import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private JLabel id=new JLabel("ID");
    private JLabel pw=new JLabel("PW");
    private JButton l=new JButton("Login");
    private JButton e=new JButton("Exit");
    private JTextField jt=new JTextField();
    private JPasswordField jp=new JPasswordField();
    private Container cp;

    public Window(){
        init();
    }
    private  void  init(){
        e.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        l.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pw=new String(jp.getPassword());
                if (jt.getText().equals("h304")  &&  pw.equals("23323456")){
                    javax.swing.JOptionPane.showMessageDialog(Window.this,"Login Success");
                    AppFrame w=new AppFrame(Window.this);
                    w.setVisible(true);
                }
                else {
                    javax.swing.JOptionPane.showMessageDialog(Window.this,"ID Wrong or Password Wrong");
                }
            }
        });
       cp=this.getContentPane();
       this.setLayout(null);
       this.setSize(450,250);
       this.setDefaultCloseOperation(Window.EXIT_ON_CLOSE);

        id.setBounds(50,50,100,30);
        pw.setBounds(50,150,100,30);
        jt.setBounds(100,50,250,30);
        jp.setBounds(100,150,250,30);
        l.setBounds(350,50,70,30);
        e.setBounds(350,150,70,30);

       cp.add(id);
       cp.add(pw);
       cp.add(jt);
       cp.add(jp);
       cp.add(l);
       cp.add(e);





    }
    public void resetData(){
        jt.setText("");
        jp.setText("");
    }
}

