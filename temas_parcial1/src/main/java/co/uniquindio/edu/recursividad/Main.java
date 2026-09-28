package co.uniquindio.edu.recursividad;

public class Main {
    public static void main(String[] args) {
    //    MatrushkaRecursiva(5);
    int [] list = {1,3,4,5};
    int ans = sumaArregloBinaryAlgorithm(list, 0, list.length - 1);
    System.out.println(ans);
    }

    public static void MatrushkaRecursiva(int cant) {
        // Caso base
        if (cant <= 0) {
            return;
        }
        System.out.println("Abrí la matrushka: " + cant);

        // Caso Recursivo
        MatrushkaRecursiva(cant -1);
        System.out.println("Cerré la matrushka: " + cant);
    }

    // Calcular el factorial de un n >= 0
    // Recursividad: Directa - Lineal - No de cola
    public static int calcFactorial(int n) {
        //Caso base 
        if (n ==1) return 1;

        // Caso recursivo
        return n * calcFactorial(n-1);
    }

    // Recorrer un arreglo de forma recursiva
    public static void imprimirArreglo(int [] arreglo, int i) {
        // Caso base
        if (i == arreglo.length) {
            return;
        }

        // Imprime la posición
        System.out.println(arreglo[i]);

        // Caso recursivo
        imprimirArreglo(arreglo, i + 1);

        System.out.println(arreglo[i]);

    }

   public static int sumaArregloBinaryAlgorithm (int [] list, int start, int end) {
        // Caso base
        if (start == end) return list[start];

        int mid = start + (end - start) / 2;

        // Caso recursivo
        int sumLeft = sumaArregloBinaryAlgorithm(list, start, mid);
        int sumRight = sumaArregloBinaryAlgorithm(list, mid + 1, end);

        return sumLeft + sumRight;
    }
}