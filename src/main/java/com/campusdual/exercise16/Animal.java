package com.campusdual.exercise16;

public class Animal {

    /* Animal
 Mamífero
   Perro   ->   Balto
   Caballo ->   Spirit
 Ave
    Halcón ->   ???
    Pollo  ->   Calimero
 Pez
    Delfín ->   Flipper
    Orca   ->   Willy

Animal -> Altura / Peso / Edad
 Mamífero, Ave, Pez -> Características únicas de estos animales ->  Habitat + 2 características
 Perro, Caballo, Halcón, Pollo, Delfín, Orca -> Nombre cientifico, Nombre del animal, Territorio donde viven, Sonido del animal

Presentarse -> ONOMATOPEYA DEL SONIDO ("NOMBRE DEL ANIMAL")*/

    protected int altura;
    protected int peso;
    protected int edad;

    public Animal(int altura, int peso, int edad) {
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}

