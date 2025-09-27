package NivelBasico;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        /*
        DESAFIO
         */

        String[] ninja = new String[3];
        ninja[0] = "Sakura Haruno";
        ninja[1] = "Uchiha Madara";
        ninja[2] = "Neji  Hyuga";
        for (int i = 0; i <3 ; i++) {
            System.out.println("Nome dos Ninjas Escolhidos: " + ninja[i]);

            Scanner menuInterativo = new Scanner(System.in);
            System.out.println("Digite o nome do Ninja que você quer escolher para a missão "  );
            String ninjaescolhido = menuInterativo.nextLine();
            switch (ninjaescolhido) {
                case "Sakura Haruno":
                    System.out.println(" Sakura Haruno é uma Ninja Médica Talentosa ");
                    break;
                case "Uchiha Madara":
                    System.out.println("O Madara é o Uchiha Mais forte da História");
                    break;
                case "Neji Hyuga":
                    System.out.println(" O Neji, é o Hyuga mais talentoso do Mundo ");
                    break;
                default:
                    System.out.println("Você não escolheu nenhum ninja disponível");

                    menuInterativo.close();
            }




        }


    }
}
