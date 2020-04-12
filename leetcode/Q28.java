import java.util.*;

/**
 * 实现strStr()
 * https://leetcode-cn.com/problems/implement-strstr/
 */
public class Q28 {

   /* java string util */
   public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
   }
   
   /* 双指针*/
   public int strStr1(String haystack, String needle) {
      int parentIndex = 0;
      int 
      while (parentIndex <= haystack.length() - needle.length()) {
        
        for (int i = 0; i < needle.length(); i++) {
            if (!needle.charAt(i).equals(haystack.charAt(parentIndex))) {
              parentIndex = parendIndex + i + 1;
              break;
            }
        }
        
        res = parendIndex;
      }
   }
   
   
}
