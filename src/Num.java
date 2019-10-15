import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Num extends JFrame {
    private Container cp;
    private String str[] = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0"};
    private String str2[] ={"submit","exit"};
    private JButton jbtns[] = new JButton[10];
    private JButton jbtns2[] = new JButton[2];
    private JLabel jlb=new JLabel("0");
    private Window num;



    public Num (Window nu1){
        num=nu1;
        init();
    }

    private void init() {

        cp = this.getContentPane();
        cp.setLayout(new GridLayout(4, 3, 3, 3));
        this.setSize(400, 400);
        jlb.setFont(new Font(null,Font.PLAIN,30));


        for (int i=0;i<10;i++){
            jbtns[i]=new JButton(str[i]);
            cp.add(jbtns[i]);
            jbtns[i].setFont(new Font(null,Font.PLAIN,30));
            jbtns[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton jbtn=(JButton)e.getSource();
                }
            });
        }
        for (int j=0;j<2;j++) {
            jbtns2[j] = new JButton(str2[j]);
            cp.add(jbtns2[j]);
            jbtns2[j].setFont(new Font(null, Font.PLAIN, 30));
        }

    }
}