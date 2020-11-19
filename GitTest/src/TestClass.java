import java.util.*;
public class TestClass {
	
	//Function to display the array
	public void dispalyNames(String names[]){
		//Modified to Advanced for loop
		for(String nm:names){
			System.out.println("names to be displayed");

			System.out.println("names displayed")

			System.out.println("names is"+nm);

		}
	}
	
	//Function to add string at the end of the array
	public String[] addlast(String Names[], String name){
		int size = Names.length;
		String newNames[] = new String[size + 1];
		for(int i =0; i< (size); i++){
			newNames[i] = Names[i];
		}
		newNames[size] = name;
		
		return newNames	;
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String []names={"name1","name2","name3","name4","name5"};
		System.out.println("Enter the string to be appended at last : ");
		String name = sc.next();
		
		//to add string
		names = addlast(names, name)
			
		//to print the array
		dispalyNames(names)
	}
	
	
	

}
