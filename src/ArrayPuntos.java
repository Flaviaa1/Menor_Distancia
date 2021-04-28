import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPuntos {

    ArrayList<Punto> misPuntos = new ArrayList<>();

    public  ArrayList<Punto> cargarPuntos(int cantPuntos){
        Scanner leer = new Scanner(System.in);


        for(int i = 1; i < cantPuntos+1;i++){
            System.out.println("Ingrese la X del punto "+i);
            int x = leer.nextInt();
            System.out.println("Ingrese la Y del punto "+i);
            int y = leer.nextInt();
            Punto punto = new Punto(x,y);
            punto.setX(x);
            punto.setY(y);
            misPuntos.add(punto);

        }

        return  misPuntos;
    }

    public void calcularDistanciaMin(ArrayList<Punto> misPuntos){

        Punto p1 = null;
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
        System.out.println("Punto "+p2+": "+p2.toString());



    }


}
