package Varipiste;

/*************************************
Tekijä: Tuomas Romppanen
Jakson numero: AVE1017-3009
Jakson tehtävänumero: Jakso 4 tehtävät
Päiväys: 6.6.2022
*************************************/

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.Timer;

// 3) Ohjelma tulostaa satunnaisiin paikkoihin satunnaisen värisiä pisteitä.

public class HaeVaripisteet extends JFrame {

    public HaeVaripisteet() {

        initUI();
    }

    private void initUI() {

        final Varipisteet surface = new Varipisteet();
        add(surface);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Timer timer = surface.getTimer();
                timer.stop();
            }
        });

        setTitle("Pisteet");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            HaeVaripisteet ex = new HaeVaripisteet();
            ex.setVisible(true);
        });
    }
}