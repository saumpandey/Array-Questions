public class MY2 {
    public void shift(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
            arr[temp] = arr[i];
            temp++;
            }
        }
        while ( temp < arr.length)
            arr[temp++] =0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,7,9,0,8,0,0,53,32,66,0};
        MY2 bc = new MY2();
        bc.shift(arr);
    }
}