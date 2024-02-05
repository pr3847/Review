import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[]  arr={"man","manu","ram"};

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()<=3){
                count++;
            }
        }

        String[] ar=new String[count];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()<=3){
                ar[j]=arr[i];
                j++;
            }
        }
        for(String s: ar){
            System.out.println(s);
        }
    }
}