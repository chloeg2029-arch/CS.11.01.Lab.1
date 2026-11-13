import java.util.Scanner; //import scanner functions

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in); //establish scanner
        System.out.print("Enter your age: "); //ask for age
        int age = scanner.nextInt();
        int minAge = age/2 + 7; //calculate minimum age
        System.out.print(age + " should date somebody who is at least " + minAge + " years old.");//deliver final result
    }
}
