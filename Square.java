import java.util.*;

class Square{
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int c = a*a;

        System.out.println("result " + c);
    }
}
//outpt : enter a number: 5 
//result 25
