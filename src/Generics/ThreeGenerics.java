package Generics;

public class ThreeGenerics<T,V,K>{
    private T obT;
    private V obV;
    private K obK;
    public ThreeGenerics(T obT, V obV, K obK){
        this.obT = obT;
        this.obV = obV;
        this.obK = obK;
    }
    public void showTypes () {
        System.out.println("Type T: " + obT.getClass().getName());
        System.out.println("Type V: " + obV.getClass().getName());
        System.out.println("Type K: " + obK.getClass().getName());
    }
    public T getObT(){
        return obT;
    }
    public V getObV(){
        return obV;
    }
    public K getObK(){
        return obK;
    }
}
