import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;

// Driver Class
public class GameFrame{

    int rightAnswers = 0,questionIdx = 0;
    Question vupros = new Question();
    int correctAns= vupros.getCorrectans();

    JLabel otg = new JLabel();

    JButton opt1 = new JButton();
    JButton opt2 = new JButton();
    JButton opt3 = new JButton();
    JButton opt4 = new JButton();
    ButtonGroup group = new ButtonGroup();
    JLabel question = new JLabel();
    public GameFrame(){
        // Create the main frame
        JFrame frame = new JFrame("Stani Bogat");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,1920,1040);

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
        Image icon = Toolkit.getDefaultToolkit().getImage("src/images/gameicon.png");
        frame.setIconImage(icon);
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        settingItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SettingFrame setting = new SettingFrame();
            }
        });
        menuBar.add(fileMenu);

        // Create a panel with a button
        JPanel hintsPanel = new JPanel();
        hintsPanel.setLayout(new FlowLayout());
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

        otg.setBounds(1600,60,300,40);

        // Add action to the button
        btn50.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn50.setEnabled(false);

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
                btnCall.setEnabled(false);
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
                btnAudience.setEnabled(false);
            }
        });


        // Create another panel with text
        JPanel buttonsPanel = new JPanel ();
        buttonsPanel.setBounds(40,800,1820,100);
        //buttonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonsPanel.setLayout(new GridLayout(2,2,20,10));
        //buttonsPanel.setBackground(Color.pink);


        question.setText(vupros.getAsk());
        //question.setVerticalAlignment(SwingConstants.NORTH);
        question.setFont(new Font("Arial",Font.BOLD, 40));
        //question.setBounds(60,620,1800,100);
        //question.setHorizontalAlignment(SwingConstants.CENTER);


        opt1.setText(vupros.getAns1());
        opt1.setBounds(40,800,700,100);
        opt2.setText(vupros.getAns2());
        opt2.setBounds(40,940,700,100);
        opt3.setText(vupros.getAns3());
        opt3.setBounds(800,800,700,100);
        opt4.setText(vupros.getAns4());
        opt4.setBounds(800,940,700,100);

        opt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opt1.setEnabled(false);
                opt2.setEnabled(false);
                opt3.setEnabled(false);
                opt4.setEnabled(false);
                if(correctAns == 1){
                    ImageIcon icon = new ImageIcon("src/images/right.png");
                    JOptionPane.showMessageDialog(frame,"Congratulations, your answer is right!","RIGHT ANSWER",JOptionPane.PLAIN_MESSAGE,icon);
                    rightAnswers++;
                    new_question();
                }else{
                    ImageIcon icon = new ImageIcon("src/images/wrong.png");
                    JOptionPane.showMessageDialog(frame,"This is the wrong answer. It was still a good run and you got "+ rightAnswers + " correct answers."
                            ,"WRONG ANSWER",JOptionPane.PLAIN_MESSAGE,icon);
                }
            }
        });
        opt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opt1.setEnabled(false);
                opt2.setEnabled(false);
                opt3.setEnabled(false);
                opt4.setEnabled(false);
                if(correctAns == 2){
                    ImageIcon icon = new ImageIcon("src/images/right.png");
                    JOptionPane.showMessageDialog(frame,"Congratulations, your answer is right!","RIGHT ANSWER",JOptionPane.PLAIN_MESSAGE,icon);
                    rightAnswers++;
                    new_question();
                }else{
                    ImageIcon icon = new ImageIcon("src/images/wrong.png");
                    JOptionPane.showMessageDialog(frame,"This is the wrong answer. It was still a good run and you got "+ rightAnswers + " correct answers."
                            ,"WRONG ANSWER",JOptionPane.PLAIN_MESSAGE,icon);
                }
            }
        });
        opt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opt1.setEnabled(false);
                opt2.setEnabled(false);
                opt3.setEnabled(false);
                opt4.setEnabled(false);
                if(correctAns == 3){
                    ImageIcon icon = new ImageIcon("src/images/right.png");
                    JOptionPane.showMessageDialog(frame,"Congratulations, your answer is right!","RIGHT ANSWER",JOptionPane.PLAIN_MESSAGE,icon);
                    rightAnswers++;
                    new_question();
                }else{
                    ImageIcon icon = new ImageIcon("src/images/wrong.png");
                    JOptionPane.showMessageDialog(frame,"This is the wrong answer. It was still a good run and you got "+ rightAnswers + " correct answers."
                            ,"WRONG ANSWER",JOptionPane.PLAIN_MESSAGE,icon);
                }
            }
        });
        opt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opt1.setEnabled(false);
                opt2.setEnabled(false);
                opt3.setEnabled(false);
                opt4.setEnabled(false);
                if(correctAns == 4){
                    ImageIcon icon = new ImageIcon("src/images/right.png");
                    JOptionPane.showMessageDialog(frame,"Congratulations, your answer is right!","RIGHT ANSWER",JOptionPane.PLAIN_MESSAGE,icon);
                    rightAnswers++;
                    new_question();
                }else{
                    ImageIcon icon = new ImageIcon("src/images/wrong.png");
                    JOptionPane.showMessageDialog(frame,"This is the wrong answer. It was still a good run and you got "+ rightAnswers + " correct answers."
                            ,"WRONG ANSWER",JOptionPane.PLAIN_MESSAGE,icon);
                }
            }
        });

//        group.add(opt1);
//        group.add(opt2);
//        group.add(opt3);
//        group.add(opt4);


        //buttonsPanel.add(question);
        buttonsPanel.add(opt1);
        opt1.setContentAreaFilled(false);
        opt1.setFocusPainted(false);
        opt1.setBorderPainted(false);
        buttonsPanel.add(opt2);
        buttonsPanel.add(opt3);
        buttonsPanel.add(opt4);
        frame.add(buttonsPanel);

        // Set layout for the main frame
        frame.add(otg);
        frame.setLayout(null);
        frame.setJMenuBar(menuBar);
        frame.add(hintsPanel);

        frame.setVisible(true);
    }
    void new_question(){
        otg.setText("You have answered correctly to "+ rightAnswers+ " questions.");
        questionIdx++; /// calculate randomly
        vupros.change_question(questionIdx);
        correctAns = vupros.getCorrectans();
        question.setText(vupros.getAsk());
        opt1.setText(vupros.getAns1());
        opt2.setText(vupros.getAns2());
        opt3.setText(vupros.getAns3());
        opt4.setText(vupros.getAns4());
        opt1.setEnabled(true);
        opt2.setEnabled(true);
        opt3.setEnabled(true);
        opt4.setEnabled(true);
    }
}