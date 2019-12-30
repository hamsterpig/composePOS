
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class Panel_btn02 extends Panel_btn01_Login_Action implements ActionListener{
	JLabel lbTotal, lbDis, lbNeed, lbInput, lbOutput; // panel btn02 pad
	
	JButton btnNumKey[], btnEA, btnDisPer, btnDis, btnClear;
	
	JTextField txTotal, txDis, txNeed, txInput, txOutput, txStateFeild; // panel btn02 pad
	JTable tableItem; // panel btn01
	DefaultTableModel tm;
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
		
		
		String[] columnName = {"상품명","수량","정가","할인","금액"}; // table columnName
		String[][] data = {};
		tm = new DefaultTableModel(data, columnName);
		tableItem = new JTable(tm);
		JScrollPane tableSP = new JScrollPane(tableItem);
		pbtn02_n_Table.add(tableSP);
		tableItem.setPreferredSize(new Dimension(650,350));
		tableSP.setPreferredSize(new Dimension(650,350));
		pbtn02_n_Table.setPreferredSize(new Dimension(650,350));
		
		/*String testar[] = {"1","2","3","4","5"};
		tm.addRow(testar);*/
		
		btnMenu = new JButton[16];
		for(int i=0; i<btnMenu.length; i++){ // add menu Button Array
			switch(i){
				case 0: btnMenu[i] = new JButton("아메리카노 1500"); break;
				case 1: btnMenu[i] = new JButton(); break;
				default : btnMenu[i] = new JButton(); break;
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
		
		pad_s.setBackground(Color.gray);
		pad_s.setPreferredSize(new Dimension(250,250));
		
		btnEA = new JButton("C/A");
		btnDisPer = new JButton("%/D");
		btnDis = new JButton("N/D");
		btnClear = new JButton("Clear");
		btnNumKey = new JButton[12];
		for(int i=0; i<btnNumKey.length; i++){ // NumKeyPad
			btnNumKey[i] = new JButton();
			btnNumKey[i].setText(Integer.toString(i));
			btnNumKey[i].setPreferredSize(new Dimension(60,50));
			btnNumKey[i].setBackground(new Color(255,153,102));
		}
		btnNumKey[11].setText("00");
		
		btnEA.setPreferredSize(new Dimension(60,50));
		btnDisPer.setPreferredSize(new Dimension(60,50));
		btnDis.setPreferredSize(new Dimension(60,50));
		btnClear.setPreferredSize(new Dimension(126,50));
		
		btnEA.setBackground(new Color(255,100,100));
		btnDisPer.setBackground(new Color(255,100,100));
		btnDis.setBackground(new Color(255,100,100));
		btnClear.setBackground(new Color(255,60,60));
	
		pad_c.add(btnNumKey[7]); 
		pad_c.add(btnNumKey[8]);
		pad_c.add(btnNumKey[9]);
		pad_c.add(btnEA);
		
		pad_c.add(btnNumKey[4]); 
		pad_c.add(btnNumKey[5]);
		pad_c.add(btnNumKey[6]);
		pad_c.add(btnDisPer);
		
		pad_c.add(btnNumKey[1]); 
		pad_c.add(btnNumKey[2]);
		pad_c.add(btnNumKey[3]);
		pad_c.add(btnDis);
		
		pad_c.add(btnNumKey[0]); 
		pad_c.add(btnNumKey[11]);
		pad_c.add(btnClear);
		//pad_c.add(arg0);
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			UIManager.setLookAndFeel
			("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch(Exception e){
			System.out.println("ERROR");
		}
		new Panel_btn02();
	}
	
}
