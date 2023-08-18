package Ympyra;

/*************************************
Tekijä: Tuomas Romppanen
Jakson numero: AVE1017-3009
Jakson tehtävänumero: Jakso 4 tehtävät
Päiväys: 6.6.2022
*************************************/

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.Timer;

// 2) Ohjelma piirtää ympyrän ja alkaa sitten täyttää sitä pisteillä.

class Variympyra extends JPanel implements ActionListener{
    private final int DELAY = 2;
    private Timer timer;

    public Variympyra() {
        initTimer();
    }

    private void initTimer() {
        timer = new Timer(DELAY,this);
        timer.start();
    }

    public Timer getTimer() {
        return timer;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

  
    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
    }
       

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        double padding = 40;
        double radius = Math.min(this.getWidth(), this.getHeight()) / 2 - padding;

        g2.draw(new Ellipse2D.Double(padding, padding, radius * 2, radius * 2));

        double a = Math.random() * 20 * Math.PI;
        double r = radius * Math.sqrt(Math.random());
        double x = r * Math.cos(a) + radius + padding;
        double y = r * Math.sin(a) + radius + padding;
        g2.setColor(Color.ORANGE);
        g2.fill(new Ellipse2D.Double(x, y, 4, 4));
    }
    
    @Override
    public void update(Graphics g) {
        paint(g);
    }
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Variympyra");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationByPlatform(true);
            frame.add(new Variympyra());
            frame.pack();
            frame.setVisible(true);
        });
    }
}
