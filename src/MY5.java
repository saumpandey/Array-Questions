public class MY5 {
    public void three_largest(int[] arr){
        int temp = 0;
        int n= arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            n--;
        }
        for (int i = arr.length-1; i > arr.length - 4 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {56,78,23,98,34,55};
        MY5 bc = new MY5();
        bc.three_largest(arr);
    }
}
