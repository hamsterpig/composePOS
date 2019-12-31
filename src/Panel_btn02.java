
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class Panel_btn02 extends Panel_btn01{
	JLabel lbTotal, lbDis, lbNeed, lbInput, lbOutput; // panel btn02 pad
	
	JButton btnNumKey[], btnAllClear, btnDisPer, btnDis, btnClear; // pad_n
	JButton btnCard, btnCash;
	
	JTextField txTotal, txDis, txNeed, txInput, txOutput, txStateFeild; // panel btn02 pad
	JTable tableItem; // panel btn01
	DefaultTableModel tm;
	
	//int[] intEA = new int
	Panel_btn02(){

		pbtn02_nc = new JPanel(new BorderLayout());
		pbtn02_s = new JPanel();
		pbtn02_n = new JPanel();
		pbtn02_c = new JPanel();
		pbtn02_w = new JPanel();
		pbtn02_e = new JPanel();
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
		JPanel pbtn02_c_menu = new JPanel(); // add menu Button tab
		pbtn02_c.add(pbtn02_c_menu);
		pbtn02_c.setLayout(new FlowLayout(FlowLayout.LEADING));
		pbtn02_c_menu.setPreferredSize(new Dimension(650, 350));
		pbtn02_c_menu.setBackground(new Color(255,255,150));
		
		
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
				case 5: btnMenu[i] = new JButton("카라멜마끼야또 2500"); break;
				case 6: btnMenu[i] = new JButton("카페모카 2500"); break;
				case 7: btnMenu[i] = new JButton("그린티라떼 3000"); break;
				case 8: btnMenu[i] = new JButton("고구마라떼 3000"); break;
				case 9: btnMenu[i] = new JButton("곡물라떼 3000"); break;
				case 10: btnMenu[i] = new JButton("초코오레오라떼 3000"); break;
				case 11: btnMenu[i] = new JButton("민트초코라떼 3000"); break;
				case 12: btnMenu[i] = new JButton("블루베리스무디 3000"); break;
				case 13: btnMenu[i] = new JButton("딸기스무디 3000"); break;
				case 14: btnMenu[i] = new JButton("메론스무디 3000"); break;
				case 15: btnMenu[i] = new JButton("허니유자티 3000"); break;
				default : btnMenu[i] = new JButton("null"); break;
			}
			btnMenu[i].setPreferredSize(new Dimension(150,80));
			btnMenu[i].setBackground(new Color(255,255,183));
			pbtn02_c_menu.add(btnMenu[i]);
			btnMenu[i].addActionListener(this);
		}
		
		JPanel pad = new JPanel(new BorderLayout()); // panel btn02 pad
		pbtn02_w.add(pad);
		pad.setPreferredSize(new Dimension(300,780));
		//pad.setBackground(new Color(255,153,153));
		JPanel pad_n = new JPanel();
		JPanel pad_c = new JPanel();
		JPanel pad_s = new JPanel();
		pad.add(pad_n, BorderLayout.PAGE_START);
		pad.add(pad_c, BorderLayout.CENTER);
		pad.add(pad_s, BorderLayout.PAGE_END);
		pad_n.setPreferredSize(new Dimension(250,290));
		pad_n.setBackground(new Color(255,255,204));
		
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
		txTotal.setEnabled(false);
		txDis.setEnabled(false);
		txNeed.setEnabled(false);
		txInput.setEnabled(false);
		txOutput.setEnabled(false);
		txTotal.setText("0");
		txDis.setText("0");
		txNeed.setText("0");
		txInput.setText("0");
		txOutput.setText("0");
		
		txStateFeild = new JTextField();
		txStateFeild.setEditable(false);
		txStateFeild.setPreferredSize(new Dimension(240,40));
		
		JPanel pad_n_line01 = new JPanel();
		JPanel pad_n_line02 = new JPanel();
		JPanel pad_n_line03 = new JPanel();
		JPanel pad_n_line04 = new JPanel();
		JPanel pad_n_line05 = new JPanel();
		JPanel pad_n_line06 = new JPanel();
		
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
		pad_n_line06.add(txStateFeild);
		pad_n_line01.setBackground(new Color(255,255,102));
		pad_n_line02.setBackground(new Color(255,255,102));
		pad_n_line03.setBackground(new Color(255,255,102));
		pad_n_line04.setBackground(new Color(255,255,102));
		pad_n_line05.setBackground(new Color(255,255,102));
		pad_n_line06.setBackground(new Color(255,120,120));
		
		pad_n.add(pad_n_line01);
		pad_n.add(pad_n_line02);
		pad_n.add(pad_n_line03);
		pad_n.add(pad_n_line04);
		pad_n.add(pad_n_line05);
		pad_n.add(pad_n_line06);
		
		pad_c.setBackground(new Color(255,255,204));
		pad_c.setPreferredSize(new Dimension(250,250));
		
		pad_s.setBackground(new Color(255,255,204));
		pad_s.setPreferredSize(new Dimension(250,250));
		
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
		
		pad_s.add(btnCard);
		pad_s.add(btnCash);	
		
		
		
	}
	
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
			viewer(1);
		} else if(e.getSource()==btn2){
			viewer(2);
		} else if(e.getSource()==btn3){
			viewer(3);
		} else if(e.getSource()==btn4){
			viewer(4);
		} else if(e.getSource()==btn5){
			viewer(5);
		} else if(e.getSource()==btn6){
			viewer(6);
		} else if(e.getSource()==btnMenu[0]){ // add Menu Plus Price
			tableAddRow(btnMenu[0]);
		} else if(e.getSource()==btnMenu[1]){ // add Menu Plus Price
			tableAddRow(btnMenu[1]);
		} else if(e.getSource()==btnMenu[2]){ // add Menu Plus Price
			tableAddRow(btnMenu[2]);
		} else if(e.getSource()==btnMenu[3]){ // add Menu Plus Price
			tableAddRow(btnMenu[3]);
		} else if(e.getSource()==btnMenu[4]){ // add Menu Plus Price
			tableAddRow(btnMenu[4]);
		} else if(e.getSource()==btnMenu[5]){ // add Menu Plus Price
			tableAddRow(btnMenu[5]);
		} else if(e.getSource()==btnMenu[6]){ // add Menu Plus Price
			tableAddRow(btnMenu[6]);
		} else if(e.getSource()==btnMenu[7]){ // add Menu Plus Price
			tableAddRow(btnMenu[7]);
		} else if(e.getSource()==btnMenu[8]){ // add Menu Plus Price
			tableAddRow(btnMenu[8]);
		} else if(e.getSource()==btnMenu[9]){ // add Menu Plus Price
			tableAddRow(btnMenu[9]);
		} else if(e.getSource()==btnMenu[10]){ // add Menu Plus Price
			tableAddRow(btnMenu[10]);
		} else if(e.getSource()==btnMenu[11]){ // add Menu Plus Price
			tableAddRow(btnMenu[11]);
		} else if(e.getSource()==btnMenu[12]){ // add Menu Plus Price
			tableAddRow(btnMenu[12]);
		} else if(e.getSource()==btnMenu[13]){ // add Menu Plus Price
			tableAddRow(btnMenu[13]);
		} else if(e.getSource()==btnMenu[14]){ // add Menu Plus Price
			tableAddRow(btnMenu[14]);
		} else if(e.getSource()==btnMenu[15]){ // add Menu Plus Price
			tableAddRow(btnMenu[15]);
		} else if(e.getSource()==btnNumKey[0]){ // input txStateFeild
				input_TxStateFeild("0");
		} else if(e.getSource()==btnNumKey[1]){ // input txStateFeild
			input_TxStateFeild("1");
		} else if(e.getSource()==btnNumKey[2]){ // input txStateFeild
			input_TxStateFeild("2");
		} else if(e.getSource()==btnNumKey[3]){ // input txStateFeild
			input_TxStateFeild("3");
		} else if(e.getSource()==btnNumKey[4]){ // input txStateFeild
			input_TxStateFeild("4");
		} else if(e.getSource()==btnNumKey[5]){ // input txStateFeild
			input_TxStateFeild("5");
		} else if(e.getSource()==btnNumKey[6]){ // input txStateFeild
			input_TxStateFeild("6");
		} else if(e.getSource()==btnNumKey[7]){ // input txStateFeild
			input_TxStateFeild("7");
		} else if(e.getSource()==btnNumKey[8]){ // input txStateFeild
			input_TxStateFeild("8");
		} else if(e.getSource()==btnNumKey[9]){ // input txStateFeild
			input_TxStateFeild("9");
		} else if(e.getSource()==btnNumKey[10]){ // input txStateFeild
			input_TxStateFeild("00");
		} else if(e.getSource()==btnAllClear){ // input txStateFeild
			btnAllClear();
		} else if(e.getSource()==btnDisPer){ // input txStateFeild
			btnDisPer(txStateFeild.getText());
		} else if(e.getSource()==btnDis){ // input txStateFeild
			btnDis_Percent(txStateFeild.getText());
		} else if(e.getSource()==btnClear){ // input txStateFeild
			txStateFeild.setText("");
		} 
		
	}

	private void btnDis_Percent(String s) {
		// TODO Auto-generated method stub
		if(tm.getRowCount()==0){
			// Dialog
			txStateFeild.setText("");
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
			}
		}
	}

	protected void btnAllClear() {
		// TODO Auto-generated method stub
		txTotal.setText("0");
		txDis.setText("0");
		txNeed.setText("0");
		txInput.setText("0");
		txOutput.setText("0");
		txStateFeild.setText("");
		while(tm.getRowCount()!=0){ // table row All delete
			tm.removeRow(0);
			revalidate();
			repaint();
		}
	}

	protected void btnDisPer(String s) { // total Update Because Dis Cange
		// TODO Auto-generated method stub
		if(tm.getRowCount()==0){
			// Dialog
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
			} else{
				
			}
		} // txTotal, txDis, txNeed, txInput, txOutput, txStateFeild;
		if(overlap==false){
			
			String tempItem[] = {itemName,"1",priceB,Vprice,price}; //상품명, 수량, 정가, 부가세, 금액
			tm.addRow(tempItem);
			
			txTotalUpdate(price);
		}
	}

	protected void txTotalUpdate(String p) { // Total price, Dis price, input money
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
		
		txTotalInt += Integer.parseInt(p); // Total Price Update
		txTotal.setText(Integer.toString(txTotalInt));
		
		txNeedInt = (txTotalInt+txDisInt); // Need Price
		txNeed.setText(Integer.toString(txNeedInt));
	}
	
	

}
