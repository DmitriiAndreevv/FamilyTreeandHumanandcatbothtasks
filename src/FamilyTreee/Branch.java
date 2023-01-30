package FamilyTreee;

import java.util.ArrayList;

public class Branch implements Family {
    ArrayList<FamilyTree.Node> tree;

    public Branch(FamilyTree familyTree){
        tree = familyTree.getTree();
    }

    public ArrayList<Person> findAll(Person whose, FamilyTree.Type re){
        ArrayList<Person> result = new ArrayList<>();
        for (FamilyTree.Node t: tree) {
            if(t.toWhom.getFullName() == whose.getFullName() && t.re == re) {
                result.add(t.who);
            }
        }
        return result;
    }

    @Override
    public void ShowAllFamily() {

    }
}

