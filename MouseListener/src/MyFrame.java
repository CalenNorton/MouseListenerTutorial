import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon image;
    ImageIcon image2;
    ImageIcon image3;
    ImageIcon image4;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        image = new ImageIcon(getClass().getResource("default/bee.png"));
        image2 = new ImageIcon(getClass().getResource("default/glasses.png"));
        image3 = new ImageIcon(getClass().getResource("default/frown.png"));
        image4 = new ImageIcon(getClass().getResource("default/smile.png"));

        label.setIcon(image);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setIcon(image2);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(image3);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(image4);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(image);
    }
}
