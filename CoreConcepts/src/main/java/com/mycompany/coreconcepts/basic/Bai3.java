/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coreconcepts.basic;

import java.util.Scanner;


public class Bai3 {
     public static int Bai3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap a :");
        int a = sc.nextInt();
        System.out.println("moi nhap b :");
        int b = sc.nextInt();
        
        int tem = a;
        int tem1 = b;
        while(tem != tem1){
            if(tem > tem1){
                tem -= tem1;
            }else{
                tem1 -= tem;
            }
        }
        int USCLN = tem;
        System.out.println("USCLN :" +a+ "va" +b+" la :" + USCLN);
        System.out.println("BCNN :" +a+ "va" +b+ " la : " + (a*b)/USCLN);
        return USCLN;
    
    }
    
    
    
}
