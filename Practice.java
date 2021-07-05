import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        System.out.println("Enter value of 1st number: ");
        int a = my.nextInt();
        System.out.println("Enter Value of 2nd number: ");
        int b = my.nextInt();
        int sum = a + b;
        System.out.println("The sum of "+a+" and "+b+" is "+sum);
        //System.out.printf("The sum of %d and %d is: %d",a,b,sum);
        my.close();

    }
    
}
