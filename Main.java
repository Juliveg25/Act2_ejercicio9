
public class Main {
    public static void main(String[] args) {
        Enteros nuevoEntero = new Enteros();
        nuevoEntero.setEntero1();
        nuevoEntero.setEntero2();

        double valor1 = nuevoEntero.getEntero1();
        double valor2 = nuevoEntero.getEntero2();

        double respuesta = nuevoEntero.leerMayor(valor1, valor2);

        if (respuesta == 0) {
            System.out.println("Ambos enteros son iguales");
        } else {
            System.out.println("El mayor entero es: " + respuesta);
        }

    }
}