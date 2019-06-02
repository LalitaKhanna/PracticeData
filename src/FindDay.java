
public class FindDay{
	int n= 7;
	String[] Day = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday","sunday"};
    int size=Day.length;
	void findDay(int num)
	{
		 int i=num%n;
		 i= i-1;;
	        System.out.println(i);
	        System.out.println("After '" +num +"' days the day would be '"+Day[i]+"'");
				
	}
	void findDay(int index, int num)
	{
		 int i=num%n;
	     i+=index;
	     System.out.println(i);
	     if(i<=n)
	     System.out.println("After '" +num +"' days the day would be '"+Day[i-1]+"'");
	     else
	     {
	    	 i=i-7;
	    	 System.out.println("After '" +num +"' days the day would be '"+Day[i]+"'");
	     }
	}
	
	//Monday or Tuesday After 176 days ?
	public static void main(String []args){
		FindDay obj = new FindDay();
	       obj.findDay(50);
	      obj.findDay(6,51);
		
}
	
}