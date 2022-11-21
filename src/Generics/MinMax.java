package Generics;

public class MinMax <T extends Number> {
    private T [] massive;

    public MinMax(T [] massive_temp){
        this.massive = massive_temp;
    }

    public T min(){
        T min = massive[0];
        for(int i =0; i<massive.length; i++){
            if (massive[i].doubleValue() <= min.doubleValue()){
                min = massive[i];
            }
        }
        return min;
    }
    public T max(){
        T max = massive[0];
        for(int i =0; i<massive.length; i++){
            if (massive[i].doubleValue() >= max.doubleValue()){
                max = massive[i];
            }
        }
        return max;
    }
}
