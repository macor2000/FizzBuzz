import java.util.Scanner;

public class FizzBuzz {
    

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        System.out.println();
        int fizzyOne = input.nextInt();
        System.out.print("Enter another number: ");
        System.out.println();
        int buzzyOne = input.nextInt();
        System.out.print("Enter the endpoint: ");
        int endPoint = input.nextInt();

        String output = FizzBuzz(fizzyOne, buzzyOne, endPoint);

        System.out.println(output);

    }

    public static String FizzBuzz(int Fizz , int Buzz , int n){
        String result = "";
        for(int i = 0; i <= n; i++){
            String value = "";
            if(i % Fizz == 0){
                value += "Fizz";
            }
            if(i % Buzz == 0){
                value += "Buzz";
            }
            if(value.equals("")){
                value += String.valueOf(i);
            }
            result += value + "\n";

        }
        return result;


    }
}
