import java.util.Scanner; //import scanner functions

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in); //establish scanner
        System.out.print("Enter your age: "); //ask for age
        int age = scanner.nextInt();
        int minPage = 100-age; //calculate minimum age
        System.out.print(age + "-year-olds should read at least " + minPage + " before giving up a book.");//deliver final result
    }
}
