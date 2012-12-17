package belajar.swing.container;
import javax.swing.JFrame;
public class BelajarFrame {
	public static void main (String[] xx){
		//buat object fr bertype JFrame
		JFrame fr = new JFrame();
		//title frame
		fr.setTitle("Belajar Frame");
		//size
		fr.setSize(800,600);
		fr.setLocationRelevationTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setting ga ada tombol
		//fr.setUndecorated(true);
		
		JDialog jd = new JDialog(fr);
		jd.setSize(200,200);
		jd.setLocationRelevationTo(fr);
		jd.setTitle("Dialog Box");
		jd.SetModal(false);
		fr.setResizeable(false);
		fr.setVisible(true);
	}
}