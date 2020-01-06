
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class Panel_btn06 extends Panel_btn05{
	JPanel pbtn6_s, pbtn6_n, pbtn6_c, pbtn6_e, pbtn6_w; // e
	JLabel title06;
	JLabel lbPColor;
	JRadioButton rType01, rType02, rType03, rType04;
	JButton btnType01, btnType02, btnType03, btnType04;
	ButtonGroup theme;
	JButton btn_Panel_Setting;
	Panel_btn06(){
		pbtn6_s = new JPanel();
		pbtn6_n = new JPanel();
		pbtn6_c = new JPanel(new FlowLayout(FlowLayout.LEADING));
		pbtn6_e = new JPanel();
		pbtn6_w = new JPanel();
		
		pa_c_cManuField_cbtn6.add(pbtn6_s, BorderLayout.PAGE_START);
		pa_c_cManuField_cbtn6.add(pbtn6_n, BorderLayout.PAGE_END);
		pa_c_cManuField_cbtn6.add(pbtn6_c, BorderLayout.CENTER);
		pa_c_cManuField_cbtn6.add(pbtn6_e, BorderLayout.LINE_END);
		pa_c_cManuField_cbtn6.add(pbtn6_w, BorderLayout.LINE_START);
		
		pbtn6_s.setLayout(new FlowLayout(FlowLayout.CENTER));
		title06 = new JLabel("ȯ�漳��");
		title06.setBackground(Color.yellow);
		
		pbtn6_s.add(title06);
		pbtn6_s.setBackground(Color.yellow);
		
		lbPColor = new JLabel("�׸�");
		rType01 = new JRadioButton();
		rType02 = new JRadioButton();
		rType03 = new JRadioButton();
		rType04 = new JRadioButton();
		
		theme = new ButtonGroup();
		theme.add(rType01);
		theme.add(rType02);
		theme.add(rType03);
		theme.add(rType04);
		
		btnType01 = new JButton();
		btnType02 = new JButton();
		btnType03 = new JButton();
		btnType04 = new JButton();
		
		btnType01.add(rType01);
		btnType02.add(rType02);
		btnType03.add(rType03);
		btnType04.add(rType04);
		btnType01.setPreferredSize(new Dimension(200,80));
		btnType02.setPreferredSize(new Dimension(200,80));
		btnType03.setPreferredSize(new Dimension(200,80));
		btnType04.setPreferredSize(new Dimension(200,80));
		btnType01.setBackground(new Color(255,80,80));
		btnType02.setBackground(new Color(80,255,80));
		btnType03.setBackground(new Color(80,80,255));
		btnType04.setBackground(new Color(255,255,183)); // default
		btnType01.addActionListener(this);
		btnType02.addActionListener(this);
		btnType03.addActionListener(this);
		btnType04.addActionListener(this);
		
		JLabel lbTheme = new JLabel("�׸� ");
		JPanel pline01 = new JPanel();
		
		//pline01.add(lbTheme);
		pbtn6_c.add(lbTheme);
		pline01.add(btnType01);
		pline01.add(btnType02);
		pline01.add(btnType03);
		pline01.add(btnType04);
		pbtn6_c.add(pline01);
		pline01.setLayout(new FlowLayout(FlowLayout.LEADING));
		pline01.setPreferredSize(new Dimension(900,100));
		pline01.setBackground(Color.white);
		pline01.setLayout(new GridLayout(1,0));
		
		btn_Panel_Setting = new JButton("���� ����");
		btn_Panel_Setting.addActionListener(this);
		btn_Panel_Setting.setPreferredSize(new Dimension(700,100));
		pbtn6_n.add(btn_Panel_Setting);
		
		
		
	}
	
	protected void btn_Panel_Setting(){
		if(rType01.isSelected()==true){
			btn_TypeSetting("type1");
		} else if(rType02.isSelected()==true){
			btn_TypeSetting("type2");
		} else if(rType03.isSelected()==true){
			btn_TypeSetting("type3");
		} else if(rType04.isSelected()==true){
			btn_TypeSetting("type4");
		}
	}

	private void btn_TypeSetting(String type) {
		// TODO Auto-generated method stub
		try {
			FileWriter write3 = new FileWriter("src/db/color.txt");
			write3.write(type);
			write3.close();
			setThemeType(type);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void setThemeType(String colorType) {
		// TODO Auto-generated method stub
		if(colorType.equals("type1")){
			setTheme(colorManager.redBg, colorManager.redBtn, colorManager.redLine); // Theme Red
		} else if(colorType.equals("type2")){
			setTheme(colorManager.greenBg, colorManager.greenBtn, colorManager.greenLine); // Theme Green
		} else if(colorType.equals("type3")){
			setTheme(colorManager.blueBg, colorManager.blueBtn, colorManager.blueLine); // Theme Blue
		} else if(colorType.equals("type4")){
			setTheme(colorManager.yellowBg, colorManager.yellowBtn, colorManager.yellowLine); // Theme yellow
		} else{ // Default
			setTheme(colorManager.yellowBg, colorManager.yellowBtn, colorManager.yellowLine); // Theme yellow
		}
	}
	
	private void setTheme(Color c, Color btnC, Color lineC){
		pa_c_eMenuBar.setBackground(c);
		pa_c_cManuField.setBackground(c);
		pa_c_eMenuBar_List.setBackground(c);
		pbtn02_c_menu.setBackground(c);
		pad_n.setBackground(c);
		pad_c.setBackground(c);
		pad_s.setBackground(c);
		
		for(int i=0; i<btnMenu.length; i++){
			btnMenu[i].setBackground(btnC);
		}
		btn1.setBackground(btnC);
		btn2.setBackground(btnC);
		btn3.setBackground(btnC);
		btn4.setBackground(btnC);
		btn5.setBackground(btnC);
		btn6.setBackground(btnC);
		pad_n_line01.setBackground(lineC);
		pad_n_line02.setBackground(lineC);
		pad_n_line03.setBackground(lineC);
		pad_n_line04.setBackground(lineC);
		pad_n_line05.setBackground(lineC);
	}
}
