
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
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
	JRadioButton rType01, rType02, rType03, rType04; // Theme Color
	JRadioButton rFont01, rFont02, rFont03, rFont04; // Font
	JButton btnType01, btnType02, btnType03, btnType04;
	JButton btnFont01, btnFont02, btnFont03, btnFont04;
	ButtonGroup gtheme, gfont;
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
		title06 = new JLabel("»Ø∞Êº≥¡§");
		title06.setBackground(Color.yellow);
		
		pbtn6_s.add(title06);
		pbtn6_s.setBackground(Color.yellow);
		
		lbPColor = new JLabel("≈◊∏∂");
		rType01 = new JRadioButton();
		rType02 = new JRadioButton();
		rType03 = new JRadioButton();
		rType04 = new JRadioButton();
		
		rFont01 = new JRadioButton(); // Font
		rFont02 = new JRadioButton();
		rFont03 = new JRadioButton();
		rFont04 = new JRadioButton();; 
		
		gtheme = new ButtonGroup();
		gtheme.add(rType01);
		gtheme.add(rType02);
		gtheme.add(rType03);
		gtheme.add(rType04);
		
		gfont = new ButtonGroup();
		gfont.add(rFont01);
		gfont.add(rFont02);
		gfont.add(rFont03);
		gfont.add(rFont04);
		
		
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
		
		JLabel lbTheme = new JLabel("≈◊∏∂"); // Theme Color
		lbTheme.setHorizontalAlignment(lbTheme.CENTER);
		lbTheme.setPreferredSize(new Dimension(100,100)); // will add Color
		JPanel pline01 = new JPanel(); 
		
		//pline01.add(lbTheme);
		pbtn6_c.add(lbTheme); 
		pline01.add(btnType01);
		pline01.add(btnType02);
		pline01.add(btnType03);
		pline01.add(btnType04);
		pbtn6_c.add(pline01);
		pline01.setLayout(new FlowLayout(FlowLayout.LEADING));
		pline01.setPreferredSize(new Dimension(850,100));
		pline01.setBackground(Color.white);
		pline01.setLayout(new GridLayout(1,0));
		
		btn_Panel_Setting = new JButton("º≥¡§ ¿˚øÎ");
		btn_Panel_Setting.addActionListener(this);
		btn_Panel_Setting.setPreferredSize(new Dimension(700,100));
		pbtn6_n.add(btn_Panel_Setting);
		
		btnFont01 = new JButton();
		btnFont02 = new JButton();
		btnFont03 = new JButton();
		btnFont04 = new JButton();
		
		
		JPanel lbFontLine = new JPanel();
		lbFontLine.setPreferredSize(new Dimension(1000, 15));
		lbFontLine.setBackground(Color.yellow); // will add Color
		pbtn6_c.add(lbFontLine);
		
		JLabel lbFont = new JLabel("∆˘∆Æ√º");
		lbFont.setHorizontalAlignment(lbFont.CENTER);
		JPanel pline02 = new JPanel();
		lbFont.setPreferredSize(new Dimension(100,100)); // will add Color
		
		pbtn6_c.add(lbFont);
		pbtn6_c.add(pline02);
		pline02.add(btnFont01);
		pline02.add(btnFont02);
		pline02.add(btnFont03);
		pline02.add(btnFont04);
		
		btnFont01.add(rFont01);
		btnFont02.add(rFont02);
		btnFont03.add(rFont03);
		btnFont04.add(rFont04);
		btnFont01.addActionListener(this);
		btnFont02.addActionListener(this);
		btnFont03.addActionListener(this);
		btnFont04.addActionListener(this);
		
		JLabel lbFontEx01 = new JLabel("≥™¥Æ∞ÌµÒ");
		JLabel lbFontEx02 = new JLabel("»ﬁ∏’∆Ì¡ˆ√º");
		JLabel lbFontEx03 = new JLabel("«‘√ ∑’πŸ≈¡");
		JLabel lbFontEx04 = new JLabel("¿±∞ÌµÒ");
		
		lbFontEx01.setFont(fontManager.nanum_PLAIN_15);
		lbFontEx02.setFont(fontManager.latter_PLAIN_15);
		lbFontEx03.setFont(fontManager.yun_PLAIN_15);
		lbFontEx04.setFont(fontManager.cholong_PLAIN_15);
		
		btnFont01.setLayout(new GridLayout(1,0));
		btnFont02.setLayout(new GridLayout(1,0));
		btnFont03.setLayout(new GridLayout(1,0));
		btnFont04.setLayout(new GridLayout(1,0));
		
		btnFont01.add(lbFontEx01);
		btnFont02.add(lbFontEx02);
		btnFont03.add(lbFontEx03);
		btnFont04.add(lbFontEx04);
		
		pline02.setPreferredSize(new Dimension(850,100));
		pline02.setBackground(Color.white);
		pline02.setLayout(new GridLayout(1,0));
		
		
		
		
	}
	
	protected void btn_Panel_Setting(){
		if(rType01.isSelected()==true){ // Theme
			btn_TypeSetting("type1");
		} else if(rType02.isSelected()==true){
			btn_TypeSetting("type2");
		} else if(rType03.isSelected()==true){
			btn_TypeSetting("type3");
		} else if(rType04.isSelected()==true){
			btn_TypeSetting("type4");
		}
		
		if(rFont01.isSelected()==true){ // Font ≥™¥Æ∞ÌµÒ, »ﬁ∏’∆Ì¡ˆ√º, «‘√ ∑’πŸ≈¡, «—ƒƒ ¿±∞ÌµÒ 230
			btn_FontTetting("≥™¥Æ∞ÌµÒ");
		} else if(rFont02.isSelected()==true){
			btn_FontTetting("»ﬁ∏’∆Ì¡ˆ√º");
		} else if(rFont03.isSelected()==true){
			btn_FontTetting("«‘√ ∑’πŸ≈¡");
		} else if(rFont04.isSelected()==true){
			btn_FontTetting("«—ƒƒ ¿±∞ÌµÒ 230");
		}
	}

	private void btn_FontTetting(String type) { // save
		// TODO Auto-generated method stub
		try {
			FileWriter write3 = new FileWriter("src/db/font.txt");
			write3.write(type);
			write3.close();
			setFontType(type);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void setFontType(String fontType) { // /∏¶ ∆˜«‘ ¿˙¿Â. Split « ø‰ X
		// TODO Auto-generated method stub
		if(fontType.equals("≥™¥Æ∞ÌµÒ")){
			setFont("≥™¥Æ∞ÌµÒ", "plain", "15"); // ing
		} else if(fontType.equals("»ﬁ∏’∆Ì¡ˆ√º")){
			setFont("»ﬁ∏’∆Ì¡ˆ√º", "plain", "15");
		} else if(fontType.equals("«‘√ ∑’πŸ≈¡")){
			setFont("«‘√ ∑’πŸ≈¡", "plain", "15");
		} else if(fontType.equals("«—ƒƒ ¿±∞ÌµÒ 230")){
			setFont("«—ƒƒ ¿±∞ÌµÒ 230", "plain", "15");
		} else{ // Default
		}
	}

	private void setFont(String type, String bp, String size) { // add
		// TODO Auto-generated method stub
		if(type.equals("≥™¥Æ∞ÌµÒ") && bp.equals("plain") && size.equals("15")){ // default
			setFontManager(fontManager.nanum_PLAIN_13);
		} else if(type.equals("»ﬁ∏’∆Ì¡ˆ√º") && bp.equals("plain") && size.equals("15")){
			setFontManager(fontManager.latter_PLAIN_13);
		} else if(type.equals("«‘√ ∑’πŸ≈¡") && bp.equals("plain") && size.equals("15")){
			setFontManager(fontManager.cholong_PLAIN_13);
		} else if(type.equals("«—ƒƒ ¿±∞ÌµÒ 230") && bp.equals("plain") && size.equals("15")){
			setFontManager(fontManager.yun_PLAIN_13);
		} else{ // default
			setFontManager(fontManager.yun_PLAIN_13);
		}
	}

	private void setFontManager(Font setting) {
		// TODO Auto-generated method stub
		btn1.setFont(setting);
		btn2.setFont(setting);
		btn3.setFont(setting);
		btn4.setFont(setting);
		btn5.setFont(setting);
		btn6.setFont(setting);
		
		lb1_jumju.setFont(setting);
		lb1_jumName.setFont(setting);
		lb1_Period.setFont(setting);
		lb1_Location.setFont(setting);
		lbTotal.setFont(setting);
		lbDis.setFont(setting);
		lbNeed.setFont(setting);
		lbInput.setFont(setting);
		lbOutput.setFont(setting);
		lbMessage.setFont(setting);
		btnCard	.setFont(setting);	
		btnCash.setFont(setting);
		btnData.setFont(setting);
		
		
		for(int i=0; i<btnNumKey.length; i++){
			btnNumKey[i].setFont(setting);
		}
		for(int i=0; i<+btnMenu.length; i++){
			btnMenu[i].setFont(setting);
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
