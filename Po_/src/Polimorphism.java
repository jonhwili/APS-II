//* Polimorfismo é a capacidade de um objeto decidir qual método 
//* aplicará a si mesmo, dependendo de onde se encontra na hierarquia 
//* de herança. 
//* Embora o método tenha sido chamado algumas vezes, o comportamento 
//*apresentado variou de acordo com a classe ao qual ele representava no momento.

public class Polimorphism {
  
    public static void main(String[] args) {
       Operacoes Som = new Soma();
       Operacoes Sub = new Subtrair();
       Operacoes Mult = new Multiplicar();
       Operacoes Div = new Dividir();
      
       Som.Calculo(6, 3);
       Sub.Calculo(6, 3);
       Div.Calculo(6, 3);
       Mult.Calculo(6, 3);
       
       
    }
    
}
