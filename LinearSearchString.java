public class LinearSearchString{
    public static void main(String[] args) {
        String Name="DARPAN";
        char target='A';
        System.out.println(Search(Name,target));

    }
    public static int Search(String Name,char target){
        if(Name.length()==0){
            return -1;
        }
        else {
            for(int i=0;i<Name.length();i++){
                if(Name.charAt(i)==target){
                    return i;
                }
            }
        }
        return -1;
    }
}
