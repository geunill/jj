import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends Frame implements ActionListener  {
	JButton b1 = new JButton("가위");
	JButton b2 = new JButton("바위");
	JButton b3 = new JButton("보");
	static int computerVal = 0;
	
	public Main() {
		JFrame f = new JFrame();
		Container c = f.getContentPane();
		c.setBackground(Color.black);
		c.setLayout(new FlowLayout());
	
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setTitle("짱깽뽀");
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
		 	// 가위 :0 바위 :1 보 :2
		 	int cc = computerVal;	// 이거는 랜덤 0,1,2 중에 하나
		 	
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
		 	
		 	if(cc == 0){	// 컴퓨터가 가위인 경우
		 		if(myVal == 2){	// 컴퓨터가 이긴경우
		 			gameSet(2);
		 		}
		 		if(myVal == 1){	// 내가 이긴경우
		 			gameSet(1);
		 		}
		 		if(myVal == 0){	// 비긴경우
		 			gameSet(3);
		 		}
		 	}
		 	if(cc == 1){	// 컴퓨터가 바위인 경우
		 		if(myVal == 0){	// 컴퓨터가 이긴경우
		 			gameSet(2);
		 		}
		 		if(myVal == 2){	// 내가 이긴경우
		 			gameSet(1);
		 		}
		 		if(myVal == 1){	// 비긴경우
		 			gameSet(3);
		 		}
		 	}
		 	if(cc == 3){	// 컴퓨터가 가위인 경우
			 		if(myVal == 1){	// 컴퓨터가 이긴경우
			 			gameSet(2);
			 		}
			 		if(myVal == 0){	// 내가 이긴경우
			 			gameSet(1);
			 		}
			 		if(myVal == 2){	// 비긴경우
			 			gameSet(3);
			 		}
			 	}
		 	}
	 
	 		void gameSet(int p){

	 			switch(p){
		 			case 1:	//내가 이기거나
		 				JOptionPane.showMessageDialog(this ,"이겻어");
		 				break;
		 			case 2:	//컴퓨터가 이기거나
		 				JOptionPane.showMessageDialog(this ,"졌어");
		 				break;
		 			case 3:	//비기거나
		 				JOptionPane.showMessageDialog(this ,"비겼어");
		 				break;
	 			}
	 			
	 			Random random = new Random();
	 			int val = random.nextInt(3);
	 			computerVal = val;
	 			
	 		}
		 	
		 
		 	
		 	/*
			if (e.getSource().equals(b1))
			{
				JOptionPane.showMessageDialog(this ,"이겻어");
			}
			
			if (e.getSource().equals(b2))
			{
				JOptionPane.showMessageDialog(this ,"이겻어");
			}
			
			if (e.getSource().equals(b3))
			{
				JOptionPane.showMessageDialog(this ,"이겻어");
			}
			*/
		}



