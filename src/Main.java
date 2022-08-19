import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    static int[] addItem(int[] array){
        for (int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100);
        }
        return array;
    }
    static int maxMinValue(int[]array){
        int max,min;
        max=array[0];
        min=array[0];
        for (int i:array){
            if (i > max){
                max=i;
            }else if (i < min){
                min=i;
            }
        }
        return max;
    }
    static void dist(int[]array,int value){
        int temp,distance,max=0,min=0,tempMin;
        temp=Math.abs(value- (maxMinValue(array)));
        tempMin=Math.abs(value- (maxMinValue(array)));
        for (int i:array){
            distance=Math.abs(i-value);
            if (i >= value){

                if (distance < temp){

                    temp=distance;
                    max=i;
                }
            }
            if (i <= value){

                if (distance < tempMin){
                    tempMin=distance;
                    min=i;
                }
            }
        }
        System.out.println("Girilen Değerden küçük en Büyük değer : "+ min);
        System.out.println("Girilen Değerden büyük en küçük değer : "+ max);


    }
    public static void main(String[] args) {
        int[] array=new int[10];
        int value;
        addItem(array);
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        value=input.nextInt();

        System.out.println("Dizi : "+Arrays.toString(array));
        System.out.println("Girilen Sayı : "+ value);

        dist(array,value);



    }
}
