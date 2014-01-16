import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame implements ActionListener {

    private Container pane;
    private JButton exitButton;
    private JPanel canvas;
    private int[][] board;
    private Container buttons;

    private class myKeyListener implements KeyListener {
        public void keyPressed(KeyEvent e) {
	    System.out.println("button");
	    //fill in some box
        }

	public void keyTyped(KeyEvent e) {
	    System.out.println("potato");
	}
	public void keyReleased(KeyEvent e) {
         System.out.println("RELEASED: "+e.getKeyChar()+" - "+e.getKeyCode());
        }
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitButton) {
         System.exit(0);
        } else {
	    //some buttons for boxes
        }
    }


    public Gui() {
        this.setTitle("My first GUI");
        this.setSize(600,700);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        pane = this.getContentPane();
        //pane.setLayout(new FlowLayout());
        pane.setLayout(new FlowLayout());
        exitButton = new JButton("Exit");
        canvas = new JPanel();
        canvas.setBorder(BorderFactory.createLineBorder(Color.blue,5));
	canvas.setLayout(new GridLayout(6,7));
	board = new int[6][7];
        buttons = new Container();
        buttons.setLayout(new FlowLayout());
        //buttons.setLayout(new GridLayout(0,2));
        buttons.add(exitButton);

        pane.add(buttons);
        pane.add(canvas);
	for (int[] panels:board) {
	    for (int panel:panels) {
		JPanel jpanel = new JPanel();
		jpanel.setBorder(BorderFactory.createLineBorder(Color.yellow,2));		
		canvas.add(jpanel);
	    }
	}

        exitButton.addActionListener(this);
    }
    public void hello() {
        System.out.println("HEllo");
    }
    public static void main(String[] args) {
        Gui g = new Gui();
        g.setVisible(true);
    }

}