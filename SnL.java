import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FDemo extends JFrame {
	JPDemo jp1;
	FDemo() {
		super.setTitle("Snake & Ladder");
		jp1 = new JPDemo();
		add(jp1);
	}
}

class JPDemo extends JPanel implements ActionListener {
	ImageIcon img1, img2, img3, img4, img5, img6, img7, img8,img9, img10, img11;
	Image swt, board, s1, start, player1, player2, player11, player12, dice, dice1;
	JButton b1, b2, b3, b4;
	JTextField tx1, tx2, tx3;
	int px1=60, py1=620;
	
	JPDemo() {
		setBackground(Color.black);
		Font f = new Font("Bauhaus 93", Font.BOLD, 30);
		setLayout(null);
		
		img1 = new ImageIcon("swt.jpg");
		img2 = new ImageIcon("board.jpg");
		img3 = new ImageIcon("s1.png");
		img4 = new ImageIcon("start.jpg");
		img5 = new ImageIcon("about.gif");
		img6 = new ImageIcon("reset.png");
		img7 = new ImageIcon("start.gif");
		img8 = new ImageIcon("player1.png");
		img9 = new ImageIcon("player2.png");
		img10 = new ImageIcon("dice.gif");
		img11 = new ImageIcon("dice.png");
		swt = img1.getImage(); 
		board = img2.getImage();
		s1 = img3.getImage();
		start = img4.getImage();
		player1 = img8.getImage();
		player2 = img9.getImage();
		player11 = img8.getImage();
		player12 = img9.getImage();
		dice = img10.getImage();
		dice1 = img11.getImage();
		
		b1 = new JButton(img5);
		b1.setBounds(50,120,100,30);
		b1.setBackground(new Color(4,129,255));
		add(b1);
		b2 = new JButton(img6);
		b2.setBounds(50,180,100,30);
		b2.setBackground(new Color(4,129,255));
		add(b2);
		b3 = new JButton("Roll");
		b3.setBounds(50,500,100,30);
		b3.setForeground(new Color(4,129,255));
		b3.setFont(f);
		add(b3);
		b3.addActionListener(this);
		b4 = new JButton(img7);
		b4.setBounds(20,560,150,60);
		b4.setForeground(new Color(4,129,255));
		b4.setFont(f);
		add(b4);
		
		tx1 = new JTextField("Start Game");
		tx1.setBounds(50,230,150,35);
		tx1.setBackground(Color.black);
		tx1.setForeground(Color.green);
		tx1.setFont(f);
		add(tx1);
		tx2 = new JTextField("Player 1 Name");
		tx2.setBounds(50,290,150,35);
		tx2.setBackground(Color.black);
		tx2.setForeground(Color.green);
		tx2.setFont(f);
		add(tx2);
		tx3 = new JTextField("Player 2 Name");
		tx3.setBounds(50,375,150,35);
		tx3.setBackground(Color.black);
		tx3.setForeground(Color.green);
		tx3.setFont(f);
		add(tx3);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(4,129,255));
		g.fillRect(0,0,200,735);
		
		g.drawImage(swt, 0,0, this);
		g.drawImage(board,200,0,this);
		g.drawImage(s1,920,0,this);
		g.drawImage(start,20,550,this);
		g.drawImage(player1,px1,py1,this);
		g.drawImage(player2,120,620,this);
		g.drawImage(player11,10,280,this);
		g.drawImage(player12,10,360,this);
		g.drawImage(dice,10,420,this);
		g.drawImage(dice1,110,430,this);	
	}
	
	int count=0;
	public void actionPerformed(ActionEvent e) {
		px1=140;  py1=645;
		int k=1;
		
		if(e.getSource()==b3) {
			int random = (int)Math.round(Math.random()*5 +1);
			System.out.println(random);
			switch(random) {
				case 1: img11 = new ImageIcon("dice1.png"); count++;
					P:
					for(int i=1; i<=10; i++) {
						if(k==11) {
							px1 -= 70;
							k--;
						}
						if(k==0) {
							px1 += 70;
							k++;
						}
						for(int j=1; j<=10; j++) {
							count++;
							if(random==count) break P;
							
							if(i%2==1) {
								px1 += 70;
								k++;
							}
							else {
								px1 -= 70;
								k--;
							}
						}
						py1 -= 70;
					}
				break;
				case 2: img11 = new ImageIcon("dice2.png"); count+= 2;
					P:
					for(int i=1; i<=10; i++) {
						if(k==11) {
							px1 -= 70;
							k--;
						}
						if(k==0) {
							px1 += 70;
							k++;
						}
						for(int j=1; j<=10; j++) {
							count++;
							if(random==count) break P;
							
							if(i%2==1) {
								px1 += 70;
								k++;
							}
							else {
								px1 -= 70;
								k--;
							}
						}
						py1 -= 70;
					}
				break;
				case 3: img11 = new ImageIcon("dice3.png"); count+= 3; 
					P:
					for(int i=1; i<=10; i++) {
						if(k==11) {
							px1 -= 70;
							k--;
						}
						if(k==0) {
							px1 += 70;
							k++;
						}
						for(int j=1; j<=10; j++) {
							count++;
							if(random==count) break P;
							
							if(i%2==1) {
								px1 += 70;
								k++;
							}
							else {
								px1 -= 70;
								k--;
							}
						}
						py1 -= 70;
					}
				break;
				case 4: img11 = new ImageIcon("dice4.png"); count+= 4; 
					P:
					for(int i=1; i<=10; i++) {
						if(k==11) {
							px1 -= 70;
							k--;
						}
						if(k==0) {
							px1 += 70;
							k++;
						}
						for(int j=1; j<=10; j++) {
							count++;
							if(random==count) break P;
							
							if(i%2==1) {
								px1 += 70;
								k++;
							}
							else {
								px1 -= 70;
								k--;
							}
						}
						py1 -= 70;
					}
				break;
				case 5: img11 = new ImageIcon("dice5.png"); count += 5; 
					P:
					for(int i=1; i<=10; i++) {
						if(k==11) {
							px1 -= 70;
							k--;
						}
						if(k==0) {
							px1 += 70;
							k++;
						}
						for(int j=1; j<=10; j++) {
							count++;
							if(random==count) break P;
							
							if(i%2==1) {
								px1 += 70;
								k++;
							}
							else {
								px1 -= 70;
								k--;
							}
						}
						py1 -= 70;
					}
				break;
				case 6: img11 = new ImageIcon("dice6.png"); count+= 6; 
					P:
					for(int i=1; i<=10; i++) {
						if(k==11) {
							px1 -= 70;
							k--;
						}
						if(k==0) {
							px1 += 70;
							k++;
						}
						for(int j=1; j<=10; j++) {
							count++;
							if(random==count) break P;
							
							if(i%2==1) {
								px1 += 70;
								k++;
							}
							else {
								px1 -= 70;
								k--;
							}
						}
						py1 -= 70;
					}
				break;
			}
			dice1 = img11.getImage();
			repaint();
		}
	}
}

class SnL {
	public static void main(String[] SK) {
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setBounds(200,100,990,740);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}


	