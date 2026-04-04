import java.util.ArrayList;
import java.util.Collections;
class ArrayList_ex
{
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>();
			
		// add element
		al.add(0);
		al.add(4);
		al.add(2);
		System.out.println("ArrayList : "+al);

		//get ele
		int ele = al.get(0);    //al.get(index Position)
		System.out.println("Get Function : "+ele);

		//add ele in between 
		al.add(1,9);
		System.out.println("Add Element in Between : "+al);

		//Size of ArrayList
		int size = al.size();
		System.out.println("Size of ArrayList : "+size);

		// Remove element
		al.remove(2);
		System.out.println("Remove element"+al);

		//LOOP
		for(int i=0;i<size-1;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println();

		//Sort element
		Collections.sort(al);
		System.out.println("Sort element : "+al);
	}
	
}