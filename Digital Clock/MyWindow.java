import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class MyWindow extends JFrame {

    private JLabel heading;
    private JLabel clockLabel;

    private Font font = new Font("Arial", Font.BOLD, 35);

    MyWindow() {
        super.setTitle("My Clock");
        super.setSize(500, 400);   // wider window to avoid dots
        super.setLocation(300, 50);

        this.createGUI();
        this.startClock();

        super.setVisible(true);
    }

    public void createGUI() {

        heading = new JLabel("My Clock", SwingConstants.CENTER);
        clockLabel = new JLabel("", SwingConstants.CENTER);

        heading.setFont(font);
        clockLabel.setFont(font);

        this.setLayout(new GridLayout(2, 1));

        this.add(heading);
        this.add(clockLabel);
    }

    public void startClock() {

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss a");

                String dateTime = sdf.format(new Date());
                clockLabel.setText(dateTime);
            }
        });

        timer.start();
    }
}
