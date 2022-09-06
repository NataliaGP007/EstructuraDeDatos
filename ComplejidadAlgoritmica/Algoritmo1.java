package ComplejidadAlgoritmica;

public class Algoritmo1 {

    public double sumar(int numero){
        // Tiempo inicial
        long TiempoInicial = System.nanoTime();
        int suma = 0;
        for(int x = 1; x <= numero; x++){
            suma += x;
        }
        // Tiempo final
        long TiempoFinal = System.nanoTime();
        long tiempoEjecucion = TiempoFinal - TiempoInicial;
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
