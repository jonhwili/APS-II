//*No padrão grasp Indirection temos o seguinte problemaOnde atribuir 
//*uma responsabilidade para evitar acoplamento direto entre duas ou mais 
//*entidades? 
//*Como “desacoplar” objetos de forma que baixo acoplamento seja suportado 
//*e que o potencial de reuso permaneça alto?
//*Solução: Atribuir a responsabilidade a um objeto intermediário que irá 
//*mediar entre os demais componentes ou serviços de forma que eles não sejam 
//*diretamente acoplados.

public class Indirection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Depositante.VeriricarAplicacao(500);
        Depositante.VeriricarAplicacao(1200);
        
    }
    
}
