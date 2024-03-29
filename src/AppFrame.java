import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppFrame extends JFrame {
    private Container cp;
    private JMenuBar jmbar= new JMenuBar();
    private JMenu jmFile= new JMenu("File");
    private JMenuItem exit =new JMenuItem("Exit");
    private JMenuItem jmiLogout=new JMenuItem("Logout");
    private JMenu jmTool= new JMenu("Tool");
    private JMenuItem jmiCalculator=new JMenuItem("Calculator");
    private JMenuItem jmiEncryptor=new JMenuItem("Encryptor");


    private Window loginFrame;
    private JDesktopPane desktop=new JDesktopPane();
    private EncryptorFrame internalFrame1=new EncryptorFrame("Encrptor");


    public AppFrame(Window login){
        loginFrame=login;
        init();
    }
    private void init(){
        cp=this.getContentPane();
        this.setSize(650,500);
        this.setDefaultCloseOperation(Window.EXIT_ON_CLOSE);
        this.setJMenuBar(jmbar);
        jmbar.add(jmFile);
        jmFile.add(exit);
        jmFile.add(jmiLogout);
        jmbar.add(jmTool);
        jmTool.add(jmiCalculator);
        jmTool.add(jmiEncryptor);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        jmiLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AppFrame.this.setVisible(false);
                AppFrame.this.dispose();
                loginFrame.resetData();
                loginFrame.setVisible(true);
            }
        });
        jmiCalculator.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        jmiEncryptor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                internalFrame1.setVisible(true);
            }
        });

        this.add(desktop);
        desktop.add(internalFrame1);
    }
}