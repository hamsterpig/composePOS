
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
import javax.swing.JTextField;
import javax.swing.UIManager;

public class login01 extends FrameD implements ActionListener{

	JButton btnLogin, btnLogout, btn1, btn2, btn3, btn4, btn5, btn6;
	
	JPanel pa_c_eMenuBar, pa_c_cManuField, pa_c_eMenuBar_List, pLogo;
	JPanel pa_c_cLogin;
	JPanel pa_c_cManuField_cbtn1, pa_c_cManuField_cbtn2,pa_c_cManuField_cbtn3,
		pa_c_cManuField_cbtn4,pa_c_cManuField_cbtn5,pa_c_cManuField_cbtn6;
	
	JLabel lbLogo, lbLogin;
	JLabel lbID, lbPass;
	
	JTextField txID, txPass;
	
	ImageIcon imgLogo, imgLogin;
	
	
	
	
	login01(){
		
		pa_c_eMenuBar = new JPanel(); // menuBar
		pa_c_eMenuBar.setBackground(Color.yellow);
		pa_c_eMenuBar.setPreferredSize(new Dimension(250,800));
		pa_c_eMenuBar.setVisible(false);
		
		pa_c_cManuField = new JPanel(); // menuMain
		pa_c_cManuField.setBackground(Color.WHITE);
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
		
		pa_c_eMenuBar_List.setBackground(Color.yellow);
		lbLogo = new JLabel(); //로고
		pLogo.add(lbLogo);
		pLogo.setOpaque(false);
		imgLogo = new ImageIcon("D:/PGH/Workspace/compose/src/imgs/yellow_logo.png");
		imgLogin = new ImageIcon("D:/PGH/Workspace/compose/src/imgs/composeLogin.jpg");
		
		Image ximgLogo = imgLogo.getImage();  //ImageIcon을 Image로 변환.
		Image yimgLogo = ximgLogo.getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimgLogo = new ImageIcon(yimgLogo); //Image로 ImageIcon 생성
		
		Image ximgLogin = imgLogin.getImage();  //ImageIcon을 Image로 변환.
		Image yimgLogin = ximgLogin.getScaledInstance(1280, 800, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimgLogin = new ImageIcon(yimgLogin); //Image로 ImageIcon 생성
		
		
		pa_c_eMenuBar_List.add(btnLogout);
		lbLogo.setIcon(xyimgLogo);
		lbLogo.setPreferredSize(new Dimension(200,100));
		
		lbLogin = new JLabel(); // Login img setting ~
		lbLogin.setIcon(xyimgLogin);
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
		btn4 = new JButton("발주");
		btn5 = new JButton("발주 내역");
		btn6 = new JButton("매출 관리");
		btnLogout.setPreferredSize(new Dimension(200,80));
		btn1.setPreferredSize(new Dimension(180,60));
		btn2.setPreferredSize(new Dimension(180,60));
		btn3.setPreferredSize(new Dimension(180,60));
		btn4.setPreferredSize(new Dimension(180,60));
		btn5.setPreferredSize(new Dimension(180,60));
		btn6.setPreferredSize(new Dimension(180,60));
		btnLogout.setBackground(new Color(255,50,50));
		btn1.setBackground(new Color(255,255,125));
		btn2.setBackground(new Color(255,255,125));
		btn3.setBackground(new Color(255,255,125));
		btn4.setBackground(new Color(255,255,125));
		btn5.setBackground(new Color(255,255,125));
		btn6.setBackground(new Color(255,255,125));
		
		
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

	
		pack();
		setLocationRelativeTo(null);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			UIManager.setLookAndFeel
			("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch(Exception e){
			System.out.println("ERROR");
		}
		new login01();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnLogin){ // Login
			pa_c_cLogin.setVisible(false);
			pa_c_cLogin.setPreferredSize(new Dimension(0,400));
			pa_c_eMenuBar.setVisible(true);
			pa_c_cManuField.setVisible(true);
	
		} else if(e.getSource()==btnLogout) { // Logout
			pa_c_cLogin.setVisible(true);
			pa_c_cLogin.setPreferredSize(new Dimension(260,400));
			pa_c_eMenuBar.setVisible(false);
			pa_c_cManuField.setVisible(false);

		} else if(e.getSource()==btn1){
			
		}
	}

}
