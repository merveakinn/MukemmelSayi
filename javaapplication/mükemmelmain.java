
package javaapplication2;

import java.util.Scanner;
import static javaapplication2.Mukemmel.MukemmelSayilar;


public class mükemmelmain {
       public static void main(String[] args) {
           
    Mukemmel s1=new Mukemmel();
    Mukemmel s2=new Mukemmel();
    s1.MukemmelSayilar(5);
    
    s2.MukemmelSayilar(15);
    
    Scanner klavye = new Scanner(System.in);  //kullanıcıdan veri almak için 
         System.out.print("Araligin ust limitini giriniz:");  
         int ustlimit = klavye.nextInt();  //ustlimiti tanımladım klavyede
         
  System.out.print("1 ile "+ustlimit+ " arasındaki Mükemmel sayılar:");
  for(int i=1;i<=ustlimit;i++) //bir sayı sıfıra bölünmez bu yüzden i'yi 1 den başlattım
  { 
    if(MukemmelSayilar(i)) 
    System.out.print(i+" ");
  }
} 
}