import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {
    private Container cp;


    public AppFrame(){
        init();
    }
    private void init(){
        cp=this.getContentPane();
        this.setDefaultCloseOperation(Window.EXIT_ON_CLOSE);
    }
}
