

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyColorPanel1 extends JPanel
{
	
	MyColorPanel1()
	{	}
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        Color color1 = Color.black;
        Color color2 = Color.darkGray;
        GradientPaint gp = new GradientPaint(100, 350, color1, 500, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }

}

public class firstpan extends MyColorPanel1 implements ActionListener,MouseListener
{
	String lab;
	JLabel mainname1,mainname2,mainname3,mainimg;
	JButton play;
	public firstpan() {
		
		setLayout(null);
		setVisible(false);
		
		Font f1=new Font("Arial",Font.BOLD,80);
		Font f2=new Font("Arial",Font.PLAIN,20);
		Font f3=new Font("TimesRoman",Font.PLAIN,30);
		
		mainname1=new JLabel("SuDoKu");
		mainname1.setForeground(Color.MAGENTA);
		mainname1.setBorder(null);
		mainname1.setLayout(null);
		mainname1.setBackground(Color.white);
		mainname1.setBounds(90,60,500,100);
		mainname1.setFont(f1);
		
		mainname2=new JLabel("Solver");
		mainname2.setForeground(Color.cyan);
		mainname2.setBorder(null);
		mainname2.setLayout(null);
		mainname2.setBackground(Color.white);
		mainname2.setBounds(500,60,400,100);
		mainname2.setFont(f1);
		
		mainname3=new JLabel("By Kirtan Shah");
		mainname3.setForeground(Color.white);
		mainname3.setBorder(null);
		mainname3.setLayout(null);
		mainname3.setBackground(Color.white);
		mainname3.setBounds(640,55,400,50);
		mainname3.setFont(f2);
		
		mainimg=new JLabel();
		mainimg.setBorder(null);
		mainimg.setOpaque(false);
		mainimg.setLayout(null);
		mainimg.setBounds(80,120,200,200);
		mainimg.setIcon(new ImageIcon(firstpan.class.getResource("/img/s2.png")));
		
		play=new JButton("Play");
		play.setLayout(null);
		play.setBounds(350,350,200,100);
		play.setBackground(Color.YELLOW);
		play.setForeground(Color.black);
		play.setFont(f3);
		play.setFocusable(false);
		play.setBorder(null);

		play.addActionListener(this);
		play.addMouseListener(this);
		
		add(mainname1);
		add(mainname2);
		add(mainname3);
		add(mainimg);
		add(play);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		lab=ae.getActionCommand();
		
	}
	public void mouseClicked(MouseEvent e) 
	{  
		
    }  
    public void mouseEntered(MouseEvent e) 
    {  
    	AbstractButton EventSource = (AbstractButton)e.getSource();
    	if(EventSource.equals(play))
    	{
    		EventSource.setBackground(Color.cyan);
    		EventSource.setForeground(Color.MAGENTA);
    		EventSource.setBorder(BorderFactory.createMatteBorder(3,3,3,3, Color.white));
    	}
    } 
    public void mouseExited(MouseEvent e) 
    {  
    	AbstractButton EventSource = (AbstractButton)e.getSource();
    	if(EventSource.equals(play))
    	{
    		EventSource.setBackground(Color.yellow);
    		EventSource.setForeground(Color.black);
    		EventSource.setBorder(null);
    		
    	}
    }  
    public void mousePressed(MouseEvent e) 
    {
    	
    }  
    public void mouseReleased(MouseEvent e) 
    {
    	
    } 


}
