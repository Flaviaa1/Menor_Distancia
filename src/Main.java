import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String [] ars){

        int cantPuntos;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese al cantidad de puntos");
            cantPuntos = leer.nextInt();
        } while ( cantPuntos < 2 || cantPuntos > 200 );

        //Cargar puntos

         ArrayPuntos arrayPuntos = new ArrayPuntos();
         ArrayList<Punto> misPuntos = arrayPuntos.cargarPuntos(cantPuntos);

        //calcular la distancia minima

        arrayPuntos.calcularDistanciaMin(misPuntos);

        /*Punto p1 = null;
        Punto p2 = null;

        double distaciaMin = 999999;

        for(int i = 0; i < misPuntos.size();i++){
            for(int j = 0; j < misPuntos.size()-1;j++){
                if(i!=j){
                    double distancia = misPuntos.get(i).pitagoras(misPuntos.get(j));
                    if (distancia < distaciaMin) {
                        p1= misPuntos.get(i);
                        p2= misPuntos.get(j);
                        distaciaMin = distancia;
                    }
                }
            }
        }

        //mostrar
        System.out.println("La menor distancia :" + distaciaMin);
        System.out.println("Punto "+p1+": "+p1.toString());
        System.out.println("Punto "+p2+": "+p2.toString());*/
    }
}