public class Random{
  public void game(int x,int tahmin){
    if(tahmin>x){
      System.out.println("Your guess is too high");
    }
    else if(tahmin<x){
      System.out.println("Your guess is too low");
    }
    else{
      System.out.println("You guessed it right");
    }
  }
}