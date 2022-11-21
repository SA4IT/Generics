package Generics;

public class Runner {
    public static void main(String[] args) {
        ThreeGenerics <String,Integer,Double> object = new ThreeGenerics<>("Vlad", 19, 182.5);
        object.showTypes();
        System.out.println(" ");
        System.out.println(object.getObT());
        System.out.println(object.getObV());
        System.out.println(object.getObK());
        System.out.println(" ");


        int [] arr = {5,3,674,6,8,67,8,79,25};
        Integer [] newArray = new Integer[arr.length];
        int i =0;
        for (int value : arr){
            newArray[i++] = Integer.valueOf(value);
        }
        MinMax <Integer> massive = new MinMax<>(newArray);
        System.out.println("min = " + massive.min());
        System.out.println("max = " + massive.max());

    }
}
