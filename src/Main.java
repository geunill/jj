import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends Frame implements ActionListener  {
	JButton b1 = new JButton("����");
	JButton b2 = new JButton("����");
	JButton b3 = new JButton("��");
	static int computerVal = 0;
	
	public Main() {
		JFrame f = new JFrame();
		Container c = f.getContentPane();
		c.setBackground(Color.black);
		c.setLayout(new FlowLayout());
	
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setTitle("¯����");
		f.setSize(300, 300);
		f.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu	
		Random random = new Random();
		int val = random.nextInt(3);
		computerVal = val;
		
		new Main();
	}

	 @Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 	// ���� :0 ���� :1 �� :2
		 	int cc = computerVal;	// �̰Ŵ� ���� 0,1,2 �߿� �ϳ�
		 	
		 	int myVal = 0;
		 	
		 	if (e.getSource().equals(b1)){
		 		myVal = 0;
		 	}
		 	if (e.getSource().equals(b2)){
		 		myVal = 1;
		 	}
		 	if (e.getSource().equals(b3)){
		 		myVal = 2;
		 	}
		 	
		 	if(cc == 0){	// ��ǻ�Ͱ� ������ ���
		 		if(myVal == 2){	// ��ǻ�Ͱ� �̱���
		 			gameSet(2);
		 		}
		 		if(myVal == 1){	// ���� �̱���
		 			gameSet(1);
		 		}
		 		if(myVal == 0){	// �����
		 			gameSet(3);
		 		}
		 	}
		 	if(cc == 1){	// ��ǻ�Ͱ� ������ ���
		 		if(myVal == 0){	// ��ǻ�Ͱ� �̱���
		 			gameSet(2);
		 		}
		 		if(myVal == 2){	// ���� �̱���
		 			gameSet(1);
		 		}
		 		if(myVal == 1){	// �����
		 			gameSet(3);
		 		}
		 	}
		 	if(cc == 3){	// ��ǻ�Ͱ� ������ ���
			 		if(myVal == 1){	// ��ǻ�Ͱ� �̱���
			 			gameSet(2);
			 		}
			 		if(myVal == 0){	// ���� �̱���
			 			gameSet(1);
			 		}
			 		if(myVal == 2){	// �����
			 			gameSet(3);
			 		}
			 	}
		 	}
	 
	 		void gameSet(int p){

	 			switch(p){
		 			case 1:	//���� �̱�ų�
		 				JOptionPane.showMessageDialog(this ,"�̰��");
		 				break;
		 			case 2:	//��ǻ�Ͱ� �̱�ų�
		 				JOptionPane.showMessageDialog(this ,"����");
		 				break;
		 			case 3:	//���ų�
		 				JOptionPane.showMessageDialog(this ,"����");
		 				break;
	 			}
	 			
	 			Random random = new Random();
	 			int val = random.nextInt(3);
	 			computerVal = val;
	 			
	 		}
		 	
		 
		 	
		 	/*
			if (e.getSource().equals(b1))
			{
				JOptionPane.showMessageDialog(this ,"�̰��");
			}
			
			if (e.getSource().equals(b2))
			{
				JOptionPane.showMessageDialog(this ,"�̰��");
			}
			
			if (e.getSource().equals(b3))
			{
				JOptionPane.showMessageDialog(this ,"�̰��");
			}
			*/
		}



