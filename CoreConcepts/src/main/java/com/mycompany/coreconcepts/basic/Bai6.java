
package com.mycompany.coreconcepts.basic;

import java.util.Scanner;


public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap : ");
        int n = sc.nextInt();
        int i = 2;
        
        while(n>1){
            if(n%i==0){
                n = n/i;
            }else{
                i++;
            }
        }
    }
    
}
