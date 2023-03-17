package edu.craptocraft.examen2.Persona;

public class Persona {
    
    private String nombre = "";

    private int edad = 0;

    private String DNI = "";

    private final char SEXO;

    private double peso = 0d;

    private double altura = 0d;
    

    public Persona(char sexo) {
        
        this.SEXO = sexo;
    }
    
    public Persona(String nombre,int edad, char sexo){
        
        this.nombre = nombre;
        this.edad = edad;
        this.SEXO = sexo;
        
        
        
    }
    public Persona(String nombre, int edad, String DNI, double peso, double altura,char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.peso = peso;
        this.altura = altura;
        this.SEXO = sexo;
    }

    public String calcularIMC(){

        double imc = 0d;

        String res = "";

        imc = peso / (altura * altura);

        if (imc < 18.5){

            res = "El IMC esta por debajo el peso ideal.";

        } else  {

            if (imc >= 18.5 && imc <= 24.9 ){

                res = "La persona esta en el peso ideal";

            } else{

                if (imc >= 25 && imc <=29.9){

                    res = "La persona tiene sobrepeso.";

                } else {


                    if ( imc >= 30){


                        res = "La persona tiene obesidad";

                    }

                }


            }

        }

        return res;

    }

    public boolean esMayorDeEdad(){

        boolean res;

        if (edad >=18){

            res = true;
        } else {

            res = false;
        }

        return res;

    }

    public String comprobarSexo(char sexo){

        String res = "Introduce un caracter valido (F/H)";

        if (sexo == 'H'){

            res = "Es hombre";

        } else {

            if ( sexo == 'F'){

                res = "Es mujer";

            }

        }

        return res;

    }

    @Override
    public String toString() {
        return "\nCARACTERISTICAS DEL USUARIO"+ "\n-----------------------------" + "\nNombre: " + nombre + "\nEdad: " + edad + "\nDNI: " + DNI + "\nSexo:" + comprobarSexo(SEXO) + "\nPeso: " + peso
                + "\nAltura: " + altura;
    }

    

    

    
}
