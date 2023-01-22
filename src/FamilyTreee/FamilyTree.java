package FamilyTreee;

import org.w3c.dom.Node;

import java.util.ArrayList;

import static jdk.internal.org.jline.utils.Colors.s;

public class  FamilyTree implements Family {
    private ArrayList<Node>tree = new ArrayList<>();

    @Override
    public void ShowAllFamily() {
        System.out.println("All Family");
        System.out.println(Type.Brother);
        System.out.println(Type.Daughter);
        System.out.println(Type.Father);
        System.out.println(Type.Husband);
        System.out.println(Type.Mother);
        System.out.println(Type.Sister);
        System.out.println(Type.Son);
        System.out.println(Type.Wife);

    }

    enum Type {
        Brother, Daughter, Father, Husband, Mother, Sister, Son, Wife

    }

    class Node{
        Person who;
        Type re;
        Person toWhom;

        public Node(Person who,Type re, Person toWhom){
            this.who = who;
            this.re =re;
            this.toWhom = toWhom;
        }

        public Node(Type re, Person toWhom){
            this.who = null;
            this.re = re;
            this.toWhom = toWhom;
        }
        public Node(Person who, Type re){
            this.who = who;
            this.re = re;
            this.toWhom = null;
        }
        public String toString(){
            return String.format("<%s %s %s>", who, re, toWhom);
        }
    }
    public ArrayList<Node>getTree(){
        return tree;
    }
    public void addNode(Person who, Type re, Person toWhom) {
        tree.add(new Node(who, re, toWhom));
    }
}
