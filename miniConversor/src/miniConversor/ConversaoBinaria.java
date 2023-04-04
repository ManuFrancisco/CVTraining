package miniConversor;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuel Francisco
 */
public class ConversaoBinaria {
    
    /**
     *
     * @param args
     */
    public static void main(String[]args){
	Scanner teclado = new Scanner(System.in);
		int dec;
		dec = Integer.parseInt(JOptionPane.showInputDialog("\t\n Insira um número para converter em binário:\n"));
		
		int bin = 0, cont = 0;
	int[] Bit = new int[010]; // Vetor para oito elementos
	if(dec <= 255){
	while(dec >= 1){
	    bin = dec;
	    bin %= 2;System.out.println(bin);
	    Bit[cont] = bin;
	    cont++;
	    dec /= 2;
	}
	System.out.println("Elementos do vetor Bit: "+Arrays.toString(Bit));
    }
	String strBinario = "";
	for(cont = Bit.length-1; cont >= 0; cont--) {
	    strBinario += Bit[cont];
	}
	JOptionPane.showMessageDialog(null,strBinario);
    }
}
    

