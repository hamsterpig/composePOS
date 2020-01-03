
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Panel_btn03 extends Panel_btn02{
	JPanel pbtn3_s, pbtn3_n, pbtn3_c, pbtn3_e, pbtn3_w; // e
	JButton btnDataPrevious, btnDataNext, btnData;
	DefaultTableModel tmPaymentList;
	JTable tablePamentList;
	
	Panel_btn03(){
		pbtn3_s = new JPanel();
		pbtn3_n = new JPanel();
		pbtn3_c = new JPanel();
		pbtn3_e = new JPanel();
		pbtn3_w = new JPanel();
		
		pa_c_cManuField_cbtn3.add(pbtn3_s, BorderLayout.PAGE_START);
		pa_c_cManuField_cbtn3.add(pbtn3_n, BorderLayout.PAGE_END);
		pa_c_cManuField_cbtn3.add(pbtn3_c, BorderLayout.CENTER);
		pa_c_cManuField_cbtn3.add(pbtn3_e, BorderLayout.LINE_END);
		pa_c_cManuField_cbtn3.add(pbtn3_w, BorderLayout.LINE_START);
		
		btnDataPrevious = new JButton("<");
		btnData = new JButton();
		btnDataNext = new JButton(">");
		
		btnDataPrevious.setPreferredSize(new Dimension(80,40));
		btnData.setPreferredSize(new Dimension(200,40));
		btnDataNext.setPreferredSize(new Dimension(80,40));
		
		pbtn3_s.add(btnDataPrevious);
		pbtn3_s.add(btnData);
		pbtn3_s.add(btnDataNext);
		
		String[] columnName = {"영수증번호","판매날짜","결제유형","상품개수","상품금액","할인금액","판매금액"}; // table columnName
		String[][] data = {};
		tmPaymentList = new DefaultTableModel(data, columnName);
		tablePamentList = new JTable(tmPaymentList);
		JScrollPane tableSP = new JScrollPane(tablePamentList);
		pbtn3_c.add(tableSP);
		//tableItem.setPreferredSize(new Dimension(650,300));
		tableSP.setPreferredSize(new Dimension(850,450));
		pbtn3_c.setPreferredSize(new Dimension(850,450));
		
		String timeNow;
		SimpleDateFormat formatView = new SimpleDateFormat ( "yyyy년 MM월 dd일"); 	
		Date time = new Date();
		timeNow = formatView.format(time);
		
		btnData.setText(timeNow);
		
	}
	
	protected void renewal() throws IOException{ 
		String tempConcat = "";
		while(tmPaymentList.getRowCount()>0){ // table reset
			tmPaymentList.removeRow(0);
		}
		
		
		
		
		File file = new File("src/db/paymentDB.txt"); //date
		if(!file.exists()){ // file not
			FileWriter check = new FileWriter("src/db/paymentDB.txt"); // new creat file
		} else {
			FileReader reader = new FileReader("src/db/paymentDB.txt"); // file Open
			BufferedReader in = new BufferedReader(reader);
			Scanner scan = new Scanner(reader);
			
			try{
				String string;
			    while ((string = in.readLine()) != null) {
			    	tempConcat = tempConcat.concat("\n"+string);
			    	System.out.println(string);
			      }
			} catch(Exception e){
				
			}
			reader.close();
			tempConcat = tempConcat.concat("\n");
		}
		System.out.println(tempConcat);
		
		
		int listCnt = 0; // PK Count 특정문자 카운터
	    int fromIndex = -1;
	    while ((fromIndex = tempConcat.indexOf("@", fromIndex + 1)) >= 0) {
	    	listCnt++;
	    }
	    //System.out.println(listCnt);



		String pkString[] = new String[listCnt]; // add Row
		for(int i=0; i<=listCnt; i++){ // PK Segment @ Criteria
			pkString = tempConcat.split("@");
		}
		
		String dataString[] = new String[listCnt]; // add Row
		String dataIntput;
		for(int i=0; i<=listCnt; i++){
			dataString = tempConcat.split("#");
			cutP(dataString);
			System.out.println(dataString[i]);
		}
		String pkInput;
		for(int i=0; i<listCnt; i++){ // 영수증번호   판매날짜   결제유형   상품개수   상품금액   할인금액   판매금액   
			
			pkInput = pkString[i+1].substring(0, 1);
			String[] addList = {pkInput,"판매날짜","결제유형","상품개수","상품금액","할인금액","판매금액"};
			tmPaymentList.addRow(addList);
		}
		
		
		
		
		 // table add row
		
	}
	
	protected void cutP(String[] s) {
		// TODO Auto-generated method stub

	}

	protected void btnDataPrevious(){
		
	}
	protected void btnDataNext(){
		
	}
}
