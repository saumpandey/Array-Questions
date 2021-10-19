public class MY6 {
    public void find(int arr[] , int m){
        int temp = 0;
            if(arr[1] - arr[0] == 1){
                for (int i = arr[0]; i < m; i++) {
                    if (arr[i] != i){
                        temp = arr[i] +1;
                        break;
                    }
                    else
                        continue;
                }
            }
        System.out.println("missing element : " + temp);
    }
    public static void main(String[] args) {
        int[] arr = {3,4,6,8};
        MY6 bc = new MY6();
        bc.find(arr, 9);
    }
}
