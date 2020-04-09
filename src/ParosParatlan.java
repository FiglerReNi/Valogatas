/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class ParosParatlan {
    public static void main(String[]args){
        int[] a=new int[30];
        int[] b=new int[30];
        int[] c=new int[30];
        int osztob=0;
        int osztoc=0;
        System.out.print("Számok: ");
        for(int i=0; i<a.length; i++){
            a[i]=i+1;
            System.out.print(a[i]+" ");
        }
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                b[osztob]=a[i];
                osztob++;
            }
            else{
                c[osztoc]=a[i];
                osztoc++;
            }
        }
        System.out.println();
        System.out.print("Páros számok: ");
        for(int i=0; i<osztob; i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.print("Páratlan számok: ");
        for(int i=0; i<osztoc; i++){
            System.out.print(c[i]+" ");
        }
            }    
}
