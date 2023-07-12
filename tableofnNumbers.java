import java.util.Scanner;

/**
 * practice1
 */
public class tableofnNumbers {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please Enter a number");
        int num=sc.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(num +"*"+i+"=" + num*i);

        }
    }
}