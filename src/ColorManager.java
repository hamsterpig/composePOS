import java.awt.Color;

public class ColorManager {
	private static ColorManager instance = null;
	
	public Color redBg, redBtn, redLine;
	public Color greenBg, greenBtn, greenLine;
	public Color blueBg, blueBtn, blueLine;
	public Color yellowBg, yellowBtn, yellowLine;
	
	
	private ColorManager(){
		
		redBg = new Color(255,190,190);
		redBtn = new Color(255,205,205);
		redLine = new Color(255,140,160);
		
		greenBg = new Color(190,255,190);
		greenBtn = new Color(205,255,205);
		greenLine = new Color(140,255,160); // Theme Green
		
		blueBg = new Color(190,190,255);
		blueBtn = new Color(205,205,255);
		blueLine = new Color(140,160,255); // Theme blue
		
		yellowBg = new Color(255,255,183);
		yellowBtn = new Color(255,255,205);
		yellowLine = new Color(255,255,130); // Theme yellow
		
		
	}
	
	public static ColorManager getInstance(){
		if(instance == null){
			instance = new ColorManager();
		}
		return instance;
	}
}
