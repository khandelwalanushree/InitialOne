class Prime{  
 		public static void main(String args[])	
		{  
  			int i,num=0,flag=0;    
  			int n=2;//I've changed the num that is to be checked  
  			num=n/2; 
   
  			for(i=2;i<=num;i++)
			{    
   				if(n%i==0)
				{    
   					System.out.println("Number is not prime");    
   					flag=1;    
   					break;    
   				}    
  			}    
  			if(flag==0)    
  			System.out.println("Number is prime");    
		}  
}  

//Indented the file
//changed m to num