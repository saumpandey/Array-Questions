public class MY4 {
    public void acc_to_index(int arr[] , int index[]){
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[index[i]] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
            index[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < index.length; i++) {
            System.out.print(index[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] index = {0,4,5,3,2,1};
        MY4 bc = new MY4();
        bc.acc_to_index(arr,index);
    }
}
