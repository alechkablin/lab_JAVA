package ru.mirea.lab20.ex.ex1;

class Generic<T extends Comparable, V extends Animal & Serializable, K> {
    private final T variable1;
    private final V variable2;
    private final K variable3;

    public Generic(T variable1, V variable2, K variable3) {
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.variable3 = variable3;
    }

    public T getVariable1() {
        return variable1;
    }

    public V getVariable2() {
        return variable2;
    }

    public K getVariable3() {
        return variable3;
    }

    public void printClass() {
        System.out.println("Variable 1: " + variable1.getClass().getName());
        System.out.println("Variable 2: " + variable2.getClass().getName());
        System.out.println("Variable 3: " + variable3.getClass().getName());
    }
}