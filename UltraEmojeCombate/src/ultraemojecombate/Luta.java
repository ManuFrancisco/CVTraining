/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojecombate;
import java.util.Random;
/**
 * Aula 8b
 * @author Manuel Francisco
 */
public class Luta {

    // Atributos da Classe
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    // Métodos
   public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)) {
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
    if(this.aprovado){
        System.out.println("###### DESAFIADO ######");
        this.desafiado.apresentar();
        System.out.println("###### DESAFIANTE ######");
        this.desafiante.apresentar();
        Random aleatorio = new Random();
          int vencedor = aleatorio.nextInt(3); //0 1 2 
          switch(vencedor){
              case 0://Empate
                  System.out.println("Empate!");
                  this.desafiado.empatarLuta();
                  this.desafiante.empatarLuta();
                  break;
              case 1://Desafiado Vence
                  System.out.println(" Venceu "+ this.desafiado.getNome()+"!");
                  this.desafiado.ganharLuta();
                  this.desafiante.perderLuta();
                  break;
              case 2: //Desafiante Vence
                  System.out.println("Venceu "+ this.desafiante.getNome()+"!");
                  this.desafiado.perderLuta();
                  this.desafiante.ganharLuta();
                  break;
          }
        }else{
            System.out.println("A luta não pode acontecer");
        }
    }

    // Métodos Especiais
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

   
}
