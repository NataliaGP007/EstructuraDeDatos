package ComplejidadAlgoritmica;

public class Algoritmo2 {

    public double sumar(int numero){
        // Tiempo inicial
        long inicio = System.nanoTime();
        int suma = 0;
        suma = (numero * (numero + 1)) / 2;
        // Tiempo final
        long fin = System.nanoTime();
        long tiempoEjecucion = fin - inicio;
        System.out.println("La suma es:" + suma);
        System.out.println("El tiempo de ejecucion fue:" + tiempoEjecucion);
        return suma;
    }
    // Metodo main
    public static void main (String args[]){
        Algoritmo1 prueba = new Algoritmo1();
        prueba.sumar(100);
    }
}
