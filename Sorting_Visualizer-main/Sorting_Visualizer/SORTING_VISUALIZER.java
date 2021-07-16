import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class SORTING_VISUALIZER implements ActionListener
{
	JFrame frame;
	JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15;
	JComboBox box1,box2;
	JButton button1,button2;
	SORTING_VISUALIZER()
	{
		frame=new JFrame("Sorting Visualizer");
		frame.setSize(800,600);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setResizable(false);
		
		label1=new JLabel("SORTING VISUALIZER");
		label1.setBounds(38,0,700,100);
//		label1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setVerticalAlignment(SwingConstants.CENTER);
		label1.setForeground(Color.YELLOW);
		label1.setFont(new Font("Times New Roman",Font.BOLD,60));
		frame.add(label1);
		
		label2=new JLabel();
		label2.setBounds(38,125,700,400);
		label2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label2.setLayout(null);
		frame.add(label2);
		
		label3=new JLabel("TYPES:");
		label3.setBounds(125,50,100,50);
//		label3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setVerticalAlignment(SwingConstants.CENTER);
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font("Times New Roman",Font.BOLD,20));
		label2.add(label3);
		
		String sort[]= {"BUBBLE SORT","SELECTION SORT","MERGE SORT","INSERTION SORT","HEAP SORT"};
		
		box1=new JComboBox(sort);
		box1.setBounds(225,62,150,30);
		label2.add(box1);
		
		label4=new JLabel("SIZE:");
		label4.setBounds(400,50,100,50);
//		label4.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setVerticalAlignment(SwingConstants.CENTER);
		label4.setForeground(Color.WHITE);
		label4.setFont(new Font("Times New Roman",Font.BOLD,20));
		label2.add(label4);
		
		String size[]= {"1","2","3","4","5","6","7","8","9","10"};
		
		box2=new JComboBox(size);
		box2.setBounds(490,62,70,30);
		label2.add(box2);
		
		button1=new JButton("GENERATE ARRAY");
		button1.setBounds(300,137,150,30);
		button1.setBackground(Color.GRAY);
		button1.setForeground(Color.YELLOW);
		button1.addActionListener(this);
		label2.add(button1);
		
		label5=new JLabel();
		label5.setBounds(100,250,50,50);
		label5.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setVerticalAlignment(SwingConstants.CENTER);
		label5.setForeground(Color.YELLOW);
		label5.setFont(new Font("Times New Roman",Font.BOLD,25));
		label2.add(label5);
		
		label6=new JLabel();
		label6.setBounds(150,250,50,50);
		label6.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label6.setHorizontalAlignment(SwingConstants.CENTER);
		label6.setVerticalAlignment(SwingConstants.CENTER);
		label6.setForeground(Color.YELLOW);
		label6.setFont(new Font("Times New Roman",Font.BOLD,25));
		label2.add(label6);
		
		label7=new JLabel();
		label7.setBounds(200,250,50,50);
		label7.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label7.setHorizontalAlignment(SwingConstants.CENTER);
		label7.setVerticalAlignment(SwingConstants.CENTER);
		label7.setForeground(Color.YELLOW);
		label7.setFont(new Font("Times New Roman",Font.BOLD,25));
		label2.add(label7);
		
		label8=new JLabel();
		label8.setBounds(250,250,50,50);
		label8.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label8.setHorizontalAlignment(SwingConstants.CENTER);
		label8.setVerticalAlignment(SwingConstants.CENTER);
		label8.setForeground(Color.YELLOW);
		label8.setFont(new Font("Times New Roman",Font.BOLD,25));
		label2.add(label8);
		
		label9=new JLabel();
		label9.setBounds(300,250,50,50);
		label9.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label9.setHorizontalAlignment(SwingConstants.CENTER);
		label9.setVerticalAlignment(SwingConstants.CENTER);
		label9.setForeground(Color.YELLOW);
		label9.setFont(new Font("Times New Roman",Font.BOLD,25));
		label2.add(label9);
		
		label10=new JLabel();
		label10.setBounds(350,250,50,50);
		label10.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label10.setHorizontalAlignment(SwingConstants.CENTER);
		label10.setVerticalAlignment(SwingConstants.CENTER);
		label10.setForeground(Color.YELLOW);
		label10.setFont(new Font("Times New Roman",Font.BOLD,25));
		label2.add(label10);
		
		label11=new JLabel();
		label11.setBounds(400,250,50,50);
		label11.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label11.setHorizontalAlignment(SwingConstants.CENTER);
		label11.setVerticalAlignment(SwingConstants.CENTER);
		label11.setForeground(Color.YELLOW);
		label11.setFont(new Font("Times New Roman",Font.BOLD,25));
		label2.add(label11);
		
		label12=new JLabel();
		label12.setBounds(450,250,50,50);
		label12.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label12.setHorizontalAlignment(SwingConstants.CENTER);
		label12.setVerticalAlignment(SwingConstants.CENTER);
		label12.setForeground(Color.YELLOW);
		label12.setFont(new Font("Times New Roman",Font.BOLD,25));
		label2.add(label12);
		
		label13=new JLabel();
		label13.setBounds(500,250,50,50);
		label13.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label13.setHorizontalAlignment(SwingConstants.CENTER);
		label13.setVerticalAlignment(SwingConstants.CENTER);
		label13.setForeground(Color.YELLOW);
		label13.setFont(new Font("Times New Roman",Font.BOLD,25));
		label2.add(label13);
		
		label14=new JLabel();
		label14.setBounds(550,250,50,50);
		label14.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label14.setHorizontalAlignment(SwingConstants.CENTER);
		label14.setVerticalAlignment(SwingConstants.CENTER);
		label14.setForeground(Color.YELLOW);
		label14.setFont(new Font("Times New Roman",Font.BOLD,25));
		label2.add(label14);
		
		label15=new JLabel("GENERATED ARRAY:");
		label15.setBounds(100,200,210,50);
//		label15.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label15.setHorizontalAlignment(SwingConstants.CENTER);
		label15.setVerticalAlignment(SwingConstants.CENTER);
		label15.setForeground(Color.YELLOW);
		label15.setFont(new Font("Times New Roman",Font.BOLD,20));
		label2.add(label15);

		
		button2=new JButton("SORT ARRAY");
		button2.setBounds(300,325,150,30);
		button2.setBackground(Color.GRAY);
		button2.setForeground(Color.YELLOW);
		button2.addActionListener(this);
		label2.add(button2);
		
		frame.setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		new SORTING_VISUALIZER();
	}
	public void actionPerformed(ActionEvent e) 
	{
		int size=Integer.valueOf(box2.getSelectedItem().toString());
		
		if(e.getSource()==button1)
		{
			generateArray(size);
		}
		else if(e.getSource()==button2)
		{
			int m[]=getArray(size);
			if((box1.getSelectedItem().toString()).equals("BUBBLE SORT"))
				new Bubble_Sort(m);
			else if((box1.getSelectedItem().toString()).equals("SELECTION SORT"))
				new Selection_Sort(m);
			else if((box1.getSelectedItem().toString()).equals("MERGE SORT"))
				new Merge_Sort(m);
			else if((box1.getSelectedItem().toString()).equals("INSERTION SORT"))
				new Insertion_Sort(m);
			else if((box1.getSelectedItem().toString()).equals("HEAP SORT"))
				new Heap_Sort(m);
			frame.dispose();
		}
	}
	public void generateArray(int size)
	{
		label5.setText("");
		label6.setText("");
		label7.setText("");
		label8.setText("");
		label9.setText("");
		label10.setText("");
		label11.setText("");
		label12.setText("");
		label13.setText("");
		label14.setText("");
		String m[]=new String[size];
		for(int i=0;i<size;i++)
			m[i]=(0+(int)(Math.random()*(10-0+1)))+"";
		if(size==1)
		{
			label5.setText(m[0]);
		}
		else if(size==2)
		{
			label5.setText(m[0]);
			label6.setText(m[1]);
		}
		else if(size==3)
		{
			label5.setText(m[0]);
			label6.setText(m[1]);
			label7.setText(m[2]);
		}
		else if(size==4)
		{
			label5.setText(m[0]);
			label6.setText(m[1]);
			label7.setText(m[2]);
			label8.setText(m[3]);
		}
		else if(size==5)
		{
			label5.setText(m[0]);
			label6.setText(m[1]);
			label7.setText(m[2]);
			label8.setText(m[3]);
			label9.setText(m[4]);
		}
		else if(size==6)
		{
			label5.setText(m[0]);
			label6.setText(m[1]);
			label7.setText(m[2]);
			label8.setText(m[3]);
			label9.setText(m[4]);
			label10.setText(m[5]);
		}
		else if(size==7)
		{
			label5.setText(m[0]);
			label6.setText(m[1]);
			label7.setText(m[2]);
			label8.setText(m[3]);
			label9.setText(m[4]);
			label10.setText(m[5]);
			label11.setText(m[6]);
		}
		else if(size==8)
		{
			label5.setText(m[0]);
			label6.setText(m[1]);
			label7.setText(m[2]);
			label8.setText(m[3]);
			label9.setText(m[4]);
			label10.setText(m[5]);
			label11.setText(m[6]);
			label12.setText(m[7]);
		}
		else if(size==9)
		{
			label5.setText(m[0]);
			label6.setText(m[1]);
			label7.setText(m[2]);
			label8.setText(m[3]);
			label9.setText(m[4]);
			label10.setText(m[5]);
			label11.setText(m[6]);
			label12.setText(m[7]);
			label13.setText(m[8]);
		}
		else if(size==10)
		{
			label5.setText(m[0]);
			label6.setText(m[1]);
			label7.setText(m[2]);
			label8.setText(m[3]);
			label9.setText(m[4]);
			label10.setText(m[5]);
			label11.setText(m[6]);
			label12.setText(m[7]);
			label13.setText(m[8]);
			label14.setText(m[9]);
		}
	}
	public int[] getArray(int size)
	{
		int n[]=new int[size];
		if(size==1)
		{
			n[0]=Integer.valueOf(label5.getText());
		}
		else if(size==2)
		{
			n[0]=Integer.valueOf(label5.getText());
			n[1]=Integer.valueOf(label6.getText());
		}
		else if(size==3)
		{
			n[0]=Integer.valueOf(label5.getText());
			n[1]=Integer.valueOf(label6.getText());
			n[2]=Integer.valueOf(label7.getText());
		}
		else if(size==4)
		{
			n[0]=Integer.valueOf(label5.getText());
			n[1]=Integer.valueOf(label6.getText());
			n[2]=Integer.valueOf(label7.getText());
			n[3]=Integer.valueOf(label8.getText());
		}
		else if(size==5)
		{
			n[0]=Integer.valueOf(label5.getText());
			n[1]=Integer.valueOf(label6.getText());
			n[2]=Integer.valueOf(label7.getText());
			n[3]=Integer.valueOf(label8.getText());
			n[4]=Integer.valueOf(label9.getText());
		}
		else if(size==6)
		{
			n[0]=Integer.valueOf(label5.getText());
			n[1]=Integer.valueOf(label6.getText());
			n[2]=Integer.valueOf(label7.getText());
			n[3]=Integer.valueOf(label8.getText());
			n[4]=Integer.valueOf(label9.getText());
			n[5]=Integer.valueOf(label10.getText());
		}
		else if(size==7)
		{
			n[0]=Integer.valueOf(label5.getText());
			n[1]=Integer.valueOf(label6.getText());
			n[2]=Integer.valueOf(label7.getText());
			n[3]=Integer.valueOf(label8.getText());
			n[4]=Integer.valueOf(label9.getText());
			n[5]=Integer.valueOf(label10.getText());
			n[6]=Integer.valueOf(label11.getText());
		}
		else if(size==8)
		{
			n[0]=Integer.valueOf(label5.getText());
			n[1]=Integer.valueOf(label6.getText());
			n[2]=Integer.valueOf(label7.getText());
			n[3]=Integer.valueOf(label8.getText());
			n[4]=Integer.valueOf(label9.getText());
			n[5]=Integer.valueOf(label10.getText());
			n[6]=Integer.valueOf(label11.getText());
			n[7]=Integer.valueOf(label12.getText());
		}
		else if(size==9)
		{
			n[0]=Integer.valueOf(label5.getText());
			n[1]=Integer.valueOf(label6.getText());
			n[2]=Integer.valueOf(label7.getText());
			n[3]=Integer.valueOf(label8.getText());
			n[4]=Integer.valueOf(label9.getText());
			n[5]=Integer.valueOf(label10.getText());
			n[6]=Integer.valueOf(label11.getText());
			n[7]=Integer.valueOf(label12.getText());
			n[8]=Integer.valueOf(label13.getText());
		}
		else if(size==10)
		{
			n[0]=Integer.valueOf(label5.getText());
			n[1]=Integer.valueOf(label6.getText());
			n[2]=Integer.valueOf(label7.getText());
			n[3]=Integer.valueOf(label8.getText());
			n[4]=Integer.valueOf(label9.getText());
			n[5]=Integer.valueOf(label10.getText());
			n[6]=Integer.valueOf(label11.getText());
			n[7]=Integer.valueOf(label12.getText());
			n[8]=Integer.valueOf(label13.getText());
			n[9]=Integer.valueOf(label14.getText());
		}
		return(n);
	}
}