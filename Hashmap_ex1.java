import java.util.HashMap;
class Hashmap_ex1
{
	public static void main(String args[])
	{
		HashMap<String,Integer> map = new HashMap<>();
	
		// Insert 

		map.put("Petrol",120);
		map.put("Disel",105);
		map.put("cng",70);

		System.out.println(map);

		// Update for Cng price

		map.put("cng",50);
		System.out.println(map);

		//Searching for key 

		if(map.containsKey("Petrol"))
		{	
			System.out.println("Key is present in the Map");
		}
		else
		{
			System.out.println("Key is not present in the Map");
		}

		//Another method for searching

		System.out.println(map.get("Petrol")); //key is exits in this map
		System.out.println(map.get("Rockel")); //key is not exits in this map
	}
}