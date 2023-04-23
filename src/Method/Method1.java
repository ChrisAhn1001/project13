package Method;

public class Method1 {
    public static void main(String[] args) {
        int number1 = 4;
        int number2 = 14;
        System.out.println(number1+number2);
        System.out.println(number1 - number2);
        System.out.println(number1*number2);
        System.out.println(number1%number2);

        int plusMethodTest = 0;
        int minusMethodTest = 0;
        int timesMethodTest = 0;
        int divideMethodTest = 0;

        plusMethodTest = plus(100,1);
        minusMethodTest = minus(100 ,1);
        timesMethodTest = times(100,1);
        divideMethodTest = divide(100,1);

        System.out.println(plusMethodTest);
        System.out.println(minusMethodTest);
        System.out.println(timesMethodTest);
        System.out.println(divideMethodTest);
    }
    public static int minus(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }
    public static int  plus(int num1,int num2) {
        int result = num1 + num2;
        return result;
    }
    public static int times(int num1,int num2) {
        int result = num1 + num2;
        return result;
    }
    public static int divide(int num1,int num2) {
        int result = num1 / num2;
        return result;
    }
}
