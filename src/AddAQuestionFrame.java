import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
public class AddAQuestionFrame {
    public AddAQuestionFrame(){
        JFrame frame = new JFrame("Add a question");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(0,0,1920,1040);
        frame.setLayout(null);
        JTextField questionfld = new JTextField("Type in your question here.");
        JTextField ans1fld = new JTextField("Type in answer 1 here.");
        JTextField ans2fld = new JTextField("Type in answer 2 here.");
        JTextField ans3fld = new JTextField("Type in answer 3 here.");
        JTextField ans4fld = new JTextField("Type in answer 4 here.");
        JButton ready = new JButton("SUBMIT");

        questionfld.setBounds(260,150,1400,100);
        questionfld.setFont(new Font("Ariel", Font.PLAIN,40));
        questionfld.setHorizontalAlignment(SwingConstants.CENTER);


        ans1fld.setBounds(220,350,700,80);
        ans1fld.setFont(new Font("Ariel",Font.PLAIN,25));
        ans1fld.setHorizontalAlignment(SwingConstants.CENTER);

        ans2fld.setBounds(1000,350,700,80);
        ans2fld.setFont(new Font("Ariel",Font.PLAIN,25));
        ans2fld.setHorizontalAlignment(SwingConstants.CENTER);

        ans3fld.setBounds(220,520,700,80);
        ans3fld.setFont(new Font("Ariel",Font.PLAIN,25));
        ans3fld.setHorizontalAlignment(SwingConstants.CENTER);

        ans4fld.setBounds(1000,520,700,80);
        ans4fld.setFont(new Font("Airel",Font.PLAIN,25));
        ans4fld.setHorizontalAlignment(SwingConstants.CENTER);

        ready.setBounds(860,700,200,80);
        ready.setHorizontalAlignment(SwingConstants.CENTER);
        ready.setBackground(Color.PINK);

        ready.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // zapisva vyv file-a
                JOptionPane.showMessageDialog(null,"Added a question","Successfully added a question!", JOptionPane.PLAIN_MESSAGE);
                frame.dispose();
            }
        });

        frame.add(questionfld);
        frame.add(ans1fld);
        frame.add(ans2fld);
        frame.add(ans3fld);
        frame.add(ans4fld);
        frame.add(ready);
        frame.setVisible(true);
    }
}
