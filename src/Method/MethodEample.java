package Method;

public class MethodEample {
    public static void main(String[] args) {
        int number1 = 4;
        int number2 = 14;
        System.out.println(number1+number2);

        int plusMethodTest = 0;
        plusMethodTest = plus(100 ,1);
        System.out.println(plusMethodTest);
    }
    //메서드
    /*
        메서드 선언방법
        접든제어자 static 리턴타임 메서드명(paremere1,type paramerter,parameter type parameter2 ....) {
            //logic
        }
     */

    public static int plus(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}
