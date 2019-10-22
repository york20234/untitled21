//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Calculator extends JFrame {
//    String str[]={"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
//    JButton jbtns[]=new JButton[16];
//    //    private JButton a=new JButton("7");
////    private JButton b=new JButton("8");
////    private JButton c=new JButton("9");
////    private JButton d=new JButton("/");
////    private JButton e=new JButton("4");
////    private JButton f=new JButton("5");
////    private JButton g=new JButton("6");
////    private JButton h=new JButton("*");
////    private JButton i=new JButton("1");
////    private JButton j=new JButton("2");
////    private JButton k=new JButton("3");
////    private JButton l=new JButton("-");
////    private JButton n=new JButton("0");
////    private JButton m=new JButton(".");
////    private JButton o=new JButton("=");
////    private JButton p=new JButton("+");
//    private JLabel q=new JLabel("0");
//    private double x=0.0;
//    private double v1=0.0;
//
//    private int optype=0;
//    private JPanel r=new JPanel(new GridLayout(4,4,3,3));
//
//    private Container cp;
//    private boolean isDotClick=false;
//    private boolean isOpClick=false;
//
//
//    public Calculator(String title){
//        super(title,true,true,true,true);
//        init();
//    }
//    private void init(){
//
////        a.setFont(new Font(null,Font.PLAIN,80));
////        b.setFont(new Font(null,Font.PLAIN,80));
////        c.setFont(new Font(null,Font.PLAIN,80));
////        d.setFont(new Font(null,Font.PLAIN,80));
////        e.setFont(new Font(null,Font.PLAIN,80));
////        f.setFont(new Font(null,Font.PLAIN,80));
////        g.setFont(new Font(null,Font.PLAIN,80));
////        h.setFont(new Font(null,Font.PLAIN,80));
////        i.setFont(new Font(null,Font.PLAIN,80));
////        j.setFont(new Font(null,Font.PLAIN,80));
////        k.setFont(new Font(null,Font.PLAIN,80));
////        l.setFont(new Font(null,Font.PLAIN,80));
////        n.setFont(new Font(null,Font.PLAIN,80));
////        m.setFont(new Font(null,Font.PLAIN,80));
////        o.setFont(new Font(null,Font.PLAIN,80));
////        p.setFont(new Font(null,Font.PLAIN,80));
//        q.setFont(new Font(null,Font.PLAIN,80));
//
////        a.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                JButton jbtn=(JButton) e.getSource();
////                double v1=Double.parseDouble(q.getText());
////                if (v1!=0){
////                    q.setText(q.getText()+jbtn.getText());
////                }else {
////                    q.setText(jbtn.getText());
////                }
////            }
////        });
////        b.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                JButton jbtn=(JButton) e.getSource();
////                double v1=Double.parseDouble(q.getText());
////                if (v1!=0){
////                    q.setText(q.getText()+jbtn.getText());
////                }else {
////                    q.setText(jbtn.getText());
////                }
////            }
////        });
////        c.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                JButton jbtn=(JButton) e.getSource();
////                double v1=Double.parseDouble(q.getText());
////                if (v1!=0){
////                    q.setText(q.getText()+jbtn.getText());
////                }else {
////                    q.setText(jbtn.getText());
////                }
////            }
////        });
////        e.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                JButton jbtn=(JButton) e.getSource();
////                double v1=Double.parseDouble(q.getText());
////                if (v1!=0){
////                    q.setText(q.getText()+jbtn.getText());
////                }else {
////                    q.setText(jbtn.getText());
////                }
////            }
////        });
////        f.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                JButton jbtn=(JButton) e.getSource();
////                double v1=Double.parseDouble(q.getText());
////                if (v1!=0){
////                    q.setText(q.getText()+jbtn.getText());
////                }else {
////                    q.setText(jbtn.getText());
////                }
////            }
////        });
////        g.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                JButton jbtn=(JButton) e.getSource();
////                double v1=Double.parseDouble(q.getText());
////                if (v1!=0){
////                    q.setText(q.getText()+jbtn.getText());
////                }else {
////                    q.setText(jbtn.getText());
////                }
////            }
////        });
////        i.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                JButton jbtn=(JButton) e.getSource();
////                double v1=Double.parseDouble(q.getText());
////                if (v1!=0){
////                    q.setText(q.getText()+jbtn.getText());
////                }else {
////                    q.setText(jbtn.getText());
////                }
////            }
////        });
////        j.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                JButton jbtn=(JButton) e.getSource();
////                double v1=Double.parseDouble(q.getText());
////                if (v1!=0){
////                    q.setText(q.getText()+jbtn.getText());
////                }else {
////                    q.setText(jbtn.getText());
////                }
////            }
////        });
////        k.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                JButton jbtn=(JButton) e.getSource();
////                double v1=Double.parseDouble(q.getText());
////                if (v1!=0){
////                    q.setText(q.getText()+jbtn.getText());
////                }else {
////                    q.setText(jbtn.getText());
////                }
////            }
////        });
////        n.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                JButton jbtn=(JButton) e.getSource();
////                double v1=Double.parseDouble(q.getText());
////                if (v1!=0){
////                    q.setText(q.getText()+jbtn.getText());
////                }else {
////                    q.setText(jbtn.getText());
////                }
////            }
////        });
////        p.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                JButton jbtn=(JButton) e.getSource();
////               x=Double.parseDouble(q.getText());
////               q.setText("0");
////               optype=1;
////            }
////        });
////        l.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                JButton jbtn=(JButton) e.getSource();
////                x=Double.parseDouble(q.getText());
////                q.setText("0");
////                optype=2;
////            }
////        });
////        h.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                JButton jbtn=(JButton) e.getSource();
////                x=Double.parseDouble(q.getText());
////                q.setText("0");
////                optype=3;
////            }
////        });
////        d.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                JButton jbtn=(JButton) e.getSource();
////                x=Double.parseDouble(q.getText());
////                q.setText("0");
////                optype=4;
////            }
////        });
////
////        o.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                JButton jbtn=(JButton) e.getSource();
////                double y=Double.parseDouble(q.getText());
////                switch (optype){
////                    case 1:
////                        q.setText(Double.toString(x+y));
////                        x=0;
////                        optype=0;
////                        break;
////                    case 2:
////                        q.setText(Double.toString(x-y));
////                        x=0;
////                        optype=0;
////                        break;
////                    case 3:
////                    q.setText(Double.toString(x*y));
////                    x=0;
////                    optype=0;
////                    break;
////                    case 4:
////                        q.setText(Double.toString(x/y));
////                        x=0;
////                        optype=0;
////                        break;
////                        default:
////                            break;
////                }
////            }
////        });
//
//
//        cp=this.getContentPane();
//        this.setLayout(new BorderLayout(3,3));
//        this.setBounds(150,200,600,600);
//        q.setHorizontalAlignment(JLabel.RIGHT);
//        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//        cp.add(q,BorderLayout.NORTH);
//        cp.add(r,BorderLayout.CENTER);
//
//        for (int i=0;i<16;i++){
//            jbtns[i]=new JButton(str[i]);
//            r.add(jbtns[i]);
//            jbtns[i].setFont(new Font(null,Font.PLAIN,80));
//            jbtns[i].addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    JButton jbtn = (JButton) e.getSource();
//                    int vx = jbtn.getText().charAt(0) - '0';
//                    if (vx >= 0 && vx <= 9) {
//                        float v1 = Float.parseFloat(q.getText());
//                        if (isOpClick) {
//                            q.setText(" ");
//                            isOpClick = false;
//                        }
//                        if (v1 == 0.0f) {
//                            if (isDotClick) {
//                                q.setText(q.getText() + jbtn.getText());
//                            } else {
//                                q.setText(jbtn.getText());
//                            }
//                        }
//                        else {
//                            q.setText(q.getText()+jbtn.getText());
//                        }
//                    }else {
//                        switch (jbtn.getText()) {
//                            case "+":
//                                isOpClick = true;
//                                optype = 1;
//                                v1 = Float.parseFloat(q.getText());
//                                isDotClick = false;
//                                break;
//                            case "-":
//                                isOpClick = true;
//                                optype = 2;
//                                v1 = Float.parseFloat(q.getText());
//                                isDotClick = false;
//                                break;
//                            case "*":
//                                isOpClick = true;
//                                optype = 3;
//                                v1 = Float.parseFloat(q.getText());
//                                isDotClick = false;
//                                break;
//                            case "/":
//                                isOpClick = true;
//                                optype = 4;
//                                v1 = Float.parseFloat(q.getText());
//                                isDotClick = false;
//                                break;
//                            case "=":
//                                float v2 = Float.parseFloat(q.getText());
//                                switch (optype) {
//                                    case 1:
//                                        v1 += v2;
//                                        break;
//                                    case 2:
//                                        v1 -= v2;
//                                        break;
//                                    case 3:
//                                        v1 *= v2;
//                                        break;
//                                    case 4:
//                                        v1 /= v2;
//                                        break;
//                                }
//                                q.setText(Double.toString(v1));
//                                optype=0;
//                                break;
//                        }
//                    }
//                }
//            });
//        }
//    }
//}
