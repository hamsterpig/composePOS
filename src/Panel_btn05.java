
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class Panel_btn05 extends Panel_btn04{
	JPanel pbtn5_s, pbtn5_n; // e
	static JPanel pbtn5_c;
	JPanel pbtn5_e;
	JPanel pbtn5_w;
	
	static JButton btnAddStaff;
	JButton btnStaffIncome;
	static String staffArray[];
	static String staffArraySegment[][];
	int staffArrayNum, staffArrayNum2;
	
	Dialog_AddStaff dialog_AddStaff;
	
	
	Panel_btn05(){
		
		pbtn5_s = new JPanel();
		pbtn5_n = new JPanel();
		pbtn5_c = new JPanel(new FlowLayout(FlowLayout.LEADING));
		pbtn5_e = new JPanel();
		pbtn5_w = new JPanel();
		
		pbtn5_s.setBackground(Color.white);
		pbtn5_n.setBackground(Color.white);
		pbtn5_c.setBackground(Color.white);
		pbtn5_e.setBackground(Color.white);
		pbtn5_w.setBackground(Color.white);
		
		pa_c_cManuField_cbtn5.add(pbtn5_s, BorderLayout.PAGE_END);
		pa_c_cManuField_cbtn5.add(pbtn5_n, BorderLayout.PAGE_START);
		pa_c_cManuField_cbtn5.add(pbtn5_c, BorderLayout.CENTER);
		pa_c_cManuField_cbtn5.add(pbtn5_e, BorderLayout.LINE_END);
		pa_c_cManuField_cbtn5.add(pbtn5_w, BorderLayout.LINE_START);
		
		btnAddStaff = new JButton("+");
		btnAddStaff.addActionListener(this);
		
		btnAddStaff.setPreferredSize(new Dimension(183,200));
		btnAddStaff.setBackground(colorManager.blueLine);
		btnAddStaff.setFont(new Font("함초롱바탕", Font.PLAIN, 40));
		
		btnStaffIncome = new JButton();
		btnStaffIncome.addActionListener(this);
		btnStaffIncome.setPreferredSize(new Dimension(150,80));
		btnStaffIncome.setBackground(colorManager.blueBtn);
		btnStaffIncome.setText("정산");
		pbtn5_s.setPreferredSize(new Dimension(800,100));
		pbtn5_s.setBackground(colorManager.blueLine);
		pbtn5_s.add(btnStaffIncome);
		
		staffRenewal();
	}
	
	public static void staffRenewal() {
		// TODO Auto-generated method stub
		pbtn5_c.removeAll();
		
		Panel_Staff pStaff[];
		
		String staffText = getStaff();
		int staffArrayNum = charCount(staffText, "\n");
		staffArray = new String[staffArrayNum];
		
		String[] tempSplit = staffText.split("\n"); // Staff Segments
		for(int i=0; i<staffArray.length; i++){
			staffArray[i] = tempSplit[i];
		}
		
		int staffArrayNum2 = 3; // 
		staffArraySegment = new String[staffArrayNum][staffArrayNum2+1];
		
		for(int i=0; i<staffArraySegment.length; i++){ // Staff Array[][] Segments Save
			
			for(int j=0; j<staffArraySegment[i].length; j++){
				String[] tempSplit2 = staffArray[i].split("/");
				staffArraySegment[i][j] = tempSplit2[j];
			}
		}
		
		
		pStaff = new Panel_Staff[staffArray.length];
		for(int i=0; i<pStaff.length; i++){
			pStaff[i] = new Panel_Staff();
			pbtn5_c.add(pStaff[i]);
			for(int j=0; j<(staffArrayNum2+1); j++){ // 1/name/memo/00:00
				pStaff[i].setLbStaffNum(staffArraySegment[i][0]); //setText PK
				pStaff[i].setLbName(staffArraySegment[i][1]);  // name
				pStaff[i].setTxMemo(staffArraySegment[i][2]); //memo
				pStaff[i].settxAccumulation(staffArraySegment[i][3]); //
			}
		}
		
		pbtn5_c.add(btnAddStaff);
	}
	
	void btnAddStaff(){
	
		if(dialog_AddStaff==null){
			dialog_AddStaff = new Dialog_AddStaff();
			dialog_AddStaff.setVisible(true);
		} else{
			dialog_AddStaff.setVisible(true);
		}
	}
	
	


	static class Panel_Staff extends JPanel implements ActionListener{
		
		JPanel p_c, p_s, p_n, p_e, p_w;
		
		private JLabel lbName;
		private JLabel lbStaffNum;
		private JTextField txMemo;
		private JTextField txAccumulation;
		JCheckBox rCheck;
		
		ColorManager colorManager = ColorManager.getInstance();
		

		Panel_Staff(){
			p_c = new JPanel();
			p_s = new JPanel(new BorderLayout());
			p_n = new JPanel();
			p_e = new JPanel();
			p_w = new JPanel();
			p_c.setBackground(Color.white);
			p_s.setBackground(Color.white);
			p_n.setBackground(Color.white);
			p_e.setBackground(Color.white);
			p_w.setBackground(Color.white);
			
			JButton btnMemo;
			
			rCheck= new JCheckBox();
			txMemo = new JTextField();
			btnMemo = new JButton("해고");
			txAccumulation = new JTextField();
			btnMemo.addActionListener(this);
			
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
			txMemo.setHorizontalAlignment(txMemo.CENTER);
			
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

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			staffRenewal_work();
			
			String tempStaff = getStaff();
			int checkCNT = charCount(tempStaff, "\n");
			
			if(checkCNT>1){
				 int result = JOptionPane.showConfirmDialog(null, lbName.getText()+" <- 정말 해고하시겠습니까?", "해고",
                         JOptionPane.OK_CANCEL_OPTION);
				 if(result==0){
					String temp = Static_FileInOut.fileRead("src/db/staff.txt");
					String temp2;
					String delString;
						
					delString = lbStaffNum.getText()+"/"+lbName.getText()+"/"+txMemo.getText()+"/"+txAccumulation.getText()+"\n";
					temp2 = temp.replaceAll(delString, "");
					Static_FileInOut.fileWrite("src/db/staff.txt", temp2);
						
					temp =  Static_FileInOut.fileRead("src/db/staff_Time.txt");
					String tempSplit[] = temp.split("\n");
					
					int index = 0;
					for(int i=0; i<tempSplit.length; i++){
						if(lbStaffNum.getText().equals(pStaff_work[i].getLbStaffNum())){
							index = i;
							break;
						}
					}
					
					tempSplit[index] = "";

					for(int i=index; i<tempSplit.length-1;i++){
						tempSplit[i] = tempSplit[i+1];
					}
					
					String tempReplace ="";
					for(int i=0; i<tempSplit.length-1;i++){
						tempReplace = tempReplace.concat(tempSplit[i]+"\n");
					}
					
					Static_FileInOut.fileWrite("src/db/staff_Time.txt", tempReplace);
	
						
					staffRenewal();
				 }
			} else {
				JOptionPane.showMessageDialog(null, "최소한 1명의 직원은 있어야 합니다.\n(자신이라도)", "해고 불가!", JOptionPane.WARNING_MESSAGE);
			}
			
		}
	}




	

}
