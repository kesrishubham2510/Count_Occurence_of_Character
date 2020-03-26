import java.util.HashMap;
import java.util.Map;

public class Counttt {

	private String string;
	
    Map<Character,Integer> Key_Count = new HashMap<Character,Integer>();
	
	Counttt(String inp_String)
	  {
		  this.string= inp_String;
		  initialise_Map();
	      Update_Map();
	      print_Map();
	  }
	  
	 private void initialise_Map()
	 {
		 int ind;
		 
		 for(ind=0;ind<string.length();ind++)
		 {
			 if(string.charAt(ind)==' ')
				 continue;
			 
			  Key_Count.put(string.charAt(ind),0);
		 }
	 }

    private void Update_Map()
    {
    	int ind;
    	char curr_char;
    	for(ind=0;ind<string.length();ind++)
    	{
    		curr_char = string.charAt(ind);
    		
    		if(Key_Count.containsKey(curr_char))
    		  {
    			  int new_Value,old_Value;
    			  
    			  old_Value=Key_Count.get(curr_char);
                     new_Value = old_Value+1;
                     Key_Count.put(curr_char,new_Value);
       		  }
    	}
    	
    	//Note:- This countting is case sensitive//
    }
    
    
    private void print_Map()
    {
          for(int i=0;i<string.length();i++)
          {
        	  if(string.charAt(i)==' ')
        	  {
        		  System.out.println();
        		  System.out.println();
        		  continue;
        	  }
 			
        	  System.out.println(string.charAt(i)+ " "+Key_Count.get(string.charAt(i)));
          }
    }
}

