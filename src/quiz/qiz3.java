package quiz;

public class qiz3 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,10,17,3,21,33,99,101};
        int evensum =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        }
        System.out.println("sum="+evensum);
    }
}
