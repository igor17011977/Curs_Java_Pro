package dz10;

import java.util.*;

public class FileNavigator {
    Map<String, ArrayList<String>> map = new HashMap<>();
    FileData fileData = new FileData();

    public Map<String, ArrayList<String>> getMap() {
        return map;
    }

    public void add(FileData e) {
        ArrayList<String> array = new ArrayList<>();
        if (map.containsKey(e.patchtofile)) {
            array = map.get(e.patchtofile);
            array.add(e.filename);
        } else {
            array.add(e.filename);
            map.put(e.patchtofile, array);
        }
    }

    public List<String> find(String patch) {
        return map.get(patch);
    }

    public List<String> filterBySize(int size) {
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < fileData.getArrayList().size(); i++) {
            if (fileData.getArrayList().get(i).filesize <= size) {
                array.add(fileData.getArrayList().get(i).filename);
            }
        }
        return array;
    }

    public void remove(String patch) {
        map.remove(patch);
        System.out.println("5: delete patch " + patch + " new map " + map);
    }

    public Collection<String> sortBySize() {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < fileData.getArrayList().size(); i++) {
            treeMap.put(fileData.getArrayList().get(i).filesize, fileData.getArrayList().get(i).filename);
        }
        Collection s =treeMap.values();
        System.out.println("treemap sort"+treeMap);
        return s;
    }
}

