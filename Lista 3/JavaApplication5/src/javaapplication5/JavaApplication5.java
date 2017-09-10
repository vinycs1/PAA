/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.math.BigInteger;

/**
 *
 * @author vinyc
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigInteger n1,n2,n3;
        n1= new BigInteger("11111111111111111111");
        n2= new BigInteger("11111111111111111111");
        
        
        n3 = karatsuba.karatsuba(n1, n2);
        System.out.println(n3);
    }
    
}
