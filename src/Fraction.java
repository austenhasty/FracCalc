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
        return sum;
    }

    public Fraction subtract(Fraction other) {
        int numerator = (this.num * other.den) - (other.num * this.den);
        int denominator = this.den * other.den;
        Fraction answer = new Fraction(numerator, denominator);
        return answer;
    }

    public Fraction multiply(Fraction other) {
        int numerator = this.num * other.num;
        int denominator = this.den * other.den;
        Fraction answer = new Fraction(numerator, denominator);
        return answer;
    }
}
