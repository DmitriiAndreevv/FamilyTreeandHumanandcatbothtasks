package FamilyTreee;

import FamilyTreee.FamilyTree.Type;
import FamilyTreee.File;


public class Main {
    public static void main(String[] args) {

        var maxim1 = new Person("Отец Василия и Натальи: Демьянов Максим Олегович 01.11.1960 г.");
        var julia = new Person("Мама Василия и Натальи: Демьянова Юлия Юрьевна 07.03.1961 г.");
        var irina = new Person("Мама Ивана и Марии: Демьянова Ирина Генадьевна 04.10.1972 г.");
        var maxim = new Person("брат Ирины: Захаров Максим Генадьевич 10.07.1973 г.");
        var natasha = new Person("сестра Василия: Демьянова Наталья Владимировна 01.04.1975 г.");
        var vasya = new Person("Отец Ивана и Марии: Демьянов Василий Максимович 12.12.1977 г.");
        var masha = new Person("Дочь Ирины и Василия: Демьянова Мария Владимировна 08.12.1993 г.");
        var ivan = new Person("Сын Ирины и Василия: Демьянов Иван Владимирович 10.08.1995 г.");


        FamilyTree ft = new FamilyTree();

        ft.addNode(maxim1, Type.Father, maxim1);
        ft.addNode(julia, Type.Mother, julia);
        ft.addNode(vasya, Type.Husband, vasya);
        ft.addNode(irina, Type.Wife, vasya);
        ft.addNode(maxim, Type.Brother, maxim);
        ft.addNode(natasha, Type.Sister, natasha);
        ft.addNode(masha, Type.Daughter, vasya);
        ft.addNode(ivan, Type.Son, vasya);

        Branch Father = new Branch(ft);
        Branch Mother = new Branch(ft);
        Branch Husband = new Branch(ft);
        Branch Brother = new Branch(ft);
        Branch Wife = new Branch(ft);
        Branch children = new Branch(ft);
        Branch Sister = new Branch(ft);


        File p = new File();

        System.out.println(p.people(Father.findAll(maxim1, Type.Father)));
        System.out.println(p.people(Mother.findAll(julia, Type.Mother)));
        System.out.println();
        System.out.println(p.people(Brother.findAll(maxim, Type.Brother)));
        System.out.println();
        System.out.println(p.people(Sister.findAll(natasha, Type.Sister)));
        System.out.println();
        System.out.println(p.people(Husband.findAll(vasya, Type.Husband)));
        System.out.println(p.people(Wife.findAll(vasya, Type.Wife)));
        System.out.println(p.people(children.findAll(vasya, Type.Son)));
        System.out.println(p.people(children.findAll(vasya, Type.Daughter)));


    }
}