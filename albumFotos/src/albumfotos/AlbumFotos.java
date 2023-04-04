/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albumfotos;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Manuel Francisco
 */
@SuppressWarnings("serial")
public class AlbumFotos extends JFrame implements ItemListener {
    JComboBox<String> combo;
    JLabel label;
    ImageIcon[] imagens;
    
    @Override
    public void itemStateChanged(ItemEvent e) {
	if(e.getStateChange() == ItemEvent.SELECTED){
		
          label.setIcon(imagens[combo.getSelectedIndex()]);
        }
    }

    AlbumFotos(){
        super("Album de Fotos");
	this.imagens = new ImageIcon[]{
	    new ImageIcon(getClass().getResource("Album_Pro/01.jpg")), 
	    new ImageIcon(getClass().getResource("Album_Pro/02.jpg")), 
	    new ImageIcon(getClass().getResource("Album_Pro/03.jpg")), 
	    new ImageIcon(getClass().getResource("Album_Pro/04.jpg")),
	    new ImageIcon(getClass().getResource("Album_Pro/05.jpg")),
	    new ImageIcon(getClass().getResource("Album_Pro/06.jpg"))
	};
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        combo = new JComboBox<>();
        //combo = setFont(new Font("serif", Font.PLAIN,26));
 
        combo.addItem("Foto - UAN");
        combo.addItem("impressão 3D");
        combo.addItem("MaDoFScott - "
		+ "inthe Art ");
        combo.addItem("Scott Dev.");
	combo.addItem("Impressora 3D");
	combo.addItem("Maravilha!!!");
        combo.addItemListener(this);

        label = new JLabel(imagens[0]);
        c.add(BorderLayout.NORTH, combo);
        c.add(BorderLayout.CENTER, label);

        setSize(530,626);
        setVisible(true);

    }

    public static void main(String[] args) {
	       new AlbumFotos();
    }

   
}
