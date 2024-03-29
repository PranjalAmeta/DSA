public class Largest{
    public static void largest(String fruits[]){
        String large=fruits[0];
        for(int i=1;i<fruits.length;i++){
            //In this A==a it ignore uppercase or lowercase
            //In compareTo A!=a
            if(large.compareToIgnoreCase(fruits[i])<0){ 
                large=fruits[i];
            }
        }
        System.out.print("largest String="+large);
    }
    public static void main(String args[]){
        String fruits[]={"apple","mango","banana"};
        largest(fruits);
    }
}