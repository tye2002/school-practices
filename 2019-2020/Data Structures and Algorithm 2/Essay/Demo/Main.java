import java.util.*;
import javax.swing.*;
import java.awt.*;


public class Main {
	
	public static int id;
	public static JFrame f = new JFrame("Path");
		
	public static int Test (String address)
	{
		Scanner sc = new Scanner(System.in);
		GenerateAL a = new GenerateAL();
		FindandSuggest b = new FindandSuggest();
				
		if (b.Find(address, a.list_name) == 0){
			id = a.reference_name.get(address);	
			return id;
		}
		else if (b.Suggest(address, a.list_name) == 0){
			String addr1= JOptionPane.showInputDialog("Enter the correct address with a space in front of the address: ");
			Test(addr1);
		}
		else {
			String addr2= JOptionPane.showInputDialog("Can't find this address. Enter another address: ");
			Test(addr2);
		}
		return 0;	
	}

	public static void Main (){
		Dijkstra a = new Dijkstra();
		String start = JOptionPane.showInputDialog("Go From: ");
		Test(start);
		int source = id;
		String end= JOptionPane.showInputDialog("To: ");
		Test(end);				
		int dest = id;
		
		a.Graph_from_File(source,dest);
	}
	
	private static void display_Path() {
       
		Dijkstra a = new Dijkstra ();
        
        f.add(new JList(a.path.toArray()));
		f.setSize(600, 400);
		f.setBounds(100, 30, 600, 300);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
	
	public static void ShowMap(){
        JFrame window=new JFrame("Map");  
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		window.setUndecorated(true);
		window.getContentPane().add(new MyCanvas());
		window.setVisible(true);
	}
	public static void main(String[] args)
	{
		GenerateAL a = new GenerateAL();
		a.Generate_Data();
		ShowMap();
		Main();
		display_Path();
	}
}