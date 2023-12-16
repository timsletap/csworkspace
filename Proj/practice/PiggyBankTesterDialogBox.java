import javax.swing.JOptionPane;

public class PiggyBankTesterDialogBox {
	public static void main(String[] args) {
	String collect;
	JOptionPane.showMessageDialog(null,"Welcome to your Piggy Bank!");
	collect = JOptionPane.showInputDialog(null, "Please input the number of pennies");
	int penniesx= Integer.parseInt(collect);
	collect = JOptionPane.showInputDialog(null, "Please input the number of nickels");
	int nickelsx = Integer.parseInt(collect);
	collect = JOptionPane.showInputDialog(null, "Please input the number of dimes");
	int dimesx = Integer.parseInt(collect);
	collect = JOptionPane.showInputDialog(null, "Please input the number of quarters");
	int quartersx = Integer.parseInt(collect);
	PiggyBank user1 = new PiggyBank(penniesx, nickelsx, dimesx, quartersx);
	JOptionPane.showMessageDialog(null,user1.toString()+"\nTotal Dollar Value: "+user1.totalDolVal());
	}

}
