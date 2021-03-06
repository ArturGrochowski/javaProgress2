import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MakeButton {

    void makeRadioButton(String name, JLabel time, JLabel timeLable, Boolean trueFalse, ButtonGroup buttonGrSize, JPanel panelNorth){
        JRadioButton button = new JRadioButton(name);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeLable.setVisible(trueFalse);
                time.setVisible(trueFalse);
            }
        });
        buttonGrSize.add(button);
        panelNorth.add(button);
        button.doClick();
    }

    void makeButtonSize(String name, int size, JPanel panel, ButtonGroup buttonGrSize, JLabel lable){
        JButton button = new JButton(name);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lable.setFont(new Font("Monospaced", lable.getFont().getStyle(), size));
            }
        });
        panel.add(button);
        buttonGrSize.add(button);
    }

    void makeButtonColor (String name, JLabel lable, JPanel panle){
        JButton button = new JButton(name);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color c = new Color(((int)(Math.random() * 0x1000000)));
                Color co = new Color(((int)(Math.random() * 0x1000000)));
                lable.setForeground(c);
                panle.setBackground(co);
            }
        });
        panle.add(button).setBackground(Color.cyan);
    }
   /* int style = Font.PLAIN;
    public void makeCheckBoxButton (String name, JLabel lable, JPanel panelNorth, int font){
        JCheckBox boxButton = new JCheckBox(name);
        boxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(boxButton.isSelected()) style += font;
                lable.setFont(new Font("Arial", style, 12));
            }
        });
        panelNorth.add(boxButton);
    }*/
}
