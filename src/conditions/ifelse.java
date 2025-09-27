package conditions;

public class ifelse {
    public static void main(String[] args) {
        /*
        *IF e ELSE- condições
        * Objetivo: passar o ninja de acordo com o numero de missoes
         */
        //ninja naruto
        String nome = "Naruto Uzumaki";
        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 20;
        String Rank = "";

        //(if) (condicao) (faça isso)
        if (numeroDeMissoes ==10 && idade > 15) {
            System.out.println("Rank: Chunnin");
            //System.out.println("Naruto está pronto para passar de nível");
        }   else if (numeroDeMissoes >= 20) {
            System.out.println("Jounin"); }
        else{
            System.out.println("Rank: Gennim");;
           // System.out.println("O Naruto nao alcancou o numero de missoes minimo");
        }

    }
}
