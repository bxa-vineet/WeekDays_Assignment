package dsa_questions;

import java.util.regex.*;

class Ques7 {
    public static boolean palimdrome(String s,int l, int r) {
      if(l>r){
          return true;
      }
      if(s.charAt(l) != s.charAt(r)){
          return false;
      }
      l++;
      r--;
      return palimdrome(s,l,r);
    }

    public static void main(String[] args) {
        String str ="hello";
        boolean ans = palimdrome(str,0,str.length()-1);
        System.out.println(ans);
    }
}