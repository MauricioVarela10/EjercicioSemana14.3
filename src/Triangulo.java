import java.util.Scanner;
public class Triangulo extends Figura{

    private double lado, altura;


    @Override
    double calcularArea() {
        double area = (lado*altura)/2;
        return area;
    }

    @Override
    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un lado del triangulo equilatero: ");
        lado = sc.nextDouble();
        System.out.println("Ingrese un lado del triangulo equilatero: ");
        altura = sc.nextDouble();
    }

    @Override
    double calcularPerimetro(){
        double perimetro = lado*3;
        return perimetro;
    }

}
