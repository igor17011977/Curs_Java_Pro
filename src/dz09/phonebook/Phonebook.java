package dz09.phonebook;

import java.util.ArrayList;


public class Phonebook {
    ArrayList<Record> recordset = new ArrayList<>();
    public void add(String name, String phone) {
        recordset.add(new Record(name,phone));
    }

    public void find(String name) {
        int i=0;
        for (Record record : recordset) {
            if (record.name.equals(name)) {
                System.out.println(record.name);
                System.out.println(record.phonenamber);
                i++;
                break;
            }
        }
        if (i==0) System.out.println("null");
    }
    public void findAll(String name) {
        int i=0;
        for (Record record : recordset) {
            if (record.name.equals(name)) {
                if (i==0) System.out.println(record.name);
                System.out.println(record.phonenamber);
                i++;
            }
        }
        if (i==0) System.out.println("null");
    }
}