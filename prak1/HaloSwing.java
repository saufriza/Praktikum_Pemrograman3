package belajar.swing;

public class HaloSwing {
	public static void main (String [] xx){
	
		JFrame fr = new JFrame();
		fr.setTitle(":: Halo Swing ::");
		
		JLabel lb = new JLabel("Halo Swing");
		fr.getContentPane().add(lb);
		
		fr.setSize(300,300);
		fr.setVisible(true);
	}
}