public class App{


    public static void main(String[] args) {

        char[] respuetas = {'a','a','b'};

        char[] resUsu = {'a','a','b'};        

        System.out.println(puntosCuestionario(resUsu,respuetas));
        System.out.println(puntosPregunta('a','b'));
        System.out.println(puntosPregunta('b','b'));



    }

    public static int puntosPregunta(char rc,char ru) {

        int res = 0;

        if (ru == rc){

            res = 2;

        }

        return res;
        
    }

    public static int puntosCuestionario(char[] respuestas, char[] claves){

        int res = 0;

        for (int i = 0; i < respuestas.length; i++){

            int resPreg = puntosPregunta(respuestas[i], claves[i]);

            res += resPreg;

        }

        return res;

    }



}