package introducao.telas;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
//borderLayout
public class telinha1 extends JFrame {
    public telinha1() {
        
        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Arquivo");
        JMenuItem menuItem = new JMenuItem("Abrir");
        menu.add(menuItem);
        barraMenu.add(menu);
        setJMenuBar(barraMenu);
        //JLabel texto = new JLabel("                 Eu ACREDITO");
        //add(texto,"North");
        JButton botao = new JButton("ME CLICA");
        add(botao,"South");
        JPanel painel = new JPanel();
        add(painel,"Center");
        painel.setBackground(Color.green);
        painel.add(new JButton("BOTAO"));
        painel.add(new JButton("BOTAO"));
        painel.add(new JButton("BOTAO"));
        painel.add(new JButton("BOTAO"));
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new telinha1();
    }
    
}
