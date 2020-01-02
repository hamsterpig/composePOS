import javax.swing.JTextField;


public class Static_Pad {
	private static String staticTxTotal="0";
	private static String staticTxDis="0";
	private static String staticTxNeed="0";
	private static String staticTxInput="0";
	private static String staticTxStateFeild="0";
	private static String staticTxOutput="0";
	private static boolean cashPayment = false;
	
	
	public static String getStaticTxTotal() {
		return staticTxTotal;
	}
	public static String getStaticTxOutput() {
		return staticTxOutput;
	}
	public static void setStaticTxOutput(String staticTxOutput) {
		Static_Pad.staticTxOutput = staticTxOutput;
	}
	public static boolean isCashPayment() {
		return cashPayment;
	}
	public static void setCashPayment(boolean cashPayment) {
		Static_Pad.cashPayment = cashPayment;
	}
	public static void setStaticTxTotal(String staticTxTotal) {
		Static_Pad.staticTxTotal = staticTxTotal;
	}
	public static String getStaticTxDis() {
		return staticTxDis;
	}
	public static void setStaticTxDis(String staticTxDis) {
		Static_Pad.staticTxDis = staticTxDis;
	}
	public static String getStaticTxNeed() {
		return staticTxNeed;
	}
	public static void setStaticTxNeed(String staticTxNeed) {
		Static_Pad.staticTxNeed = staticTxNeed;
	}
	public static String getStaticTxInput() {
		return staticTxInput;
	}
	public static void setStaticTxInput(String staticTxInput) {
		Static_Pad.staticTxInput = staticTxInput;
	}
	public static String getStaticTxStateFeild() {
		return staticTxStateFeild;
	}
	public static void setStaticTxStateFeild(String staticTxStateFeild) {
		Static_Pad.staticTxStateFeild = staticTxStateFeild;
	}
	
	
}
