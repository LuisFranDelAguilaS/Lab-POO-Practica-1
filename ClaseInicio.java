import java.util.Scanner;

public class ClaseInicio {


    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        Alumno al1 =new Alumno("",0,0,0,0,0 );


        int opcion= 0;

        do {
        System.out.println("-Opciones que puedes realizar-");
        System.out.println("1-Captura de nombre y calificaciones");
        System.out.println("2-Imprimir calificaciones y promedio de calificaciones");
        System.out.println("3-Imprimir calificaciones y calificación más baja");
        System.out.println("4-Imprimir calificaciones y calificación más alta");
        System.out.println("5-Salir");
        System.out.println("Cual opcion desea? :  ");


            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                     al1.nombre = CapturaEntrada.capturarCadena("Nombre alumno ");
                     al1.calificacion = CapturaEntrada.capturarFlotante("Calificacion 1");
                     al1.calificacion2 = CapturaEntrada.capturarFlotante("Calificacion 2");
                     al1.calificacion3= CapturaEntrada.capturarFlotante("Calificacion 3");
                     al1.calificacion4 = CapturaEntrada.capturarFlotante("Calificacion 4");
                     al1.calificacion5 = CapturaEntrada.capturarFlotante("Calificacion 5");


                    break;

                case 2:

                      float  suma=al1.calificacion+ al1.calificacion2+ al1.calificacion3+ al1.calificacion4+ al1.calificacion4;
                      float  prom=suma/5;
                      System.out.println("Alumno:"+al1.nombre);
                      System.out.println("---Calificaciones---");
                      System.out.println(al1.getCalificacion());
                      System.out.println(al1.getCalificacion2());
                      System.out.println(al1.getCalificacion3());
                      System.out.println(al1.getCalificacion4());
                      System.out.println(al1.getCalificacion5());
                      System.out.println();
                      System.out.println("El promedio es: "+prom);

                    break;

                case 3:

                    System.out.println("---Calificaciones---");
                    System.out.println(al1.getCalificacion());
                    System.out.println(al1.getCalificacion2());
                    System.out.println(al1.getCalificacion3());
                    System.out.println(al1.getCalificacion4());
                    System.out.println(al1.getCalificacion5());
                    System.out.println();

                    if ( (al1.calificacion > al1.calificacion2) && (al1.calificacion>al1.calificacion3) && (al1.calificacion>al1.calificacion4 ) && (al1.calificacion>al1.calificacion5 )) {
                        System.out.println("La calificacion mayor es: " + al1.calificacion);
                    }
                    else{
                        if ((al1.calificacion2 > al1.calificacion3) && (al1.calificacion2 > al1.calificacion4) && (al1.calificacion2 > al1.calificacion5))
                        {
                            System.out.println("La calificacion mayor es: " + al1.calificacion2);
                        }

                        else{
                            if ((al1.calificacion3 > al1.calificacion4) && (al1.calificacion3 > al1.calificacion5)) {
                                System.out.println("La calificacion mayor es: " + al1.calificacion3);
                            }
                            else
                            {
                                if ((al1.calificacion4 > al1.calificacion5))
                                {
                                    System.out.println("La calificacion mayor es: " + al1.calificacion4);
                                }
                                else {
                                    System.out.println("La calificacion mayor es: " + al1.calificacion5);
                                }

                            }

                        }

                    }

                    break;

                case 4:

                    System.out.println("---Calificaciones---");
                    System.out.println(al1.getCalificacion());
                    System.out.println(al1.getCalificacion2());
                    System.out.println(al1.getCalificacion3());
                    System.out.println(al1.getCalificacion4());
                    System.out.println(al1.getCalificacion5());
                    System.out.println();


                    if ( (al1.calificacion < al1.calificacion2) && (al1.calificacion<al1.calificacion3) && (al1.calificacion<al1.calificacion4 ) && (al1.calificacion<al1.calificacion5 )) {
                        System.out.println("La calificacion menor es: " + al1.calificacion);
                    }
                    else{
                        if ((al1.calificacion2 < al1.calificacion3) && (al1.calificacion2 < al1.calificacion4) && (al1.calificacion2 < al1.calificacion5))
                        {
                            System.out.println("La calificacion menor es: " + al1.calificacion2);
                        }

                        else{
                            if ((al1.calificacion3 < al1.calificacion4) && (al1.calificacion3 < al1.calificacion5)) {
                                System.out.println("La calificacion menor es: " + al1.calificacion3);
                            }
                            else
                            {
                                if ((al1.calificacion4 < al1.calificacion5))
                                {
                                    System.out.println("La calificacion menor es: " + al1.calificacion4);
                                }
                                else {
                                    System.out.println("La calificacion menor es: " + al1.calificacion5);
                                }

                            }

                        }

                    }

                    break;


            }
        }while(opcion!=5);

    }


}


class Alumno{

    String nombre;
    float   calificacion;
    float   calificacion2;
    float   calificacion3;
    float   calificacion4;
    float   calificacion5;



    public Alumno(String nombre, float calificacion, float calificacion2, float calificacion3,float calificacion4, float calificacion5){

        setNombre(nombre);
        setCalificacion(calificacion);
        setCalificacion2(calificacion2);
        setCalificacion3(calificacion3);
        setCalificacion4(calificacion4);
        setCalificacion5(calificacion5);

    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCalificacion(float calificacion){
        this.calificacion = calificacion;
    }
    public void setCalificacion2(float calificacion2){
        this.calificacion2 = calificacion2;
    }
    public void setCalificacion3(float calificacion3){
        this.calificacion3 = calificacion3;
    }
    public void setCalificacion4(float calificacion4){
        this.calificacion4 = calificacion4;
    }
    public void setCalificacion5(float calificacion5){
        this.calificacion5 = calificacion5;
    }

    public String getNombre(){
        return nombre;
    }

    public float getCalificacion(){
        return calificacion;
    }
    public float getCalificacion2(){
        return calificacion2;
    }
    public float getCalificacion3(){
        return calificacion3;
    }
    public float getCalificacion4(){
        return calificacion4;
    }
    public float getCalificacion5(){
        return calificacion5;
    }


}



// Es una clase que captura datos de tipo entero, flotante, double y string.
class CapturaEntrada {
    //Metodo que permite capturar numeros enteros
    //Al ser static son metodos de clase (Le pertenece a la clase)(por lo que ya no haria faltar instanciar o crear objeros, si no que puedes llamarlo con la clase)
    public static int capturarEntero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextInt());
    }
    //Metodo que permite capturar numeros flotantes
    public static float capturarFlotante(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextFloat());
    }
    //Metodo que permite capturar double
    public static double capturarDoble(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextDouble());
    }
    //Metodo que permite capturar cadenas
    public static String capturarCadena(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextLine());
    }

}



