import java.util.Scanner;

public class Piramide extends Figura {

    private double a;
    private double h;
    private double areabase,arealateral;
    @Override
    double calcularArea() {
        areabase =a*a;
        arealateral=(a*h)/2;
        double area = areabase+arealateral;
        return area;
    }

    @Override
    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un lado de la piramide cuadrangular: ");
        a = sc.nextDouble();
        System.out.println("Ingrese la altura");
        h = sc.nextDouble();
    }

    @Override
    double calcularPerimetro() {
        areabase =a*a;
        double perimetro = (areabase*h)/3;
        return perimetro;
    }
}
