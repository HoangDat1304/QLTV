/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coreconcepts.basic;

/**
 *
 * @author DAT
 */
public class Bai10 {
    public static void main(String[] args) {
        int count =0 ;
        for(int i = 1000000 ; i <9999999 ; i++){
            if(SNT(i)){
                System.out.println("i");
                count++;
            }
        }
        System.out.println("có "+count+"thoa mãn là :");
    }
    public static boolean  SNT(int n){
        if (n>1) {
            for (int i = 2; i<= Math.sqrt(n); i++) {
                if (n % i== 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
    
    
}
