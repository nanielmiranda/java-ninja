package scanner;

import java.util.Scanner;

public class ScannerDousuario {
    public static void main(String[] args) {


        /*
         *scanner = é um jeito de trazer o usuário para dentro da aplicação
         * objetivo: O usuário vai criar um ninja e vamos validar os dados
         */
        //abrir o Scanner
        Scanner caixaDetexto = new Scanner(System.in);
        System.out.println("Escreva aqui o nome do Ninja ");

        String nomeDoninja= caixaDetexto.nextLine();
        System.out.println(" O nome do ninja é: " + nomeDoninja);

        System.out.println("Escreva aqui a idade do Ninja: ");
        int idadeDoninja = caixaDetexto.nextInt();
        System.out.println("A idade do Ninja é: " + idadeDoninja + " anos ");

        //tratamento de dados
        if (idadeDoninja >=18) {
            System.out.println("Esse Ninja é um Chounnin e está apto");
        } else {
            System.out.println("Esse Ninja ainda é um gennin e precisa de mais treinamento");
        }

        //fechar sempre o Scanner
        caixaDetexto.close();
    }
}
