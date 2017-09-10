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
public class karatsuba {
    public static BigInteger karatsuba(BigInteger numero1, BigInteger numero2){
        BigInteger cem = new BigInteger("100");
        int res = numero1.compareTo(cem);
        if (res==-1){
            BigInteger r=numero1.multiply(numero2);
            
            return r;
        } else{
           
            int N = Math.max(numero1.bitLength(), numero2.bitLength()); 
            N = (N / 2) + (N % 2);

        
        BigInteger b = numero1.shiftRight(N);
        BigInteger a = numero2.subtract(b.shiftLeft(N));
        BigInteger d = numero1.shiftRight(N);
        BigInteger c = numero2.subtract(d.shiftLeft(N));

        BigInteger ac    = karatsuba(a, c);
        BigInteger bd    = karatsuba(b, d);
        BigInteger abcd  = karatsuba(a.add(b), c.add(d));
           
        return ac.add(abcd.subtract(ac).subtract(bd).shiftLeft(N)).add(bd.shiftLeft(2*N));
        }
         
    }
}
