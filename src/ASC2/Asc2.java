package ASC2;

import java.util.ArrayList;
import java.util.Scanner;

public class Asc2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("chuỗi(String) = ");
        String str = scanner.next();
        char[] chars = str.toCharArray();
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            ints.add(i,(int)chars[i]);
        }
        int[] newInt=changeArray(ints);
        String a= "";
        for (int i = 0; i < newInt.length; i++) {
            if (newInt[i]!=0){
                char ch = (char) newInt[i];
                a+=ch;
            }
        }
        System.out.println(a);


    }

    public static int[] changeArray(ArrayList<Integer> arr) {
        int max= arr.get(0);
        int[] abc = new int[arr.size()];
        abc[0]=arr.get(0);
        int length = arr.size();
        for (int i = 0; i < length; i++) {
            if (max<arr.get(i)){
                max = arr.get(i);
            }
        }
        int count = 0;
        for (int i = 1; i < length; i++) {
            if (arr.get(i)>arr.get(count)){
                abc[count+1]=arr.get(i);
            }
            count++;
            if (arr.get(count)==max){
                return abc;
            }
        }
        return abc;
    }
}
