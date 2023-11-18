package com.campusdual.Exercise13;

public class Ave extends Animal {
    protected String habitad;
    protected String color;
    protected String numeroDePatas;

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(String numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public Ave(int altura, int peso, int edad, String habitad, String color, String numeroDePatas) {
        super(altura, peso, edad);
        this.habitad = habitad;
        this.color = color;
        this.numeroDePatas = numeroDePatas;
    }
}
