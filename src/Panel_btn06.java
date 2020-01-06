
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	JPanel pType01, pType02, pType03, pType04;
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
		title06 = new JLabel("환경설정");
		title06.setBackground(Color.yellow);
		
		pbtn6_s.add(title06);
		pbtn6_s.setBackground(Color.yellow);
		
		lbPColor = new JLabel("테마");
		rType01 = new JRadioButton();
		rType02 = new JRadioButton();
		rType03 = new JRadioButton();
		rType04 = new JRadioButton();
		
		theme = new ButtonGroup();
		theme.add(rType01);
		theme.add(rType02);
		theme.add(rType03);
		theme.add(rType04);
		
		pType01 = new JPanel();
		pType02 = new JPanel();
		pType03 = new JPanel();
		pType04 = new JPanel();
		
		pType01.add(rType01);
		pType02.add(rType02);
		pType03.add(rType03);
		pType04.add(rType04);
		pType01.setPreferredSize(new Dimension(200,80));
		pType02.setPreferredSize(new Dimension(200,80));
		pType03.setPreferredSize(new Dimension(200,80));
		pType04.setPreferredSize(new Dimension(200,80));
		pType01.setBackground(new Color(255,80,80));
		pType02.setBackground(new Color(80,255,80));
		pType03.setBackground(new Color(80,80,255));
		pType04.setBackground(new Color(255,255,183)); // default
		
		JLabel lbTheme = new JLabel("테마 ");
		JPanel pline01 = new JPanel();
		pline01.add(lbTheme);
		pline01.add(pType01);
		pline01.add(pType02);
		pline01.add(pType03);
		pline01.add(pType04);
		pbtn6_c.add(pline01);
		pline01.setLayout(new FlowLayout(FlowLayout.LEADING));
		pline01.setPreferredSize(new Dimension(1000,100));
		pline01.setBackground(Color.white);
		
		btn_Panel_Setting = new JButton("설정 적용");
		btn_Panel_Setting.addActionListener(this);
		btn_Panel_Setting.setPreferredSize(new Dimension(700,100));
		pbtn6_n.add(btn_Panel_Setting);
		
		
	}
	
	protected void btn_Panel_Setting(){
		if(rType01.isSelected()==true){
			System.out.println("1타입 선택");
		} else if(rType02.isSelected()==true){
			System.out.println("2타입 선택");
		} else if(rType03.isSelected()==true){
			System.out.println("3타입 선택");
		} else if(rType04.isSelected()==true){
			System.out.println("4타입 선택");
		}
	}
}
