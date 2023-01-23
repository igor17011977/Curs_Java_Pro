package dz12;

import java.util.Arrays;
import java.util.List;

public class ToList<T> {
    List<T> ob;
    public void toList(T[] o){
        this.ob=Arrays.asList(o);
    }

    public List<T> getOb() {
        return ob;
    }

    public static void main(String[] args) {
        ToList<Integer> toList=new ToList<>();
        Integer[] massive={1,2,3,4,5,6,7,8,9};
        toList.toList(massive);
        System.out.println(toList.getOb());
    }

}
