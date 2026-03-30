import java.util.HashSet;
class HashSet_ex
{
	public static void main(String args[])
	{
		HashSet<Integer> set = new HashSet<>();
		
		//insert
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1); // HashSet is Not stored the same value 
		
		//print
		System.out.println(set);
		
		//Size of set
		System.out.println("Size Of Set : "+set.size());


		//Search
		if(set.contains(1))
		{
			System.out.println("set contains 1");
		}else{
			System.out.println("Does not contains 1");
		}

		//remove ele
		set.remove(2);
		System.out.println(set);

		
	}
}