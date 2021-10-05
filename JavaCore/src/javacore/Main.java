/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore;

import java.util.Scanner;

/**
 *
 * @author DAT
 */
public class Main {

   
 
    public void Xuat(int n){
        System.out.println("Tổng số lẻ" + sumSoLe(n));

    }


    //bai1a
    public static int sumSoLe(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static int sumSoChan(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;

        }
        return sum;
    }

    //bai2b
    public static float sumSTN(int n) {
        float sum = 0;
        for (int i = 1; i < n / 2; i++) {
            sum += 1 / i;

        }
        return sum;
    }
    
    //bai2
    public static int uocSo(int n){
        int dem = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                dem++;
                System.out.println("uoc la :" + n);
            }
        }
        return dem;
    }
    
    //bai3
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
    
    //bai5
    
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
