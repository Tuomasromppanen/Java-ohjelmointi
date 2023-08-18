package GRAAFINEN.Ikkuna;

/*************************************
Tekijä: Tuomas Romppanen
Jakson numero: AVE1017-3009 
Jakson tehtävänumero: Jakso 5: Graafiset käyttöliittymät
Päiväys: 18.6.2022
*************************************/

import java.awt.event.*;
import javax.swing.*;

public class sovellus extends JFrame {
    // Tehtävä 2 Tee itsenäinen ikunnallinen sovellus
    // Lisätään aloitemuuttajat JmenuBar ja Jmenulle
    JMenuBar valikkorivi;
    JMenu valikko;
    JMenuItem JMenuOne, JMenuTwo;

    public sovellus(){
        // Haetaan muuttujat ja lisätään tiedot, lisäksi lopeta komennolle 
        // asetetaan ActionListener, kun halutaan sulkea ikkuna
        valikkorivi = new JMenuBar();
        valikko = new JMenu("Tiedosto");
        JMenuOne = new JMenuItem("Avaa");
        JMenuTwo = new JMenuItem("Lopeta");
        JMenuTwo.addActionListener(new LopetaOhjelma());

        // Lisätään toiminnallisuudet valikolle
        valikko.add(valikko);
        valikko.add(JMenuOne);
        valikko.add(JMenuTwo);
        valikkorivi.add(valikko);

        // Määritellään ikkunan koko ja nimeäminen
        this.setJMenuBar(valikkorivi);
        this.setSize(400,300);
        this.setTitle("Ikkuna");
    }

    // Asetetaan LopetaOhjelmalle ActionListener, System.exit komento
    class LopetaOhjelma implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
              System.exit(0);
        }
    }


    public static void main(String[] args) {
        // Pääohjelma ikkunalle
        sovellus frame = new sovellus();
        frame.show();
  
      }}
    

