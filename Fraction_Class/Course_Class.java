
package javaapplication29;


public class Fraction {
    
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        int gcd = gcd(numerator, denominator);
        int simplifiedNumerator = numerator / gcd;
        int simplifiedDenominator = denominator / gcd;
        return simplifiedNumerator + "/" + simplifiedDenominator;
    }

    public void add(Fraction fraction) {
        int newNumerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
        int newDenominator = this.denominator * fraction.denominator;
        this.numerator = newNumerator;
        this.denominator = newDenominator;
    }

    public void sub(Fraction fraction) {
        int newNumerator = this.numerator * fraction.denominator - fraction.numerator * this.denominator;
        int newDenominator = this.denominator * fraction.denominator;
        this.numerator = newNumerator;
        this.denominator = newDenominator;
    }

    public void multiplication(Fraction fraction) {
        int newNumerator = this.numerator * fraction.numerator;
        int newDenominator = this.denominator * fraction.denominator;
        this.numerator = newNumerator;
        this.denominator = newDenominator;
    }

    public void division(Fraction fraction) {
        int newNumerator = this.numerator * fraction.denominator;
        int newDenominator = this.denominator * fraction.numerator;
        this.numerator = newNumerator;
        this.denominator = newDenominator;
    }
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
