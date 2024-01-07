import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;

// Driver Class
public class GameFrame{


    public GameFrame(){
        // Create the main frame
        JFrame frame = new JFrame("Stani Bogat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);

//        JLabel background=new JLabel(new ImageIcon("src/images/background.png"));
//        frame.add(background);
//        background.setLayout(new FlowLayout());
//        background.setSize(399,399);
//        background.setSize(1920,1080);

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Menu");
        JMenuItem settingItem = new JMenuItem("Settings");
        JMenuItem exitItem = new JMenuItem("Exit game");
        fileMenu.add(settingItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menuBar.add(fileMenu);

        // Create a panel with a button
        JPanel hintsPanel = new JPanel();
        hintsPanel.setLayout(null);
        hintsPanel.setBounds(1600,0,320,100);
        JButton btn50 = new JButton("50/50");
        btn50.setBounds(1620,15,80,40);
        JButton btnCall = new JButton("Call");
        btnCall.setBounds(1705,15,65,40);
        JButton btnAudience = new JButton("Audience");
        btnAudience.setBounds(1775,15,100,40);

        hintsPanel.add(btnCall);
        hintsPanel.add(btn50);
        hintsPanel.add(btnAudience);

        // Add action to the button
        btn50.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        btnCall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String ans;
                ans = "B";

                JLabel message = new JLabel("Your friend tells you answer "+ ans + " is correct!");
                message.setBounds(0, 0, 200, 64);
                message.setFont(new Font("Arial", Font.BOLD, 30));
                message.setHorizontalAlignment(SwingConstants.CENTER);

                ImageIcon icon = new ImageIcon("src/images/telephone.png");

                JOptionPane.showMessageDialog(frame, message, "Ask a friend", JOptionPane.PLAIN_MESSAGE, icon);
            }
        });
        btnAudience.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel message = new JLabel("A: 67 B: 20 C: 3 D: 10");
                message.setBounds(0, 0, 200, 64);
                message.setFont(new Font("Arial", Font.BOLD, 30));
                message.setHorizontalAlignment(SwingConstants.CENTER);

                JOptionPane.showMessageDialog(frame,message,"Votes from the audience",JOptionPane.PLAIN_MESSAGE);
            }
        });


        // Create another panel with text
        JPanel questionPanel = new JPanel ();
        questionPanel.setBounds(0,600,1920,480);
        //questionPanel.setLayout(null);
        questionPanel.setBackground(Color.pink);

        JLabel question = new JLabel("<html>Prez 2024 zapochva razrabotkata na proekt na java.<br>Koi sa negovite syzdateli?</html>");
        question.setHorizontalAlignment(SwingConstants.CENTER);
        question.setFont(new Font("Arial",Font.BOLD, 40));
        question.setBounds(60,620,1800,100);

        JRadioButton opt1 = new JRadioButton("Miro i Kalata");
        opt1.setBounds(40,800,700,100);
        JRadioButton opt2 = new JRadioButton("Kris I Drenchev");
        opt2.setBounds(40,940,700,100);
        JRadioButton opt3 = new JRadioButton("Ogi i Stefcho");
        opt3.setBounds(800,800,700,100);
        JRadioButton opt4 = new JRadioButton("Momichetata");
        opt4.setBounds(800,940,700,100);
        ButtonGroup group = new ButtonGroup();
        group.add(opt1);
        group.add(opt2);
        group.add(opt3);
        group.add(opt4);


        questionPanel.add(question);
        questionPanel.add(opt1);
        questionPanel.add(opt2);
        questionPanel.add(opt3);
        questionPanel.add(opt4);
        frame.add(questionPanel);

        // Set layout for the main frame
        frame.setLayout(null);
        frame.setJMenuBar(menuBar);
        frame.add(hintsPanel);

        frame.setVisible(true);
    }
}