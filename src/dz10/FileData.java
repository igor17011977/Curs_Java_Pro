package dz10;

import java.util.ArrayList;

public class FileData {
    public static ArrayList<FileData> arrayList = new ArrayList<>();
    String filename;
    int filesize;
    String patchtofile;
    FileData() {
       }

    FileData(String filename, int filebytesize, String patchtofile) {
        this.filename = filename;
        this.filesize = filebytesize;
        this.patchtofile = patchtofile;
    }

    public ArrayList<FileData> getArrayList() {
        return arrayList;
    }

    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();
        arrayList.add(new FileData("xrdp.ini", 8689, "/etc/xrdp"));
        arrayList.add(new FileData("docbook-xml.xml", 10313, "/etc/xml"));
        arrayList.add(new FileData("catalog", 1211, "/etc/xml"));
        arrayList.add(new FileData("polkitd.xml.old", 365, "/etc/xml"));
        arrayList.add(new FileData("XCalc.ini", 367, "/etc/X11/app-defaults"));
        arrayList.add(new FileData("XPast.txt", 3655, "/etc/X11/app-defaults"));
        for (FileData q : arrayList) {
            fileNavigator.add(q);
        }
            System.out.println("2: "+fileNavigator.getMap());
            System.out.println("3: /etc/xml= "+fileNavigator.find("/etc/xml"));
            System.out.println("4: 1200 bytes <= "+fileNavigator.filterBySize(1200));
            fileNavigator.remove("/etc/xrdp");
            System.out.println("6: "+fileNavigator.sortBySize());
    }
}
