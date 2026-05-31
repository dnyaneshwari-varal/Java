package MapPack;


import java.util.TreeMap;

public class TreeMapClass {

    public static void main(String[] args) {

        TreeMap<Integer,String> tm =
                new TreeMap<>();

        tm.put(103,"Amit");
        tm.put(101,"Ram");
        tm.put(102,"Shyam");

        System.out.println(tm);

        System.out.println(
                tm.firstKey());

        System.out.println(
                tm.lastKey());
    }
}