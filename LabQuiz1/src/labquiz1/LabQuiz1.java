/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labquiz1;
import java.util.Scanner;
/**
 *
 * @author Duran_PC
 */
public class LabQuiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     int sayi1,sayi2,toplam,faktoriyel=1;
     System.out.println("Bir sayı giriniz");
     sayi1=input.nextInt();
     System.out.println("Bir sayı giriniz");
     sayi2=input.nextInt();
     toplam=sayi1+sayi2;
     for(int i=1;i<=toplam;i++)
     {
     faktoriyel=faktoriyel*i;
     }
     System.out.println("İki sayının toplamının faktöriyeli="+faktoriyel);
    }
    
}
