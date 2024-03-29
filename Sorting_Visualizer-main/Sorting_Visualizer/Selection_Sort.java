import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
public class Selection_Sort implements ActionListener
{
	JFrame frame;
	JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17,label18;
	JTextArea textarea1,textarea2;
	JButton button1;
	Selection_Sort(int m[])
	{
		frame=new JFrame("Selction Sort");
		frame.setSize(800,600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setLayout(null);
		frame.setResizable(false);
		
		label1=new JLabel();
		label1.setBounds(37,100,350,375);
		label1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		frame.add(label1);
		
		label2=new JLabel();
		label2.setBounds(385,100,350,375);
		label2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label2.setLayout(null);
		frame.add(label2);
		
		label3=new JLabel("SELECTION SORT");
		label3.setBounds(37,0,700,100);
//		label3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setVerticalAlignment(SwingConstants.CENTER);
		label3.setFont(new Font("Times New Roman",Font.BOLD,60));
		label3.setForeground(Color.YELLOW);
		frame.add(label3);
		
		label4=new JLabel("SORTING VISUALIZER");
		label4.setBounds(10,0,330,40);
		label4.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setVerticalAlignment(SwingConstants.CENTER);
		label4.setForeground(Color.YELLOW);
		label4.setFont(new Font("Times New Roman",Font.BOLD,25));
		label2.add(label4);
		
		label5=new JLabel("ALGORITHM");
		label5.setBounds(10,0,330,40);
		label5.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setVerticalAlignment(SwingConstants.CENTER);
		label5.setForeground(Color.YELLOW);
		label5.setFont(new Font("Times New Roman",Font.BOLD,25));
		label1.add(label5);
		
		label6=new JLabel("Time Complexity: O(n�)");
		label6.setBounds(10,275,330,40);
//		label6.setBorder(BorderFactory.createLineBorder(Color.WHITE));
//		label6.setHorizontalAlignment(SwingConstants.CENTER);
//		label6.setVerticalAlignment(SwingConstants.CENTER);
		label6.setForeground(Color.YELLOW);
		label6.setFont(new Font("Times New Roman",Font.BOLD,20));
		label1.add(label6);
		
		label7=new JLabel("Space Complexity: O(1)");
		label7.setBounds(10,315,330,40);
//		label7.setBorder(BorderFactory.createLineBorder(Color.WHITE));
//		label7.setHorizontalAlignment(SwingConstants.CENTER);
//		label7.setVerticalAlignment(SwingConstants.CENTER);
		label7.setForeground(Color.YELLOW);
		label7.setFont(new Font("Times New Roman",Font.BOLD,20));
		label1.add(label7);
		
		label8=new JLabel("Sorted Array:");
		label8.setBounds(37,480,150,50);
		label8.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label8.setHorizontalAlignment(SwingConstants.CENTER);
		label8.setVerticalAlignment(SwingConstants.CENTER);
		label8.setForeground(Color.YELLOW);
		label8.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label8);
		
		label9=new JLabel();
		label9.setBounds(190,480,50,50);
		label9.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label9.setHorizontalAlignment(SwingConstants.CENTER);
		label9.setVerticalAlignment(SwingConstants.CENTER);
		label9.setForeground(Color.YELLOW);
		label9.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label9);
		
		label10=new JLabel();
		label10.setBounds(240,480,50,50);
		label10.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label10.setHorizontalAlignment(SwingConstants.CENTER);
		label10.setVerticalAlignment(SwingConstants.CENTER);
		label10.setForeground(Color.YELLOW);
		label10.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label10);
		
		label11=new JLabel();
		label11.setBounds(290,480,50,50);
		label11.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label11.setHorizontalAlignment(SwingConstants.CENTER);
		label11.setVerticalAlignment(SwingConstants.CENTER);
		label11.setForeground(Color.YELLOW);
		label11.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label11);
		
		label12=new JLabel();
		label12.setBounds(340,480,50,50);
		label12.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label12.setHorizontalAlignment(SwingConstants.CENTER);
		label12.setVerticalAlignment(SwingConstants.CENTER);
		label12.setForeground(Color.YELLOW);
		label12.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label12);
		
		label13=new JLabel();
		label13.setBounds(390,480,50,50);
		label13.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label13.setHorizontalAlignment(SwingConstants.CENTER);
		label13.setVerticalAlignment(SwingConstants.CENTER);
		label13.setForeground(Color.YELLOW);
		label13.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label13);
		
		label14=new JLabel();
		label14.setBounds(440,480,50,50);
		label14.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label14.setHorizontalAlignment(SwingConstants.CENTER);
		label14.setVerticalAlignment(SwingConstants.CENTER);
		label14.setForeground(Color.YELLOW);
		label14.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label14);
		
		label15=new JLabel();
		label15.setBounds(490,480,50,50);
		label15.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label15.setHorizontalAlignment(SwingConstants.CENTER);
		label15.setVerticalAlignment(SwingConstants.CENTER);
		label15.setForeground(Color.YELLOW);
		label15.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label15);
		
		label16=new JLabel();
		label16.setBounds(540,480,50,50);
		label16.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label16.setHorizontalAlignment(SwingConstants.CENTER);
		label16.setVerticalAlignment(SwingConstants.CENTER);
		label16.setForeground(Color.YELLOW);
		label16.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label16);
		
		label17=new JLabel();
		label17.setBounds(590,480,50,50);
		label17.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label17.setHorizontalAlignment(SwingConstants.CENTER);
		label17.setVerticalAlignment(SwingConstants.CENTER);
		label17.setForeground(Color.YELLOW);
		label17.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label17);
		
		label18=new JLabel();
		label18.setBounds(640,480,50,50);
		label18.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label18.setHorizontalAlignment(SwingConstants.CENTER);
		label18.setVerticalAlignment(SwingConstants.CENTER);
		label18.setForeground(Color.YELLOW);
		label18.setFont(new Font("Times New Roman",Font.BOLD,20));
		frame.add(label18);

		
		textarea1=new JTextArea();
		textarea1.setBounds(10,40,330,325);
		textarea1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		textarea1.setFont(new Font("Times New Roman",Font.BOLD,15));
		textarea1.setEditable(false);
		label2.add(textarea1);
		
		textarea2=new JTextArea();
		textarea2.setBounds(10,40,330,225);
		textarea2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		textarea2.setFont(new Font("Times New Roman",Font.BOLD,15));
		textarea2.setEditable(false);
		label1.add(textarea2);
		
		JScrollPane scroll1=new JScrollPane(textarea1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll1.setBounds(10,40,330,325);
		label2.add(scroll1);
		
		JScrollPane scroll2=new JScrollPane(textarea2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll2.setBounds(10,40,330,225);
		label1.add(scroll2);
		
		String s="void SELECTION_SORT(int A[]) {\n  for(int i=0;i<A.length-1;i++) {\n    int index=i;\n    for(int j=0;j<A.length;j++) {\n      if(A[j]<A[index])\n        index=j;\n      }\n      int s=A[index];\n     A[index]=A[i];}\n      A[i]=s;\n    }\n  }";
		textarea2.append(s);
		
		button1=new JButton("BACK");
		button1.setBounds(10,10,75,30);
		button1.setBackground(Color.GRAY);
		button1.setForeground(Color.YELLOW);
		button1.addActionListener(this);
		frame.add(button1);
		
		frame.setVisible(true);
		
		ArrayList<String> res=getSorted(m);
		for(int i=0;i<res.size();i++)
			System.out.println(res.get(i));
		
		for(int i=0;i<res.size();i++)
			textarea1.append(res.get(i)+"\n");
		
		setText(m.length,m);
	}
	public ArrayList<String> getSorted(int m[])
	{
		int c=0;
		String str;
		ArrayList<String> res=new ArrayList<String>();
		
		for (int i=0;i<m.length-1;i++)  
        {  
            int index = i;  
            for (int j=i+1;j<m.length;j++)
            {  
                if (m[j]<m[index])
                {  
                    index = j;
                }
                res.add("i= "+i+", j= "+j+",  min_index= "+index+"; "+getDisplay(m));
            }
            int smallerNumber=m[index];   
            m[index] =m[i];  
            m[i] =smallerNumber; 
        }
		return(res);
	}
	public String getDisplay(int m[])
	{
		String str="";
		for(int i=0;i<m.length;i++)
			str=str+m[i]+" ";
		return(str);
	}
	public void setText(int size,int m[])
	{
		if(size==1)
		{
			label9.setText(m[0]+"");
		}
		else if(size==2)
		{
			label9.setText(m[0]+"");
			label10.setText(m[1]+"");
		}
		else if(size==3)
		{
			label9.setText(m[0]+"");
			label10.setText(m[1]+"");
			label11.setText(m[2]+"");
		}
		else if(size==4)
		{
			label9.setText(m[0]+"");
			label10.setText(m[1]+"");
			label11.setText(m[2]+"");
			label12.setText(m[3]+"");
		}
		else if(size==5)
		{
			label9.setText(m[0]+"");
			label10.setText(m[1]+"");
			label11.setText(m[2]+"");
			label12.setText(m[3]+"");
			label13.setText(m[4]+"");
		}
		else if(size==6)
		{
			label9.setText(m[0]+"");
			label10.setText(m[1]+"");
			label11.setText(m[2]+"");
			label12.setText(m[3]+"");
			label13.setText(m[4]+"");
			label14.setText(m[5]+"");
		}
		else if(size==7)
		{
			label9.setText(m[0]+"");
			label10.setText(m[1]+"");
			label11.setText(m[2]+"");
			label12.setText(m[3]+"");
			label13.setText(m[4]+"");
			label14.setText(m[5]+"");
			label15.setText(m[6]+"");
		}
		else if(size==8)
		{
			label9.setText(m[0]+"");
			label10.setText(m[1]+"");
			label11.setText(m[2]+"");
			label12.setText(m[3]+"");
			label13.setText(m[4]+"");
			label14.setText(m[5]+"");
			label15.setText(m[6]+"");
			label16.setText(m[7]+"");
		}
		else if(size==9)
		{
			label9.setText(m[0]+"");
			label10.setText(m[1]+"");
			label11.setText(m[2]+"");
			label12.setText(m[3]+"");
			label13.setText(m[4]+"");
			label14.setText(m[5]+"");
			label15.setText(m[6]+"");
			label16.setText(m[7]+"");
			label17.setText(m[8]+"");
		}
		else if(size==10)
		{
			label9.setText(m[0]+"");
			label10.setText(m[1]+"");
			label11.setText(m[2]+"");
			label12.setText(m[3]+"");
			label13.setText(m[4]+"");
			label14.setText(m[5]+"");
			label15.setText(m[6]+"");
			label16.setText(m[7]+"");
			label17.setText(m[8]+"");
			label18.setText(m[9]+"");
		}
	}
	
	public static void main(String args[])
	{
		int m[]= {5,7,8,4,12,11};
		new Selection_Sort(m);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1)
		{
			frame.dispose();
			new SORTING_VISUALIZER();
		}
	}
}