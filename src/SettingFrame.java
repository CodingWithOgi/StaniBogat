import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SettingFrame {
    public SettingFrame() {
        JFrame frame = new JFrame("Settings");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.setLayout(null);

        Image icon = Toolkit.getDefaultToolkit().getImage("src/images/settings.png");
        frame.setIconImage(icon);

        JLabel nadpis = new JLabel("SETTINGS");
        nadpis.setHorizontalAlignment(SwingConstants.CENTER);
        nadpis.setVerticalAlignment(SwingConstants.TOP);
        nadpis.setFont(new Font("Times New Roman", 0 ,40));
        frame.add(nadpis);

        JButton btnClose = new JButton("close settings");
        btnClose.setBounds(860, 200, 200, 40);
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        frame.add(btnClose);
        frame.setVisible(true);

        JButton btnMusic = new JButton("music on/off");
        btnMusic.setBounds(860, 275, 200, 40);

        frame.add(btnMusic);
        frame.setVisible(true);


        JButton btnName = new JButton("change name");
        btnName.setBounds(860, 350, 200, 40);
        frame.add(btnName);
        JTextField fldName = new JTextField("Type in your name here");
        fldName.setBounds(560, 425, 800, 40);
        fldName.setVisible(false);
        frame.add(fldName);
        JButton btnOk = new JButton("Okay");
        btnOk.setBounds(860,500,200,40);
        btnOk.setVisible(false);
        frame.add(btnOk);

        btnName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fldName.setVisible(true);
                btnOk.setVisible(true);
            }
        });

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });




    }
}
