package LiikkuvaPallo;

/*************************************
Tekijä: Tuomas Romppanen
Jakson numero: AVE1017-3009
Jakson tehtävänumero: Jakso 6 tehtävät
Päiväys: 28.6.2022
*************************************/

import javax.swing.JPanel;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;


// Tehtävä 3: Liikkuva Pallo
class HaePallo extends JPanel implements Runnable {
    // Ohjaustanko
    private int x = 0;
    private int y = 0;
    private int xdir = 1,ydir = 1;
    private final int diameter = 50;
    

    // Käyninitettyvalikko
    @Override
    public void run() {
            x += xdir;
            y += ydir;

            if(x + xdir < 0) {
                xdir = 1;
            } else if(x + xdir > getWidth() - 50) {
                xdir = -1;
            } else if (y + ydir < 0) {
                ydir = 1;
            } else if ( y + ydir > getHeight() - 50) {
            ydir = -1;
            }
        try {
            Thread.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(HaePallo.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
      

    // Luodaan neliö
    @Override
    public void paint(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLUE);
    g.fillRect(x, y, diameter, diameter);
    
    }



}



 