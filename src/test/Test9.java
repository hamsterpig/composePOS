package test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
class SignUpInfoDialog extends JDialog implements ActionListener{
	JLabel info_l[];
	JButton button;
	JPanel labelPanel;
	SignUpDialog sd;
	String str;
	SignUpInfoDialog(SignUpDialog signUpDialog,String title){
	
		super(signUpDialog, title, true);
		sd = (SignUpDialog)signUpDialog;
		this.setSize(300,350);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(signUpDialog);
		this.setResizable(false);
		info_l = new JLabel[6];
		
		info_l[0] = new JLabel("��������");
		str = sd.id_t.getText();
		info_l[1] = new JLabel("���̵�     : "+str);
		str = sd.pw_t.getText();
		info_l[2] = new JLabel("��й�ȣ : "+str);
		str = sd.name_t.getText();
		info_l[3] = new JLabel("�̸�        : "+str);
		str = sd.email_t.getText();
		info_l[4] = new JLabel("�̸���    : "+str);
		str = sd.wellcome_ta.getText();
		info_l[5] = new JLabel("�λ�    : "+str);
		labelPanel = new JPanel();
		labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
		labelPanel.add(info_l[0]);
		labelPanel.add(info_l[1]);
		labelPanel.add(info_l[2]);
		labelPanel.add(info_l[3]);
		labelPanel.add(info_l[4]);
		labelPanel.add(info_l[5]);
	
		button = new JButton("Ȯ��");
		button.addActionListener(this);
		
		this.add(labelPanel,"Center");
		this.add(button,"South");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button){
			this.dispose();
			//remove(this);
			
			sd.init();
			infoInit();
		}
		
	}
	public void infoInit(){
		info_l[1].setText("���̵�     : ");
		info_l[2].setText("��й�ȣ : ");
		info_l[3].setText("�̸�        : ");
		info_l[4].setText("�̸���    : ");
		info_l[5].setText("�λ�    : ");
	}
	
}
class SignUpDialog extends JDialog implements ActionListener{
	JLabel id_l,pw_l,name_l,email_l,wellcome_l;
	JTextField id_t,name_t,email_t;
	JPasswordField pw_t;
	JTextArea wellcome_ta;
	JPanel labelPanel[];
	JButton ok,cencel;
	SignUpInfoDialog suifd;
	SignUpDialog(JFrame frame,String title){
		super(frame, title, true);
		this.setSize(300,350);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		//this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(frame);
		this.setResizable(false);
		id_l = new JLabel("���̵�    ");
		pw_l = new JLabel("��й�ȣ");
		name_l = new JLabel("�̸�       ");
		email_l = new JLabel("�̸���   ");
		wellcome_l = new JLabel("�λ�");
		id_t = new JTextField(13);
		pw_t = new JPasswordField(13);
		pw_t.setEchoChar('*');
		name_t = new JTextField(13);
		email_t = new JTextField(13);
		labelPanel = new JPanel[7];
		labelPanel[0] = new JPanel();
		labelPanel[0].add(id_l);
		labelPanel[0].add(id_t);
		labelPanel[1] = new JPanel();
		labelPanel[1].add(pw_l);
		labelPanel[1].add(pw_t);
		labelPanel[2] = new JPanel();
		labelPanel[2].add(name_l);
		labelPanel[2].add(name_t);
		labelPanel[3] = new JPanel();
		labelPanel[3].add(email_l);
		labelPanel[3].add(email_t);
		labelPanel[4] = new JPanel();
		labelPanel[4].add(wellcome_l);
		labelPanel[5] = new JPanel();
		labelPanel[5].setLayout(new BoxLayout(labelPanel[5],BoxLayout.Y_AXIS));
		labelPanel[5].add(labelPanel[0]);
		labelPanel[5].add(labelPanel[1]);
		labelPanel[5].add(labelPanel[2]);
		labelPanel[5].add(labelPanel[3]);
		labelPanel[5].add(labelPanel[4]);
		wellcome_ta = new JTextArea(5,20);
		ok = new JButton("Ȯ��");
		cencel = new JButton("���");
		ok.addActionListener(this);
		cencel.addActionListener(this);
		labelPanel[6] = new JPanel();
		labelPanel[6].add(ok);
		labelPanel[6].add(cencel);
		this.add(labelPanel[5]);
		this.add(wellcome_ta);
		this.add(labelPanel[6]);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ok){
			if(suifd == null){
				suifd = new SignUpInfoDialog(this,"ȸ������");
				suifd.setVisible(true);
				suifd =null;
			}
		}else if(e.getSource() == cencel){
			this.dispose();
		}
		
	}
	public void init(){
		id_t.setText(null);
		pw_t.setText(null);
		name_t.setText(null);
		email_t.setText(null);
		wellcome_ta.setText(null);
	}
}
public class Test9 extends JFrame implements ActionListener{
	JLabel label_id, label_pw, logOnLabel;
	JButton login, sign_up, find, infoChange, logOff;
	JTextField text_id;
	JPasswordField text_pw;
	JPanel panel, inputPan, loginPan, buttonPan, logOnPanel, logOnButtonPan;
	SignUpDialog sud;
	String user;
	Boolean isLogin = false;
	Test9(){
		this.setSize(300,160);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		text_id = new JTextField(10);
		text_pw = new JPasswordField(10);
		text_pw.setEchoChar('*');
		label_id = new JLabel("���̵�: ");
		label_pw = new JLabel("��й�ȣ: ");
		inputPan = new JPanel();
		inputPan.setLayout(new BoxLayout(inputPan,BoxLayout.Y_AXIS));
		inputPan.add(label_id);
		inputPan.add(text_id);
		inputPan.add(label_pw);
		inputPan.add(text_pw);
		login = new JButton("�α���");
		login.addActionListener(this);
		login.setPreferredSize(new Dimension(80,65));
		sign_up = new JButton("ȸ������");
		sign_up.addActionListener(this);
		find = new JButton("���̵�/���ã��");
		
		panel = new JPanel();
		panel.add(inputPan);
		panel.add(login);
		panel.add(sign_up);
		panel.add(find);
		
		logOnLabel = new JLabel(user+"�� �ݰ����ϴ�.");
		logOnButtonPan = new JPanel();
		logOnButtonPan.setLayout(new FlowLayout());
		infoChange = new JButton("ȸ����������");
		logOff = new JButton("�α׾ƿ�");
		logOff.addActionListener(this);
		logOnButtonPan.add(infoChange);
		logOnButtonPan.add(logOff);
		logOnPanel = new JPanel();
		logOnPanel.setLayout(new BorderLayout());
		logOnPanel.add(logOnLabel,"Center");
		logOnPanel.add(logOnButtonPan,"South");
		//logOnPanel.setVisible(false);
		if(isLogin){
			this.add(logOnPanel);
		}else{
			this.add(panel);
		}
		
		this.setVisible(true);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sign_up){
			if(sud == null){
				sud = new SignUpDialog(this,"ȸ������");
				
			}
			sud.setVisible(true);
		}else if(e.getSource() == login){
			user = text_id.getText();
			loginOn();
		}else if(e.getSource() == logOff){
			loginOut();
		}
		
		revalidate();
		repaint();
	}
	public void loginOn(){
		this.remove(panel);
		logOnLabel.setText(user+"�� �ݰ����ϴ�.");
		this.add(logOnPanel);
		revalidate();
		repaint();
	}
	public void loginOut(){
		this.remove(logOnPanel);
		text_id.setText(null);
		text_pw.setText(null);
		this.add(panel);
		revalidate();
		repaint();
	}
	public static void main(String[] args) {
		new Test9();
	}
}
