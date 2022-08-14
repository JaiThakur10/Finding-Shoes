import java.util.Scanner;

public class shoes {
    public static void main(String[] args) {
        System.out.println("Enter the number of friends");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number of left shoes");
        int m = sc.nextInt();
        if(n<=m){
            System.out.println("The number of shoes to be bought:");
            System.out.println(n);
        }
        else{
            System.out.println("The number of shoes to be bought:");
            System.out.println(2*n-m);
        }
    }
    
}
