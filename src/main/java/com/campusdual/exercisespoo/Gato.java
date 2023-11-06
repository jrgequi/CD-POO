package com.campusdual.exercisespoo;

import com.campusdual.util.Utils;

public class Gato {
    public String name;
    public String breed;
    public String sex;
    public static int age = 0;
    public static String hair = "negro";
    public static String colour;
    public boolean esCastrado;
    public String eyeColour = "green";

    public Gato(String name, String breed, String sex, boolean esCastrado) {
        this.name = name;
        this.breed = breed;
        this.hair = hair;
        this.sex = sex;
        this.esCastrado = esCastrado;
    }

    public static int obtenerEdad (){

        return age;
    }
    public static void changeAge () {
        age = Utils.integer("Introduce la edad correcta del Gato: ");
}

    public static String ColorDePelo () {

        colour=Utils.string("Introduce el color del Gato: ");
    return colour;
    }

    public void changeEyeColour () {
        this.eyeColour = Utils.string("Introduce el color de ojos: ")
    }
    public void chageCastrated() {
        this.esCastrado = true;
    }

    public void isCastrated() {
        if (this.esCastrado == true) {
            System.out.println("El gato está castrado");
        } else {
            System.out.println("El gato no está castrado");
        }

  /*
 Crea una clase llamada Cat
 La clase debe tener las siguientes propiedades sin inicializar:
 - nombre (name)
 - raza (breed)
 - sexo (sex)
 - edad en meses (age) (estática)
 - tamaño del pelo (hair)
 - color del pelo (colour) (estática)
 - un booleano que indique si está castrado/a o no (castrated)I

 La clase debe tener las siguientes propiedades con los valores inicializados
 - el color de los ojos (eyeColour): "green"

 Crea un constructor que incluya todos los atributos no inicializados

 Crea un método estático que cambie el color del pelo y otro no estático que cambie el color de los ojos

 Crea un método estático que cambie la edad del gato y otro no estático que permita recuperar ese valor cuando se invoque

 Crea un método que castre a los gatos y otro no estático, llamado isCastrated, que devuelva su estado

 Crea un método no estático llamado catDetails() que muestre todas las características de un gato (sé original en la presentación de los datos, dale un poco de arte)

 Crea un main()

 Crea un gato de la raza siamesa, otro de raza persa, y otro de raza esfinge

 Castra a los dos primeros gatos cambiando su booleano a true. Deja el otro gato sin castrar (false)

 Cámbiale el color del pelo a los dos primeros gatos

 Cámbiale el color de los ojos al último gato

 Cambia la edad del último gato. Intenta ponerle un valor negativo (su setter debe hacer la comprobación)

 Vuelve a hacer el ejercicio en una nueva clase aplicando la encapsulación (atributos private, getters y setters)
  Verás cómo afecta a los métodos estáticos
*/


}
