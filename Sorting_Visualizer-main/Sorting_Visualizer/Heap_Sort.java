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
public class Heap_Sort implements ActionListener 
{
	JFrame frame;
	JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17,label18;
	JTextArea textarea1,textarea2;
	JButton button1;
	Heap_Sort(int m[])
	{
		frame=new JFrame("Heap Sort");
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
		
		label3=new JLabel("HEAP SORT");
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
		
		label6=new JLabel("Time Complexity: O(n*log n)");
		label6.setBounds(10,275,330,40);
//		label6.setBorder(BorderFactory.createLineBorder(Color.WHITE));
//		label6.setHorizontalAlignment(SwingConstants.CENTER);
//		label6.setVerticalAlignment(SwingConstants.CENTER);
		label6.setForeground(Color.YELLOW);
		label6.setFont(new Font("Times New Roman",Font.BOLD,20));
		label1.add(label6);
		
		label7=new JLabel("Space Complexity: O(n)");
		label7.setBounds(10,315,330,40);
//		label7.setBorder(BorderFactory.createLineBorder(Color.WHITE));
//		label7.setHorizontalAlignment(SwingConstants.CENTER);
//		label7.setVerticalAlignment(SwingConstants.CENTER);
		label7.setForeground(Color.YELLOW);
		label7.setFont(new Font("Times New Roman",Font.BOLD,20));
		label1.add(label7);
		
		label8=new JLabel("Sorted Array:");
		label8.setBounds(57,480,150,50);
//		label8.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label8.setHorizontalAlignment(SwingConstants.CENTER);
		label8.setVerticalAlignment(SwingConstants.CENTER);
		label8.setForeground(Color.YELLOW);
		label8.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label8);
		
		label9=new JLabel();
		label9.setBounds(210,480,50,50);
		label9.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label9.setHorizontalAlignment(SwingConstants.CENTER);
		label9.setVerticalAlignment(SwingConstants.CENTER);
		label9.setForeground(Color.YELLOW);
		label9.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label9);
		
		label10=new JLabel();
		label10.setBounds(260,480,50,50);
		label10.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label10.setHorizontalAlignment(SwingConstants.CENTER);
		label10.setVerticalAlignment(SwingConstants.CENTER);
		label10.setForeground(Color.YELLOW);
		label10.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label10);
		
		label11=new JLabel();
		label11.setBounds(310,480,50,50);
		label11.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label11.setHorizontalAlignment(SwingConstants.CENTER);
		label11.setVerticalAlignment(SwingConstants.CENTER);
		label11.setForeground(Color.YELLOW);
		label11.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label11);
		
		label12=new JLabel();
		label12.setBounds(360,480,50,50);
		label12.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label12.setHorizontalAlignment(SwingConstants.CENTER);
		label12.setVerticalAlignment(SwingConstants.CENTER);
		label12.setForeground(Color.YELLOW);
		label12.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label12);
		
		label13=new JLabel();
		label13.setBounds(410,480,50,50);
		label13.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label13.setHorizontalAlignment(SwingConstants.CENTER);
		label13.setVerticalAlignment(SwingConstants.CENTER);
		label13.setForeground(Color.YELLOW);
		label13.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label13);
		
		label14=new JLabel();
		label14.setBounds(460,480,50,50);
		label14.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label14.setHorizontalAlignment(SwingConstants.CENTER);
		label14.setVerticalAlignment(SwingConstants.CENTER);
		label14.setForeground(Color.YELLOW);
		label14.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label14);
		
		label15=new JLabel();
		label15.setBounds(510,480,50,50);
		label15.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label15.setHorizontalAlignment(SwingConstants.CENTER);
		label15.setVerticalAlignment(SwingConstants.CENTER);
		label15.setForeground(Color.YELLOW);
		label15.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label15);
		
		label16=new JLabel();
		label16.setBounds(560,480,50,50);
		label16.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label16.setHorizontalAlignment(SwingConstants.CENTER);
		label16.setVerticalAlignment(SwingConstants.CENTER);
		label16.setForeground(Color.YELLOW);
		label16.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label16);
		
		label17=new JLabel();
		label17.setBounds(610,480,50,50);
		label17.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		label17.setHorizontalAlignment(SwingConstants.CENTER);
		label17.setVerticalAlignment(SwingConstants.CENTER);
		label17.setForeground(Color.YELLOW);
		label17.setFont(new Font("Times New Roman",Font.BOLD,25));
		frame.add(label17);
		
		label18=new JLabel();
		label18.setBounds(660,480,50,50);
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
		
		String s="Heap Sort Algorithm for sorting in increasing order:\n1. Build a max heap from the input data.\n2. At this point, the largest item is stored at the root of the heap. Replace it with the last item of the heap followed by reducing the size of heap by 1. Finally, heapify the root of the tree.\n3. Repeat step 2 while the size of the heap is greater than 1.";
		textarea2.append(s);
		
		button1=new JButton("BACK");
		button1.setBounds(10,10,75,30);
		button1.setBackground(Color.GRAY);
		button1.setForeground(Color.YELLOW);
		button1.addActionListener(this);
		frame.add(button1);
		
		frame.setVisible(true);
		
		ArrayList<String> res=getSorted(m,0,m.length-1);
		
		for(int i=0;i<res.size();i++)
			textarea1.append(res.get(i)+"\n");
		
		setText(m.length,m);
	}
	void getMerged(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
	ArrayList<String> res=new ArrayList<String>();
	public ArrayList<String> getSorted(int A[],int l,int r)
	{
		for (int i=A.length/2-1;i>=0;i--)
		{
            heapify(A,A.length,i);
            res.add("i= "+i+",   "+getDisplay(A));
		}
        for (int i=A.length-1;i>0;i--) 
        {
            int temp=A[0];
            A[0]=A[i];
            A[i]=temp;
            heapify(A, i, 0);
            res.add("i= "+i+",   "+getDisplay(A));
        }
		
//		if (l<r) 
//		{
//            int m=l+(r-l)/2;
////            res.add("l= "+l+",    m= "+m+";    r= "+r+";    "+getDisplay(A));
//            getSorted(A,l,m);
////            res.add("l= "+l+",    m= "+m+";    r= "+r+";    "+getDisplay(A));
//            getSorted(A,m+1,r);
////            res.add("l= "+l+",    m= "+m+";    r= "+r+";    "+getDisplay(A));
//            getMerged(A, l, m, r);
//            res.add("l= "+l+",    m= "+m+";    r= "+r+";    "+getDisplay(A));
//		}
		return(res);
	}
	void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
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
		new Heap_Sort(m);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1)
		{
			frame.dispose();
			new SORTING_VISUALIZER();
		}
	}
}