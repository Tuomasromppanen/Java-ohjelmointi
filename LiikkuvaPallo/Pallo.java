package LiikkuvaPallo;

/*************************************
Tekijä: Tuomas Romppanen
Jakson numero: AVE1017-3009
Jakson tehtävänumero: Jakso 6 tehtävät
Päiväys: 28.6.2022
*************************************/

import javax.swing.*;

// Tehtävä 3: Liikkuva Pallo
public class Pallo {

    // Luodaan frame ja yhdistetään testi-luokka while loopilla
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame();
        frame.setSize(350,350);
        frame.setTitle("Ikkuna");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 


        HaePallo luokka = new HaePallo();
        frame.add(luokka);
        while(true) {
            luokka.run();
            luokka.repaint();

        }
    }
    
}
