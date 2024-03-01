public class ValidParentheses {
    public boolean isValid(String s) {
        char[] stringOfChars = s.toCharArray();
        int k = s.length();
        if (k%2 == 1){
            return false;
        }

        for (int i = 0; i<k-1; i+=2){
            if ((int)stringOfChars[i]+1 == (int)stringOfChars[i+1] || (int)stringOfChars[i]+2 == (int)stringOfChars[i+1]){
                continue;
            }else{
                return false;
            }
        }

        return true;


    }

    public static void main(String[] args) {
        ValidParentheses n = new ValidParentheses();
        System.out.print(n.isValid("(){}[][]{}"));
    }
}