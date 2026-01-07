import java.util.Arrays;
import java.util.Scanner;

public class TwoDArraySearch{
    public static void main(String[] args) {
        int[][] arr={{1,3,4},{11,33},{111,333,444}};
        Scanner s=new Scanner(System.in);
        int target=s.nextInt();
        System.out.println(Arrays.toString(Search(arr,target)));
    }
    public static int []Search(int [][] arr,int target){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
