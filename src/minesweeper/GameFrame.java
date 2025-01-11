package minesweeper;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class GameFrame extends JFrame implements ActionListener {

    

    public GameFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.getContentPane().setBackground(new Color(220,230,255));
        this.setLocation(600, 150);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Minesweeper");
       





    }
    

    
    
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public void CraetBordGame(){



    }



}
