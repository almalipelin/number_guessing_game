import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Random a = new Random(); 
    int tahmin,i=0,x;
    x=(int)(Math.random() * 100)+1;
    do{
      System.out.println("Enter a number between 0 and 100");
      tahmin = scanner.nextInt();
      
      a.game(x,tahmin); 
      i++;
    }while(tahmin!=x);
    System.out.println("You guessed it in "+i+" tries");
    }
}
