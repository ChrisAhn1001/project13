package lecture20230521;
import java.util.Objects;
import java.util.Scanner;
public class Num1 {
    public static void main(String[] args) {
        Scanner inputNum1 = new Scanner(System.in);
        int num1 = inputNum1.nextInt();
        Scanner inputNum2 = new Scanner(System.in);
        int num2 = inputNum2.nextInt();
        Scanner operator = new Scanner(System.in);
        String oper = operator.nextLine();
        int calculateMethod = 0;
        calculateMethod = calculate(num1,num2,oper);
        System.out.println(calculateMethod);
    }
    public static int calculate(int num1,int num2,String operator) {
        int result = 0;
        if (Objects.equals(operator,"plus")) {
            result = num1 +num2;
        }
        else if (Objects.equals(operator,"minus")) {
            result = num1 - num2;
        }
        else if (Objects.equals(operator,"times")) {
            result = num1 * num2;
        }
        else if (Objects.equals(operator,"divide")) {
            result = num1 / num2;
        }
        return result;
    }
}
