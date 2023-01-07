package dz09;

import org.json.simple.JSONObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Main {
    int countposition;
    public int countOccurance(String[] list,ArrayList list1){
        for (Object o : list1) {
            if (list[1].equals(o)) countposition++;
        }

        return countposition;
    }
     public List<Integer> toList(Integer[] sourceArray){
         return Arrays.asList(sourceArray);
     }
     public int[] findUnique(int[] unique) {
         return Arrays.stream(unique).distinct().toArray();
     }
     public void calcOcurance(String[] animal) {
         System.out.println("4).**");
         List<String> animalunical = Arrays.stream(animal).distinct().toList();

         for (String s : animalunical) {
             countposition = 0;
             for (Object o : animal) {
                 if (s.equals(o)) countposition++;
             } System.out.println(s+": "+countposition);
         }
     }

    public void findOcurance(String[] animal) {
        System.out.println("4)***.");
        List<String> animalunical = Arrays.stream(animal).distinct().toList();
        ArrayList<Object> arrayList =new ArrayList<>();
        JSONObject jsonObject= new JSONObject();
        for (String s : animalunical) {
            countposition = 0;
            for (Object o : animal) {
                if (s.equals(o)) {
                    countposition++;
                }
            }
            jsonObject.put("name",s);
            jsonObject.put("occurence",countposition);
            arrayList.add(jsonObject.toJSONString());
            jsonObject.clear();

        }
        for (Object e:arrayList) {
            System.out.println(e);
        }
    }


    public static void main(String[] args){
        Main main=new Main();
        String text="However this example might have resource leak program has to do more than rely on the garbage collector (GC)";
        String[] list=null;
        list=text.split(" ");
        ArrayList<String> list1=new ArrayList<>(Arrays.asList("have","this","might","this","resource","more","rely","this","collector","program"));
        System.out.println("1). Second argument in string ("+list[1]+") meet in List =  "+main.countOccurance(list,list1)+" times");
        Integer[] sourceArray = { 0, 1, 2, 3, 4, 5 };
        System.out.println("2). "+main.toList(sourceArray));
        int[] unique = { 0,1,1,7,7,3,7,4,8,4,7,89};
        System.out.println("3). "+Arrays.toString(main.findUnique(unique)));
        String[] animal ={"Beaver","Orangutan","Antelope","Badger","Giraffe","Hermit","Crab","Hamster","Cobra","Hammerhead shark","Chameleon","Badger","Giraffe","Hermit","Crab","Crab","Hamster","Cobra"};
        main.calcOcurance(animal);
        main.findOcurance(animal);
    }
}
