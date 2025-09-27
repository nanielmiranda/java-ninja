package conditions;

public class Ternaris {
    public static void main(String[] args) {

        /*
        * Ternaris: são maneiras de reduzir o código
        *  variável = (condição) ? ValorVerdadeiro : ValorFalso
         */

        short numeroDeMissoes = 1;
        String nivelDoninja = (numeroDeMissoes>=10) ? "Esse Ninja está com mais de 10 missoes" : "Esse Ninja tem menos de 10 missoes";
        System.out.println(nivelDoninja);
    }
}
