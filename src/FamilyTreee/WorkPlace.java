package FamilyTreee;

import java.util.Iterator;

public class WorkPlace implements Iterator<String> {

    public String workplace;
    public int phoneNumber;
    public int salary;



    public WorkPlace(Branch husband, String workplace, int phoneNumber, int salary){
        this.workplace = workplace;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.index = 0;

    }

    public String AboutFamily(){return String.format("%s, %s",workplace, phoneNumber);}

    int index;

    @Override
    public boolean hasNext(){return  index++ < 3;}

    @Override
    public String next(){
        switch (index){
            case 1:

                return String.format("Место работы Василия: %s",workplace);
            case 2:

                return String.format("Номер телефона: %d", phoneNumber);

            case 3:

                return String.format("Зарплата: %d",salary);

        }
        return workplace;
    }
}
