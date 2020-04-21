
public class StringConverter{

    public static String reverse(String str){
       String s = "";
       for (int i = str.length() - 1; i > -1; i --){
           s += str.charAt(i);
       }
       return s;
   }

   public static boolean checkPalindrome(String str){
       String s = str.toLowerCase();
       s = s.replaceAll(" ", "").replaceAll(":", "").replaceAll("//?", "").replaceAll("!", "");
       if (s.equals(reverse(s))){
           return true;
       }
       return false;
   }
   public static String pigLatinate(String str){
       String start = "";
       String end = "";
       String vowels = "aeiouAEIOU";
       str = str.replaceAll(":", "").replaceAll("//?", "").replaceAll("!", "");
       if (vowels.indexOf(str.substring(0,1)) >= 0){
           return str + "yay";
       }
        for (int i = 1; i < str.length(); i++){
            if (vowels.indexOf(str.substring(i,i+1)) >= 0){
                if (Character.isUpperCase(str.charAt(0))){
                    start = str.substring(i,i+1).toUpperCase() + str.substring(i+1,str.length());
                    end = str.substring(0,i).toLowerCase();
                }
                else{
                    start = str.substring(i,str.length());
                    end = str.substring(0,i);
                }
                return start + end + "ay";
            }
        }
        return str + "yay";
    }
    public static String shorthand(String str){
        str = str.replaceAll("you", "U").replaceAll(" and ", " & ").replaceAll(" to ", " 2 ").replaceAll("for", "4").replaceAll("a", "").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "").replaceAll("u", "").replaceAll("A", "").replaceAll("E", "").replaceAll("I", "").replaceAll("O", "");
       return str;

    }
}