/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttcash.en.ligne;

/**
 *
 * @author marwen.aouiti
 */
class T2 implements Runnable {

    Jeu m;

    public T2(Jeu m2) {
        this.m = m2;
        new Thread(this, "Joueur2").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            m.Joueur2();
        }
    }
}
