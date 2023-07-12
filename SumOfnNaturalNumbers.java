import java.util.Scanner;

/**
 * SumOfnNaturalNumbers
 */
public class SumOfnNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number");

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
        sc.close();
    }
}