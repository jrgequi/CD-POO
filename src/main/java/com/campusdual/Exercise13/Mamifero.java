package com.campusdual.Exercise13;

public class Mamifero extends Animal {
    protected String habitat;
    protected String color;
    protected String numeroDePatas;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPies() {
        return numeroDePatas;
    }

    public void setPies(String numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public Mamifero(int altura, int peso, int edad, String habitat, String color, String numeroDePatas) {
        super(altura, peso, edad);
        this.habitat = habitat;
        this.color = color;
        this.numeroDePatas = numeroDePatas;
    }
}