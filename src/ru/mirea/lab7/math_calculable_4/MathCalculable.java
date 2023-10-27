package ru.mirea.lab7.math_calculable_4;

interface MathCalculable {
    Double Pow(Double a, Double b);

    Double AbsI(Double a, Double b);

    Double Pi();
}

class MathFunc implements MathCalculable {
    @Override
    public Double Pow(Double a, Double b) {
        return Math.pow(a, b);
    }

    @Override
    public Double AbsI(Double a, Double b) {
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public Double Pi() {
        return Math.PI;
    }
}