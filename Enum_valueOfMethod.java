enum Parts{  
  
Skin, Muscles,Bones,Organs,Tissue;  
  
}  
public class Enum_valueOfMethod {
	public static void main(String[] args) {  
		  
		System.out.println("The part which is exposed to the environment is :");  
		  
		for(Parts part : Parts.values()){  
		  
		int i = part.ordinal()+1;  
		  
		System.out.println(i+" "+part);  
		  
		        }  
		  
		      Parts part = Parts.valueOf("Muscles");  
		  
		System.out.println("\nAns: "+part);  
		  
		       }
}
