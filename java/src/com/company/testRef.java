package com.company;

public class testRef {

   public static void foo(int x){
       x++;
   }

    public static void main(String[] args) {
        int a = 1;
        foo(a);
        System.out.println(a);
    }


}
