import java.util.*;
import java.io.*;
import javax.swing.*;

class Data 
{	
	int id;
	double lat, lon;
	public Data(int id, double lat, double lon) 
	{
		this.id = id;
		this.lat = lat;
		this.lon = lon;
	}	
}

class Reachable
{
	public int source;
	public int dest;
	
	public Reachable(int source, int dest)
	{
		this.source = source;
		this.dest = dest;
	}
}

class GenerateAL {

	public static Map<String,Integer> reference_name = new HashMap<>();
	public static ArrayList<String> list_name = new ArrayList<String>();
	
	// Calculate distance between 2 locations
	public static int measure (double lat1, double lon1,double lat2, double lon2)
	{
		lon1 = Math.toRadians(lon1); 
        lon2 = Math.toRadians(lon2); 
        lat1 = Math.toRadians(lat1); 
        lat2 = Math.toRadians(lat2); 
  
        // Haversine formula  
        double dlon = lon2 - lon1;  
        double dlat = lat2 - lat1; 
        double a = Math.pow(Math.sin(dlat / 2),2) 
                 + Math.cos(lat1) * Math.cos(lat2) 
                 * Math.pow(Math.sin(dlon / 2),2); 
              
        double c = 2 * Math.asin(Math.sqrt(a)); 

        double r = 6371; 
		int result = (int) Math.round ((c * r)*100);
        // calculate the result 
        return result; 
	}
	
	public static void make_AL_to_file (List<Data> datas,List<Reachable> edges)
	{
		try 
		{
			FileWriter myWriter = new FileWriter("AL.txt");
			int size = edges.size();
			int s=0,d=0,i=1;
			myWriter.write(size + "\r\n");
			while (i<size){
				s = edges.get(i).source - 1;
				d = edges.get(i).dest - 1;
				myWriter.write(s + " " + d + " " + measure(datas.get(s).lat,datas.get(s).lon,
													datas.get(d).lat,datas.get(d).lon) + "\r\n");
				i++;
				}
			
			myWriter.close();
		} catch (IOException e) 
		{
			JOptionPane.showMessageDialog(null,"An error occurred.");
			e.printStackTrace();
		}
	}
	
	public static void make_list_name (List<String> names)
	{
		try 
		{
			FileWriter myWriter = new FileWriter("names.txt");
			int n =0;
			for (int i = 0;i<names.size();i++)
			{
				n=i+1;
				String s = names.get(i);
				myWriter.write(n + s +"\r\n");
				reference_name.put(s,i);
			}
			myWriter.close();
		} catch (IOException e) 
		{
			System.out.println();
			JOptionPane.showMessageDialog(null,"An error occurred.");
			e.printStackTrace();
		}
	}
	
	private static void err(int code) 
	{
		System.out.println("Error code:" +code);
		System.exit(code);
	}
	public static void Generate_Data ()
	{
		int id = 0,s=0,d=0;
		double lat = 0 ,lon = 0;
		ArrayList<Data> datas = new ArrayList<Data>();
		ArrayList<Reachable> edges = new ArrayList<Reachable>();
		try{
			Scanner sc = new Scanner(new File("location.txt"), "UTF-8");
		
			while (sc.hasNext()) {
				if (sc.hasNextInt())
					id = sc.nextInt();
				else {System.out.println(id);err(2);}
				if (sc.hasNextDouble())
					lat = sc.nextDouble();
				else {System.out.println(lat);err(3);}
				if (sc.hasNextDouble())
					lon = sc.nextDouble();
				else {System.out.println(lon);err(4);}
				if (sc.hasNext())
					list_name.add(new String(sc.nextLine()));
				else {System.out.println(lon);err(5);}
				
				
				datas.add(new Data(id,lat,lon));
			}	
			
			
			Scanner sc1 = new Scanner(new File("path.txt"));
		
			while (sc1.hasNext()) {
				if (sc1.hasNextInt())
					s = sc1.nextInt();
				else {System.out.println(s);err(6);}
				if (sc1.hasNextInt())
					d = sc1.nextInt();
				else {System.out.println(d);err(7);}
				
				edges.add(new Reachable(s,d));
				edges.add(new Reachable(d,s));
			}
			
		}catch(Exception e){System.out.println(e);}
		
		make_AL_to_file (datas, edges);
		make_list_name (list_name);
	}
}