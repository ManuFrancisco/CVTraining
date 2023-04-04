/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ao.com.madofsystems.cursojava;

/** Jogo das 52 cartas de um baralho
 *
 * @author Manuel Francisco
 */
public class JogoCartas {

    public static void main(String[] args) {

        String[] nipes = {"Ouros", "Copas", "Espadas", "Paus"};
        String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Dama", "Joker", "King", "Az"};
        // Recuperação de cada valor dos conteúdos dos arrays de forma aleatório atendendo as suas posições
        String nipe = nipes[(int) (Math.random() * 4)];
        String face = faces[(int) (Math.random() * faces.length)];
        // A linha abaico exibe a carta sorteada
        System.out.println(face + " de " + nipe);
    }

}
