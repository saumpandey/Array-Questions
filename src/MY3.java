public class MY3 {
    public void sort(int arr[]){
        int temp = 0;
        int n = arr.length;
        int m = n;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            n--;
        }
        int i = 0 , j = m-1;
        while (j > i){
                System.out.print(arr[i] +", " + arr[j]+", ");
                i++;
                j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,9,1,4,};
        MY3 bc = new MY3();
        bc.sort(arr);
    }
}
