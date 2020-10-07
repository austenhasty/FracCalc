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
        Fraction sum;
        int numerator;
        int denominator;
        if (this.getDenominator() == other.getDenominator()) {
            numerator = this.getNumerator() + other.getDenominator();
            denominator = this.getDenominator();
        } else {
            numerator = (this.getNumerator() * other.getDenominator()) + (other.getDenominator() * this.getNumerator());
            denominator = this.getDenominator() * other.getDenominator();
        }
        sum = new Fraction(numerator, denominator);
        return sum;
    }
}
