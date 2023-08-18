package GRAAFINEN.Dialog;

/*************************************
Tekijä: Tuomas Romppanen
Jakson numero: AVE1017-3009 
Jakson tehtävänumero: Jakso 5: Graafiset käyttöliittymät
Päiväys: 18.6.2022
*************************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class input extends JFrame {
    // Tehtävä 1 Lisää ikkunaan painike, joka avaa
    // Input Dialog tyyppisen dialogin
    // Luodaan tiedot valikoille
    private final Container contentPane=this.getContentPane();
    private final JMenuBar valikkorivi = new JMenuBar();
    private final JMenu valikko = new JMenu("Tiedosto");
    private final JButton button = new JButton("Avaa dialogi");
    private final BorderLayout border = new BorderLayout();
    private final GridBagConstraints GridBagContraints = new GridBagConstraints();
    private final JMenuItem JMenuOne = new JMenuItem("Avaa dialogi");
    private final JMenuItem  JMenuTwo = new JMenuItem("Lopeta");
    

    public input(){
    // Asetetaan ylätunnisteen valikko
    contentPane.setLayout(border);
    contentPane.add(valikkorivi, BorderLayout.NORTH);
    JMenuTwo.addActionListener(new LopetaOhjelma());
    valikko.add(valikko);
    valikko.add(JMenuOne);
    valikko.add(JMenuTwo);
    valikkorivi.add(valikko);
    this.setJMenuBar(valikkorivi);

    // Asetetaan painike keskelle 
    setLayout(new GridBagLayout());
    GridBagContraints.gridwidth = GridBagConstraints.REMAINDER;
    GridBagContraints.fill = GridBagConstraints.HORIZONTAL;
    contentPane.add(button, GridBagContraints);

    // Luodaan ActionListener menuvalikolle ja kutsutaan dialogtyyppinen tiedosto
    JMenuOne.addActionListener((ActionEvent e) -> {
        JOptionPane.showInputDialog("Syötä hakusana");
    });

    // Luodaan ActionListener painikkeelle ja kutsutaan dialogtyyppinen tiedosto
    button.addActionListener((ActionEvent e) -> {
        JOptionPane.showInputDialog("Syötä hakusana");
    });
    
    }

    // Asetetaan lopeta komento ylätunnisteen valikolle, joka on System.exit
    class LopetaOhjelma implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
              System.exit(0);
        }
    }

    public static void main(String[] args) {
        // Pääohjelma ikkunalle
        input frame = new input();
        frame.setSize(new Dimension(400,300));
        frame.setTitle("Ikkuna");
        frame.show();
  
      }}

