package dz09.phonebook;

public class Main {
    public static void main(String[] args){
        Phonebook phonebook=new Phonebook();
        phonebook.add("Igor","0977893112");
        phonebook.add("Ivan","0986543431");
        phonebook.add("Ivan","0986543433");
        phonebook.add("Ivan","0986536433");
        phonebook.add("Sacha","0986246433");
        phonebook.find("Ivan");
        phonebook.findAll("Ivan");
    }
}
