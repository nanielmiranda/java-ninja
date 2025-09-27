package estudoSwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        /*
        *SwitchCases: que servem para gerar casos específicos
        * Objetivo: Pedir para o usuário escolher entre os ninjas
        * switchCase
         */

        //pedir para o Usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 Naruto Uzumaki");
        System.out.println("2 Uchiha Sasuke");
        System.out.println("3 Sakura Haruno");

        int escolhaDousuario = scanner.nextInt();

        System.out.println("Você digitou o número " + escolhaDousuario);

        switch (escolhaDousuario) {
            case 1:
                System.out.println("O Usuário escolheu o Hokage Naruto Uzumaki ");
                break;
            case 2:
                System.out.println("O Personagem escolheo o último remanescente dos Uchiha, o Sasuke Uchiha ");
                break;
            case 3:
                System.out.println("O Usuário escolheu a ninja mais legal, Sakura Haruno ");
                break;
            default:
                System.out.println("Você não digitou uma resposta válida! Tente de novo");
        }



        //fechar a caixa
        scanner.close();
    }
}
