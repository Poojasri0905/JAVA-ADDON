import java.util.Scanner;
public class Atm {
  public static void main(String[] args) {
    Scanner ref = new Scanner(System.in);
    System.out.print("Enter your PIN: ");
    int pin=ref.nextInt();
    System.out.println("Enter your amount");
    int amount=ref.nextInt();
    if(pin == 1234) {
             if(amount <= 50000){
                      //withdraw successfully
              }
              else{
              //insufficient  
              }
}
else{
//invalid
}
}
}
