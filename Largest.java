import java.util.*;

class Largest {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a>b && a>c){
            System.out.println("A IS GREATER ");
        }
        else if(b>c && b>a){
            System.out.println("B IS GREATER");
        }
        else{
            System.out.println("C IS GREATER");
        }
    }
}
// output : enter a number:
// 4 5 1
// B IS GREATER
