/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montgomeryhoredukce;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Milan Z
 */
public final class MontgomeryhoRedukce {
    
    private BigInteger modulus;       // Musí být liché číslo nejméně 3
    // Vypoctena cisla
    private BigInteger reducer;       // Je exponentem cisla 2
    private int reducerBits;          // Je log2(reducer)
    private BigInteger reciprocal;    // Je reducer^-1 mod modulus
    private BigInteger mask;          // Protoze x mod reducer = x & (reducer - 1)
    private BigInteger factor;        // Je (reducer * reducer^-1 - 1) / n
    private BigInteger convertedOne;  // Je convertIn(BigInteger.ONE)

    // Modulus Musi byt liche cislo nejmene 3
    public MontgomeryhoRedukce(BigInteger modulus) {
        
        
        
        // Input parameter
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Zadej hodnotu modula: ");
	modulus = sc1.nextBigInteger(); // Musí být liché číslo nejméně 3 // Musí být liché číslo nejméně 3
        
        // Modulus
        if (modulus == null) {
            throw new NullPointerException("Modulus se nesmi byt nulovy.");
        }
        if (!modulus.testBit(0) || modulus.compareTo(BigInteger.ONE) <= 0) {
            throw new IllegalArgumentException("Modulus must byt liche cislo. Jeho hodnota musi byt alespon  3");
        }
        this.modulus = modulus;

        // Reducer
        reducerBits = (modulus.bitLength() / 8 + 1) * 8;  // Toto je nasobek 8
        reducer = BigInteger.ONE.shiftLeft(reducerBits);  // Toto je exponent cisla 256
        mask = reducer.subtract(BigInteger.ONE);
        assert reducer.compareTo(modulus) > 0 && reducer.gcd(modulus).equals(BigInteger.ONE);

        // Dalsi vypoctene cisla
        reciprocal = reducer.modInverse(modulus);
        factor = reducer.multiply(reciprocal).subtract(BigInteger.ONE).divide(modulus);
        convertedOne = reducer.mod(modulus);
    }

    // Rozsah x je bez limitu
    public BigInteger convertIn(BigInteger x) {
        return x.shiftLeft(reducerBits).mod(modulus);
    }

    // Rozsah x je bez limitu
    public BigInteger convertOut(BigInteger x) {
        return x.multiply(reciprocal).mod(modulus);
    }

    // Inputy a outputy jsou v Montgomeryho redukci v rozsahu [0, modulus)
    public BigInteger multiply(BigInteger x, BigInteger y) {
        assert x.signum() >= 0 && x.compareTo(modulus) < 0;
        assert y.signum() >= 0 && y.compareTo(modulus) < 0;
        BigInteger product = x.multiply(y);
        BigInteger temp = product.and(mask).multiply(factor).and(mask);
        BigInteger reduced = product.add(temp.multiply(modulus)).shiftRight(reducerBits);
        BigInteger result = reduced.compareTo(modulus) < 0 ? reduced : reduced.subtract(modulus);
        assert result.signum() >= 0 && result.compareTo(modulus) < 0;
        return result;
    }

    // Input x (base) a output (exponent) jsou v Montgomeryho redukci a v rozsahu [0, modulus); input y (exponent) je v standartni forme
    public BigInteger pow(BigInteger x, BigInteger y) {
        assert x.signum() >= 0 && x.compareTo(modulus) < 0;
        if (y.signum() == -1) {
            throw new IllegalArgumentException("Negativni (minusovy) exponent");
        }

        BigInteger z = convertedOne;
        for (int i = 0, len = y.bitLength(); i < len; i++) {
            if (y.testBit(i)) {
                z = multiply(z, x);
            }
            x = multiply(x, x);
        }
        return z;
    }

}
