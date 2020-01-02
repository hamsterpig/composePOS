import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Dialog_Card extends JDialog implements ActionListener {
	JPanel pa;
	JPanel pa_c, pa_n, pa_s, pa_w, p_e;
	
	JTextField txTotal, txDis, txNeed, txStateFeild;
	JLabel lbTotal, lbDis, lbInput, lbStateFeild;
	
	JButton btnY, btnN;
	
	public Dialog_Card(){
		
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
		JPanel pa_c_Line04 = new JPanel();
		JPanel pa_c_Line05 = new JPanel();
		
		lbTotal = new JLabel("총매출액"); 
		lbDis = new JLabel("할인금액");
		lbInput = new JLabel("결제금액");
		lbInput.setForeground(Color.red);
		
		txTotal = new JTextField(12);
		txDis = new JTextField(12);
		txNeed = new JTextField(12);
		JLabel msg = new JLabel("결제 하시겠습니까?");
		msg.setForeground(Color.red);
		
		txTotal.setEditable(false);
		txDis.setEditable(false);
		txNeed.setEditable(false);
		
		btnY = new JButton("결제");
		btnY.setBackground(new Color(100,100,255));
		btnN = new JButton("취소");
		btnN.setBackground(new Color(255,100,100));
		btnY.setPreferredSize(new Dimension(100,60));
		btnN.setPreferredSize(new Dimension(100,60));
		btnN.addActionListener(this);
		btnY.addActionListener(this);
		
		pa_c_Line01.add(lbTotal);
		pa_c_Line01.add(txTotal);
		pa_c_Line02.add(lbDis);
		pa_c_Line02.add(txDis);
		pa_c_Line03.add(lbInput);
		pa_c_Line03.add(txNeed);
		pa_c_Line04.add(msg);
		pa_c_Line04.setOpaque(false);
		pa_c_Line05.add(btnY);
		pa_c_Line05.add(btnN);
		
		txTotal.setText(Static_Pad.getStaticTxTotal());
		txDis.setText(Static_Pad.getStaticTxDis());
		txNeed.setText(Static_Pad.getStaticTxNeed());
		
		pa_c.add(pa_c_Line01);
		pa_c.add(pa_c_Line02);
		pa_c.add(pa_c_Line03);
		pa_c.add(pa_c_Line04);
		pa_c.add(pa_c_Line05);
		
		pa_c.setBackground(new Color(255,255,183));
		
		pa_c.setPreferredSize(new Dimension(230,360));;
		
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
			Static_Pad.setStaticTxStateFeild("결제가 완료되었습니다");
			Panel_btn02.cashPayment(true);
			setVisible(false);
			
		} else if(e.getSource()==btnN){
			Panel_btn02.cashPayment(false);
			setVisible(false);
		}
	}

}
