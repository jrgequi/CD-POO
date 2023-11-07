package com.campusdual.exercise16;

public class Perro extends Mamifero {
    protected String nombreCientifico;
    protected String nombreDelAnimal;
    protected String territorio;
    protected String sonido;

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreDelAnimal() {
        return nombreDelAnimal;
    }

    public void setNombreDelAnimal(String nombreDelAnimal) {
        this.nombreDelAnimal = nombreDelAnimal;
    }

    public String getTerritorio() {
        return territorio;
    }

    public void setTerritorio(String territorio) {
        this.territorio = territorio;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public Perro(int altura, int peso, int edad, String habitad, String color, String pies, String nombreCientifico, String nombreDelAnimal, String territorio, String sonido) {
        super(altura, peso, edad, habitad, color, pies);
        this.nombreCientifico = nombreCientifico;
        this.nombreDelAnimal = nombreDelAnimal;
        this.territorio = territorio;
        this.sonido = sonido;
    }

    public void presentarse() {
        System.out.println(getSonido() + "Hola, mi nombre es " + getNombreDelAnimal());
    }

}
