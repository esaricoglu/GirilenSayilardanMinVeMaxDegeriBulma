package Donguler;

import java.util.Scanner;

public class GirilenSayilardanMinMax {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        int n = inp.nextInt();

        int maxValue= Integer.MIN_VALUE , minvalue = Integer.MAX_VALUE;

        for(int i = 1 ; i<=n;i++){
            System.out.print(i + ". sayıyı giriniz : ");
            int number = inp.nextInt();
            if (number > maxValue) {
                maxValue = number;
            }
            if (number < minvalue) {
                minvalue = number;
            }

        }
        System.out.println("En büyük sayı : " + maxValue);
        System.out.println("En küçük sayı : " + minvalue);
    }
}
