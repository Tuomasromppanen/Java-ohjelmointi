package Tausta;

/*************************************
Tekijä: Tuomas Romppanen
Jakson numero: AVE1017-3009
Jakson tehtävänumero: Jakso 4 tehtävät
Päiväys: 6.6.2022
*************************************/

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.border.Border;

// 12) Tulosta 8 eri väriä. Laita viivettä, jotta uusi väri näkyy jonkun aikaa esimerkiksi komponentin tai appletin taustavärinä. 
// Kerro myös nykyiset r-, g- ja b-komponenttien sisällöt vaikkapa Labeleissa. Vinkki: viiveen voi määritellä vaikkapa tyhjällä silmukalla.

public class Taustavari {

    private static final Color[] colors = {Color.RED, Color.BLUE, Color.ORANGE, Color.GREEN, Color.YELLOW, Color.pink, Color.white, Color.CYAN};
    private static int counter = 0;
    
    public static void main(String[] args) {

        JFrame frame = new JFrame("Taustavari");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(colors[counter++]);
        
        JLabel label = new JLabel();
        Border padding = BorderFactory.createEmptyBorder(200, 200, 150, 200);
        label.setBorder(padding);
        frame.add(label);
        frame.pack();

        Timer timer = new Timer(1000, e -> {

            frame.getContentPane().setBackground(colors[counter++]);
            if (counter >= colors.length) {
                counter = 0;
            }
        });

        timer.start();
        frame.setVisible(true);
    }
}  