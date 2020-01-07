import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Dialog_AddStaff extends JDialog implements ActionListener {
	JPanel pa;
	JPanel pa_c, pa_n, pa_s, pa_w, p_e;
	
	
	public Dialog_AddStaff(){
		
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
		

		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(false);
		setResizable(false);
		setTitle("직원 추가");
		pack();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

}
