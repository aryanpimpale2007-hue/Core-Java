import java.util.Scanner;

public class ProgressiveDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows: ");
        int n = sc.nextInt();

        int num = 1;
        for(int i=1;i<=n && num<=100;i++){
            for(int j=1;j<=i && num<=100;j++){
                if (num%4!=0) {
                     System.out.print(" "+num);
                }
                  num = num+1;
            }
            System.out.println();
        }

        sc.close();
    }
}
