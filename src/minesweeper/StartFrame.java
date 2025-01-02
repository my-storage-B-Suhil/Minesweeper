package minesweeper;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartFrame extends JFrame implements ActionListener {
   public boolean timer = false;
   public boolean easy = false;
   public boolean hard = false;
   public JButton startButton;
   public JButton easyButton;
   public JButton hardButton;
   public JCheckBox timerBox;
   public JButton how_to_play_button;
   public String tempraty="akl;jfd";
    
    
   StartFrame(){
        
        
        JLabel titel = new JLabel();
        titel.setText("Minesweeper");
        titel.setForeground(Color.BLACK);
        titel.setFont(new Font("MV Boli",Font.PLAIN,50));
        titel.setHorizontalAlignment(JLabel.CENTER);
        titel.setVerticalAlignment(JLabel.CENTER);
        titel.setBackground(new Color(220,230,255));
        titel.setBounds(230, 0, 300, 100);
        
        
        
        
        startButton = new JButton("Start");
        startButton.setFont(new Font("MV Boli",Font.PLAIN,30));
        startButton.setFocusable(false);
        startButton.setBackground(new Color(220,230,255));
        startButton.setForeground(Color.BLACK);
        startButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        startButton.addActionListener(this);
        
         
        easyButton = new JButton("Easy");
        easyButton.setFont(new Font("Comic Sans",Font.BOLD,25));
        easyButton.setFocusable(false);
        easyButton.setBackground(new Color(220,230,255));
        easyButton.setForeground(new Color(10,120,10));
        easyButton.setBorder(BorderFactory.createLineBorder(new Color(10,120,10)));
        easyButton.addActionListener(this);
        
        
        
        hardButton = new JButton("Hard");
        hardButton.setFont(new Font("Comic Sans",Font.BOLD,25));
        hardButton.setFocusable(false);
        hardButton.setBackground(new Color(220,230,255));
        hardButton.setForeground(new Color(120,10,10));
        hardButton.setBorder(BorderFactory.createLineBorder(new Color(120,10,10)));
        hardButton.addActionListener(this);

        
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(3,1,10,10));
        buttonsPanel.add(startButton);
        buttonsPanel.add(easyButton);
        buttonsPanel.add(hardButton);
        buttonsPanel.setBounds(280, 200, 200, 200);
        buttonsPanel.setBackground(new Color(220,230,255));
        
        
        
       
        
        timerBox = new JCheckBox("If you want to play with a timer, check the box (it will be harder!!)");
        timerBox.setBounds(200, 400, 500, 50);
        Font font = timerBox.getFont();
        timerBox.setFont(new Font(font.getName(), Font.PLAIN, 17));
        timerBox.setBackground(new Color(220,230,255));
        timerBox.setFocusable(false);
        timerBox.addActionListener(this);
        
        
        
        
        JPanel information = new JPanel();
        information.setLayout(null);
        
        
        JLabel Text = new JLabel();
        Text.setText("X/Twitter: @Suhild2004  //  Github: SUHIL-B");
        Text.setFont(new Font("MV Boli",Font.PLAIN,24));
        Text.setBounds(0, 0, 600, 70);

        ImageIcon book = new ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\Minesweeper\\src\\minesweeper\\istockphoto-1022453654-612x612-removebg-preview.png");
        Image boock = book.getImage();
        Image scaledBoock = boock.getScaledInstance(95, 91, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledBoock);

        how_to_play_button = new JButton();
        how_to_play_button.setBounds(665, 0, 80, 80);
        how_to_play_button.setIcon(scaledIcon);
        how_to_play_button.setBackground(new Color(220,230,255));
        how_to_play_button.setFocusable(false);
        how_to_play_button.setBorderPainted(false);
        how_to_play_button.addActionListener(this);
        
        
        information.add(Text);
        information.add(how_to_play_button);
        information.setBounds(0, 670, 800, 100);
        information.setBackground(new Color(220,230,255));
        
        
        
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.getContentPane().setBackground(new Color(220,230,255));
        this.setLocation(600, 150);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Minesweeper");
        this.add(titel);
        this.add(buttonsPanel);
        this.add(timerBox);
        this.add(information);

         ImageIcon image = new ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\Minesweeper\\src\\minesweeper\\minswper-removebg-preview (1).png");
        this.setIconImage(image.getImage());
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==startButton){
            
            if(hard == true || easy == true){
                new GameFrame();
                this.dispose();
            }
        }
        
        
        if (e.getSource()==easyButton){
            
            easy=true;
            easyButton.setForeground(new Color(20,255,20));
            easyButton.setBorder(BorderFactory.createLineBorder(new Color(20,255,20)));
            
            hardButton.setBorder(BorderFactory.createLineBorder(new Color(120,10,10)));
            hardButton.setForeground(new Color(120,10,10));
            hard = false;
        }
        
        
        if(e.getSource()==hardButton){
            
            hard=true;
            hardButton.setForeground(new Color(255,0,0));
            hardButton.setBorder(BorderFactory.createLineBorder(new Color(255,0,0)));

            easyButton.setBorder(BorderFactory.createLineBorder(new Color(10,120,10)));
            easyButton.setForeground(new Color(10,120,10));
            easy = false;
        }
        
        
        if(e.getSource()==how_to_play_button){
            
            JFrame information = new JFrame();
            
            information.setSize(500,500);
            information.getContentPane().setBackground(new Color(220,230,255));
            information.setLocation(750, 200);
            information.setLayout(null);
            information.setVisible(true);
            information.setResizable(false);
            


        }
        
        
        if(e.getSource()== timerBox){
            
            timer = timerBox.isSelected();

        }
        
    
    }
    
}
