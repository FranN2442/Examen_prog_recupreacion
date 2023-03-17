package edu.craptocraft.examen2;

import edu.craptocraft.examen2.Persona.Persona;

public class App 
{
    public static void main( String[] args )
    {
        // Persona fran = new Persona("Fran", 18, "41622502T", 70.00, 1.74, 'H')
        Persona gema = new Persona("Gema", 28, "1493478T", 70.00, 1.70, 'F');
        System.out.println(gema.calcularIMC());

        System.out.println(gema.esMayorDeEdad());

        System.out.println(gema.comprobarSexo('H'));

        System.out.println(gema.toString());

    }
}
