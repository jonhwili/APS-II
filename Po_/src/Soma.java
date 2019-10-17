//*Classe Soma herdando classe abastrata operações
 
public class Soma extends Operacoes {
    @Override
    public double Calculo(double a, double b) {
       double r = a+b;
        System.out.println("A soma de "+a+ " + "+b+ " e igual a: " +r );
       return a+b;
    }
}