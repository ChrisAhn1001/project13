package lecture20230521;

import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPrice = 0;

        System.out.println("맥도날드 주문");
        System.out.println("주문을 입력하세요.");

        String input;
        do {
            System.out.print("주문 내역을 입력하세요 (종료: 1:0): ");
            input = scanner.nextLine();

            if (!input.equals("1:0")) {
                String[] orders = input.split(", ");
                for (String order : orders) {
                    String[] orderDetail = order.split(" ");
                    String menu = orderDetail[0];
                    int quantity = Integer.parseInt(orderDetail[1]);

                    int price = calculatePrice(menu, quantity);
                    totalPrice += price;
                }
            }
        } while (!input.equals("1:0"));

        System.out.println("총 가격: " + totalPrice + "원");
        scanner.close();
    }

    public static int calculatePrice(String menu, int quantity) {
        int price = 0;

        switch (menu) {
            case "빅맥":
                price = 6000;
                break;
            case "상하이버거":
                price = 6000;
                break;
            case "골드에그":
                price = 10000;
                break;
            case "맥윙":
                price = 3000;
                break;
            case "치즈":
                price = 200;
                break;
            default:
                System.out.println("잘못된 메뉴입니다.");
                break;
        }

        return price * quantity;
    }
}


