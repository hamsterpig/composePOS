
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Panel_btn02 extends Panel_btn01{
	JLabel lbTotal, lbDis, lbNeed, lbInput, lbOutput; // panel btn02 pad

	static JLabel lbMessage;
	
	JButton btnNumKey[], btnAllClear, btnDisPer, btnDis, btnClear; // pad_n
	JButton btnCard, btnCash;

	static JTextField txTotal, txDis, txNeed, txInput, JTextField;


	static JTextField txOutput;

	static JTextField txStateFeild;
	JTable tableItem; // panel btn01
	static DefaultTableModel tm;
	
	Dialog_Cash dialog_cash;
	Dialog_Card dialog_card;
	
	JPanel pbtn02_c_menu, pad_n, pad_s, pad_c;
	JPanel pad_n_line01, pad_n_line02, pad_n_line03, pad_n_line04, pad_n_line05, pad_n_line06, pad_n_line07;

	
	
	static int toDayOrderNum=0;
	
	//int[] intEA = new int
	Panel_btn02(){

		pbtn02_nc = new JPanel(new BorderLayout());
		pbtn02_s = new JPanel();
		pbtn02_n = new JPanel();
		pbtn02_c = new JPanel();
		pbtn02_w = new JPanel();
		pbtn02_e = new JPanel();

		pbtn02_nc.setBackground(Color.white);
		pbtn02_s.setBackground(Color.white);
		pbtn02_n.setBackground(Color.white);
		pbtn02_c.setBackground(Color.white);
		pbtn02_w.setBackground(Color.white);
		pbtn02_e.setBackground(Color.white);
		
		pa_c_cManuField_cbtn2.setLayout(new BorderLayout());
		pa_c_cManuField_cbtn2.add(pbtn02_s, BorderLayout.PAGE_END);
		pbtn02_nc.add(pbtn02_n, BorderLayout.PAGE_START);
		pbtn02_nc.add(pbtn02_c, BorderLayout.CENTER);
		pa_c_cManuField_cbtn2.add(pbtn02_nc, BorderLayout.CENTER);
		pa_c_cManuField_cbtn2.add(pbtn02_w, BorderLayout.LINE_END);
		pa_c_cManuField_cbtn2.add(pbtn02_e, BorderLayout.LINE_START);
		
		JPanel pbtn02_n_Table = new JPanel(); // add Price Table
		pbtn02_n.add(pbtn02_n_Table);
		pbtn02_n.setLayout(new FlowLayout(FlowLayout.LEADING));
		pbtn02_c_menu = new JPanel(); // add menu Button tab
		pbtn02_c.add(pbtn02_c_menu);
		pbtn02_c.setLayout(new FlowLayout(FlowLayout.LEADING));
		pbtn02_c_menu.setPreferredSize(new Dimension(650, 350));
		//pbtn02_c_menu.setBackground(new Color(255,255,150));
		
		
		String[] columnName = {"상품명","수량","정가","부가세","금액"}; // table columnName
		String[][] data = {};
		tm = new DefaultTableModel(data, columnName);
		tableItem = new JTable(tm);
		JScrollPane tableSP = new JScrollPane(tableItem);
		pbtn02_n_Table.add(tableSP);
		//tableItem.setPreferredSize(new Dimension(650,300));
		tableSP.setPreferredSize(new Dimension(650,350));
		pbtn02_n_Table.setPreferredSize(new Dimension(650,350));
		
		/*String testar[] = {"1","2","3","4","5"};
		tm.addRow(testar);*/
		
		btnMenu = new JButton[16];
		for(int i=0; i<btnMenu.length; i++){ // add menu Button Array
			switch(i){
				case 0: btnMenu[i] = new JButton("아메리카노 1500"); break;
				case 1: btnMenu[i] = new JButton("카푸치노 2000"); break;
				case 2: btnMenu[i] = new JButton("카페라떼 2000"); break;
				case 3: btnMenu[i] = new JButton("바닐라라떼 2000"); break;
				case 4: btnMenu[i] = new JButton("헤이늘넛라떼 2000"); break;
				case 5: btnMenu[i] = new JButton("바닐라라떼 2500"); break;
				case 6: btnMenu[i] = new JButton("카페모카 2500"); break;
				case 7: btnMenu[i] = new JButton("그린티라떼 3000"); break;
				case 8: btnMenu[i] = new JButton("고구마라떼 3000"); break;
				case 9: btnMenu[i] = new JButton("곡물라떼 3000"); break;
				case 10: btnMenu[i] = new JButton("오레오라떼 3000"); break;
				case 11: btnMenu[i] = new JButton("민트초코라떼 3000"); break;
				case 12: btnMenu[i] = new JButton("블루베리스무디 3000"); break;
				case 13: btnMenu[i] = new JButton("딸기스무디 3000"); break;
				case 14: btnMenu[i] = new JButton("메론스무디 3000"); break;
				case 15: btnMenu[i] = new JButton("허니유자티 3000"); break;
				default : btnMenu[i] = new JButton("null"); break;
			}
			btnMenu[i].setPreferredSize(new Dimension(150,80));
			//btnMenu[i].setBackground(new Color(255,255,183));
			pbtn02_c_menu.add(btnMenu[i]);
			btnMenu[i].addActionListener(this);
		}
		
/*		ImageIcon choco = new ImageIcon("src/imgs/espresso.png");
		JLabel lbIcon = new JLabel();
		lbIcon.setIcon(imageSetSize(choco,130,80));
		btnMenu[0].add(lbIcon);*/
		
		
		JPanel pad = new JPanel(new BorderLayout()); // panel btn02 pad
		pbtn02_w.add(pad);
		pad.setPreferredSize(new Dimension(300,780));
		//pad.setBackground(new Color(255,153,153));
		pad_n = new JPanel();
		pad_c = new JPanel();
		pad_s = new JPanel();
		pad.add(pad_n, BorderLayout.PAGE_START);
		pad.add(pad_c, BorderLayout.CENTER);
		pad.add(pad_s, BorderLayout.PAGE_END);
		pad_n.setPreferredSize(new Dimension(250,330));
		//pad_n.setBackground(new Color(255,255,204));
		
		lbTotal = new JLabel("총매출액");
		lbDis = new JLabel("할인금액");
		lbNeed = new JLabel("받을금액");
		lbInput = new JLabel("받은금액");
		lbOutput = new JLabel("거스름돈");
		txTotal = new JTextField(16);
		txDis = new JTextField(16);
		txNeed = new JTextField(16);
		txInput = new JTextField(16);
		txOutput = new JTextField(16);
		txTotal.setEditable(false);
		txDis.setEditable(false);
		txNeed.setEditable(false);
		txInput.setEditable(false);
		txOutput.setEditable(false);
		txTotal.setText("0");
		txDis.setText("0");
		txNeed.setText("0");
		txInput.setText("0");
		txOutput.setText("0");
		
		txStateFeild = new JTextField();
		txStateFeild.setEditable(false);
		txStateFeild.setPreferredSize(new Dimension(240,40));
		
		pad_n_line01 = new JPanel();
		pad_n_line02 = new JPanel();
		pad_n_line03 = new JPanel();
		pad_n_line04 = new JPanel();
		pad_n_line05 = new JPanel();
		pad_n_line06 = new JPanel();
		pad_n_line07 = new JPanel();
		
		lbMessage = new JLabel();
		lbMessage.setBackground(Color.red);
		lbMessage.setPreferredSize(new Dimension(240,20));
		lbMessage.setForeground(new Color(51,0,51));
		lbMessage.setText("판매할 상품을 선택하세요.");
		
		pad_n_line01.add(lbTotal);
		pad_n_line01.add(txTotal);
		pad_n_line02.add(lbDis);
		pad_n_line02.add(txDis);
		pad_n_line03.add(lbNeed);
		pad_n_line03.add(txNeed);
		pad_n_line04.add(lbInput);
		pad_n_line04.add(txInput);
		pad_n_line05.add(lbOutput);
		pad_n_line05.add(txOutput);
		pad_n_line06.add(lbMessage);
		pad_n_line07.add(txStateFeild);
		//pad_n_line01.setBackground(new Color(255,255,102));
		//pad_n_line02.setBackground(new Color(255,255,102));
		//pad_n_line03.setBackground(new Color(255,255,102));
		//pad_n_line04.setBackground(new Color(255,255,102));
		//pad_n_line05.setBackground(new Color(255,255,102));
		pad_n_line06.setBackground(new Color(204,204,255));
		pad_n_line07.setBackground(new Color(255,120,120));
		
		pad_n.add(pad_n_line01);
		pad_n.add(pad_n_line02);
		pad_n.add(pad_n_line03);
		pad_n.add(pad_n_line04);
		pad_n.add(pad_n_line05);
		pad_n.add(pad_n_line06);
		pad_n.add(pad_n_line07);
		
		//pad_c.setBackground(new Color(255,255,204));
		pad_c.setPreferredSize(new Dimension(250,250));
		
		//pad_s.setBackground(new Color(255,255,204));
		pad_s.setPreferredSize(new Dimension(250,180));
		
		btnAllClear = new JButton("A/C");
		btnDisPer = new JButton("N/D");
		btnDis = new JButton("%/D");
		btnClear = new JButton("Clear");
		btnNumKey = new JButton[11];
		for(int i=0; i<btnNumKey.length; i++){ // NumKeyPad
			btnNumKey[i] = new JButton();
			btnNumKey[i].setText(Integer.toString(i));
			btnNumKey[i].setPreferredSize(new Dimension(60,50));
			btnNumKey[i].setBackground(new Color(255,153,102));
			btnNumKey[i].addActionListener(this);
		}
		

		
		btnNumKey[10].setText("00");
		btnAllClear.addActionListener(this);
		btnDisPer.addActionListener(this);
		btnDis.addActionListener(this);
		btnClear.addActionListener(this);
		
		
		btnAllClear.setPreferredSize(new Dimension(60,50));
		btnDisPer.setPreferredSize(new Dimension(60,50));
		btnDis.setPreferredSize(new Dimension(60,50));
		btnClear.setPreferredSize(new Dimension(126,50));
		
		btnAllClear.setBackground(new Color(255,60,60));
		btnDisPer.setBackground(new Color(255,100,100));
		btnDis.setBackground(new Color(255,100,100));
		btnClear.setBackground(new Color(255,60,60));
	
		pad_c.add(btnNumKey[7]); 
		pad_c.add(btnNumKey[8]);
		pad_c.add(btnNumKey[9]);
		pad_c.add(btnAllClear);
		
		pad_c.add(btnNumKey[4]); 
		pad_c.add(btnNumKey[5]);
		pad_c.add(btnNumKey[6]);
		pad_c.add(btnDisPer);
		
		pad_c.add(btnNumKey[1]); 
		pad_c.add(btnNumKey[2]);
		pad_c.add(btnNumKey[3]);
		pad_c.add(btnDis);
		
		pad_c.add(btnNumKey[0]); 
		pad_c.add(btnNumKey[10]);
		pad_c.add(btnClear);
		//pad_c.add(arg0);
		
		btnCard = new JButton("카드 결제");
		btnCash = new JButton("현금 결제");
		btnCard.setPreferredSize(new Dimension(140,120));
		btnCash.setPreferredSize(new Dimension(140,120));
		btnCard.setBackground(new Color(100,100,255));
		btnCash.setBackground(new Color(120,255,120));
		btnCard.addActionListener(this);
		btnCash.addActionListener(this);
		
		pad_s.add(btnCard);
		pad_s.add(btnCash);	
		
		
		
	}
	


	protected void btnDis_Percent(String s) {
		// TODO Auto-generated method stub
		int isTry=0;
		try{
			isTry = Integer.parseInt(s);
		} catch(Exception e){
			
		}
		if(isTry > 100){
			lbMessage.setText("% 할인은 100을 초과할 수 없습니다.!!");
			lbMessage.setForeground(Color.red);
			txStateFeild.setText("");
		} else{
			if(tm.getRowCount()==0){
				// Dialog
				txStateFeild.setText("");
				lbMessage.setText("할인을 적용할 상품이 없습니다.!!");
				lbMessage.setForeground(Color.red);
			} else{
				if(!(txStateFeild.getText()).equals("") || !(txStateFeild.getText()).equals("0") || txStateFeild.getText()!=null){
					int txTotalInt = 0;
					int dis = 0;
					int disPer = 0;
					try{
						txTotalInt = Integer.parseInt(txTotal.getText());
						//disTemp = Integer.parseInt(txDis.getText());
						dis = Integer.parseInt(s);
					} catch(Exception e){
						
					}
					disPer = -((txTotalInt*dis)/100); // +disTemp
					dis = disPer;
					
					txDis.setText(Integer.toString(dis));
					
					txTotalInt = (txTotalInt + dis);
					txNeed.setText(Integer.toString(txTotalInt));
					
					txStateFeild.setText("");
					
					if(disPer < 0){
						lbMessage.setText(s + "% 만큼 할인이 적용");
						lbMessage.setForeground(Color.black);
					} else{
						lbMessage.setText("먼저 적용할 할인 %을 입력하세요");
						lbMessage.setForeground(Color.red);
					}
				}
			}
		}
	}

	protected static void btnAllClear() {
		// TODO Auto-generated method stub
		txTotal.setText("0");
		txDis.setText("0");
		txNeed.setText("0");
		txInput.setText("0");
		txOutput.setText("0");
		txStateFeild.setText("");
		while(tm.getRowCount()!=0){ // table row All delete
			tm.removeRow(0);
		}
		lbMessage.setText("판매할 상품을 선택하세요.");
		lbMessage.setForeground(Color.gray);
	}

	protected void btnDisPer(String s) { // total Update Because Dis Cange
		// TODO Auto-generated method stub		
		int txNeedTry = 0;
		int isTry=0;
		try{
			txNeedTry = Integer.parseInt(txNeed.getText());
			isTry = Integer.parseInt(s);
		} catch(Exception e){
			lbMessage.setText("할인을 적용할 수 없습니다.!!");
			lbMessage.setForeground(Color.red);
		}
		if(isTry > txNeedTry){
			lbMessage.setText("할인 금액이 판매금액을 넘을 수 없습니다.!!");
			lbMessage.setForeground(Color.red);
			txStateFeild.setText("");
		} else{
			if(tm.getRowCount()==0){
				// Dialog
				lbMessage.setText("할인을 적용할 상품이 없습니다.!!");
				lbMessage.setForeground(Color.red);
				txStateFeild.setText("");
			} else{
				if(!(txStateFeild.getText()).equals("") || !(txStateFeild.getText()).equals("0") || txStateFeild.getText()!=null){
					int disInt = 0;
					int txTotalInt = 0;
					int dis = 0;
					
					try{
						txTotalInt = Integer.parseInt(txTotal.getText());
						disInt =  Integer.parseInt(txDis.getText()); // Dis Price
						dis = Integer.parseInt(s);
					} catch(Exception e){
						
					}
					disInt -= dis; // Total Price Update
					txDis.setText(Integer.toString(disInt));
					
					txTotalInt = (txTotalInt + disInt); // Need Price
					txNeed.setText(Integer.toString(txTotalInt));
					
					txStateFeild.setText("");
					if(disInt < 0){
						lbMessage.setText(s + " 만큼 할인이 적용(Total:"+(disInt*-1)+")");
						lbMessage.setForeground(Color.black);
					} else{
						lbMessage.setText("먼저 적용할 할인 금액을 입력하세요");
						lbMessage.setForeground(Color.red);
					}
					
					
				}
			}
		}
	}

	protected  void input_TxStateFeild(String s) {
		// TODO Auto-generated method stub
		String temp = txStateFeild.getText();
		txStateFeild.setText(temp+s);
	}

	protected void tableAddRow(JButton btn) { // segment and add row 
		// TODO Auto-generated method stub
		
		
		int idx = btn.getText().indexOf(" ");  // 공백을 인덱스 저장
        String itemName = btn.getText().substring(0, idx); //아이템 이름
        String price = btn.getText().substring(idx+1); // 가격
        int pricePer10 = (Integer.parseInt(price)/10); // 부가가치세
        String Vprice = Integer.toString(pricePer10); //
        String priceB = Integer.toString((Integer.parseInt(price)-pricePer10));
        boolean overlap = false;
		
		for(int i=0; i<tm.getRowCount();i++){
			if(tm.getValueAt(i, 0).equals(itemName)){
				
				overlap = true;
				int addEA = Integer.parseInt((String)tm.getValueAt(i, 1)); // EA Update
				tm.setValueAt(Integer.toString((addEA+1)), i, 1);
				
				int priceAUP = Integer.parseInt(priceB)*(addEA+1); // PriceA Update
				tm.setValueAt(Integer.toString(priceAUP), i, 2);
				
				int priceVUP = Integer.parseInt(Vprice)*(addEA+1); // PriceV Update
				tm.setValueAt(Integer.toString(priceVUP), i, 3);
				
				int priceUP = Integer.parseInt(price)*(addEA+1); // Price Update
				tm.setValueAt(Integer.toString(priceUP), i, 4);
				
				txTotalUpdate(price);
				lbMessage.setText(itemName + "가 추가되었습니다 ("+(addEA+1)+"개)");
				lbMessage.setForeground(Color.black);
			} else{
				
			}
		} // txTotal, txDis, txNeed, txInput, txOutput, txStateFeild;
		if(overlap==false){
			
			String tempItem[] = {itemName,"1",priceB,Vprice,price}; //상품명, 수량, 정가, 부가세, 금액
			tm.addRow(tempItem);
			
			txTotalUpdate(price);
			
			lbMessage.setText(itemName + "가 추가되었습니다");
			lbMessage.setForeground(Color.black);
		}
	}

	protected void txTotalUpdate(String s) { // Total price, Dis price, input money
		// TODO Auto-generated method stub
		int txTotalInt = 0;
		int txDisInt = 0;
		int txNeedInt = 0;
		try{
			txTotalInt = Integer.parseInt(txTotal.getText()); // Total Price Update
			txDisInt =  Integer.parseInt(txDis.getText()); // Dis Price
			txNeedInt = Integer.parseInt(txInput.getText());
		} catch(Exception e){
			
		}
		
		txTotalInt += Integer.parseInt(s); // Total Price Update
		txTotal.setText(Integer.toString(txTotalInt));
		
		txNeedInt = (txTotalInt+txDisInt); // Need Price
		txNeed.setText(Integer.toString(txNeedInt));
	}
	
	protected void btnCash() { // cash Event
		// TODO Auto-generated method stub
		int inputTemp = 0;
		int needTemp = 0;

		try{
			inputTemp = Integer.parseInt(txStateFeild.getText());
			needTemp = Integer.parseInt(txNeed.getText());
		} catch(Exception e){
			
		}
		if(inputTemp==0){
			lbMessage.setText("받은 돈을 입력하세요.!!");
			lbMessage.setForeground(Color.red);
		} else if(inputTemp < needTemp){
			lbMessage.setText("받은 금액이 부족합니다! 다시 입력하세요");
			lbMessage.setForeground(Color.red);
			txStateFeild.setText("");
		} else{
			txInput.setText(Integer.toString(inputTemp));
			txOutput.setText(Integer.toString((inputTemp-needTemp)));
			//lbMessage.setText("현금 결제 완료!");
			txStateFeild.setText("");
			if(dialog_cash==null){
				Static_Pad.setStaticTxTotal(txTotal.getText());
				Static_Pad.setStaticTxInput(txInput.getText());
				Static_Pad.setStaticTxNeed((txNeed.getText()));
				Static_Pad.setStaticTxOutput(txOutput.getText());
				Static_Pad.setStaticTxDis(txDis.getText());
				dialog_cash = new Dialog_Cash();
				dialog_cash.setVisible(true);
				lbMessage.setText("현금 결제 진행 중...");
				lbMessage.setForeground(Color.blue);
			} else{
				dialog_cash.setVisible(true);
			}
			
		}

	}
	protected void btnCard(){ // Card Event

		if((int)tm.getRowCount()!=0){
			txStateFeild.setText("");
			if(dialog_cash==null){
				Static_Pad.setStaticTxTotal(txTotal.getText());
				Static_Pad.setStaticTxInput(txInput.getText());
				Static_Pad.setStaticTxNeed((txNeed.getText()));
				Static_Pad.setStaticTxOutput(txOutput.getText());
				Static_Pad.setStaticTxDis(txDis.getText());
				dialog_card = new Dialog_Card();
				dialog_card.setVisible(true);
				lbMessage.setText("카드 결제 진행 중...");
				lbMessage.setForeground(Color.blue);
			} else{
				dialog_cash.setVisible(true);
			}
		} else{
			lbMessage.setText("결제할 상품이 없습니다.!");
			lbMessage.setForeground(Color.red);
		}
	}
	
	protected static void btnClear(){
		txStateFeild.setText("");
		lbMessage.setText("입력창이 초기화되었습니다.");
		lbMessage.setForeground(Color.gray);
	}
	
	public static void cardPayment(boolean payment){ // File input output Stream
		if(payment){
			try {
				payment_outputDB("Card");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//
			btnAllClear();
			lbMessage.setText("결제가 완료되었습니다.");
			lbMessage.setForeground(Color.blue);
		} else {
			lbMessage.setText("결제가 취소되었습니다.");
			lbMessage.setForeground(new Color(255,100,100));
		}
	}
	public static void cashPayment(boolean payment){ // File input output Stream
		if(payment){
			try {
				payment_outputDB("Cash");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//
			btnAllClear();
			lbMessage.setText("결제가 완료되었습니다.");
			lbMessage.setForeground(Color.blue);
		} else {
			lbMessage.setText("결제가 취소되었습니다.");
			lbMessage.setForeground(new Color(255,100,100));
		}
	}
	
	protected static void payment_outputDB(String type) throws IOException{
		String temp[][] = new String[tm.getRowCount()][tm.getColumnCount()];
		String tempConcat = "";
		int tempPK = 0;
		String priceTotal = txTotal.getText();
		String priceDis = txDis.getText();
		String priceNeed = txNeed.getText();
		
		
		String timeNow;
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss"); 	
		Date time = new Date();
		timeNow = format1.format(time);
		//System.out.println(timeNow); // time save
		
		File file = new File("src/db/paymentDB.txt"); //date
		File fileNum = new File("src/db/paymentDB_PK.txt"); 
		if(!file.exists()){ // file not
			FileWriter check = new FileWriter("src/db/paymentDB.txt"); // new creat file
			
		} else {
			if(!fileNum.exists()){
				FileWriter check2 = new FileWriter("src/db/paymentDB_PK.txt");
			}
			FileReader reader = new FileReader("src/db/paymentDB.txt"); // file Open
			FileReader reader2 = new FileReader("src/db/paymentDB_PK.txt"); // file Open
			
			BufferedReader in = new BufferedReader(reader);
			BufferedReader in2 = new BufferedReader(reader2);
			
			Scanner scan = new Scanner(reader);
			Scanner scan2 = new Scanner(reader2);
			
			try{
				String string;
				String string2;
			    while ((string = in.readLine()) != null) {
			    	tempConcat = tempConcat.concat("\n"+string);
			    	//System.out.println(string);
			      }
			    
			    
			} catch(Exception e){
				
			}
			int tempPlus = 0;
			try{
				tempPlus = ((Integer.parseInt(scan2.next()))+1);
			} catch(Exception e){
				FileWriter write2 = new FileWriter("src/db/paymentDB_PK.txt");

				write2.write("0"); // file save
				write2.close();
			}
			
		    tempPK = tempPlus;
		    
			reader.close();
			reader2.close();
			tempConcat = tempConcat.concat("\n");
		}

		tempConcat = tempConcat.concat("@"+Integer.toString(tempPK)+"~\n"); // Order Number - PK
		toDayOrderNum++;
		for(int i=0; i<tm.getRowCount(); i++){
			for(int j=0; j<tm.getColumnCount(); j++){
				temp[i][j] = (String) tm.getValueAt(i, j);
				tempConcat = tempConcat.concat(temp[i][j]);
				//System.out.println(temp[i][j]);
				tempConcat = tempConcat.concat("/");
			}
			tempConcat = tempConcat.concat("item");
			tempConcat = tempConcat.concat("\n");
		}
		tempConcat = tempConcat.concat("!"+priceTotal+"/"+priceDis+"/"+priceNeed+"/"+type+"\n");
		tempConcat = tempConcat.concat("#"+timeNow); // yyyy mm dd
		
		
		FileWriter write = new FileWriter("src/db/paymentDB.txt"); // 텍스트 파일이 없으면 새로 생성함!
		FileWriter write2 = new FileWriter("src/db/paymentDB_PK.txt");
		

		write.write(tempConcat); // Data file save
		//System.out.println(tempConcat);
		write.close();
		
		write2.write(Integer.toString(tempPK)); // PK file save
		//System.out.println(tempPK);
		write2.close();
		
		/* ex) save
		 * @0@
		 * table Row1
		 * table Row2
		 * total / dis / need / type
		 * data
		 */
	}
}
