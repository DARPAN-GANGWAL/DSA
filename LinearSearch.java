public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 9, 31, 0, 2};
        int target = 31;
        System.out.println(search(arr,target));
    }
    public static int search(int[] array,int target){
        if(array.length==0){
            return -1;
        }
        else {
            for(int i=0;i< array.length;i++){
                if(array[i]==target){
                    System.out.println("target found at index:-");return i;
                }
            }
        }
        return -1;
    }
}
