package homeworkw5;

import java.util.Scanner;

public class Program10 {
    public static void main(String[]args){
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a  = Integer.parseInt(keyboardInput.nextLine());
        System.out.print("Input second number: ");
        int b = Integer.parseInt(keyboardInput.nextLine());
        System.out.println(a*b);
            }
}
