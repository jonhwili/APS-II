//*Classe subtrair herdando classe abastrata operações
public class Subtrair extends Operacoes {
    @Override
    public double Calculo(double a, double b) {
        double r = a-b;
        System.out.println("a subtração de "+a+ " - "+b+ " e igual a: " +r );
       return a-b;
    }
}

