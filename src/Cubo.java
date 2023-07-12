import java.util.Scanner;

public class Cubo extends Figura{

    private double a;

    @Override
    double calcularArea() {
        double area = 6*Math.pow(a,2);
        return area;
    }

    @Override
    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un lado: ");
            a = sc.nextDouble();
    }

    @Override
    double calcularPerimetro() {
        double perimetro = 12*a;
        return perimetro;
    }
}