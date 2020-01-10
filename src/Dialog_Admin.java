import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Dialog_Admin extends JDialog implements ActionListener {
	JPanel pa;
	JPanel pa_c, pa_n, pa_s, pa_w, p_e;
	
	JTextField txID_Check, txPass_Check, txNeed, txStateFeild;
	JLabel lbTotal, lbDis, lbInput, lbStateFeild;
	
	JButton btnY, btnN;
	
	public Dialog_Admin(){
		
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
		
		JPanel pa_c_Line01 = new JPanel();
		JPanel pa_c_Line02 = new JPanel();
		JPanel pa_c_Line03 = new JPanel();
		
		lbTotal = new JLabel("아이디"); 
		lbDis = new JLabel("비밀번호");
		
		txID_Check = new JTextField(12);
		txPass_Check = new JTextField(12);
		txNeed = new JTextField(12);
		
		btnY = new JButton("확인");
		btnY.setBackground(new Color(100,100,255));
		btnN = new JButton("취소");
		btnN.setBackground(new Color(255,100,100));
		btnY.setPreferredSize(new Dimension(100,60));
		btnN.setPreferredSize(new Dimension(100,60));
		btnN.addActionListener(this);
		btnY.addActionListener(this);
		
		pa_c_Line01.add(lbTotal);
		pa_c_Line01.add(txID_Check);
		pa_c_Line02.add(lbDis);
		pa_c_Line02.add(txPass_Check);
		pa_c_Line03.add(btnY);
		pa_c_Line03.add(btnN);
		pa_c.add(pa_c_Line01);
		pa_c.add(pa_c_Line02);
		pa_c.add(pa_c_Line03);

		
		pa_c.setBackground(Color.white);
		
		pa_c.setPreferredSize(new Dimension(230,170));;
		
		setTitle("관리자 확인");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(false);
		setResizable(false);
		pack();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnY){
			if(txID_Check.getText().equals("admin")){
				if(txPass_Check.getText().equals("123")){
					Panel_btn01.viewer(5);
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 틀렸습니다!", "접근 불가", JOptionPane.WARNING_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 틀렸습니다!", "접근 불가", JOptionPane.WARNING_MESSAGE);
			}
			
			
		} else if(e.getSource()==btnN){
			setVisible(false);
		}
	}

}
