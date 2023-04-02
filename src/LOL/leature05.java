package LOL;

import java.util.Scanner;

public class leature05 {
    public static void main(String[] args) {
        // 클래스 -> 사용자 정의타입
        // 클래스 ->미리만들어진 클라스이용
        // 클라스 변수명 = new  클라스();
        // 입력
        Scanner inputNumber = new Scanner(System.in);

        System.out.println("나이를입력하세요");

        //정수입력
        int inputAge = inputNumber.nextInt();
        System.out.println("입력한 나이는 : "+ inputAge);

        Scanner inputS = new Scanner(System.in);

        System.out.println("문자열을 입력해주세요");

        //문자열 입력
        String inputStr = inputS.nextLine();
        System.out.println("입력한 문자열은 :" + inputStr);

        // 변수선언
        // type 변수명 = 초기회
        int number = 0;
    }
}
