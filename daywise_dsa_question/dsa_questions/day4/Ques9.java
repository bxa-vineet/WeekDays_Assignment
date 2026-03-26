package dsa_questions;

import java.util.Scanner;

public class Ques9 {
    public static int pow(int x , int n){
        if(n==0){
            return 1;
        }
        int xnm1 = pow(x,n/2);
        int xn = xnm1*xnm1;
        if(n%2 ==1){
            xn = x * xn;
        }
        return xn;
    }
     public static void main(String[] args) {
        int x =3;
        int n =9;
        int ans = pow(x,n);
         System.out.println(ans);

     }
}
