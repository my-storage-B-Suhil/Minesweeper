package minesweeper;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartFrame {
    StartFrame(){
        JFrame frame = new JFrame();
        frame.setBackground(Color.yellow);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.getContentPane().setBackground(new Color(220,230,255));
        frame.setLayout(null);
        frame.setVisible(true);
        
        
        JLabel titel = new JLabel();
        titel.setText("Minesweeper");
        titel.setForeground(Color.WHITE);
        titel.setFont(new Font("MV Boli",Font.PLAIN,30));
        titel.setHorizontalAlignment(JLabel.CENTER);
        titel.setVerticalAlignment(JLabel.CENTER);
        
        titel.setBackground(Color.BLACK);
        titel.setOpaque(true);
        titel.setBounds(100, 100, 200, 100);
        frame.add(titel);
    }
    
    
    
}
