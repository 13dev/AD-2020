package com.ad2020.aula7;

import java.util.Objects;

public class Rational implements Comparable<Rational> {

    private final int numerator;
    private final int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Rational rational = (Rational) o;

        return numerator == rational.numerator &&
                denominator == rational.denominator;
    }

    @Override
    public int compareTo(Rational rational) {
        return this.denominator * this.numerator - rational.denominator * rational.numerator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}
