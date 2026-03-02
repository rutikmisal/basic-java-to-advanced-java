class StringBuliders
{
	public static void main(String args[])
	{
		StringBuilder sb = new StringBuilder("Rutik");
		System.out.println("Name : "+sb);
		
		//charAt index Position at 0
		System.out.println("charAt() : "+sb.charAt(0));
		
		//setCharAt index Position at 0
		sb.setCharAt(0,'M');
		System.out.println("setCharAt() : "+sb);

		//insert
		System.out.println("insert() : "+sb.insert(1,'R'));

		//delete
		System.out.println("delete() : "+sb.delete(0,1));

		//append
		StringBuilder sb1 = new StringBuilder("R");
		sb1.append("U");
		sb1.append("T");
		sb1.append("I");
		sb1.append("K");
		System.out.println("aapend() : "+sb1);

		//length
		System.out.println("length() : "+sb1.length());
	}
}