package FamilyTreee;

import java.util.ArrayList;
public class File {

    public File() {}

    public String people(ArrayList<Person>Data){
        StringBuilder result = new StringBuilder();
        for (Person person: Data) {
            result.append(person.getFullName() + '\t');
        }
        return result.toString();
    }
}
