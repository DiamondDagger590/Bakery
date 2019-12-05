import java.util.Scanner;

public class Demo {

  public static void main(String[] args){
    //Create an instance of a bakery
    Bakery bakery = new Bakery();
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many customers are being served?");
    int customers = scanner.nextInt();
    for(int i = 0; i < customers; i++){
      //If there is any cake
      if(bakery.makingCake){
        //If current cake has any slices
        if(bakery.cakeSlices > 0){
          //Sell a slice
          bakery.cakeSlices = bakery.cakeSlices - 1;
        }
        else{
          //else bake a cake and sell a slice
          bakery.cakeSlices = 10;
          bakery.profits -= 5;
          bakery.cakeSlices -= 1;
          bakery.profits += 2;
        }
      }
      //If there is not cake
      else{
        //Bake a cake and sell it
        bakery.cakeSlices = 10;
        bakery.profits -= 5;
        bakery.cakeSlices -= 1;
        bakery.profits += 2;
      }
    }
    System.out.println("Profits are: " + bakery.profits);
  }
}
