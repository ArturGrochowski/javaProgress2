import javax.swing.*;
import java.awt.*;

public class myMenu extends JFrame {

    static int i = 0;

    public myMenu(){
        initCompponent();
    }

    private void initCompponent() {
        this.setTitle(" My Menu");
        this.setBounds(300, 300, 300, 200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panelMenu.setLayout(new GridLayout(7, 1));
        container.add(panelMenu);
        MakeMenuButton menu1 = new MakeMenuButton("1. add", Color.lightGray, Color.orange, panelMenu);
        MakeMenuButton menu2 = new MakeMenuButton("2. remove", Color.gray, Color.red, panelMenu);
        MakeMenuButton menu3 = new MakeMenuButton("3. change", Color.lightGray, Color.orange, panelMenu);
        jTextField.initComponent(jTextField);

        panelMenu.add(menu1);
        panelMenu.add(menu2);
        panelMenu.add(menu3);
        panelMenu.add(labe);
        panelMenu.add(jTextField);
        panelMenu.add(lable2);
        panelMenu.add(yourNumbers);

    }

    private Container container = this.getContentPane();
    private JPanel panelMenu = new JPanel();
    private TextField jTextField = new TextField();
//    private JTextField textField = new JTextField();
    private JLabel labe = new JLabel("Write a number:");
    private  JLabel lable2 = new JLabel("Your numbers are:");
    private  JLabel yourNumbers = new JLabel();




//    public static void keyPressedHandler(KeyEvent e, JPanel panelMenu) {
//
//        int menuLength = panelMenu.getComponentCount();
//        if (e.getKeyCode() == KeyEvent.VK_DOWN){
//            panelMenu.getComponent(++i%menuLength).requestFocus();
//            System.out.println(i);
//        }
//        else if (e.getKeyCode() == KeyEvent.VK_UP){
//            panelMenu.getComponent(--i%menuLength).requestFocus();
//            System.out.println(i);
//        }
//    }

}
