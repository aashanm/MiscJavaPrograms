public class Roman
{
    public static void main (String args[])
    {
	new Roman ();
    }


    public Roman ()
    {
	    int I = 1;
	    int V = 5;
	    int X = 10;
	    int L = 50;
	    int C = 100;
	    int D = 500;
	    int M = 1000;

	    char n1[] = {'I', 'I'};
	     for (int i = 0 ; i < n1.length ; i++)
	     {
		System.out.print ( n1[i] + " ");
	     }
	     System.out.println (I + I );  
	     
	    char n2[] = {'I', 'X'}; //9
	    for (int i = 0 ; i < n2.length ; i++)
	     {
		System.out.print ( n2[i] + " ");
	     }
	     System.out.println (X - I);
  

	    char n3[] = {'V', 'I', 'I'}; //7
	    for (int i = 0 ; i < n3.length ; i++)
	     {
		System.out.print ( n3[i] + " ");
	     }
	     System.out.println (V + I + I);
	    

	    char n4[] = {'C', 'X', 'I', 'I', 'I'}; //113
	      for (int i = 0 ; i < n4.length ; i++)
	     {
		System.out.print ( n4[i] + " ");
	     }
	    System.out.println (C + I + I + I + X);
	    
	    char n5[] = {'L', 'I', 'V'}; //54
	      for (int i = 0 ; i < n5.length ; i++)
	     {
		System.out.print ( n5[i] + " ");
	     }
	    System.out.println (L - I + V);
	    
	    char n6[] = {'X', 'X', 'X', 'V', 'I', 'I', 'I'}; //38
	      for (int i = 0 ; i < n6.length ; i++)
	     {
		System.out.print ( n6[i] + " ");
	     }
	    System.out.println (X + X + X + V + I + I + I);
	    
	    char n7[] = {'X', 'C', 'I', 'X'}; //99
	      for (int i = 0 ; i < n7.length ; i++)
	     {
		System.out.print ( n7[i] + " ");
	     }
	    System.out.println (C - I + X - X);
	    
	    char n8[] = {'D', 'C', 'L', 'X', 'X', 'V', 'I', 'I', 'I' }; //678
	      for (int i = 0 ; i < n8.length ; i++)
	     {
		System.out.print ( n8[i] + " ");
	     }
	    System.out.println (D + C + L + X + X + V + I + I + I);
}
}
