public class Fraction {
    private int num;
    private int den;

    public Fraction(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("The denominator cannot be 0.");
        } else if (den < 0) {
            this.den = Math.abs(den);
            this.num = num * -1;
        } else {
            this.num = num;
            this.den = den;
        }
    }

    public int getNumerator() {
        return this.num;
    }

    public int getDenominator() {
        return this.den;
    }

    public String toString() {
        if (this.getDenominator() == 1) {
            return this.getNumerator() + "";
        } else {
            return this.getNumerator() + "/" + this.getDenominator();
        }
    }

    public double toDouble() {
        return (double) this.getNumerator() / this.getDenominator();
    }

    public Fraction add(Fraction other) {
        int numerator = (this.num * other.den) + (other.num * this.den);
        int denominator = this.den * other.den;
        Fraction sum = new Fraction(numerator, denominator);
        sum.toLowestTerms();
        return sum;
    }

    public Fraction subtract(Fraction other) {
        int numerator = (this.num * other.den) - (other.num * this.den);
        int denominator = this.den * other.den;
        Fraction answer = new Fraction(numerator, denominator);
        answer.toLowestTerms();
        return answer;
    }

    public Fraction multiply(Fraction other) {
        int numerator = this.num * other.num;
        int denominator = this.den * other.den;
        Fraction answer = new Fraction(numerator, denominator);
        answer.toLowestTerms();
        return answer;
    }

    public Fraction divide(Fraction other) {
        int numerator = (this.num * other.den);
        int denominator = (this.den * other.num);
        Fraction answer = new Fraction(numerator, denominator);
        answer.toLowestTerms();
        return answer;
    }

    public boolean equals(Object other) {
        if(other instanceof Fraction) {
            Fraction newFraction = (Fraction) other;
            this.toLowestTerms();
            newFraction.toLowestTerms();
            if(this.num == newFraction.num && this.den == newFraction.den) {
                return true;
            }
        }
        return false;
    }

    public void toLowestTerms() {
        int gcd = gcd(this.num, this.den);
        this.num = this.num / gcd;
        this.den = this.den / gcd;
    }

    public static int gcd(int numerator, int denominator) {
        while(numerator != 0 && denominator != 0) {
            int remainder = numerator % denominator;
            numerator = denominator;
            denominator = remainder;
        }
        return numerator;
    }
}
