import java.util.*;
class Iteration_Hashmap
{
	public static void main(String args[])
	{
		HashMap<String,Integer> map = new HashMap<>();

		map.put("Petrol",120);
		map.put("Disel",105);
		map.put("cng",70);

		System.out.println(map);


		int arr[] = {1,2,3};

		// regular For loop 

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();


		//for loop another step are used
		for(int val : arr)
		{
			System.out.println(val+" ");
		}
		System.out.println();


		// for loop are used to HashMap using
		for(Map.Entry<String,Integer> e : map.entrySet())
		{	
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

		//for loop are used to Set using
		Set<String> keys = map.keySet();
		for(String key : keys)
		{
			System.out.println("\n"+key+" "+map.get(key));
		}
	}
}