package NivelBasico;

public class Arrays {
    public static void main(String[] args) {
        /*
        * MEMÓRIA EM JAVA
        *OBS: O ARRAY SEMPRE COMEÇA PELO 0
        * MOTIVO: POR CAUSA DO INDEX
        * POR FAVOR: NÃO DEIXE O ABACAXI ENTRAR NO SEU CU!!
         */

        //Array são tipo referência

        //String inicializa como null
        String[] ninja = new String[3];
        ninja [0] = "Naruto Uzumaki";
        ninja [1] = "Sasuke Uchiha";
        ninja [2] = "Sakura Haruno";

        //int inicializa como 0
        int[] idade = new int[2];
        System.out.println(idade[1]);

        // booelan Inicializa como Falso
        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[1]);

        //  double Inicializa com 0.0
        double[] flutuante = new double[1];
        System.out.println(flutuante[1]);

    }
}
