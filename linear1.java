public class linear1 {
    public static void main(String[] args) {
     int arr[] ={8,9,12,22,34,21};
     int target=34;
     int ans=linear(arr,target);
     System.out.println(ans);
    }
    

    public static int linear(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
            else{ 
                return -1;
        }
    }
    return -1;
}
}