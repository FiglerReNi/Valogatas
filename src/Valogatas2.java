/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class Valogatas2 {
    public static void main(String[]args){
        int[] a=new int[40];
        int[] b=new int[40];
        int[] c=new int[40];
        int indexb=0;
        int indexc=0;
        System.out.print("Számok: ");
        for(int i=0; i<a.length; i++){
            a[i]=(int)(Math.random()*50)+1;
            System.out.print(a[i]+" ");
        }
        for(int i=0; i<a.length; i++){
            if(a[i]<10){
                b[indexb]=a[i];
                indexb++;
            }
            else{
                c[indexc]=a[i];
                indexc++;
            }
        }
        System.out.println();
        System.out.print("Egyjegyű számok: ");
        for(int i=0; i<indexb; i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.print("Kétjegyű számok: ");
        for(int i=0; i<indexc; i++){
            System.out.print(c[i]+" ");
        }
    }    
}
