import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

public class MainFrame extends JFrame implements ActionListener,MouseListener 
{
	String lab;
	Container cont;
	JButton cancel,mini;
	firstpan f1;
	secondpan s1;
	int height,width;
	public MainFrame() {
		
		height=700;
		width=900;
		
		cont = getContentPane();
		cont.setLayout(null);
		setLayout(null);
		setBounds(400,200,width,height);
		setUndecorated(true);
		setVisible(true);
		
		//reload=0;
		
		ImageIcon img = new ImageIcon(MainFrame.class.getResource("/img/icon1.jpeg"));
		this.setIconImage(img.getImage());
		
		cancel=new JButton();
		cancel.setLayout(null);
		cancel.setBounds(10,10,15,15);
		cancel.setFocusable(false);
		cancel.setBackground(Color.black);
		cancel.setBorder(new LineBorder(Color.red,1));
		//cancel.setIcon(new ImageIcon("img/cancel.png"));
		
		
		mini=new JButton();
		mini.setLayout(null);
		mini.setBounds(30,10,15,15);
		mini.setFocusable(false);
		mini.setBackground(Color.black);
		mini.setBorder(new LineBorder(Color.yellow,1));
		//mini.setIcon(new ImageIcon("img/mini.png"));
		
		f1=new firstpan();
		f1.setBounds(0,0,width,height);
		f1.setVisible(true);
		
		cont.add(f1);
		cont.add(cancel);
		cont.add(mini);
		
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		cancel.setActionCommand("x");
		mini.setActionCommand("-");
		
		cancel.addActionListener(this);
		mini.addActionListener(this);
		cancel.addMouseListener(this);
		mini.addMouseListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f1.play.setActionCommand("Play");
		f1.play.addActionListener(this);
		
		f1.setVisible(false);
		f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		lab=ae.getActionCommand();
		if(lab.equals("-"))
		{
			setState(this.ICONIFIED);
		}
		else if(lab.equals("x"))
		{
			this.dispose();
			System.exit(0);
		}
		else if(lab.equals("Play"))
		{
			try {
			s1=new secondpan();
			s1.setBounds(0,0,width,height);
			cont.add(s1);
			f1.setVisible(false);
			s1.setVisible(true);
			}
			catch(Exception e)
			{
				
				e.printStackTrace();
			}
		}
	}
	public void mouseClicked(MouseEvent e) 
	{  
		
    }  
    public void mouseEntered(MouseEvent e) 
    {  
    	AbstractButton EventSource = (AbstractButton)e.getSource();
    	if(EventSource.equals(cancel))
    	{
    		EventSource.setBackground(Color.red);
    	}
    	else if(EventSource.equals(mini))
    	{
    		EventSource.setBackground(Color.YELLOW);
    	}
    } 
    public void mouseExited(MouseEvent e) 
    {  
    	AbstractButton EventSource = (AbstractButton)e.getSource();
    	if(EventSource.equals(cancel))
    	{
    		EventSource.setBackground(Color.black);
    	}
    	else if(EventSource.equals(mini))
    	{
    		EventSource.setBackground(Color.black);
    	}
    }  
    public void mousePressed(MouseEvent e) 
    {
    	
    }  
    public void mouseReleased(MouseEvent e) 
    {
    	
    } 

}
