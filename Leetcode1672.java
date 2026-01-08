public class Leetcode1672{
    public static void main(String[] args){
        int[][] accounts={{1,2,3},{3,2,2}};
        System.out.println(max(accounts));

    }
    public static int max(int[][]accounts){
        int max=0;
        for(int r=0;r<accounts.length;r++){
            int sum=0;
            for(int c=0;c<accounts[r].length;c++){
                sum+=accounts[r][c];

            }
            if (max<sum){
                max=sum;
            }

        }
        return max;
    }
}
