
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Panel_btn03 extends Panel_btn02{ 
	JPanel pbtn3_s, pbtn3_n, pbtn3_c, pbtn3_e, pbtn3_w; // e
	JButton dataPrevious, dataNext, data;
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
		
		dataPrevious = new JButton("<");
		data = new JButton();
		dataNext = new JButton(">");
		
		dataPrevious.setPreferredSize(new Dimension(80,40));
		data.setPreferredSize(new Dimension(200,40));
		dataNext.setPreferredSize(new Dimension(80,40));
		
		pbtn3_s.add(dataPrevious);
		pbtn3_s.add(data);
		pbtn3_s.add(dataNext);
		
		String[] columnName = {"영수증번호","판매날짜","결제유형","상품개수","상품금액","할인금액","판매금액"}; // table columnName
		String[][] data = {};
		tmPaymentList = new DefaultTableModel(data, columnName);
		tablePamentList = new JTable(tmPaymentList);
		JScrollPane tableSP = new JScrollPane(tablePamentList);
		pbtn3_c.add(tableSP);
		//tableItem.setPreferredSize(new Dimension(650,300));
		tableSP.setPreferredSize(new Dimension(650,350));
		pbtn3_c.setPreferredSize(new Dimension(650,350));
		
	}
}
