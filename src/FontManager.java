import java.awt.Font;

public class FontManager{
	
	private static FontManager instance = null;

	public Font nanum_BOLD_13, nanum_BOLD_15, nanum_BOLD_18;
	public Font nanum_PLAIN_13, nanum_PLAIN_15, nanum_PLAIN_18;
	public Font latter_BOLD_13, latter_BOLD_15, latter_BOLD_18;

	
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
		
		
	}
	
	public static FontManager getInstance(){
		if(instance == null){
			instance = new FontManager();
		}
		return instance;
	}
}