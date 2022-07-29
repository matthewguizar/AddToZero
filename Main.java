public class Main{
    public static void main(String [] args){
        int arr[] = new int[] {0,1,2,3,4,5};
        int arr2[] = new int[] {1,4,11,2,37,-4};

        System.out.println(addToZero(arr2));
    }

    public static boolean addToZero(int[] arr){
        if (arr.length < 2){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 0){
                    return true;
                }
            }
        }
        return false;
    }
}