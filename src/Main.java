import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

class PnlAfterLogIn extends JPanel implements ActionListener{
	
	private JButton btnTest;
	public JButton btnLogOut;
	
	public PnlAfterLogIn(){
		btnTest = new JButton("TEST");
		btnTest.addActionListener(this);
		
		btnLogOut = new JButton("Log Out");
		
		this.add(btnTest);
		this.add(btnLogOut);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btnTest){
			System.out.println("TEST");
		}
	}
}

class PnlBeforeLogIn extends JPanel implements ActionListener{
	
	public JButton btnLogIn;
	private JTextField tfID, tfPW;
	
	
	public PnlBeforeLogIn(){
		this.setLayout(null);
		
		Font font = new Font("맑�? 고딕", Font.PLAIN, 16);
		
		tfID = new JTextField(10);
		tfID.setFont(font);
		tfID.setBounds(900, 300, 150, 30);
		
		tfPW = new JTextField(10);
		
		this.add(new JLabel("ID : "));
		this.add(tfID);
		
		this.add(new JLabel("PW : "));
		this.add(tfPW);
		
		btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(930, 350, 100, 50);
		btnLogIn.setBackground(new Color(245, 179, 69));
		btnLogIn.setFont(font);
		this.add(btnLogIn);
		
		// Background Image
		JLabel lblCoffee = new JLabel("");
		lblCoffee.setIcon(new ImageIcon("D:/PGH/Workspace/compose/bin/imgs/h.jpg"));
		lblCoffee.setBounds(0, 0, 1280, 800);
		this.add(lblCoffee);
	}
	public void actionPerformed(ActionEvent e){
		
	}
}

class POS extends JFrame implements ActionListener{
	
	JPanel pnlMain;
	PnlBeforeLogIn pnlBeforeLogIn;
	PnlAfterLogIn pnlAfterLogIn;
	
	public POS(){
		
		this.setSize(1280, 800);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pnlMain = new JPanel();
		pnlMain.setLayout(new BorderLayout());
		//////////////////////////////////////////////
		
		pnlBeforeLogIn = new PnlBeforeLogIn();
		pnlBeforeLogIn.btnLogIn.addActionListener(this);
		pnlMain.add(pnlBeforeLogIn);
		
		pnlAfterLogIn = new PnlAfterLogIn();
		pnlAfterLogIn.btnLogOut.addActionListener(this);
	
		//////////////////////////////////////////////
		this.add(pnlMain);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == pnlBeforeLogIn.btnLogIn){
			pnlMain.removeAll();
			pnlMain.add(pnlAfterLogIn);
		}else if(e.getSource() == pnlAfterLogIn.btnLogOut){
			pnlMain.removeAll();
			pnlMain.add(pnlBeforeLogIn);
		}
		pnlMain.revalidate();
		pnlMain.repaint();
	}
}

public class Main{
	public static void main(String args[]){
		try{
			UIManager.setLookAndFeel
			("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch(Exception e){
			System.out.println("ERROR");
		}
		new POS();
	}
}