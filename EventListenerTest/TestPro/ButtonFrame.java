import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonFrame
{
    
    public ButtonFrame()
    {
    }
    public static void main(String[] args)
    {
        //create frame
        JFrame frame = new JFrame();//frame object
        //create objects
        JButton button = new JButton("Click Me!");//button object
        JLabel label = new JLabel("Hello World!");//label object
        //end create objects
        
        //create a JPanel to orginize the objects
        JPanel panel = new JPanel();
        //add objects to JPanel object panel
        panel.add(button);
        panel.add(label);
        
        //add panel to frame
        frame.add(panel);
        
        
        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 100;
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setTitle("A Frame With Two Components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
        
        
        
    }
}