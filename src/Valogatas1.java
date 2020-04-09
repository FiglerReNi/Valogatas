/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class Valogatas1 {
    public static void main(String[]args){
        int[] a=new int[100];
        int[] b=new int[6];
        System.out.println("Dobások: ");
        for(int i=0; i<a.length; i++){
            a[i]=(int)(Math.random()*6)+1;
            System.out.print(a[i]+" ");
        }
        for(int i=0; i<a.length; i++){
            if(a[i]==1){
                b[0]++;
            }
            else if(a[i]==2){
                b[1]++;
            }
            else if(a[i]==3){
                b[2]++;
            }
            else if(a[i]==4){
                b[3]++;
            }
            else if(a[i]==5){
                b[4]++;
            }
            else if(a[i]==6){
                b[5]++;
            }
        }
        System.out.println();
        System.out.print("A dobások szétválogatva: ");
        for(int i=0; i<b.length; i++){
            System.out.print(b[i]+" ");
        }
        int c=b[0];
        int index=0;
        for(int i=0; i<b.length; i++){
            if(c<b[i]){
                c=b[i];
                index=i;
            }
        }
        System.out.println();
        System.out.println("A legtöbbet dobott szám: "+(index+1));
        System.out.println("Hányszor dobták ezt a számot: "+c);
        
    }
    
}
