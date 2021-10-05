/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coreconcepts.basic;

import java.util.Scanner;


public class Bai5 {
    public static int sumTongCacChuSoNguyen(){
        int n , soDu ;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap : ");
        n= sc.nextInt();
        
        while(n>0){
        soDu = n%10;
        n = n/10;
        sum += soDu;           
    }
        System.out.println("tổng là :" + sum);
        return sum;
    }
    
    
    
}
