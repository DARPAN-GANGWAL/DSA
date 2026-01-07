public class MinimumNumber{
    public static void main(String[] args) {
        int arr[]={18,12,-7,3,14,28};
        System.out.println(min(arr));

    }
    public static int min(int []array){
        if(array.length==0){
            return -1;
        }
        int ans=array[0];
        for(int i=0;i< array.length;i++){
                if(ans>array[i]){
                    ans=array[i];
                }

        }
        return ans;
    }
}
