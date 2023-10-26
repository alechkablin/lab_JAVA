package ru.mirea.lab6;

interface Convertable {
    void convert();


    class ToCels implements Convertable {
        private final Double kel;

        public ToCels(Double kel) {
            this.kel = kel;
        }

        @Override
        public void convert() {
            System.out.printf("%.2f Кельвинов = %.2f градусов Цельсия\n", kel, kel - 273.15);
        }
    }

    class ToKel implements Convertable {
        private final Double cels;

        public ToKel(Double cels) {
            this.cels = cels;
        }

        @Override
        public void convert() {
            System.out.printf("%.2f градусов Цельсия = %.2f Кельвинов\n", cels, cels + 273.15);
        }
    }

}



