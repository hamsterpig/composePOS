
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class Panel_btn05 extends Panel_btn04{
	JPanel pbtn5_s, pbtn5_n, pbtn5_c, pbtn5_e, pbtn5_w; // e
	Panel_Staff pStaff[];
	JButton btnAddStaff, btnDelStaff;
	String staffArray[], staffArraySegment[][];
	int staffArrayNum, staffArrayNum2;
	
	Dialog_AddStaff dialog_AddStaff;
	
	
	Panel_btn05(){
		String staffText = getStaff();
		int staffArrayNum = charCount(staffText, "\n");
		staffArray = new String[staffArrayNum];
		
		String[] tempSplit = staffText.split("\n"); // Staff Segments
		for(int i=0; i<staffArray.length; i++){
			staffArray[i] = tempSplit[i];
		}
		
		int staffArrayNum2 = charCount(staffArray[0], "/");
		staffArraySegment = new String[staffArrayNum][staffArrayNum2+1];
		
		for(int i=0; i<staffArraySegment.length; i++){ // Staff Array[][] Segments Save
			
			for(int j=0; j<staffArraySegment[i].length; j++){
				String[] tempSplit2 = staffArray[i].split("/");
				staffArraySegment[i][j] = tempSplit2[j];
			}
		}
		
		
		
		
		pbtn5_s = new JPanel();
		pbtn5_n = new JPanel();
		pbtn5_c = new JPanel(new FlowLayout(FlowLayout.LEADING));
		pbtn5_e = new JPanel();
		pbtn5_w = new JPanel();
		
		pa_c_cManuField_cbtn5.add(pbtn5_s, BorderLayout.PAGE_END);
		pa_c_cManuField_cbtn5.add(pbtn5_n, BorderLayout.PAGE_START);
		pa_c_cManuField_cbtn5.add(pbtn5_c, BorderLayout.CENTER);
		pa_c_cManuField_cbtn5.add(pbtn5_e, BorderLayout.LINE_END);
		pa_c_cManuField_cbtn5.add(pbtn5_w, BorderLayout.LINE_START);
		
		btnAddStaff = new JButton("+");
		btnAddStaff.addActionListener(this);
		
		
		pStaff = new Panel_Staff[staffArray.length];
		for(int i=0; i<pStaff.length; i++){
			pStaff[i] = new Panel_Staff();
			pbtn5_c.add(pStaff[i]);
			/*pStaff[i].setLbName("�ǲ�");
			pStaff[i].setLbStaffNum("����");*/
			pbtn5_c.add(btnAddStaff);
			btnAddStaff.setPreferredSize(new Dimension(183,200));
			btnAddStaff.setBackground(colorManager.blueLine);
			btnAddStaff.setFont(new Font("���ʷչ���", Font.PLAIN, 40));
			
			for(int j=0; j<(staffArrayNum2+1); j++){
				pStaff[i].setLbStaffNum(staffArraySegment[i][0]);
				pStaff[i].setLbName(staffArraySegment[i][1]);
				pStaff[i].settxAccumulation(staffArraySegment[i][2]);
			}
		}
		
		btnDelStaff = new JButton();
		btnDelStaff.addActionListener(this);
		btnDelStaff.setPreferredSize(new Dimension(150,80));
		btnDelStaff.setBackground(colorManager.blueBtn);
		btnDelStaff.setText("���� �ذ�");
		pbtn5_s.setPreferredSize(new Dimension(800,100));
		pbtn5_s.setBackground(colorManager.blueLine);
		pbtn5_s.add(btnDelStaff);
	}
	
	void btnAddStaff(){
	
		if(dialog_AddStaff==null){
			dialog_AddStaff = new Dialog_AddStaff();
			dialog_AddStaff.setVisible(true);
		} else{
			dialog_AddStaff.setVisible(true);
		}
	}
	
	
	
	private String getStaff() {
		String temp = "";
		File file = new File("src/db/staff.txt"); //date
		try{
			if(!file.exists()){ // file not
				FileWriter check = new FileWriter("src/db/staff.txt"); // new creat file
			} else {
				FileReader reader = new FileReader("src/db/staff.txt"); // file Open
				BufferedReader in = new BufferedReader(reader);
				Scanner scan = new Scanner(reader);

					String string;
				    while ((string = in.readLine()) != null) {
				    	temp = temp.concat(string+"\n");
				    	//System.out.println(string);
				      }
				} 
		} catch(IOException e){
			
		}
		return temp;
	}



	class Panel_Staff extends JPanel{
		
		JPanel p_c, p_s, p_n, p_e, p_w;
		
		private JLabel lbName;
		private JLabel lbStaffNum;
		private JTextField txMemo;
		private JTextField txAccumulation;
		JCheckBox rCheck;
		

		Panel_Staff(){
			p_c = new JPanel();
			p_s = new JPanel(new BorderLayout());
			p_n = new JPanel();
			p_e = new JPanel();
			p_w = new JPanel();;
			
			JButton btnMemo;
			
			rCheck= new JCheckBox();
			txMemo = new JTextField();
			btnMemo = new JButton("�޸� ����");
			txAccumulation = new JTextField();
			
			this.setPreferredSize(new Dimension(183,200));
			this.setBackground(colorManager.blueBg);
			this.setLayout(new BorderLayout());
			this.add(p_c, BorderLayout.CENTER);
			this.add(p_w, BorderLayout.LINE_START);
			this.add(p_e, BorderLayout.LINE_END);
			this.add(p_n, BorderLayout.PAGE_START);
			this.add(p_s, BorderLayout.PAGE_END);
			
			lbName = new JLabel();
			lbStaffNum = new JLabel();
			lbName.setPreferredSize(new Dimension(65,20));
			lbStaffNum.setPreferredSize(new Dimension(20,20));
			txAccumulation.setPreferredSize(new Dimension(60,25));
			txAccumulation.setBackground(colorManager.blueBg);
			txAccumulation.setEditable(false);
			p_n.setBackground(colorManager.blueLine);
			p_n.add(lbStaffNum);
			p_n.add(lbName);
			p_n.add(txAccumulation);
			p_n.add(rCheck);
			p_n.setPreferredSize(new Dimension(150,35));
			
			p_c.setBackground(colorManager.blueBg);
			p_c.setPreferredSize(new Dimension(170,135));
			p_c.add(txMemo);
			txMemo.setPreferredSize(new Dimension(165,160));
			txMemo.setBackground(colorManager.blueBg);
			txMemo.setEditable(false);
			
			p_s.setPreferredSize(new Dimension(100,25));
			p_s.add(btnMemo, BorderLayout.CENTER);
			btnMemo.setPreferredSize(new Dimension(100,25));
			btnMemo.setBackground(colorManager.blueBg);

		}


		public String getLbName() {
			return lbName.getText();
		}
		public void setLbName(String string) {
			this.lbName.setText(string);
		}
		public String getLbStaffNum() {
			return lbStaffNum.getText();
		}
		public void setLbStaffNum(String string) {
			this.lbStaffNum.setText(string);
		}
		public String gettxAccumulation() {
			return txAccumulation.getText();
		}
		public void settxAccumulation(String string) {
			this.txAccumulation.setText(string);
		}
		public String getTxMemo() {
			return txMemo.getText();
		}
		public void setTxMemo(String string) {
			this.txMemo.setText(string);
		}
	}
	

}
