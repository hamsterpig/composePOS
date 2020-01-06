
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class Main_Action extends Panel_btn06 implements ActionListener{
	
	Main_Action(){
		
		ColorManager colorManager = ColorManager.getInstance();		
		String themeColor = "type3";
		
		if(themeColor.equals("type1")){
			setTheme(colorManager.redBg, colorManager.redBtn, colorManager.redLine); // Theme Red
		} else if(themeColor.equals("type2")){
			setTheme(colorManager.greenBg, colorManager.greenBtn, colorManager.greenLine); // Theme Green
		} else if(themeColor.equals("type3")){
			setTheme(colorManager.blueBg, colorManager.blueBtn, colorManager.blueLine); // Theme Blue
		} else if(themeColor.equals("type4")){
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			UIManager.setLookAndFeel
			("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch(Exception e){
			System.out.println("ERROR");
		}
		new Main_Action();
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
			try {
				renewal();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} // table
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
			btnClear();
		} else if(e.getSource()==btnCash){
			btnCash();
		} else if(e.getSource()==btnCard){
			btnCard();
		} else if(e.getSource()==btn_Panel_Setting){
			btn_Panel_Setting();
		} else if(e.getSource()==btnType01){ // panel 06
			rType01.setSelected(true);
		} else if(e.getSource()==btnType02){
			rType02.setSelected(true);
		} else if(e.getSource()==btnType03){
			rType03.setSelected(true);
		} else if(e.getSource()==btnType04){
			rType04.setSelected(true);
		}
		
	} //btnCard, btnCash;

	
}
