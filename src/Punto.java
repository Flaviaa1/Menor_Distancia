import java.util.Scanner;

public class Punto {
   private double x;
   private double y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;

    }

    public double pitagoras(Punto miPunto){
        double x1 = miPunto.getX()-this.getX();
        double y1 = miPunto.getY()-this.getY();
        return Math.sqrt(x1*x1 + y1*y1);
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }



    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }

}