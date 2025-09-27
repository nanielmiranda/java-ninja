package conditions;

public class lacosDeRepeticao {
    public static void main(String[] args) {

        /*
        *Laços de Repetição: vao repetir infinitamente ou até alcançar o limite que você colocou
        * WHILE = FOR
         */

        //While
        //while (condicao) {tudo aqui vai acontecer}

         int numeroDeClones = 0;
        int numeroMaximoDeclones = 40;
        /*while (numeroDeClones <= numeroMaximoDeclones ){
            numeroDeClones++;
            System.out.println("O Naruto fez um clone das sombras " + numeroDeClones);

        }*/

        //for

        for (int i = 0; i <= numeroMaximoDeclones; i++) {
            System.out.println("O Naruto fez um clone das sombras " + i);
            
        }


    }
}
