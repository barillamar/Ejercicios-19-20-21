package out.com.JavaAvanzado.Ejercicios.Ejercicios1920y21.Ejercicio3;

public class CalculadoraMalHecha {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b){return a * b; }

    public int dividir(int a, int b) {return a / b; }


}

class Main {
    public static void main(String[] args) {
        CalculadoraMalHecha calc = new CalculadoraMalHecha();

        System.out.println("El resultado de la suma es: " + calc.sumar(2, 3));
        System.out.println("El resultado de la resta es: " + calc.restar(4, 2));
        System.out.println("El resultado de la multiplicación es: " + calc.multiplicar(4, 4));
        System.out.println("El resultado de la división es: " + calc.dividir(10, 5));
    }
}
