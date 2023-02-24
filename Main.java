


import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double suma = 0;
    
    Scanner stdin = new Scanner(System.in);
    while(stdin.hasNextDouble()) {
        suma += stdin.nextDouble();
    }
    stdin.close();
   
Double sumaD = new Double (suma);
int sumaTemp = (int)suma;

if (suma - sumaTemp > 0)
   System.out.println(suma);
else
    System.out.println(sumaTemp);
   
  }
}
