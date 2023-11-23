package ru.mirea.lab20.ex.ex1;

class Animal implements Serializable {
    // Класс, расширяемый параметром типа V
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}