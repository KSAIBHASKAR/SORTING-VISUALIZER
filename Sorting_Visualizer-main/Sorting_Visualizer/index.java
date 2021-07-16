import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
public class index
{
	JFrame f;
	JLabel l1,l2,l3;
	JProgressBar p;
	index()
	{
		f=new JFrame();
		f.setUndecorated(true);
		f.setSize(600,400);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		
		l1=new JLabel("SORTING VISUALIZER    ");
		l1.setBounds(20,0,600,100);
		l1.setFont(new Font("Times New Roman",Font.BOLD,26));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setVerticalAlignment(SwingConstants.CENTER);
		l1.setForeground(Color.YELLOW);
		f.add(l1);
		
		l2=new JLabel("ALGORITHM DESIGN 1");
		l2.setBounds(185,125,250,100);
		l2.setFont(new Font("Times New Roman",Font.BOLD,20));
		l2.setForeground(Color.YELLOW);
		f.add(l2);
		
		l3=new JLabel("Loading 0 %");
		l3.setBounds(220,235,175,100);
		l3.setFont(new Font("Times New Roman",Font.BOLD,20));
		l3.setForeground(Color.YELLOW);
		f.add(l3);
		
		p=new JProgressBar();
		p.setBounds(18,310,550,25);
		p.setBackground(Color.GRAY);
		p.setForeground(Color.YELLOW);
		f.add(p);
		
		f.setVisible(true);
		
		try
		{
			for(int i=0;i<=100;i++)
			{
				p.setValue(i);
				Thread.sleep(50);
				l3.setText("Loading "+i+" %");
			}
			f.dispose();
			new SORTING_VISUALIZER();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		new index();
	}
}
