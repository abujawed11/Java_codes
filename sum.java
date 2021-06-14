import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float math,eng,sci,hindi,comp;
        float total = 500f,per,you;
        System.out.print("Enter Math marks: ");
        math = sc.nextFloat();
        System.out.print("Enter English marks: ");
        eng = sc.nextFloat();
        System.out.print("Enter Science marks: ");
        sci = sc.nextFloat();
        System.out.print("Enter Hindi marks: ");
        hindi = sc.nextFloat();
        System.out.print("Enter Computer marks: ");
        comp = sc.nextFloat();
        you = math+eng+sci+hindi+comp;
        per = (math+eng+sci+hindi+comp)/ 5.0f;
        System.out.println("Your Total marks is: "+you+" out of "+total);
        System.out.println("Your percentage is: "+per);
        if(math<33 || eng <33 || sci<33 || hindi<33 || comp<33)
        {
            System.out.println("You are fail!!");
        }
        else
        {
            System.out.println("You are Pass in all Subjects");
        }
        sc.close();

    }
}
