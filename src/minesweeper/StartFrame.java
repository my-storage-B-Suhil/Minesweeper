package minesweeper;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class StartFrame extends JFrame implements ActionListener {
    StartFrame(){
        Border testborder = BorderFactory.createLineBorder(Color.GREEN);
        
        JLabel titel = new JLabel();
        titel.setText("Minesweeper");
        titel.setForeground(Color.BLACK);
        titel.setFont(new Font("MV Boli",Font.PLAIN,50));
        titel.setHorizontalAlignment(JLabel.CENTER);
        titel.setVerticalAlignment(JLabel.CENTER);
        titel.setBackground(new Color(220,230,255));
        titel.setBounds(230, 0, 300, 100);
        
        
        titel.setBorder(testborder);
        
        
        JButton startButton = new JButton("Start");
        startButton.setFont(new Font("MV Boli",Font.PLAIN,30));
        startButton.setFocusable(false);
        startButton.setBackground(new Color(220,230,255));
        startButton.setForeground(Color.BLACK);
        startButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
         
        JButton easyButton = new JButton("Easy");
        easyButton.setFont(new Font("MV Boli",Font.PLAIN,30));
        easyButton.setFocusable(false);
        
        JButton hardButton = new JButton("Hard");
        hardButton.setFont(new Font("MV Boli",Font.PLAIN,30));
        hardButton.setFocusable(false);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(3,1,10,10));
        buttonsPanel.add(startButton);
        buttonsPanel.add(easyButton);
        buttonsPanel.add(hardButton);
        buttonsPanel.setBounds(280, 200, 200, 200);
        buttonsPanel.setBackground(new Color(220,230,255));
        
        buttonsPanel.setBorder(testborder);
       
        
        JCheckBox timerBox=new JCheckBox();
        timerBox.setText("If you want to play with timer check the box  (it will be harder!!)");
        timerBox.setBounds(200, 400, 400, 50);
        
        
        JPanel information = new JPanel();
        information.setLayout(null);
        
        JLabel Text = new JLabel();
        Text.setText("Suhild");
        Text.setFont(new Font("MV Boli",Font.PLAIN,30));
        Text.setBounds(0, 0, 500, 50);
        Text.setBorder(testborder);
        
        JButton how_to_play_button = new JButton();
        
        how_to_play_button.setBounds(700, 0, 65, 65);
        
        information.add(Text);
        information.add(how_to_play_button);
        
        
        
        information.setBounds(0, 670, 800, 100);
        information.setBackground(new Color(220,230,255));
        
        information.setBorder(testborder);
        
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.getContentPane().setBackground(new Color(220,230,255));
        this.setLocation(600, 150);
        this.setLayout(null);
        
        this.add(titel);
        this.add(buttonsPanel);
        this.add(timerBox);
        this.add(information);
        this.setVisible(true);
        
        
        
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
