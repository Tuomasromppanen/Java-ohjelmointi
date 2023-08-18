package Varipiste;

/*************************************
Tekijä: Tuomas Romppanen
Jakson numero: AVE1017-3009
Jakson tehtävänumero: Jakso 4 tehtävät
Päiväys: 6.6.2022
*************************************/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.Random;

// 3) Ohjelma tulostaa satunnaisiin paikkoihin satunnaisen värisiä pisteitä.

class Varipisteet extends JPanel implements ActionListener {

    private final int DELAY = 500;
    private Timer timer;

    public Varipisteet() {

        initTimer();
    }

    private void initTimer() {

        timer = new Timer(DELAY, this);
        timer.start();
    }
    
    public Timer getTimer() {
        
        return timer;
    }


    @Override
    public void update(Graphics g) {
        paint(g);
    }

    @Override
    public void paint(Graphics g) {
        Dimension d = getSize();
        int x = (int)(Math.random()*d.width);
        int y = (int)(Math.random()*d.height);
        int red = rnd.nextInt(256);
        int green = rnd.nextInt(256);
        int blue = rnd.nextInt(256);
        g.setColor(new Color(red, green, blue));
        g.fillOval(x, y, 10, 10);

    }

    Random rnd = new Random();

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}


