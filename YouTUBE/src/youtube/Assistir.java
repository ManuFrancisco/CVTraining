/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube;

/**
 *
 * @author Manuel Francisco
 */
public class Assistir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video[] video = new Video[3];
        video[0] = new Video("Aula 1 - Curso de Java");
        video[1] = new Video("Aula 3 - Curso de PHP");
        video[2] = new Video("Aula 4 - Curso de Python");
        Internauta assist[] = new Internauta[3];
        assist[0] = new Internauta("Scott",34,"M","MaDoF");
        assist[1] = new Internauta("Clélia",24,"F","Clé");
	assist[2] = new Internauta("Grettel",30,"F","Grett");
        assist[0].viuMaisUm(); assist[0].setExperiencia(4);   //viuMaisUm();
        assist[1].viuMaisUm(); assist[2].viuMaisUm();
        System.out.println("YOUTUBE - " + assist[0].toString());
        System.out.println("YOUTUBE - " + assist[1].toString());
	System.out.println("YOUTUBE - " + assist[2].toString());
        
    }

}
