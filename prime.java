
import java.util.Scanner;

public class prime{
    public int Prime(int n){
        int flag=0;
        for(int i=2; i<n; i++){
            
            if(n%i==0){
                flag =1;
                break;
            }
        }
        return flag;


    }




    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        prime p = new prime();
        System.out.println("Enter 1st number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int n2 = sc.nextInt();
        for(int i=n1;i<=n2;i++){
            if(i==1){
                continue;
            }
            int f = p.Prime(i);
            if(f==0)
                System.out.println(i);


        }
      

        sc.close();





    }



}
