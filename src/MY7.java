import java.util.Arrays;

public class MY7 {
    public static void main(String[] args) {
        int[] arr = {4,6,5,89,3,4,7,9};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int temp = 0;
        for (int i = 0; i < arr.length; i+=2) {
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
