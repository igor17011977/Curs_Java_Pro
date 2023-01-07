package dz09.phonebook;

public class Record {
    String name;
    String phonenamber;
    public Record(String name,String phonenamber){
        this.name=name;
        this.phonenamber=phonenamber;

    }

    public String getName() {
        return name;
    }

    public String getPhonenamber() {
        return phonenamber;
    }

    @Override
    public String toString() {
        return "Record{" +
                "name='" + this.name + '\'' +
                ", phonenamber='" + this.phonenamber + '\'' +
                '}';
    }
}
