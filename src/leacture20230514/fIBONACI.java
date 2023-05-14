package leacture20230514;

import java.util.Scanner;

public class fIBONACI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<=n;i++) {
            System.out.print(fibonaci(i)" ");
        }
    }
}
