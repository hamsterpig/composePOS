import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Dialog_Cash extends JDialog implements ActionListener {
	JPanel pa;
	JPanel pa_c, pa_n, pa_s, pa_w, p_e;
	
	JTextField txTotal, txDis, txNeed, txInput, txOutput, txStateFeild;
	JLabel lbTotal, lbDis, lbNeed, lbInput, lbOutput, lbStateFeild;
	
	public Dialog_Cash(){
		
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
		JPanel pa_c_Line06 = new JPanel();
		
		
		
		lbTotal = new JLabel("총매출액"); 
		lbDis = new JLabel("할인금액");
		lbNeed = new JLabel("받을금액");
		lbInput = new JLabel("받은금액");
		lbOutput = new JLabel("거스름돈"); 
		
		txTotal = new JTextField(12);
		txDis = new JTextField(12);
		txNeed = new JTextField(12);
		txInput = new JTextField(12);
		txOutput = new JTextField(12);
		JLabel msg = new JLabel("결제 하시겠습니까?");
		
		pa_c_Line01.add(lbTotal);
		pa_c_Line01.add(txTotal);
		pa_c_Line02.add(lbDis);
		pa_c_Line02.add(txDis);
		pa_c_Line03.add(lbNeed);
		pa_c_Line03.add(txNeed);
		pa_c_Line04.add(lbInput);
		pa_c_Line04.add(txInput);
		pa_c_Line05.add(lbOutput);
		pa_c_Line05.add(txOutput);
		pa_c_Line06.add(msg);
		pa_c_Line06.setBackground(Color.red);
		
		pa_c.add(pa_c_Line01);
		pa_c.add(pa_c_Line02);
		pa_c.add(pa_c_Line03);
		pa_c.add(pa_c_Line04);
		pa_c.add(pa_c_Line05);
		pa_c.add(pa_c_Line06);
		pa_c.setBackground(new Color(255,255,183));
		
		pa_c.setPreferredSize(new Dimension(230,500));;
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(false);
		pack();

	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
