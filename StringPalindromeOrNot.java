public class StringPalindromeOrNot {
    public static void main(String[] args){
        String input = "abccbz";
        for(int i=0;i<input.length()/2;i++){
            if(input.charAt(i)!=input.charAt(input.length()-1-i)){
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
    
}
