import java.util.Hashtable;
import java.util.Map;

public class HashTable {
	public static void main(String args[]){
	
			Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
			ht.put(1,"keerthi");
			ht.put(2,"Vidya");
			ht.put(3,"Jessy");
			System.out.println("Size of hash table = "+ht.size());
			for(Map.Entry m:ht.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());
			}
			}
			
		}