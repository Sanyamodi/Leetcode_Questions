import java.util.Arrays;

public class _07_242_ValidAnagram {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
            char[] st1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();

            Arrays.sort(st1Array);
            Arrays.sort(str2Array);

            boolean res = Arrays.equals(st1Array,str2Array);

            if(res){
                System.out.println("Anagrams");
            }else {
                System.out.println("Not anagrams");
            }
        }else {
            System.out.println("Not anagrams");
        }
    }
}
