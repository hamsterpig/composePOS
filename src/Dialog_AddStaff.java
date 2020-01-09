import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;


public class Dialog_AddStaff extends JDialog implements ActionListener {
	JPanel pa;
	JPanel pa_c, pa_n, pa_s, pa_w, p_e;
	JTextField txName;
	JTextArea txMemo;
	JLabel lbName, lbMemo;
	JButton btnY, btnN;
	
	public Dialog_AddStaff(){
		
		this.setBackground(new Color(200,200,255));
		
		pa = new JPanel(new BorderLayout());
		pa_c = new JPanel();
		pa_n = new JPanel();
		pa_s = new JPanel();
		pa_w = new JPanel();
		p_e = new JPanel();
		
		this.add(pa, BorderLayout.CENTER);
		pa.add(pa_c, BorderLayout.CENTER);
		pa.add(pa_n, BorderLayout.PAGE_START);
		pa.add(pa_s, BorderLayout.PAGE_END);
		pa.add(pa_w, BorderLayout.LINE_START);
		pa.add(p_e, BorderLayout.LINE_END);
		
		pa_c.setPreferredSize(new Dimension(200,150));
		txName = new JTextField();
		txMemo = new JTextArea();
		lbName = new JLabel("ÀÌ¸§");
		lbMemo = new JLabel("¸Þ¸ð");
		lbName.setFont(new Font("ÇÑÄÄ À±°íµñ 230", Font.PLAIN, 13));
		lbMemo.setFont(new Font("ÇÑÄÄ À±°íµñ 230", Font.PLAIN, 13));
		lbMemo.setHorizontalAlignment(lbMemo.LEFT);
		JScrollPane sb = new JScrollPane(txMemo);
		sb.setPreferredSize(new Dimension(190,80));
		txName.setPreferredSize(new Dimension(190,25));
		
		pa_c.add(lbName);
		pa_c.add(txName);
		pa_c.add(lbMemo);
		pa_c.add(sb);

		btnY = new JButton("È®ÀÎ");
		btnN = new JButton("Ãë¼Ò");
		btnY.setBackground(new Color(140,140,255));
		btnN.setBackground(new Color(255,140,140));
		pa_s.add(btnY);
		pa_s.add(btnN);
		btnY.addActionListener(this);
		btnN.addActionListener(this);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(false);
		setResizable(false);
		setTitle("Á÷¿ø Ãß°¡");
		pack();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnY){
			int temp_PK = Static_FileInOut.fileWrite_PK("src/db/staff_PK.txt");
			String temp = "";
			temp = temp.concat(temp_PK+"/"); //name
			temp = temp.concat(txName.getText()+"/"); //name
			temp = temp.concat(txMemo.getText()+"/"); //memo
			temp = temp.concat("00:00\n"); //
			Static_FileInOut.fileWrite_Concat("src/db/staff.txt", temp);
			
			String tempTime = Static_FileInOut.fileRead("src/db/staff_Time.txt");
			tempTime = tempTime.concat("Åð±Ù\n");
			Static_FileInOut.fileWrite("src/db/staff_Time.txt", tempTime);
			
			String tempToday = Static_FileInOut.fileRead("src/db/staff_Today.txt");
			tempToday = tempToday.concat("00:00");
			Static_FileInOut.fileWrite("src/db/staff_Today.txt", tempToday);
			
			txName.setText("");
			txMemo.setText("");
			Panel_btn05.staffRenewal();
			
			this.setVisible(false);
		} else if(e.getSource()==btnN){
			txName.setText("");
			txMemo.setText("");
			this.setVisible(false);
		}
	}

}
