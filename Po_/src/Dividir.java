//*Classe dividir herdando classe abastrata operações
 
public class Dividir extends Operacoes {
    @Override
    public double Calculo(double a, double b) {
       double r = a/b;
        System.out.println("A divisão de "+a+ " / "+b+ " e igual a: " +r );
       return a/b;
    }
}
