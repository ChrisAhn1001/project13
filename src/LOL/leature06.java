package LOL;

import java.util.Scanner;

public class leature06 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("You want to start the game? 0)yes or 1)no");
        Scanner sc = new Scanner(System.in);
        int[] intArr = {1,2,3,4,5};
        String[] strArr = {"top","mid","jungle","bot","support"};
        int randomNumber = (int) (Math.random()* 6)-1;
        int input = 0;
        input = sc.nextInt();
        if (input == 1) {
            System.out.println("yes moving to pick");
            System.out.println(randomNumber);
        }

        else {
            System.out.println("no close the game");
        }


    }
}
