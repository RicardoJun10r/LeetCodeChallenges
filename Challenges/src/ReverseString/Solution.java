class Solution {
    public void reverseString(char[] s) {
        char[]vetReves = new char[s.length];
        int cont = 0;
        for(int i = s.length-1; i >=0; i--){
            vetReves[cont] = s[i];
            cont++;
        }
        for(int i = 0; i < vetReves.length; i++)
            s[i] = vetReves[i];
    }
}