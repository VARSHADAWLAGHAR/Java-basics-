import java.util.*;

class Swap1 {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
//output : enter a number:
// 5 10
// a:10
// b:5
