import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            double balance = 0, amount = 0;

            System.out.println("Enter balance :");
            if(sc.hasNextDouble()){
                balance = sc.nextDouble();
            }
            else{
                throw new NumberFormatException("Invalide input.");
            }

            System.out.println("Enter withdrawal amount :");
            if(sc.hasNextDouble()){
                amount = sc.nextDouble();
            }
            else{
                throw new NumberFormatException("Invalie input. ");
            }

            Calculate.withdrawal(balance, amount);

        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }

}