
//https://leetcode.com/problems/longest-common-prefix/

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] strs = {"wwwwwr", "wwwow", "wwwwow"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {  
        String ans = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            while (true) {
                if (strs[i].startsWith(ans)) {
                    break;
                }
                else {
                    if (ans.length() == 1) {
                        return "";
                    }
                    ans = ans.substring(0, ans.length() - 1);
                }
            }
        }
        return ans;
    }
}