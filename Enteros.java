import java.util.Scanner;

public class Enteros {
    private double entero1;
    private double entero2;

    public void setEntero1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un entero: ");
        this.entero1 = scanner.nextDouble();
    }

    public void setEntero2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese otro entero: ");
        this.entero2 = scanner.nextDouble();
    }

    public double getEntero1() {
        return entero1;
    }

    public double getEntero2() {
        return entero2;
    }

    //Método que recibe 2 enteros y retorna el mayor.
    public double leerMayor(double valor1, double valor2) {
        if (valor1 < valor2) {
            return valor2;
        } else if (valor1 > valor2) {
            return valor1;
        } else {
            return 0;
        }
    }
}
