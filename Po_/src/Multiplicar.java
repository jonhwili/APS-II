//*Classe multiplicar herdando classe abastrata operações

public class Multiplicar extends Operacoes {
     @Override
    public double Calculo(double a, double b) {
       double r = a*b;
        System.out.println("A multiplicação de "+a+ " * "+b+ " e igual a: " +r );
       return a*b;
    }    
}
