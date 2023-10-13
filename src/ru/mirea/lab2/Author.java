package ru.mirea.lab2;

class Author{
    // Private attributes of author
    private String name; //поле
    private String email;
    private char gender;
    public Author(String name, String email, char gender){}

public String getName(){
        return name;
}

public String getEmail(){
        return email;
}

public char getGender(){
        return gender;
}

public void setName(String name){
        this.name = name;
}

public void setGender(char gender){
        this.gender = gender;
}

public void setEmail(String email){
        this.email = email;
}

@Override
public String toString(){
        return "Author " + name + " Author's email " + email + " Author's gender " + gender;
}
}