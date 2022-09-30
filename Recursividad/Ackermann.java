package Recursividad;

// Método recursivo que calcula la función de Ackermann
public class Ackermann {

    public int FuncionAckermann (int m, int n){

        // Caso base
        if (m == 0)
            return  n+1;
        // Caso recursivo
        else if ( m > 0 && n == 0)
            return FuncionAckermann(m-1,1);
        else
            return FuncionAckermann(m-1, FuncionAckermann(m, n-1));
    }

    public static void main (String args[]){
        Ackermann prueba = new Ackermann();
        System.out.println(prueba.FuncionAckermann(1,2));
    }
}
