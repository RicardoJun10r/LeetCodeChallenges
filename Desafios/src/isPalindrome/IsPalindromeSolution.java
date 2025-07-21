package isPalindrome;
class IsPalindromeSolution {
    public boolean isPalindrome(String s) {
        if(s.equals(" ") || (s.length() == 1)) return true;

        s = tratarString(s.toLowerCase());

        if(s.equals(inverso(s))) return true;
        else return false;

    }

    public String tratarString(String s){
        String res = "";
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) > 47) && (s.charAt(i) < 58) || (s.charAt(i) > 96) && (s.charAt(i) < 123))
                res += s.charAt(i);
        }
        return res;
    }

    public String inverso(String s){
        String res = "";
        for(int i = s.length()-1; i >= 0; i--){
            res += s.charAt(i);
        }
        return res;
    }

    // ================ outra solução ================
    
    // MENOS EFICIENTE, usando REGEX

    // public String tratarStringComRegex(String s){
    //     String res = s.replaceAll("[^A-Za-z0-9]", "");
    //     return res;
    // }

    // ================ outra solução ================
    
    // MAIS EFICIENTE

    // public boolean isPalindrome(String s){
    //     s = s.toLowerCase();
    //     char[] palavra = s.toCharArray();
    //     int left = 0, right = palavra.length - 1;
    //     while(left < right){
    //         if(((palavra[left] > 47) && (palavra[left] < 58)) || (palavra[left] > 96) && (palavra[left] < 123)){
    //             if(((palavra[right] > 47) && (palavra[right] < 58)) || (palavra[right] > 96) && (palavra[right] < 123)){
    //                 if(palavra[left] != palavra[right]){
    //                     return false;
    //                 } else {
    //                     left++;
    //                     right--;
    //                 }
    //             } else {
    //                 right--;
    //             }
    //         } else {
    //             left++;
    //         }
    //     }
    //     return true;
    // }
}