import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        try{
           String name;
           int subject1, subject2, subject3;
           double avg = 0;
           System.out.println("Enter name of the sutdent :");
           name = sc.nextLine();
           System.out.println("Enter mark of subject 1: ");
           subject1 = sc.nextInt();
           System.out.println("Enter mark of subject 2: ");
           subject2 = sc.nextInt();
           System.out.println("Enter mark of Subject 3: ");
           subject3 = sc.nextInt();

           int[] marks = {subject1, subject2, subject3};

           avg = Calculate.calculateAverage(marks);

           System.out.println("----------Student Result----------");
           System.out.println("Name : " + name);
           System.out.println("Marks : " + marks[0] + " " + marks[1] + " " + marks[2] + " .");
           System.out.println("Average mark : " + avg);

        } 
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        

        sc.close();
    }

}
