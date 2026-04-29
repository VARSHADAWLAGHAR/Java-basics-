import java.util.*;

class Swap {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
//o/p : enter a number: 5 3
// a:3
// b:5
