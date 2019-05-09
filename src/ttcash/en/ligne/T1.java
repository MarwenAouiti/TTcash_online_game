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
class T1 implements Runnable {

    Jeu j;

    public T1(Jeu j1) {
        this.j = j1;
        new Thread(this, "Joueur1").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            j.Joueur1();
        }
    }
}
