import java.util.*;

class EvenOdd {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}
// output : enter a number: 100
// Number is Even
