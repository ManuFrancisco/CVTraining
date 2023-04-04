/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojecombate;

/**
 * Lutadores: Aula 7ab - Batalha entre emoges                                                                          Pretty Boy Francês
 *
 * @author Manuel Francisco            Putscript Brasileiro
 */                                                                                                                   //Snap Shadow  Est.Unido América
public class UltraEmojeCombate {                                                                                      //Ded Cod      Austráliano
                                                                                                                      //Ufocobol     Brasileiro

    /**
     *                                                                                                                //Nerdaart Est.Unido América
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "Francesa", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscipt", "Brasileiro", 29, 1.75f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snap Shadow", "Norte Americano", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Ded Code ", "Austaliano", 28, 1.75f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Ufocobol", "Brasileiro", 37, 1.75f, 109.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "Est.Unido América", 30, 1.81f, 105.7f, 12, 2, 4);
        /* l[0].apresentar();
        l[0].ganharLuta();
        */
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[2], l[3]);
        UEC01.lutar();
        l[2].status();
        l[3].status();
    }

}
