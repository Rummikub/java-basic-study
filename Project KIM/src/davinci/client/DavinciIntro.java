package davinci.client;


import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.Border;


//��ü ������ : 1024 X 768
public class DavinciIntro extends JPanel implements ActionListener, MouseListener {
	private static final Component btn_ready_i = null;
	public static double su[] = new double[24]; //������ ���� �迭
	//���� ������ �������� ���� ȭ��
	Image back;							//����̹���
	JButton[] dummy = new JButton[24]; // ó���� �ö󰡴� ī�� ����
	JButton confirmGameEnd;		//���� ���� ��ư
	JTextArea chatHistory;		//ä�� ����
	JTextField chatInput;		//ä�� �Է� â
	JLabel gameMessage;			//���� �޽��� ���� ���̺�
	JLabel timeLabel;
	int space = 55;				//������ ���ݰ�
	JOptionPane pane;
	JDialog dialog;

	boolean gameEndMessage = false;  //true�� ��� ������ �������� üũ
	boolean dummyClickTurn= false;	//�������� ���� ���۽� dummy Ŭ�� ��Ȱ��ȭ�� ���� flag
	boolean gameStart = false;		//���� �������� �˸��� flag

	Object[] numbers = {"0", "1", "2", "3","4","5","6","7","8","9","10","11"};		//���ڸ� ���� ���� JOptionPane �� ��µ� ����
	Object[] goOrStop = {"Yes","No"};												//���ڸ� ��� ��������� �ѱ�������� ǥ���ϴ� �ɼ�
	public static double choose;													//�ÿ��̾ �� ���ڰ� ���� �� 0,1,2,3,4,5,6,7,8,9,10,11
	public static int option;														//���ڸ� ��� ��������� �ѱ�������� ���� ���� ��

	//���� ��  �� ���۵�
	Image imgBuf;
	Image imgFixed;
	ImageIcon b1;
	Border border = BorderFactory.createLineBorder(Color.RED, 5);  						//���õ� ī�带 �����ϱ� ���� ���� ������ (�β� 5�� ������)
	Border borderEmpty = BorderFactory.createLineBorder(new Color(0,0,0,0),2); 			//���� ������ ���� ī�带 �����ϱ� ���� ���� ������


	int messageToPlayers = 0;
	int playerTurn;
	//Player1 �� ������
	Image player1;																		//player1 �̹���
	JLabel avatar_1;																	//player1 �̹��� ������ �ö� ���̺�
	JLabel[] play1 = new JLabel[12]; 													//player1 ���� �ö� ���̺�
	Image[] imageBuf1 = new Image[12]; 													//player1�� ���ĵ� �̹��� ��¿� �̹��� �迭
	double[] temp = {12,12,12,12,12,12,12,12,12,12,12,12};							    // player1 Deck �� ���ĵ� ���ڰ��� ������ �ִ� �迭
	public ArrayList<Double> tail = new ArrayList<Double>(); 							//player1 ���� ���Ŀ� ����Ʈ
	int count = 0; 																		//���� ���� �� ����.Player1
	int gameEnd1 = 100;			//���� �¸����� �ʱ�ȭ(Player1�� �й��� ���)

	//Players2�� ������
	Image player2;																		 ////player2 �̹���
	JLabel avatar_2;																	 //player2 �̹��� ������ �ö� ���̺�
	JLabel[] play2 = new JLabel[12];													 // player2 ���� �ö� ���̺�
	Image[] imageBuf2 = new Image[12];													//player2�� ���ĵ� �̹��� ��¿� �̹��� �迭
	double[] temp2 = {12,12,12,12,12,12,12,12,12,12,12,12};								 //players2 Deck �� ���ĵ� ���ڰ��� ������ �ִ� �迭
	public ArrayList<Double> tail2 = new ArrayList<Double>();
	int count2 = 0; 																	//���� ���� �� ����.Player2
	int gameEnd2 = 1000;		//���� �¸����� �ʱ�ȭ (Player2�� �й��� ���)

	DavinciIntro(){
		setLayout(null); 																//�⺻ ���̾ƿ� ����

		pane = new JOptionPane();

//		dialog.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		chatHistory = new JTextArea();													//ä�� ���
		chatInput = new JTextField();													//ä�� ��ǲ
		gameMessage = new JLabel("ī�� 4���� ����ּ���", SwingConstants.CENTER); 			//�޽��� �ʱⰪ
		gameMessage.setFont(new Font("Serif", Font.BOLD, 20));

		//���� ���� Ȯ�� ��ư ���� (������ ����ÿ��� �巯����)
		confirmGameEnd = new JButton("CONFIRM End");
		confirmGameEnd.setFont(new Font ("Verdana",Font.BOLD,35));
		confirmGameEnd.setBounds(320,330,300,100);
		confirmGameEnd.setEnabled(false); //�ܼ� ��Ȱ��ȭ
		confirmGameEnd.setVisible(false);
		confirmGameEnd.addActionListener(this);

		//�⺻ �̹��� ���� (���Ŀ� ���濡�� �����͸� �޾ƿ;���.
		back = Toolkit.getDefaultToolkit().getImage("images/gameBackground.jpg");
		player1 = Toolkit.getDefaultToolkit().getImage("images/Avatar/_11.jpg");
		player2 = Toolkit.getDefaultToolkit().getImage("images/Avatar/_33.jpg");
		avatar_1 = new JLabel(new ImageIcon(player1.getScaledInstance(90, 120, Image.SCALE_SMOOTH)));
		avatar_2 = new JLabel(new ImageIcon(player2.getScaledInstance(90, 120, Image.SCALE_SMOOTH)));

		getRand(su.length); 																			//���� static su[]�迭�� ����.


		//�߻��� ������ ���� Dummy�� ��ġ��
		for (int k=0; k<su.length;k++) {
			if(su[k]<12) {
			imgBuf = Toolkit.getDefaultToolkit().getImage("images/b_tile/b_tile_"+su[k]+".png");
			//imgBuf = Toolkit.getDefaultToolkit().getImage("images/b_tile/b_tile_back.png");
			imgFixed = imgBuf.getScaledInstance(220, 190, Image.SCALE_SMOOTH);
			dummy[k] = new JButton(new ImageIcon(imgFixed));
			}else {
				su[k] = su[k]-12+0.5;
			imgBuf = Toolkit.getDefaultToolkit().getImage("images/w_tile/w_tile_"+su[k]+".png");
			//imgBuf = Toolkit.getDefaultToolkit().getImage("images/w_tile/w_tile_back.png");
			imgFixed = imgBuf.getScaledInstance(220, 190, Image.SCALE_SMOOTH);
			dummy[k] = new JButton(new ImageIcon(imgFixed));

			}
			if(k==0) {
				dummy[k].setBounds(30,260,45,65);
			}else if(k>0 && k<12) {
				dummy[k].setBounds(30+space,260,45,65);
				space += 55;
			}else if(k==12) {
				dummy[k].setBounds(30,350,45,65);
				space = 55;
			}else if(k>=13 && k<24) {
				dummy[k].setBounds(30+space,350,45,65);
				space += 55;
			}
			add(dummy[k]);
			dummy[k].addActionListener(this);
		}

		space = 0; //���ݰ� �ʱ�ȭ

		//player 1�� ���̺� ��ġ
		for (int i=0; i<12; i++) {
			if(i<6) {
				play1[i] = new JLabel(new ImageIcon());
				play1[i].setBounds(250+space, 470, 45, 65);
				space += 55;
				play1[i].setBackground(Color.white);
				play1[i].setOpaque(false);
			}else {
				if(i==6) {
					space=0;
				}
				play1[i] = new JLabel(new ImageIcon());
				play1[i].setBounds(250+space, 540, 45, 65);
				space += 55;
				play1[i].setBackground(Color.white);
				play1[i].setOpaque(false);
			}
			add(play1[i]);
			play1[i].addMouseListener(this);
		}

		space =0;
		//player2�� ���̺� ��ġ
		for (int i=0; i<12; i++) {
			if(i<6) {
				play2[i] = new JLabel(new ImageIcon());
				play2[i].setBounds(250+space, 50, 45, 65);
				space += 55;
				play2[i].setBackground(Color.white);
				play2[i].setOpaque(false);
			}else {
				if(i==6) {
					space=0;
				}
				play2[i] = new JLabel(new ImageIcon());
				play2[i].setBounds(250+space, 120, 45, 65);
				space += 55;
				play2[i].setBackground(Color.white);
				play2[i].setOpaque(false);
			}
			add(play2[i]);
			play2[i].addMouseListener(this);
		}


		JScrollPane chatRm = new JScrollPane(chatHistory);
		chatRm.setBounds(705, 10, 300, 680);
		chatInput.setBounds(705, 695, 300, 30);
		chatHistory.setEditable(false);
		chatInput.addActionListener(this);
		chatRm.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER); //horizontal scroll ������ �ʵ��� 
		chatHistory.setLineWrap(true); //���� �� ���� �Է� �� �ڵ����� �ٹٲ�ǵ��� 

		//�ȳ��޽��� ��ġ�� ����
		gameMessage.setBounds(10,645,690,80);
		gameMessage.setBackground(Color.white);
		gameMessage.setOpaque(true);

		//player1,2 �� �ƹ�Ÿ ��ġ�� ����
		avatar_1.setBounds(50, 470, 90, 120);
		avatar_2.setBounds(50, 50, 90, 120);

		add(chatRm);
		add(chatInput);
		add(gameMessage);
		add(avatar_1);
		add(avatar_2);
		add(confirmGameEnd);

		// ������ ����
		int a = (int)(Math.random()*2);
		System.out.println(a);
		if(a==0) {
			playerTurn =0;
			System.out.println("�� ����");
			avatar_1.setBorder(border);
			avatar_2.setBorder(borderEmpty);
		}else if(a ==1) {
			playerTurn =1;
			System.out.println("���� ����");
			avatar_2.setBorder(border);
			avatar_1.setBorder(borderEmpty);

		}

	}

	@Override
	protected void paintComponent(Graphics g) { //��Ų ���� �� , ��׶��忡 ���
		// ���� �����ϴ� ȭ���� paint�� Ȱ��
		//super.paintComponent(g);
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Chat
		String msg= chatInput.getText();
		if(e.getSource()==chatInput) {
			chatHistory.append(msg+"\n");
			if(msg ==null || msg.length()==0) {
					JOptionPane.showMessageDialog(null,"��ȭ�� ������ �Է��ϼ���","ä��â ���",JOptionPane.WARNING_MESSAGE);
			}else
			chatInput.setText("");
		}
//======================================================================START================================================================================//
		// 1. ī�� ���� public static final int GAMESTART=500;
		/*
		 * tail = ����Ʈ ���� ���� ��� �ʿ��� ����
		 * tail.size = ���� ������ ī��� ���
		 * temp=tail.get
		 */
		if(dummyClickTurn == false || (tail.size()>=4 || tail2.size()>=4)) {			// ������ �����ϱ� ���ܰ���    OR   �÷��̾ �� ī����� �Ѵ� 4���� Ŭ������ ī�常 ������
			for(int j=0; j<24; j++) {
				if(e.getSource()==dummy[j]) {
					if(playerTurn == 0) {   // �� �� 
						dummy[j].setVisible(false); 										//���� ��ư �̹��� ������
						if(su[j]>12)																		    //ȭ��Ʈ��� 
							su[j] = su[j]-12+0.5;														//sort�ϱ� ���� 0, 0.5, 1, 1.5 ...
						tail.add(su[j]);
						Collections.sort(tail); 											

//==================================================================================================================================================
		//2-1 . P1�� deck �����ϱ� 																public static final int MYPICKDUMMY=501; 
							for(int k=0; k<tail.size();k++) {
								imageBuf1[k] = setCardImage(tail.get(k));
								temp[k] = tail.get(k);						//  temp= �ӽ÷� ���� ����  deck 
								play1[k].setIcon(new ImageIcon(imageBuf1[k]));
								play1[k].setOpaque( true);
								play1[k].setBorder(borderEmpty);
								if(tail.get(k)%0.5!=0) {										// ������ ����Ǹ鼭 ����� ���� ������ ������ �����ϰ� �ѷ��ش�.
									double c = tail.get(k)-0.01;
									play1[k].setBorder(borderEmpty); // ���� ������ ī��
									play1[k].setIcon(new ImageIcon(reverseCardImage(c)));
								}
								//======================================================================
							}
							for (int i=0; i<12; i++) {											//���� ���õ� ���� �����ϱ� ���� count�� ��ġ�� �����صд�.
								if(su[j]==temp[i]) {
									count =i;  // ������ ī��� �?
									play1[count].setBorder(border); 
									break;
								}
							}
							if((tail.size()<=4 || tail2.size()<=4) && dummyClickTurn ==false){	//player���� 4�徿 �������� ������ ���� �ٲ㰡�� �����´�.
								turnChange();
								//===============================================================================
								if(tail.size()!=0 || tail2.size()!=0) {							//�������� ���� ������ �� ���̺�� ��뷹�̺��� ������ ���� �ϴ� ����ó��
									disableLabel_1(tail.size());
									disableLabel_2(tail2.size());
								}
							}
							if(dummyClickTurn ==true) {											//������ ���۵Ǿ��ٸ� Dummy���� ī�带 ������ ���� �߰��� Dummy�� ���������� �ϴ� ����ó��
								disableDummy();
								System.out.println("���� �������");
								enableLabel_2(tail2.size());
								disableLabel_1(tail.size());
								messageByPlyer(10);
							}
//===================================================================================================================//
//  2-2. P2�� ī�� ��������       public static final int PICKDUMMY =502; 

					}else if (playerTurn ==1) {
						dummy[j].setVisible(false);
						if(su[j]>12)
							su[j] = su[j]-12+0.5;
						tail2.add(su[j]);
						Collections.sort(tail2);
							for(int k=0; k<tail2.size();k++) {
								imageBuf2[k] = setCardImage(tail2.get(k));
								temp2[k] = tail2.get(k);
								play2[k].setIcon(new ImageIcon(imageBuf2[k]));
								play2[k].setOpaque(true);
								play2[k].setBorder(borderEmpty);
								if(tail2.get(k)%0.5!=0) {
									double c = tail2.get(k)-0.01;
									play2[k].setIcon(new ImageIcon(changeCardImage(c)));
									play2[k].setBorder(borderEmpty);
								}

							}
							for (int i=0; i<12; i++) {
								if(su[j]==temp2[i]) {
									count2 =i;
									play2[count2].setBorder(border);
									break;
								}
							}
							if((tail.size()<=4 || tail2.size()<=4) && dummyClickTurn ==false) {
								turnChange();
								if(tail.size()!=0 || tail2.size()!=0) {
									disableLabel_1(tail.size());
									disableLabel_2(tail2.size());
								}
							}
//=============================================================================================================							
							if(dummyClickTurn ==true) {
								disableDummy();
								System.out.println("����� ���� ����");
								enableLabel_1(tail.size());
								disableLabel_2(tail2.size());
								messageByPlyer(10);
							}
					}
				}
			}
		}
//==============================================================================================================
//3. ���ӽ���  public static  final int GAMESTART =503;
		if(tail.size()==4 && tail2.size()==4){											//4�徿 �����Դٸ� �������� ������ �������� �˸��� ���� ���ǹ�
			gameStart=true;
			messageStart(gameStart);
			dummyClickTurn = true;
		}
	}



	public Image setCardImage(double a) {											// ��ưŬ�� Ȥ�� �Է��� ���ڰ��� �ش��ϴ� �̹����� �����ϱ� ���� �޼ҵ�
		if(playerTurn==0)
			if(a%1.0!=0) {
				imgBuf = Toolkit.getDefaultToolkit().getImage("images/w_tile/w_tile_"+a+".png");
			}else {
				imgBuf = Toolkit.getDefaultToolkit().getImage("images/b_tile/b_tile_"+a+".png");
			}
		else if(playerTurn==1)
			if(a%1.0!=0) {
				imgBuf = Toolkit.getDefaultToolkit().getImage("images/w_tile/w_tile_back.png");
			}else {
				imgBuf = Toolkit.getDefaultToolkit().getImage("images/b_tile/b_tile_back.png");
			}

		imgFixed = imgBuf.getScaledInstance(220, 190, Image.SCALE_SMOOTH);
		return imgFixed;
	}

	public Image changeCardImage(double a) {										//�ÿ��̾� ���� ���� �Էµ� ī�带 (�ʿ� ��������...
		if(a%1.0!=0) {
			imgBuf = Toolkit.getDefaultToolkit().getImage("images/w_tile/w_tile_"+a+".png");
		}else {
			imgBuf = Toolkit.getDefaultToolkit().getImage("images/b_tile/b_tile_"+a+".png");
		}
		imgFixed = imgBuf.getScaledInstance(220, 190, Image.SCALE_SMOOTH);

		return imgFixed;
	}

	public Image reverseCardImage(double a) {
		if(a%1.0!=0) {
			imgBuf = Toolkit.getDefaultToolkit().getImage("images/w_tile_rev/w_tile_rev_"+a+".png");
		}else {
			imgBuf = Toolkit.getDefaultToolkit().getImage("images/b_tile_rev/b_tile_rev_"+a+".png");
		}
		imgFixed = imgBuf.getScaledInstance(220, 190, Image.SCALE_SMOOTH);

		return imgFixed;
	}

	public void messageStart(boolean b) {											//���� ���۸� �˸��� ���� �޼ҵ�
		if(b==true) {
			gameMessage.setText(convertToMultiline("������ �����մϴ�\n ī�带 ���� ����ּ���("+playerTurn+")�� ����"));
		}

	}
// ======================================================�̰� �������� ������ ��..... //
	public void messageByPlyer(int a) {												//��Ȳ�� ���� �޽��� ��¿� �޼ҵ� (�� player1�� player2�� �ٸ��� ������ �޽����� �����Ͽ� �Ѹ��� ���Ѵ�.����ȭ�� �Ѱ�)
		if(a==1) {
			gameMessage.setText("ī�带 ���� ����ּ���");
		}else if (a==2) {
			gameMessage.setText("������ ī�带 ���� �ֽ��ϴ�.");
		}else if (a==3) {
			gameMessage.setText(convertToMultiline("������ ī�忡�� 1���� �������ּ���.\n������ ī�� ���ڴ� �����ϱ��?\n 01,2,3,4,5,6,7,8,9,10,11,"));
		}else if (a==4) {
			gameMessage.setText(convertToMultiline("Ʋ�Ƚ��ϴ�.���� ������ ī���� ���� �����Ǿ����ϴ�.\n ī�带 ���� ����ּ���"));
		}else if (a==5 ) {
			gameMessage.setText(convertToMultiline("�¾ҽ��ϴ�.\n �� �� ���ڸ� ���纸�Ƿ��� ? Yes or No"));
		}else if (a==6) {
			gameMessage.setText("������ ī�带 �������Դϴ�.");
		}else if (a==7) {
			gameMessage.setText(convertToMultiline("������ Ʋ�Ƚ��ϴ�.\n ������ ī�尡 �ϳ� �����Ǿ����ϴ�."));
		}else if (a==8) {
			gameMessage.setText("������ ��� ī�带 ������ϴ�. �¸� ");
		}else if (a==9) {
			gameMessage.setText("�� ī�尡 ��� �� �����Ǿ����ϴ�. ");
		}else if (a==10) {
			gameMessage.setText("������ ������ ī���ϳ��� ����Ŭ���� ���ڸ� ���� ������");
		}
	}

	public void getRand(int a) {														//����ƽ �迭�� su�� �ߺ����� ���� ������ �ִ� �޼ҵ�
		boolean bCheck = false;
		for (int i=0; i<a; i++) {
			bCheck = true;
			while(bCheck) {
				bCheck=false;
				int rand = (int)(Math.random()*24);
				for(int j=0; j<i; j++) {
					if(su[j] == rand) {
						bCheck=true;
						break;
					}
				}
				su[i]=rand;
			}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {										//���� ���߱⿡ ���� �޼ҵ�
		// TODO Auto-generated method stub
		for(int i =0; i<12;i++) {
			if(e.getSource()==play2[i]) {											//������ ���̺��� Ŭ�������� ���ǹ�
				if(e.getClickCount()==2) {
					//dialog = pane.showOptionDialog(null, "���ڸ� ������","���ī��", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, numbers, numbers[0]);
					choose = JOptionPane.showOptionDialog(null, "���ڸ� ������","���ī��", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, numbers, numbers[0]);
					System.out.println("------");
					System.out.println(choose);
					System.out.println("------");
					System.out.println(temp2[i]);

					double tempValue = 0;											//�� ���� ���� �񱳸� ���� �ӽ� ����(ȭ��Ʈ ���� 0.5�� �߰��Ǿ�����  ����� �Է��� 0.5�� ���� �ʱ� ������ ����)
					if(temp2[i]%1.0!=0) {
						System.out.println("���");
						tempValue = temp2[i] - 0.5;
						System.out.println(tempValue);
					}

					if(tempValue == choose || temp2[i] == choose) {					//�ӽú����� temp2[i]�� ���� �������� ��ư Ŭ���� �� ȭ��Ʈ�� ������������ ������ �ΰ��� ����Ͽ��� ��.
						System.out.println("����");
						play2[i].setIcon(new ImageIcon(changeCardImage(temp2[i])));  //������ ī��
						play2[i].setBorder(borderEmpty);
						tail2.set(i, tail2.get(i)+0.01);  // ������ ī�� �����ϱ� ����
						gameEndCheck();												//���콺 Ŭ�� �Է��� �޾ұ⿡ ���� ���� ���������� üũ
						if(gameEndMessage==true){
							break;
						}else if(gameEndMessage == false) {							//���� ���� ���°� �ƴ϶��  ���� �̾������ �����Ұ������� üũ
							option = JOptionPane.showOptionDialog(null, "�� ���� ���ڸ� ���纸�Ƿ��� ?","GoOrStop", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, goOrStop, goOrStop[0]);
							System.out.println(option); //������ 0 Ʋ���� 1
							if (option ==0) {
								messageByPlyer(1);
								disableLabel_1(tail.size());
							}else if(option ==1) {
								turnChange();
								enableDummy();
								messageByPlyer(6);
								disableLabel_1(tail.size());
								disableLabel_2(tail2.size());
							}
						}
					}else {																//���� ������ ������ ��쿡 ���� �޴� �г�Ƽ ����
						System.out.println("Ʋ��");
						enableDummy();
						disableLabel_1(tail.size());
						disableLabel_2(tail2.size());
						tail.set(count, tail.get(count)+0.01);
						play1[count].setBorder(borderEmpty);
						play1[count].setIcon(new ImageIcon(reverseCardImage(count)));
						messageByPlyer(4);
						turnChange();

					}
				}
			}else if (e.getSource() == play1[i]) {
				if(e.getClickCount()==2) {

					choose = JOptionPane.showOptionDialog(null, "���ڸ� ������","���ī��", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, numbers, numbers[0]);
					System.out.println("------");
					System.out.println(choose);
					System.out.println("------");
					System.out.println(temp[i]);

					double tempValue = 0;
					if(temp[i]%1.0!=0) {
						System.out.println("���");
						tempValue = temp[i] - 0.5;
						System.out.println(tempValue);
					}
					System.out.println(count);

					if(tempValue == choose || temp[i] == choose) {
						System.out.println("����");
						play1[i].setBorder(borderEmpty);
						play1[i].setIcon(new ImageIcon(reverseCardImage(temp[i])));
						tail.set(i, tail.get(i)+0.01);

						gameEndCheck();
						if(gameEndMessage==true){
							break;
						}else if(gameEndMessage == false) {
							option = JOptionPane.showOptionDialog(null, "�� ���� ���ڸ� ���纸�Ƿ��� ?","GoOrStop", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, goOrStop, goOrStop[0]);
							System.out.println(option); //������ 0 Ʋ���� 1
							if (option ==0) {
								messageByPlyer(1);
								disableLabel_2(tail2.size());
							}else if(option ==1) {
								turnChange();
								messageByPlyer(6);
								enableDummy();
								disableLabel_1(tail.size());
								disableLabel_2(tail2.size());
							}
						}
					}else {
						System.out.println("Ʋ��");
						enableDummy();
						disableLabel_1(tail.size());
						disableLabel_2(tail2.size());
						tail2.set(count2, tail2.get(count2)+0.01);
						play2[count2].setIcon(new ImageIcon(changeCardImage(temp2[count2])));
						play2[count2].setBorder(borderEmpty);
						messageByPlyer(4);
						turnChange();

					}
				}
			}
		}
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	public void turnChange() { 														//���� 0 ������ 1
		if(playerTurn==1) {
			playerTurn = 0;
			avatar_1.setBorder(border);
			avatar_2.setBorder(borderEmpty);
			System.out.println("���� �����Է� ��");
		}else if(playerTurn ==0) {
			playerTurn =1;
			avatar_2.setBorder(border);
			avatar_1.setBorder(borderEmpty);
			System.out.println("���� �������� ��");
		}
	}

	public void gameEndCheck()  {									//���� �������� -> ��������� ������ �� ī�� ���ڿ� , ���� �÷��̾ ���� ī����� ���ٸ� ����.
		gameEnd1 =0;
		gameEnd2 =0;

		for(int check=0; check<tail.size();check++) {
			if (tail.get(check)%0.5!=0)
				gameEnd1 +=1;
		}
		for (int cc = 0; cc<tail2.size(); cc++) {
			if (tail2.get(cc)%0.5!=0)
			gameEnd2 +=1;
		}
		System.out.println("���� üũ��");
		if(gameEnd1 == tail.size()) {
			messageByPlyer(9);
			System.out.println("player 2 �¸�");
			confirmGameEnd.setEnabled(true); //�ܼ� ��Ȱ��ȭ
			confirmGameEnd.setVisible(true);
			gameEndMessage = true;

		}else if(gameEnd2 == tail.size()) {
			messageByPlyer(8);
			System.out.println("player 1 �¸�");
			confirmGameEnd.setEnabled(true); //�ܼ� ��Ȱ��ȭ
			confirmGameEnd.setVisible(true);
			gameEndMessage = true;

		}
		System.out.println("gmeEnd1 = " + gameEnd1);
		System.out.println("tailSize = " + tail.size());
		System.out.println("gmeEnd2 = " + gameEnd2);
		System.out.println("tail2Size = " + tail2.size());
	}

	//enable disable�� �߸��� �Է°��� �����ϱ� ���� �޼ҵ�
	public void enableLabel_1(int a) {
		for(int i=0; i<a; i++) {
			play1[i].addMouseListener(this);
		}
	}

	public void enableLabel_2(int a) {
		for(int i=0; i<a; i++) {
			play2[i].addMouseListener(this);
		}

	}
	public void disableLabel_1(int a) {
		for(int i=0; i<a; i++) {
			play1[i].removeMouseListener(this);
		}
	}

	public void disableLabel_2(int a) {
		for(int i=0; i<a; i++) {
			play2[i].removeMouseListener(this);
		}
	}
	public void disableDummy() {
		for (int i=0; i<24; i++) {
				dummy[i].setEnabled(false);
				//dummy[i].setVisible(false);
			}

	}

	public void enableDummy() {
		for (int i=0; i<24; i++) {
			dummy[i].setEnabled(true);
			//dummy[i].setVisible(true);
		}
	}

	public static String convertToMultiline(String orig)			//��Ʈ �޽��� â�� ��µǴ� ���ڿ��� ������ ���� html �� ����
	{
	    return "<html>" + orig.replaceAll("\n", "<br>");
	}
}

