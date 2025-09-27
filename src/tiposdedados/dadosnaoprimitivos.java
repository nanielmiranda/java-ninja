package tiposdedados;

public class dadosnaoprimitivos {
    public static void main(String[] args) {
        /*
         *Dados nao primitivos: String, Array, Class, enum
         * objetivo da aula: criar um ninja e atribuir métodos a ele -
         */
        String nome = "Naruto Uzumaki";
        String nomeUppercase =nome.toUpperCase();// ToUpperCase para letra maiúscula
        System.out.println(nomeUppercase);
        System.out.println("Esse texto está em CAPSLOCK " + nomeUppercase);
        System.out.println("Esse texto está normal " + nome);

    String aldeia = "ALDEIA DA FOLHA";
    String aldeiaLowercase = aldeia.toLowerCase(); //tolowercase
        System.out.println(aldeiaLowercase);
    }
}
