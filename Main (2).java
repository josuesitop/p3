package seriefibojosue;
import java.util.Scanner;
Seriefibojosue.java Public class seriefibojosue {
public static void main(String[] args) {
int numero, fibop, fibop1, fibop2;
fibop = 0;        
fibop1 = 0;
fibop2 = 1;
Scanner n = new Scanner(System.in);
System.out.println("Cuantos numeros quieres ver? ");    
numero = n.nextInt();
n.close();
for (int i = 0; i <= numero; i++) {           
System.out.println(fibop);
fibop = fibop1 + fibop2;
fibop2 = fibop1;
fibop1 = fibop;
  }      
 }
}