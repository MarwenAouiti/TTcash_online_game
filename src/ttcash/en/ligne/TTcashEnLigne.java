/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttcash.en.ligne;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class TTcashEnLigne {

    public static String nom11;
    public static String nom22;
    public static Serveur ss;
    public static Client ab;

    public static void nouvellepartie() {
        JFrame frame = new JFrame("Jeu En cours");
        nom11 = JOptionPane.showInputDialog(frame,
                "Entrer le nom joueur1", null);
        nom22 = JOptionPane.showInputDialog(frame,
                "Entre nom joueur2", null);
        Jeux t = new Jeux();
        t.setVisible(true);
        ss = new Serveur();
        ab = new Client();
        ss.start();
        ab.Client();

    }

    public static void main(String[] args) {
        // TODO code application logic here
        nouvellepartie();

    }
}
