import java.util.*;
import javax.swing.*;
import java.awt.*;

class FindandSuggest {
	
	GenerateAL a = new GenerateAL();
	public static ArrayList<String> suggest = new ArrayList<String>();
	public static JFrame f1 = new JFrame("Suggest");
	
	public static int Find (String input_name, ArrayList<String> list_name){
		int flag_F = 1;
		for (int i=0; i<list_name.size();i++){
			if ((input_name.equals(list_name.get(i)) == true))
				flag_F = 0;
		}
		return flag_F;
	}
	
	public static int Suggest(String input_name, ArrayList<String> list_name){
		int flag_S = 1;
		System.out.println();
		JOptionPane.showMessageDialog(null, "Did you mean one of these addresses: ");
        
		for (int i=0; i<list_name.size();i++){
			if ((list_name.get(i).contains(input_name)) == true){
				suggest.add(list_name.get(i));
				flag_S = 0;
			}
		}
		display_Suggest();
		
		return flag_S;
	}
	
	private static void display_Suggest() {  
        f1.add(new JList(suggest.toArray()));
		f1.setSize(400, 400);
		f1.setBounds(100, 30, 600, 300);
        f1.pack();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f1.setLocationRelativeTo(null);
        f1.setVisible(true);
		
    }
}