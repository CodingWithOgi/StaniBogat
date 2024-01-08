import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    public Menu(){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,1920,1040);
        frame.setLayout(null);

        JLabel menulbl = new JLabel("MENU");
        menulbl.setFont(new Font("Ariel",Font.BOLD, 72));
        menulbl.setBounds(760,0,400,200);
        menulbl.setHorizontalAlignment(SwingConstants.CENTER);
        //menulbl.setVerticalAlignment(SwingConstants.TOP);

        JButton gameBtn = new JButton("Start a new game");
        gameBtn.setBounds(660,250,600,150);
        gameBtn.setFont(new Font("Ariel",Font.PLAIN,40));
        gameBtn.setBackground(Color.cyan);

        JButton addAQuestionBtn = new JButton("Add a question");
        addAQuestionBtn.setBounds(660,500,600,150);
        addAQuestionBtn.setFont(new Font("Ariel",Font.PLAIN,40));
        addAQuestionBtn.setBackground(Color.cyan);

        JButton settingsButton = new JButton("Settings");
        settingsButton.setBounds(660,750,600,150);
        settingsButton.setFont(new Font("Ariel",Font.PLAIN,40));
        settingsButton.setBackground(Color.gray);

        gameBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameFrame frame1 = new GameFrame();
                frame.dispose();
            }
        });

        addAQuestionBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddAQuestionFrame frame1 = new AddAQuestionFrame();
            }
        });

        settingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SettingFrame frame1 = new SettingFrame();
            }
        });
        frame.add(menulbl);
        frame.add(gameBtn);
        frame.add(addAQuestionBtn);
        frame.add(settingsButton);
        frame.setVisible(true);
    }
}
