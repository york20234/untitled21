import javax.swing.*;
import java.awt.*;

public class EncryptorFrame extends JInternalFrame {
    private Container cp;
    private JPanel jpnE=new JPanel(new GridLayout(10,1,3,3));
    private JLabel jlb1=new JLabel("Flie");
    private JTextField jtf1=new JTextField();
    private JButton jpt1=new JButton("Browse");

    private JTextArea jta=new JTextArea();
    private JScrollPane jsp=new JScrollPane();

    private JLabel jlb2=new JLabel("key");
    private JTextField jtf2=new JTextField();

    private JLabel jlb3=new JLabel("Algorithm");
    private JComboBox<String> jcb=new JComboBox<String>();
    private ButtonGroup bg=new ButtonGroup();

    private JRadioButton jrb1=new JRadioButton("Encrypt");
    private JRadioButton jrb2=new JRadioButton("Dcerypt");

    public EncryptorFrame(){
        init();
    }
    private void init(){

        cp = this.getContentPane();

    }

}
