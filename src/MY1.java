public class MY1 {
    public void rearrange(int[] arr){
        int[] brr = new int[20];
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int temp = 0;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            n--;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                if(j == arr[i]){
                    brr[j] = arr[i];
                    break;
                }
            }
        }
        for (int i = 0; i < brr.length-1; i++) {
            System.out.print(brr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,8,14,6,3,4,11};
        MY1 bc = new MY1();
        bc.rearrange(arr);
    }
}
//{1,-1,2,3,6,7,8} -->> {-1,1,2,3,-1,-1,6,7,8}