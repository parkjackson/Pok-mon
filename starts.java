package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class starts extends JFrame {
    private JLabel label;
    private JButton button;
    private JLabel label2;
    private JButton button2;
    private JLabel label3;
    private JButton button3;
    private int x = 0, y = 0, z = 0;

    public starts() {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(Box.createRigidArea(new Dimension(0, 50)));
        // Add buttons and labels
        button = new JButton("List of Pokemon");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(button);
        label = new JLabel("");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(label);
        add(Box.createRigidArea(new Dimension(170, 30)));

        button2 = new JButton("Click here to see the rules!");
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(button2);
        label2 = new JLabel("");
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(label2);
        add(Box.createRigidArea(new Dimension(0, 30)));
        
        button3 = new JButton("Where do I play?");
        button3.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(button3);
        label3 = new JLabel("");
        label3.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(label3);

        

        start s = new start();
        button.addActionListener(s);

        start2 t = new start2();
        button2.addActionListener(t);

        start3 a = new start3();
        button3.addActionListener(a);
    }

    public class start implements ActionListener {
        public void actionPerformed(ActionEvent s) {
            if (x == 0) {
                // Create a new frame to display the image
                JFrame genOne = new JFrame("Pokemon Image");
                genOne.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                genOne.setSize(700, 1000);
                genOne.setLayout(new FlowLayout());

                // Add the image
                ImageIcon image = new ImageIcon(getClass().getResource("PokemonGenOne.jpg"));
                JLabel imageLabel = new JLabel(image);
                genOne.add(imageLabel);

                // Make the frame visible
                genOne.setVisible(true);

                label.setText("Press to Start Pokemon Guessing Game");
                x = 1;
            } else if (x == 1) {
                label.setText("");
                x = 0;
            }
        }
    }

    public class start2 implements ActionListener {
        public void actionPerformed(ActionEvent t) {
            if (y == 0) {
                label2.setText("<html> Type in your guess to try and catch the mystery Pokemon from Generation One! <br>   You get Unlimited tries, so use the clues from each wrong guess. <br>    Each correct guess will remove the Pokemon. <br>   Guess all of them and you WIN! <br> for the Nidoran male and femal type 'Nidoran M' and 'Nidoran F'");
                y = 1;
            } else if (y == 1) {
                label2.setText("");
                y = 0;
            }
        }
    }

    public class start3 implements ActionListener {
        public void actionPerformed(ActionEvent t) {
            if (z == 0) {
                label3.setText("<html> Type in your terminal to start Playing! <br> Use this window to toggle your list of pokemon <br> and the rules!");
                z = 1;
            } else if (z == 1) {
                label3.setText("");
                z = 0;
            }
        }
    }

    public static void main(String args[]) {
        starts gui = new starts();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(300, 400);
        gui.setTitle("Pokemon Guessing Game!");
    }
}
