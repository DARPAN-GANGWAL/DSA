import java.util.Scanner;

public class Leetcode1295 {
    public static void main(String[] args) {
        int[]nums={1,4,2,44,3};
        System.out.println(counting(nums));

    }

    public static int counting(int[] nums) {
        int count = 0;
        for(int num:nums)
        if (even(num)) {
            count++;
        }
        return count;
    }

    public static boolean even(int num) {
        int d=digits(num);
        if(d%2==0){
            return true;
        }
        return false;
    }
    public static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;

    }
}


