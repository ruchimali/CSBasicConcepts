import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class digitSeparation{
	static int no;

	digitSeparation(){
    
		System.out.println("Enter any number: ");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try{
			no = Integer.parseInt(input.readLine());
		} //try block end

		catch(IOException e){
			System.out.println("An exception occurred");
			e.printStackTrace();
		} //catch block end
    
	}// digitSeparation constructor end

	public static void separateDigits(){
    
		int noTemp = no , noRemainder, j,k, div;
		int lengthDigits = Integer.toString(no).length();
		div = lengthDigits;
    
		System.out.println("The separated digits of the given number are : ");
		
		for( j = 0 ; j < lengthDigits ; j++){
			int number=1;

			for( k = 0 ; k < div-1 ; k++){
				number = number*10;
			}//for k end

			noRemainder = noTemp/number;
			noTemp = noTemp%number;
			System.out.println(noRemainder);
			div = div-1;	
      
		}// for j end	

	} //separateDigits end

  public static void main(String args[]){
    
		int i;
		digitSeparation obj = new digitSeparation();
		obj.separateDigits();
    
	} //main end
  
}
