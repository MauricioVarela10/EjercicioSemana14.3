import java.util.Scanner;

public class Cuadrado extends Figura{

    private double a;

    @Override
    double calcularArea() {
        double area = a*a;
        return area;
    }

    @Override
    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un lado: ");
        a=sc.nextDouble();
    }

    @Override
    double calcularPerimetro() {
        double perimetro = a*4;
        return perimetro;
    }
}
