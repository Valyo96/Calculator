import java.util.Scanner;

public class Menu {
    public static void menu(){
        System.out.println("Choose an option: ");
        System.out.println("1- sum numbers " +
                "\n2-substract the numbers " +
                "\n3-multiply the numbers " +
                "\n4-divide the numbers " +
                "\n5-percentage the numbers " +
                "\n6-exit");
        Scanner sc=new Scanner(System.in);
        int choice= sc.nextInt();
        switch (choice){
            case 1-> System.out.println(Calculator.sum(UserInput.numbers(sc),UserInput.numbers(sc)));
            case 2-> System.out.println(Calculator.subtract(UserInput.numbers(sc),UserInput.numbers(sc)));
            case 3-> System.out.println(Calculator.multiply(UserInput.numbers(sc),UserInput.numbers(sc)));
            case 4-> System.out.println(Calculator.divide(UserInput.numbers(sc),UserInput.numbers(sc)));
            case 5-> System.out.println(Calculator.percentage(UserInput.numbers(sc),UserInput.numbers(sc)));
            case 6->{return;}
        }
    }
}
