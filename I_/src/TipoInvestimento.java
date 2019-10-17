//* Classe que faz a mediação fazendo com que os componentes não sejam diretamente
//* acoplados.


public class TipoInvestimento {
    public static double MelhorInvestimento(double Valor)  {
        if(Valor < 1000){
            return(Poupanca.AplicaValor(Valor));
        }else{
            return(TesouroDireto.AplicaValor(Valor));
        }
    }
}
