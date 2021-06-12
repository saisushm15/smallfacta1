/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallfact;

import java.util.Scanner;

/**
 *
 * @author konda babu
 */
public class Smallfact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         int t=input.nextInt();
         while(t>0)
         {
             int n=input.nextInt();
             int fact=1;
             for(int i=n;i>=1;i--)
             {
                fact=fact*i;
             }
             System.out.println(fact);
         }
         t--;

    }
    
}
