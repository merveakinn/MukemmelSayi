
package javaapplication2;

import java.util.Scanner;
public class Mukemmel {


   public static boolean MukemmelSayilar(int sayi) {
  int toplam = 0;
  for(int i=1;i<=sayi/2;i++){
    if(sayi%i == 0) 
        toplam +=i;  //sayımız i'ye tam bölünüyorsa(kalan 0 ise) topla komutunu verdim
  }
  if(toplam == sayi)  //toplam sayıya eşit ise programın durmasını sağlar
      return true;
  return false;
 }  
}
      

 
 
