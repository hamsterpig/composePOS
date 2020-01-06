import java.awt.Font;

public class FontManager{
	
	private static FontManager instance = null;

	public Font nanum_BOLD_13, nanum_BOLD_15, nanum_BOLD_18;
	public Font nanum_PLAIN_13, nanum_PLAIN_15, nanum_PLAIN_18;
	
	public Font latter_BOLD_13, latter_BOLD_15, latter_BOLD_18;
	public Font latter_PLAIN_13, latter_PLAIN_15, latter_PLAIN_18;
	
	public Font cholong_BOLD_13, cholong_BOLD_15, cholong_BOLD_18;
	public Font cholong_PLAIN_13, cholong_PLAIN_15, cholong_PLAIN_18;
	
	public Font yun_BOLD_13, yun_BOLD_15, yun_BOLD_18;
	public Font yun_PLAIN_13, yun_PLAIN_15, yun_PLAIN_18;

	
	private FontManager(){
		
		nanum_BOLD_13 = new Font("�������", Font.BOLD, 13);
		nanum_BOLD_15 = new Font("�������", Font.BOLD, 15);
		nanum_BOLD_18 = new Font("�������", Font.BOLD, 18);
		nanum_PLAIN_13 = new Font("�������", Font.PLAIN, 13);
		nanum_PLAIN_15 = new Font("�������", Font.PLAIN, 15);
		nanum_PLAIN_18 = new Font("�������", Font.PLAIN, 18);
		
		latter_BOLD_13 = new Font("�޸�����ü", Font.BOLD, 13);
		latter_BOLD_15 = new Font("�޸�����ü", Font.BOLD, 15);
		latter_BOLD_18 = new Font("�޸�����ü", Font.BOLD, 18);
		latter_PLAIN_13 = new Font("�޸�����ü", Font.PLAIN, 13);
		latter_PLAIN_15 = new Font("�޸�����ü", Font.PLAIN, 15);
		latter_PLAIN_18 = new Font("�޸�����ü", Font.PLAIN, 18);
		
		cholong_BOLD_13 = new Font("���ʷչ���", Font.BOLD, 13);
		cholong_BOLD_15 = new Font("���ʷչ���", Font.BOLD, 15);
		cholong_BOLD_18 = new Font("���ʷչ���", Font.BOLD, 18);
		cholong_PLAIN_13 = new Font("���ʷչ���", Font.PLAIN, 13);
		cholong_PLAIN_15 = new Font("���ʷչ���", Font.PLAIN, 15);
		cholong_PLAIN_18 = new Font("���ʷչ���", Font.PLAIN, 18);
		
		yun_BOLD_13 = new Font("���� ����� 230", Font.BOLD, 13);
		yun_BOLD_15 = new Font("���� ����� 230", Font.BOLD, 15);
		yun_BOLD_18 = new Font("���� ����� 230", Font.BOLD, 18);
		yun_PLAIN_13 = new Font("���� ����� 230", Font.PLAIN, 13);
		yun_PLAIN_15 = new Font("���� ����� 230", Font.PLAIN, 15);
		yun_PLAIN_18 = new Font("���� ����� 230", Font.PLAIN, 18);

		
		
		
		
	}
	
	public static FontManager getInstance(){
		if(instance == null){
			instance = new FontManager();
		}
		return instance;
	}
}