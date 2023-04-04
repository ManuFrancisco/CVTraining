/* JOGO do DADO*/
package ao.com.madofsystems.cursojava;

import java.util.Scanner;

/**
 * Função nativa do pacote Lang --- Math.random() onde Math -> Classe & random a
 * função da classe Math
 *
 * @author Manuel Francisco
 *
 */
public class JogodDado {

    
    public static void main(String[] args) {
        char ʹʹ = 's';  // No lugar da variavel ʹʹ pode ser opcao
        Scanner teclado = new Scanner(System.in);
        while (ʹʹ == 's') {
            System.out.println("Lançamento do Dado.................");
            int dado = (int) (Math.random() * 6 + 1);// Função da Biblioteca Lang neste caso vai gerar 6 n°s aleatórios cada um equival a FACE do Dado
            System.out.print("FACE " + dado);
            switch (dado) {
                case 1:
                    System.out.println("\tPILON");
                    break;
                case 2:
                    System.out.println("\tDUC");
                    break;
                case 3:
                    System.out.println("\tTRÍPLO");
                    break;
                case 4:
                    System.out.println("\tQUADRA");
                    break;
                case 5:
                    System.out.println("\tQUINA");
                    break;
                case 6:
                    System.out.println("\tSENA");
                    break;
            }
            System.out.println("Deseja lançar o dado novamente (s/n)?");
            ʹʹ = teclado.next().charAt(0);
            /* Essa instrução permitirá que seja apenas considerado
            
                                                            o primeiro caracter da palavra {(s)im}
                                                            caso seje digitada invez de apenas s*/
        }

    }

}
