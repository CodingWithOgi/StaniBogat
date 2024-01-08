import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SettingFrame {
    public SettingFrame() {
        JFrame frame = new JFrame("Settings");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1920, 1080);

        Image icon = Toolkit.getDefaultToolkit().getImage("src/images/settings.png");
        frame.setIconImage(icon);

        JLabel nadpis = new JLabel("SETTINGS");
        nadpis.setHorizontalAlignment(SwingConstants.CENTER);
        nadpis.setVerticalAlignment(SwingConstants.TOP);
        nadpis.setFont(new Font("Times New Roman", 0 ,40));
        frame.add(nadpis);

        JButton btn = new JButton("close settings");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
}
