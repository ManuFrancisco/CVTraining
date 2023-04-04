package simpletexteditor;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Manuel Francisco
 */
public class SimpleTextEditor extends JFrame implements ActionListener {

    JTextArea texto;
    JButton botao;

    public SimpleTextEditor() {
	super("Editor de texto");
	
	this.texto = new JTextArea();
	JScrollPane scroll = new JScrollPane(texto);
	this.texto.setFont(new Font("serif", Font.PLAIN, 26));
	this.botao = new JButton("Abrir Arquivo");
	this.botao.setFont(new Font("serif", Font.PLAIN, 26));
	this.botao.addActionListener(this);
	Container campoEdit = getContentPane();
	campoEdit.add(BorderLayout.CENTER, scroll);
	campoEdit.add(BorderLayout.SOUTH, botao);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	setSize(500,300);
    }
    
    public static void main(String[] args) {
	new SimpleTextEditor();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
	 
	JFileChooser c = new JFileChooser();
	c.showOpenDialog(this);
	File file = c.getSelectedFile();
	
	try {
	    Path path = Paths.get(file.getAbsolutePath());
	    String retorno = new String(Files.readAllBytes(path));
	    texto.setText(retorno);
	
	} catch (IOException erro) {
	    JOptionPane.showMessageDialog(this, "Não conseguimos abrir o ficheiro!");
	}
    }
    
}
