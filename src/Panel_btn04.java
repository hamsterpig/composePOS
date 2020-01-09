
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Panel_btn04 extends Panel_btn03{
	JPanel pbtn4_s, pbtn4_n; // e
	static JPanel pbtn4_c;
	JPanel pbtn4_e;
	JPanel pbtn4_w;
	
	static String staffArray[];
	static String staffArraySegment[][];
	int staffArrayNum, staffArrayNum2;
	
	static Panel_Staff_work pStaff_work[];
	
	Panel_btn04(){
		pa_c_cManuField_cbtn4.add(new JButton("¹öÆ° 4"));
		
		pbtn4_s = new JPanel();
		pbtn4_n = new JPanel();
		pbtn4_c = new JPanel(new FlowLayout(FlowLayout.LEADING));
		pbtn4_e = new JPanel();
		pbtn4_w = new JPanel();
		
		pbtn4_s.setBackground(Color.white);
		pbtn4_n.setBackground(Color.white);
		pbtn4_c.setBackground(Color.white);
		pbtn4_e.setBackground(Color.white);
		pbtn4_w.setBackground(Color.white);
		
		pa_c_cManuField_cbtn4.add(pbtn4_s, BorderLayout.PAGE_END);
		pa_c_cManuField_cbtn4.add(pbtn4_n, BorderLayout.PAGE_START);
		pa_c_cManuField_cbtn4.add(pbtn4_c, BorderLayout.CENTER);
		pa_c_cManuField_cbtn4.add(pbtn4_e, BorderLayout.LINE_END);
		pa_c_cManuField_cbtn4.add(pbtn4_w, BorderLayout.LINE_START);
		
		staffRenewal_work();
		

	}
	
	public static void staffRenewal_work() {
		// TODO Auto-generated method stub
		pbtn4_c.removeAll();
		

		
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
		
		
		pStaff_work = new Panel_Staff_work[staffArray.length];
		for(int i=0; i<pStaff_work.length; i++){
			pStaff_work[i] = new Panel_Staff_work();
			pbtn4_c.add(pStaff_work[i]);
			for(int j=0; j<(staffArrayNum2+1); j++){ // 1/name/memo/00:00
				pStaff_work[i].setLbStaffNum(staffArraySegment[i][0]); //setText PK
				pStaff_work[i].setLbName(staffArraySegment[i][1]);  // name
				//pStaff_work[i].setTxMemo(staffArraySegment[i][2]); //memo
				//pStaff_work[i].settxAccumulation(staffArraySegment[i][3]); //
			}
		}
		
		setIsWork();

	}
	
	private static void setIsWork() {
		// TODO Auto-generated method stub
		ColorManager colorManager = ColorManager.getInstance();
		
		String tempTime = Static_FileInOut.fileRead("src/db/staff_Time.txt");
		
		
		int cnt = charCount(Static_FileInOut.fileRead("src/db/staff.txt"), "\n");
		String tempConcat = "";
		String[] timeSplit = null;
		String[] todaySplit;
		
		if(charCount(tempTime, "Åð±Ù")<1 && charCount(tempTime, "Ãâ±Ù")<0 ||
				charCount(tempTime, "Åð±Ù")<0 && charCount(tempTime, "Ãâ±Ù")<1){
			for(int i = 0; i<cnt; i++){
				tempConcat = tempConcat.concat("Åð±Ù\n");
				tempTime = tempConcat;
			}
			Static_FileInOut.fileWrite("src/db/staff_Time.txt", tempTime);
		} else {
			
		}
		

		
		if(pStaff_work.length<1){
			timeSplit = tempTime.split("!@#$\n");
		} else if((pStaff_work.length>=1)){
			timeSplit = tempTime.split("\n");
			
			if(timeSplit.length<1){
				//System.out.println(timeSplit.length);
				
			} else if(timeSplit.length>=1) {
				for(int i=0; i<timeSplit.length; i++){
					pStaff_work[i].txMemo.setText(timeSplit[i]);
					
					if(pStaff_work[i].txMemo.getText().equals("Åð±Ù")){
						pStaff_work[i].txMemo.setBackground(Color.gray);
					} else if(pStaff_work[i].txMemo.getText().equals("")){
						pStaff_work[i].txMemo.setText("Åð±Ù");
						pStaff_work[i].txMemo.setBackground(Color.gray);
					} else if(pStaff_work[i].txMemo.getText().equals("Ãâ±Ù")){
						pStaff_work[i].txMemo.setBackground(colorManager.blueBg);
					}
				}
			}
		}
		
		String tempTime2 = Static_FileInOut.fileRead("src/db/staff_Today.txt");
		if(charCount(tempTime2, ":")<1){
			for(int i = 0; i<cnt; i++){
				tempConcat = tempConcat.concat("00:00\n");
				tempTime2 = tempConcat;
			}
			Static_FileInOut.fileWrite("src/db/staff_Today.txt", tempTime2);
		} else {
			
		}
		
		if(pStaff_work.length<1){
			todaySplit = tempTime2.split("!@#$\n");
		} else if((pStaff_work.length>=1)){
			todaySplit = tempTime2.split("\n");
			
			if(todaySplit.length<1){
				//System.out.println(timeSplit.length);
				
			} else if(todaySplit.length>=1) {
				for(int i=0; i<todaySplit.length; i++){		
					if(todaySplit[i].equals("00:00")){
						pStaff_work[i].txAccumulation.setText("¹ÌÃâ±Ù");
						pStaff_work[i].txAccumulation.setBackground(colorManager.redBg);
					} else if(timeSplit[i].equals("Åð±Ù")){
						pStaff_work[i].txAccumulation.setText("¹ÌÃâ±Ù");
						pStaff_work[i].txAccumulation.setBackground(colorManager.redBg);
						System.out.println("dd");
					} else {
						pStaff_work[i].txAccumulation.setText(todaySplit[i]);
						pStaff_work[i].txAccumulation.setBackground(colorManager.greenBg);
					}
					
				}
			}
		}
		
		
		

	}

	protected static String getStaff() {
		// TODO Auto-generated method stub
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
				      }
				} 
		} catch(IOException e){
			
		}
		return temp;
	}

	static class Panel_Staff_work extends JPanel implements ActionListener{
		
		JPanel p_c, p_s, p_n, p_e, p_w;
		
		private JLabel lbName;
		private JLabel lbStaffNum;
		private JTextField txMemo;
		private JTextField txAccumulation;
		JCheckBox rCheck;
		
		ColorManager colorManager = ColorManager.getInstance();
		
		
		

		Panel_Staff_work(){
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
			btnMemo = new JButton("Ãâ±Ù / Åð±Ù");
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
			txMemo.setBackground(Color.gray);
			
			
			txMemo.setEditable(false);
			txMemo.setHorizontalAlignment(txMemo.CENTER);
			
			p_s.setPreferredSize(new Dimension(100,25));
			p_s.add(btnMemo, BorderLayout.CENTER);
			btnMemo.setPreferredSize(new Dimension(100,25));
			btnMemo.setBackground(colorManager.blueBg);
			
			
			
			
		}

		public String txMemo(){
			return this.txMemo.getText();
		}
		public String lbStaffNum(){
			return this.lbStaffNum.getText();
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
		public void actionPerformed(ActionEvent arg0) { // btn Ãâ±Ù/Åð±Ù
			// TODO Auto-generated method stub
			String tempTime = Static_FileInOut.fileRead("src/db/staff_Time.txt");
			
			int iIndex = 0;
			for(int i=0; i < pStaff_work.length; i++) {
			    if(lbStaffNum.getText().equals(pStaff_work[i].lbStaffNum.getText()))
			    {
			        iIndex = i;
			        break;
			    }
			}
			
			String[] tempSplit = tempTime.split("\n");
			
			if(txMemo.getText().equals("Åð±Ù")){
				txMemo.setBackground(colorManager.blueBg);
				tempSplit[iIndex] = tempSplit[iIndex].replace("Åð±Ù", "Ãâ±Ù");
				txMemo.setText("Ãâ±Ù");
				String tempConcat = "";
				txAccumulation.setBackground(colorManager.greenBg);
				for(int i=0; i<pStaff_work.length; i++){
					
					tempConcat = tempConcat.concat(tempSplit[i]+"\n");
					Static_FileInOut.fileWrite("src/db/staff_Time.txt", tempConcat);
				}
			} else if(txMemo.getText().equals("Ãâ±Ù")){
				txMemo.setBackground(Color.gray);
				tempSplit[iIndex] = tempSplit[iIndex].replace("Ãâ±Ù", "Åð±Ù");
				txMemo.setText("Åð±Ù");
				String tempConcat = "";
				txAccumulation.setBackground(colorManager.redBg);
				for(int i=0; i<pStaff_work.length; i++){
					tempConcat = tempConcat.concat(tempSplit[i]+"\n");
					Static_FileInOut.fileWrite("src/db/staff_Time.txt", tempConcat);
				}
			} else {
				txMemo.setBackground(colorManager.blueBg);
				tempSplit[iIndex] = tempSplit[iIndex].replace("Åð±Ù", "Ãâ±Ù");
				txMemo.setText("Ãâ±Ù");
				txAccumulation.setBackground(colorManager.greenBg);
				String tempConcat = "";
				for(int i=0; i<pStaff_work.length; i++){
					
					tempConcat = tempConcat.concat(tempSplit[i]+"\n");
					Static_FileInOut.fileWrite("src/db/staff_Time.txt", tempConcat);
				}
			}
			
			if(txMemo.getText().equals("Ãâ±Ù")){
				String timeNow;
				SimpleDateFormat formatView = new SimpleDateFormat ( "hh:mm");
				Date time = new Date();
				timeNow = formatView.format(time);
				
				String tempToday = Static_FileInOut.fileRead("src/db/staff_Today.txt");
				String todaySplit[] = tempToday.split("\n");
				
				todaySplit[iIndex] = timeNow;
				String todayConcat = "";
				for(int i=0; i<todaySplit.length; i++){
					todayConcat = todayConcat.concat(todaySplit[i]+"\n");
				}
				Static_FileInOut.fileWrite("src/db/staff_Today.txt", todayConcat);
				txAccumulation.setText(timeNow);
			} else if(txMemo.getText().equals("Åð±Ù")) {
				
			}

			
			
			
		}
	}
}

