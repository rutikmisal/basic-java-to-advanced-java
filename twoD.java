class twoD
{
public static void main(String args[])
{
	int days[][]=new int[4][7];
	int i,j,k=0;
	System.out.println("		  ******FEBRUARY*****");
	System.out.println("\tSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");

	for(i=0;i<4;i++)
	{
		for(j=0;j<7;j++)
		{
			k++;
			days[i][j]=k;
			System.out.print("\t"+days[i][j]);
		}
		System.out.println();
	}
}
}