/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttcash.en.ligne;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static ttcash.en.ligne.Jeux.j1;
import static ttcash.en.ligne.Jeux.j2;
import static ttcash.en.ligne.Jeux.j3;
import static ttcash.en.ligne.Jeux.j4;
import static ttcash.en.ligne.Jeux.j5;
import static ttcash.en.ligne.Jeux.j6;
import static ttcash.en.ligne.TTcashEnLigne.nom11;
import static ttcash.en.ligne.TTcashEnLigne.nom22;

/**
 *
 * @author marwen.aouiti
 */
class Jeu {

    boolean flag = false;
    static String reste;
    static String msgJoueur;
    static int nbEssaiJ2 = 5;
    static int nbEssaiJ1 = 5;
    int posJ1 = 0;
    int posJ2 = 0;
    String resultat = Integer.toString(Serveur.nb);

    public synchronized void Joueur1() {
        String num = null;
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        //Scanner sc = new Scanner(System.in);

        Jeux.jnom.setText(nom11);
        System.out.println("C'est le tour de Joueur 1 ");
        reste = "C'est le tour de Joueur 1 , il vous reste " + nbEssaiJ1 + " essai (s)";
        Jeux.affNbEssai.setText(reste);
        JFrame frame = new JFrame("Jeu En cours");
        num = JOptionPane.showInputDialog(frame,
                "Deviner un numéro", null);

        //System.out.println("" + num.length());
        char c1 = num.charAt(0);
        String s1 = String.valueOf(c1);
        Jeux.j1.setText(s1);
        char c2 = num.charAt(1);
        String s2 = String.valueOf(c2);
        Jeux.j2.setText(s2);
        char c3 = num.charAt(2);
        String s3 = String.valueOf(c3);
        Jeux.j3.setText(s3);
        char c4 = num.charAt(3);
        String s4 = String.valueOf(c4);
        Jeux.j4.setText(s4);
        char c5 = num.charAt(4);
        String s5 = String.valueOf(c5);
        Jeux.j5.setText(s5);
        char c6 = num.charAt(5);
        String s6 = String.valueOf(c6);
        Jeux.j6.setText(s6);

        System.out.println("J1 :" + num);
        if (nbEssaiJ1 > 0) {
            
            if (num.charAt(0) == resultat.charAt(0)) {
                j1.setBackground(Color.GREEN);
                posJ1++;

            } else if (num.charAt(0) == resultat.charAt(1) || num.charAt(0) == resultat.charAt(2) || num.charAt(0) == resultat.charAt(3) || num.charAt(0) == resultat.charAt(4) || num.charAt(0) == resultat.charAt(5)) {
                j1.setBackground(Color.BLUE);
            } else {
                j1.setBackground(Color.red);

            }
            if (num.charAt(1) == resultat.charAt(1)) {
                System.out.println("" + resultat.charAt(posJ2));
                j2.setBackground(Color.GREEN);
                posJ1++;
            } else if (num.charAt(1) == resultat.charAt(0) || num.charAt(1) == resultat.charAt(2) || num.charAt(1) == resultat.charAt(3) || num.charAt(1) == resultat.charAt(4) || num.charAt(1) == resultat.charAt(5)) {
                j2.setBackground(Color.BLUE);
            } else {
                j2.setBackground(Color.red);

            }
            if (num.charAt(2) == resultat.charAt(2)) {
                j3.setBackground(Color.GREEN);
                posJ1++;
            } else if (num.charAt(2) == resultat.charAt(0) || num.charAt(2) == resultat.charAt(2) || num.charAt(2) == resultat.charAt(3) || num.charAt(2) == resultat.charAt(4) || num.charAt(2) == resultat.charAt(5)) {
                j3.setBackground(Color.BLUE);
            } else {
                j3.setBackground(Color.red);

            }
            if (num.charAt(3) == resultat.charAt(3)) {
                j4.setBackground(Color.GREEN);
                posJ1++;

            } else if (num.charAt(3) == resultat.charAt(0) || num.charAt(3) == resultat.charAt(2) || num.charAt(3) == resultat.charAt(4) || num.charAt(3) == resultat.charAt(5) || num.charAt(3) == resultat.charAt(1)) {
                j4.setBackground(Color.BLUE);
            } else {
                j4.setBackground(Color.red);

            }
            if (num.charAt(4) == resultat.charAt(4)) {
                j5.setBackground(Color.GREEN);
                posJ1++;
            } else if (num.charAt(4) == resultat.charAt(0) || num.charAt(4) == resultat.charAt(1) || num.charAt(4) == resultat.charAt(2) || num.charAt(4) == resultat.charAt(3) || num.charAt(4) == resultat.charAt(5)) {
                j5.setBackground(Color.blue);
            } else {
                j5.setBackground(Color.red);

            }
            if (num.charAt(5) == resultat.charAt(5)) {
                j6.setBackground(Color.GREEN);
                posJ1++;
            } else if (num.charAt(5) == resultat.charAt(0) || num.charAt(5) == resultat.charAt(1) || num.charAt(5) == resultat.charAt(2) || num.charAt(5) == resultat.charAt(3) || num.charAt(5) == resultat.charAt(4)) {
                j6.setBackground(Color.BLUE);
            } else {
                j6.setBackground(Color.red);
                 
            }
            nbEssaiJ1--;
        } 
        if (nbEssaiJ1 == 0) {
            System.err.println("J1 You LOST");
            JOptionPane.showMessageDialog(null, "YOU LOST", "J1 You LOST",
                    JOptionPane.WARNING_MESSAGE);
        }
        if ((num.charAt(0) == resultat.charAt(0) && num.charAt(1) == resultat.charAt(1) && num.charAt(2) == resultat.charAt(2) && num.charAt(3) == resultat.charAt(3) && num.charAt(4) == resultat.charAt(4) && num.charAt(5) == resultat.charAt(5))) {
            JOptionPane.showMessageDialog(null, "Bravo Joueur 1 Correct, Vous Avez Gagné!!", "FYI", JOptionPane.INFORMATION_MESSAGE, null);
            System.exit(0);
        }
        flag = true;
        notify();

    }

    public synchronized void Joueur2() {
        String num;
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        //Scanner sc = new Scanner(System.in);
        Jeux.jnom.setText(nom22);
        System.out.println("Cest Le tour de joueur 2");
        reste = "C'est le tour de Joueur 2 , il vous reste " + nbEssaiJ2 + " essai (s)";
        Jeux.affNbEssai.setText(reste);
        JFrame frame = new JFrame("Jeu En cours");
        num = JOptionPane.showInputDialog(frame,
                "Deviner un numéro", null);
        char c1 = num.charAt(0);
        String s1 = String.valueOf(c1);
        Jeux.j1.setText(s1);
        char c2 = num.charAt(1);
        String s2 = String.valueOf(c2);
        Jeux.j2.setText(s2);
        char c3 = num.charAt(2);
        String s3 = String.valueOf(c3);
        Jeux.j3.setText(s3);
        char c4 = num.charAt(3);
        String s4 = String.valueOf(c4);
        Jeux.j4.setText(s4);
        char c5 = num.charAt(4);
        String s5 = String.valueOf(c5);
        Jeux.j5.setText(s5);
        char c6 = num.charAt(5);
        String s6 = String.valueOf(c6);
        Jeux.j6.setText(s6);

        if (nbEssaiJ2 > 0) {
            if (num.charAt(0) == resultat.charAt(0)) {
                j1.setBackground(Color.GREEN);

            } else if (num.charAt(0) == resultat.charAt(1) || num.charAt(0) == resultat.charAt(2) || num.charAt(0) == resultat.charAt(3) || num.charAt(0) == resultat.charAt(4) || num.charAt(0) == resultat.charAt(5)) {
                j1.setBackground(Color.BLUE);
            } else {
                j1.setBackground(Color.red);

            }
            if (num.charAt(1) == resultat.charAt(1)) {
                System.out.println("" + resultat.charAt(posJ2));
                j2.setBackground(Color.GREEN);
                posJ1++;
            } else if (num.charAt(1) == resultat.charAt(0) || num.charAt(1) == resultat.charAt(2) || num.charAt(1) == resultat.charAt(3) || num.charAt(1) == resultat.charAt(4) || num.charAt(1) == resultat.charAt(5)) {
                j2.setBackground(Color.BLUE);
            } else {
                j2.setBackground(Color.red);

            }
            if (num.charAt(2) == resultat.charAt(2)) {
                j3.setBackground(Color.GREEN);
                posJ1++;
            } else if (num.charAt(2) == resultat.charAt(0) || num.charAt(2) == resultat.charAt(2) || num.charAt(2) == resultat.charAt(3) || num.charAt(2) == resultat.charAt(4) || num.charAt(2) == resultat.charAt(5)) {
                j3.setBackground(Color.BLUE);
            } else {
                j3.setBackground(Color.red);

            }
            if (num.charAt(3) == resultat.charAt(3)) {
                j4.setBackground(Color.GREEN);
                posJ1++;

            } else if (num.charAt(3) == resultat.charAt(0) || num.charAt(3) == resultat.charAt(2) || num.charAt(3) == resultat.charAt(4) || num.charAt(3) == resultat.charAt(5) || num.charAt(3) == resultat.charAt(1)) {
                j4.setBackground(Color.BLUE);
            } else {
                j4.setBackground(Color.red);

            }
            if (num.charAt(4) == resultat.charAt(4)) {
                j5.setBackground(Color.GREEN);
                posJ1++;
            } else if (num.charAt(4) == resultat.charAt(0) || num.charAt(4) == resultat.charAt(1) || num.charAt(4) == resultat.charAt(2) || num.charAt(4) == resultat.charAt(3) || num.charAt(4) == resultat.charAt(5)) {
                j5.setBackground(Color.blue);
            } else {
                j5.setBackground(Color.red);

            }
            if (num.charAt(5) == resultat.charAt(5)) {
                j6.setBackground(Color.GREEN);
                posJ1++;
            } else if (num.charAt(5) == resultat.charAt(0) || num.charAt(5) == resultat.charAt(1) || num.charAt(5) == resultat.charAt(2) || num.charAt(5) == resultat.charAt(3) || num.charAt(5) == resultat.charAt(4)) {
                j6.setBackground(Color.BLUE);
            } else {
                j6.setBackground(Color.red);

            }
            nbEssaiJ2--;
        }
        if (nbEssaiJ2 == 0) {
            System.err.println("J2 You LOST");
            JOptionPane.showMessageDialog(null, "YOU LOST", "J2 You LOST",
                    JOptionPane.WARNING_MESSAGE);
        }
        if ((num.charAt(0) == resultat.charAt(0) && num.charAt(1) == resultat.charAt(1) && num.charAt(2) == resultat.charAt(2) && num.charAt(3) == resultat.charAt(3) && num.charAt(4) == resultat.charAt(4) && num.charAt(5) == resultat.charAt(5))) {
            JOptionPane.showMessageDialog(null, "Bravo Joueur 2 Correct, Vous avez gangné!!", "FYI", JOptionPane.INFORMATION_MESSAGE, null);
            System.exit(0);
        }
        flag = false;
        notify();
    }
}
