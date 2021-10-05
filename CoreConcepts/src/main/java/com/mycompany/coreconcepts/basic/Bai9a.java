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
public class Bai9a {
     public static void main(String[] args) {
        int count = 0;
        for(int i =1000000 ; i <=999999999 ; i++){
            if(soDaoNgich()){
                System.out.println(i);
                count++;
            } else {
            }
        }
        System.out.println("tong cac so thuan nghich co 6 chu so la " + count);
        
    }
    public static int soDaoNgich(int n){
        int tem = 0 , dem = 0 ;
        while(n>0){
            tem = n%10; // lấy số dư 
            dem = dem * 10 + tem;
            n=n/10;
        }
        return tem;
         
    }

    private static boolean soDaoNgich() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
}
