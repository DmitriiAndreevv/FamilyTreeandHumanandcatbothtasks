package FamilyTreee;

import org.w3c.dom.Node;

import java.util.ArrayList;

import static jdk.internal.org.jline.utils.Colors.s;

public class FamilyTree {
    private ArrayList<Node>tree = new ArrayList<>();

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
