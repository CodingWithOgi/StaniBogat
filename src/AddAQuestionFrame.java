import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AddAQuestionFrame {
    public static List<Question> list = new ArrayList<Question>();
    public AddAQuestionFrame() throws FileNotFoundException {
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
        JTextField correctfld = new JTextField("Which of the four options is the correct answer?");

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
        ans4fld.setFont(new Font("Ariel",Font.PLAIN,25));
        ans4fld.setHorizontalAlignment(SwingConstants.CENTER);

        correctfld.setBounds(700,700,520,60);
        correctfld.setFont(new Font("Ariel",Font.PLAIN,20));
        correctfld.setHorizontalAlignment(SwingConstants.CENTER);

        ready.setBounds(860,800,200,80);
        ready.setHorizontalAlignment(SwingConstants.CENTER);
        ready.setBackground(Color.PINK);

        ready.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // zapisva vyv file-a
                File file = new File("src/resources/question_list.txt");
                FileWriter output = null;
                try {
                    output = new FileWriter(file,true);
                    output.write("\n"+questionfld.getText()+""+correctfld.getText());
                    output.write("\n"+ans1fld.getText());
                    output.write("\n"+ans2fld.getText());
                    output.write("\n"+ans3fld.getText());
                    output.write("\n"+ans4fld.getText());
                    output.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                if(!(correctfld.getText().equals("1") || correctfld.getText().equals("2") || correctfld.getText().equals("3") || correctfld.getText().equals("4"))){
                    JOptionPane.showMessageDialog(null,"The correct answer should be a number 1 - 4","Correct answer invalid!", JOptionPane.ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"Added a question","Successfully added a question!", JOptionPane.PLAIN_MESSAGE);
                    int cr=2;
                    switch (correctfld.getText()){
                        case "1" : cr=1; break;
                        case "2" : cr=2; break;
                        case "3" : cr=3; break;
                        case "4" : cr=4; break;
                    }
                    list.add(new Question(questionfld.getText(),ans1fld.getText(),ans2fld.getText(),ans3fld.getText(),ans4fld.getText(),cr));
                    frame.dispose();
                }

            }
        });

        frame.add(questionfld);
        frame.add(ans1fld);
        frame.add(ans2fld);
        frame.add(ans3fld);
        frame.add(ans4fld);
        frame.add(ready);
        frame.add(correctfld);
        frame.setVisible(true);
    }
}
