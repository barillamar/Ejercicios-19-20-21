package out.com.JavaAvanzado.Ejercicios.Ejercicios1920y21.Ejercicio3;

public class CalculadoraConCodigoLimpio {
    public int operar(int a, int b, String operacion) {
        int resultado = 0;

        switch (operacion) {
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multiplicación":
                resultado = a * b;
                break;
            case "division":
                resultado = a / b;
                break;
            default:
                System.out.println("Operación no válido");
        }
        return resultado;
    }
}

class Principal {
    public static void main(String[] args) {

        CalculadoraConCodigoLimpio calc = new CalculadoraConCodigoLimpio();

        System.out.println("El resultado de la suma es: " + calc.operar(2, 3, "suma"));
        System.out.println("El resultado de la resta es: " + calc.operar(7, 3, "resta"));
        System.out.println("El resultado de la multiplicación: " + calc.operar(4, 5, "multiplicación"));
        System.out.println("El resultado de la división es: " + calc.operar(10, 2, "division"));
    }
}