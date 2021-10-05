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
public class Bai1 {

    
    
    public static void main(String[] args) {     
         Scanner sc= new Scanner(System.in);
        System.out.println("moi nhap : ");
        int n = sc.nextInt();
        sc.close();
        Main a = new Main();
        a.Xuat(n);
    }
    
}
