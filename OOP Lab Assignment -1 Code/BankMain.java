public class BankMain {
    public static void main(String[] args) {

        BankAccount sazzad = new BankAccount(111, "Sazzad Rashid", 10000);
        BankAccount mahbub = new BankAccount(112, "Mahbub Hossain", 5000);
        BankAccount galib = new BankAccount(113, "Amirul Galib", 2000);
        BankAccount hasin = new BankAccount(114, "Hasin Chowdhury", 8000);
        BankAccount saikat = new  BankAccount(115, "Saikat Talukder", 1500);


        sazzad.deposit(500);
        mahbub.deposit(700);
        galib.deposit(-300);
        saikat.withdraw(2000);
        saikat.withdraw(500);
        saikat.withdraw(1700);


        sazzad.account_information();
        mahbub.account_information();
        galib.account_information();
        hasin.account_information();
        saikat.account_information();


        BankAccount.bank_information();
    }
}
