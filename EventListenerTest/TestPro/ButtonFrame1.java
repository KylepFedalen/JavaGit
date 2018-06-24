import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonFrame1 extends JFrame
{
    final int FRAME_WIDTH = 100;
    final int FRAME_HEIGHT = 100;
    
    public ButtonFrame1()
    {
        createComponents();
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
    }
    
    public void createComponents()
    {
        JButton button = new JButton("Click Me!");
        
        JPanel panel = new JPanel();
        
        panel.add(button);
        add(panel);
        
        ActionListener listener = new ClickListener();
        button.addActionListener(listener);
    }
    
}
