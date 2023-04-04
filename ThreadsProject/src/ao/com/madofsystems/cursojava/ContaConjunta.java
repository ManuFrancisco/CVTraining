/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ao.com.madofsystems.cursojava;

/**
 *
 * @author Manuel Francisco
 */
public class ContaConjunta {
    
    private int saldo = 100;

    public int getSaldo() {
	return saldo;
    }

    public void setSaldo(int saldo) {
	this.saldo = saldo;
    }
    public synchronized void sacar(int valor, String cliente){
	
	if(saldo >= valor){
	    int saldoOriginal = saldo;
	    System.out.println(cliente+ " Vai sacar ");
	    try {
		System.out.println(cliente + " a espera ");
		Thread.sleep(1000); //Aguardando processamento
	    } catch (InterruptedException e) {}
	    saldo -= valor;
	    String msg = cliente + " SACOU " + valor
		    + " [Saldo original = " + saldoOriginal
		    + ", Saldo final = " + saldo + "]";
	    System.out.println(msg);
	} else{
	    System.out.println("Saldo insuficiente para " + cliente);
	}
    }
    
}
