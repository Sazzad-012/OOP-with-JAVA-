// package Bank Withdrawal Validation Using Exceptions;

public class Calculate {
    public static void withdrawal(double balance, double amount) throws InsufficientBalanceException{
        if(amount <= 0){
            throw new ArithmeticException("Withdrawal amount must be greater than zero.");
        }
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient balance: Cannot withdraw more than existing balance.");
        }
        // return balance - amount;
        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance : " + (balance - amount));
    }
}

