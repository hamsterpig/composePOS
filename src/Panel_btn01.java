
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Panel_btn01 extends FrameD implements ActionListener{
	JButton btnLogin, btnLogout, btn1, btn2, btn3, btn4, btn5, btn6;
	JButton btnMenu[];
	
	JPanel pa_c_eMenuBar, pa_c_cManuField, pa_c_eMenuBar_List, pLogo;
	JPanel pa_c_cLogin;
	JPanel pa_c_cManuField_cbtn1, pa_c_cManuField_cbtn2,pa_c_cManuField_cbtn3,
		pa_c_cManuField_cbtn4,pa_c_cManuField_cbtn5,pa_c_cManuField_cbtn6;
	JPanel pa_c_cManuField_cbtn1_c, pa_c_cManuField_cbtn1_w, pa_c_cManuField_cbtn1_e, //btn1 S N C E W
		pa_c_cManuField_cbtn1_n, pa_c_cManuField_cbtn1_s;
	JPanel pbtn02_s, pbtn02_n, pbtn02_c, pbtn02_w, pbtn02_e, pbtn02_nc;
	
	JLabel lbLogo, lbLogin, lbInformation; // login
	JLabel lbID, lbPass; // id pass
	JLabel lb1_jumju, lb1_jumName, lb1_Period, lb1_Location;

	JTextField txID, txPass;
	JTextField tx1_jumju, tx1_jumName, tx1_Period, tx1_Location;

	ImageIcon imgLogo, imgLogin, imgInformation;
	
	
	Panel_btn01(){

		
		pa_c_eMenuBar = new JPanel(); // menuBar
		//pa_c_eMenuBar.setBackground(new Color(255,255,183));
		pa_c_eMenuBar.setPreferredSize(new Dimension(250,800));
		pa_c_eMenuBar.setVisible(false);
		
		pa_c_cManuField = new JPanel(); // menuMain
		//pa_c_cManuField.setBackground(Color.WHITE);
		pa_c_cManuField.setPreferredSize(new Dimension(800,800));
		pa_c_cManuField.setVisible(false);

		this.setPreferredSize(new Dimension(1280,800));
		setResizable(false);
		
		pa_c_cLogin = new JPanel(new FlowLayout());
		pa_c_cLogin.setPreferredSize(new Dimension(260,400));
		pa_c.add(pa_c_cLogin, BorderLayout.LINE_END);
		
		pa_c.add(pa_c_eMenuBar,BorderLayout.LINE_START);
		pa_c.add(pa_c_cManuField, BorderLayout.CENTER);
		pa_c.setPreferredSize(new Dimension(1280,800));
		
		JPanel pa_c_nLogin_Line01 = new JPanel();
		JPanel pa_c_nLogin_Line02 = new JPanel();
		JPanel pa_c_nLogin_Line03 = new JPanel();
		pa_c_cLogin.add(pa_c_nLogin_Line01);
		pa_c_cLogin.add(pa_c_nLogin_Line02);
		pa_c_cLogin.add(pa_c_nLogin_Line03);
		
		lbID = new JLabel("아이디  ");
		txID = new JTextField(16);
		pa_c_nLogin_Line01.add(lbID);
		pa_c_nLogin_Line01.add(txID);
		
		lbPass = new JLabel("비밀번호");
		txPass = new JTextField(16);
		pa_c_nLogin_Line02.add(lbPass);
		pa_c_nLogin_Line02.add(txPass);
		
		btnLogin = new JButton("Login");
		btnLogout = new JButton("Logout");
		btnLogin.addActionListener(this);
		btnLogout.addActionListener(this);
		pa_c_nLogin_Line03.add(btnLogin);
		
		//pa_c_nLogin.add();
		pLogo = new JPanel();
		
		pa_c_eMenuBar_List = new JPanel();
		pa_c_eMenuBar_List.setPreferredSize(new Dimension(260,750));
		
		//pa_c_eMenuBar_List.setBackground(new Color(255,255,183));
		lbLogo = new JLabel(); //로고
		pLogo.add(lbLogo);
		pLogo.setOpaque(false);
		
		
		
		imgLogo = new ImageIcon("D:/PGH/Workspace/compose/src/imgs/yellow_logo.png"); // Logo
		ImageIcon setLogo = imageSetSize(imgLogo, 200, 100);
		lbLogo.setIcon(setLogo);
		lbLogo.setPreferredSize(new Dimension(200,100));
		
		imgLogin = new ImageIcon("D:/PGH/Workspace/compose/src/imgs/composeLogin.jpg");
		ImageIcon setLogin = imageSetSize(imgLogin, 1280, 800);
		lbLogin = new JLabel(); // Login img setting ~
		lbLogin.setIcon(setLogin);
		
		imgInformation = new ImageIcon("D:/PGH/Workspace/compose/src/imgs/information.jpg");
		ImageIcon setInformation = imageSetSize(imgInformation, 250, 250);
		lbInformation = new JLabel();
		lbInformation.setIcon(setInformation);

		pa_c_eMenuBar_List.add(btnLogout);
		
		

		
		this.setLayout(null);
		pa.setBounds(0,0,1280,800);
		this.add(lbLogin);
		lbLogin.setBounds(0,0,1280,800);
		pa_c.setOpaque(false);
		pa.setOpaque(false);
		pa_c_cLogin.setOpaque(false);
		pa_c_nLogin_Line01.setOpaque(false);
		pa_c_nLogin_Line02.setOpaque(false);
		pa_c_nLogin_Line03.setOpaque(false); // end
		
		
		pa_c_eMenuBar.add(pLogo);
		pa_c_eMenuBar.add(pa_c_eMenuBar_List);
		
		btn1 = new JButton("가맹점 정보");
		btn2 = new JButton("주문");
		btn3 = new JButton("주문 내역");
		btn4 = new JButton("통계");
		btn5 = new JButton("직원");
		btn6 = new JButton("환경 설정");
		btnLogout.setPreferredSize(new Dimension(180,50));
		btn1.setPreferredSize(new Dimension(180,60));
		btn2.setPreferredSize(new Dimension(180,60));
		btn3.setPreferredSize(new Dimension(180,60));
		btn4.setPreferredSize(new Dimension(180,60));
		btn5.setPreferredSize(new Dimension(180,60));
		btn6.setPreferredSize(new Dimension(180,60));
		btnLogout.setBackground(new Color(255,50,50));
		//btn1.setBackground(new Color(255,255,125));
		//btn2.setBackground(new Color(255,255,125));
		//btn3.setBackground(new Color(255,255,125));
		//btn4.setBackground(new Color(255,255,125));
		//btn5.setBackground(new Color(255,255,125));
		//btn6.setBackground(new Color(255,255,125));
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		
		pa_c_eMenuBar_List.add(btn1);
		pa_c_eMenuBar_List.add(btn2);
		pa_c_eMenuBar_List.add(btn3);
		pa_c_eMenuBar_List.add(btn4);
		pa_c_eMenuBar_List.add(btn5);
		pa_c_eMenuBar_List.add(btn6);
		
		pa_c_cManuField_cbtn1 = new JPanel();
		pa_c_cManuField_cbtn2 = new JPanel();
		pa_c_cManuField_cbtn3 = new JPanel();
		pa_c_cManuField_cbtn4 = new JPanel();
		pa_c_cManuField_cbtn5 = new JPanel();
		pa_c_cManuField_cbtn6 = new JPanel();
		
		pa_c_cManuField.add(pa_c_cManuField_cbtn1);
		pa_c_cManuField.add(pa_c_cManuField_cbtn2);
		pa_c_cManuField.add(pa_c_cManuField_cbtn3);
		pa_c_cManuField.add(pa_c_cManuField_cbtn4);
		pa_c_cManuField.add(pa_c_cManuField_cbtn5);
		pa_c_cManuField.add(pa_c_cManuField_cbtn6);

		pa_c_cManuField_cbtn1.setLayout(new BorderLayout());
		pa_c_cManuField_cbtn2.setLayout(new BorderLayout());
		pa_c_cManuField_cbtn3.setLayout(new BorderLayout());
		pa_c_cManuField_cbtn4.setLayout(new BorderLayout());
		pa_c_cManuField_cbtn5.setLayout(new BorderLayout());
		pa_c_cManuField_cbtn6.setLayout(new BorderLayout());
		
		pa_c_cManuField_cbtn1.setPreferredSize(new Dimension(1000,750));
		pa_c_cManuField_cbtn2.setPreferredSize(new Dimension(1000,750));
		pa_c_cManuField_cbtn3.setPreferredSize(new Dimension(1000,750));
		pa_c_cManuField_cbtn4.setPreferredSize(new Dimension(1000,750));
		pa_c_cManuField_cbtn5.setPreferredSize(new Dimension(1000,750));
		pa_c_cManuField_cbtn6.setPreferredSize(new Dimension(1000,750));
		
		pa_c_cManuField_cbtn1.setVisible(true);
		pa_c_cManuField_cbtn2.setVisible(false);
		pa_c_cManuField_cbtn3.setVisible(false);
		pa_c_cManuField_cbtn4.setVisible(false);
		pa_c_cManuField_cbtn5.setVisible(false);
		pa_c_cManuField_cbtn6.setVisible(false);
		
		pa_c_cManuField_cbtn1_c = new JPanel();
		pa_c_cManuField_cbtn1_w = new JPanel();
		pa_c_cManuField_cbtn1_e = new JPanel();
		pa_c_cManuField_cbtn1_n = new JPanel();
		pa_c_cManuField_cbtn1_s = new JPanel();
		
		pa_c_cManuField_cbtn1.add(pa_c_cManuField_cbtn1_c, BorderLayout.CENTER);
		pa_c_cManuField_cbtn1.add(pa_c_cManuField_cbtn1_w, BorderLayout.LINE_END);
		pa_c_cManuField_cbtn1.add(pa_c_cManuField_cbtn1_e, BorderLayout.LINE_START);
		pa_c_cManuField_cbtn1.add(pa_c_cManuField_cbtn1_n, BorderLayout.PAGE_START);
		pa_c_cManuField_cbtn1.add(pa_c_cManuField_cbtn1_s, BorderLayout.PAGE_END);
		
		pa_c_cManuField_cbtn1_n.setBackground(Color.white);
		pa_c_cManuField_cbtn1_n.add(lbInformation);

		
		JPanel pbtn1_Line01 = new JPanel();
		JPanel pbtn1_Line02 = new JPanel();
		JPanel pbtn1_Line03 = new JPanel();
		JPanel pbtn1_Line04 = new JPanel();
		JPanel pbtn1_all = new JPanel();
		pbtn1_all.add(pbtn1_Line01);
		pbtn1_all.add(pbtn1_Line02);
		pbtn1_all.add(pbtn1_Line03);
		pbtn1_all.add(pbtn1_Line04);
		pbtn1_all.setPreferredSize(new Dimension(300,600));
		
		pa_c_cManuField_cbtn1_c.add(pbtn1_all);
		pa_c_cManuField_cbtn1_c.setBackground(Color.white);
		pbtn1_all.setBackground(Color.white);
		pbtn1_Line01.setBackground(Color.white);
		pbtn1_Line02.setBackground(Color.white);
		pbtn1_Line03.setBackground(Color.white);
		pbtn1_Line04.setBackground(Color.white);

		lb1_jumju = new JLabel("가맹점주   ");
		lb1_jumName = new JLabel("가맹점명   ");
		lb1_Period = new JLabel("계약기간   ");
		lb1_Location = new JLabel("가맹점 위치");;
		
		tx1_jumju = new JTextField(16);
		tx1_jumName = new JTextField(16);
		tx1_Period = new JTextField(16);
		tx1_Location = new JTextField(16);;
		tx1_jumju.setEditable(false);
		tx1_jumName.setEditable(false);
		tx1_Period.setEditable(false);
		tx1_Location.setEditable(false);
		tx1_jumju.setText("Compose");
		tx1_jumName.setText("Pigg");
		tx1_Period.setText("2019.12.01~2020.12.01");
		tx1_Location.setText("부산 북구 2동 1120");
		
		pbtn1_Line01.add(lb1_jumju);
		pbtn1_Line01.add(tx1_jumju);
		pbtn1_Line02.add(lb1_jumName);
		pbtn1_Line02.add(tx1_jumName);
		pbtn1_Line03.add(lb1_Period);
		pbtn1_Line03.add(tx1_Period);
		pbtn1_Line04.add(lb1_Location);
		pbtn1_Line04.add(tx1_Location);
		
		
		//pa_c_cManuField_cbtn2.add(new JButton("버튼 2")); 
		// end panel btn02
		
		pack();
		setLocationRelativeTo(null);
	}
	private ImageIcon imageSetSize(ImageIcon icon, int i, int j) { // image Size Setting
		// TODO Auto-generated method stub
		Image ximg = icon.getImage();  //ImageIcon을 Image로 변환.
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg); //Image로 ImageIcon 생성
		
		return xyimg;
	}
	
	public void viewer(int n) {
		// TODO Auto-generated method stub
		pa_c_cManuField_cbtn1.setVisible(false);
		pa_c_cManuField_cbtn2.setVisible(false);
		pa_c_cManuField_cbtn3.setVisible(false);
		pa_c_cManuField_cbtn4.setVisible(false);
		pa_c_cManuField_cbtn5.setVisible(false);
		pa_c_cManuField_cbtn6.setVisible(false);
		switch(n){
		case 1: pa_c_cManuField_cbtn1.setVisible(true); break;
		case 2: pa_c_cManuField_cbtn2.setVisible(true); break;
		case 3: pa_c_cManuField_cbtn3.setVisible(true); break;
		case 4: pa_c_cManuField_cbtn4.setVisible(true); break;
		case 5: pa_c_cManuField_cbtn5.setVisible(true); break;
		case 6: pa_c_cManuField_cbtn6.setVisible(true); break;
		default : break;
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {

	}
	
	
	
	
	
}

