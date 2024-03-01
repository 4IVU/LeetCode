public class FindTheIndex28 {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        char[] need = needle.toCharArray();
        char[] hays = haystack.toCharArray();
        for(int i = 0; i<=haystack.length()-n;i++){
            int count = 0;
            for(int k = 0; k < n; k++){

                if(hays[i+k] != need[k]){
                    break;
                }else{count+=1;}




            }
            if(count == n){
                return i;
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        FindTheIndex28 ind = new FindTheIndex28();
        System.out.print(ind.strStr("a", "a"));
    }
}
