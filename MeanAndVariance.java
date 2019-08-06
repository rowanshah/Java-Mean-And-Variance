package assignment0;
import java.util.*; // needed for the Scanner class in the enhanced version

public class MeanAndVariance {
		private double[] data; //can initialize array this way(doesn't need to be defined) - its just a name not a space
		
		public double mean() { //public - all methods can access this method, no restrictions
			double sum = 0.0; //creates an address  
			for (int i = 0; i < data.length; i++) {
				sum+= data[i];
			}
			double mean = 0.0;
			mean = sum/data.length;
			return mean;
			// method implementation here
		}

		public double variance() {
			double sum = 0;
			for(int i = 0;i < data.length;i++){
			sum += (data[i] -mean()) * (data[i] -mean());
			}
			return (sum /data.length);
			

			// method implementation here
		}

		public double[] getData() { 
			return data;
		}
		// array called new data + void - no value returned
		public void setData(double[] newData) { 
			data = newData;
		}
		//method to convert all values to string so convenient to print out 
		public String toString() { 
			int arraylength = data.length;
			return  Integer.toString(arraylength);
			// method implementation here
		}
		// constructor, called indirectly via new
		public MeanAndVariance(double[] myData) { 
			data = myData;
		}
		 // constructor with no data, also called indirectly via new 
		public MeanAndVariance() {
			data = null;
		} //used for security reasons - automatically created by eclipse anyway 

		private static int getNumOfData(Scanner input) {
			System.out.printf("Enter the number of arguments you wish to calculate:\n");
			int ndata;
			// loop until we get it correctly
			while (true) { 
				ndata = input.nextInt();
				if (ndata < 2) {
					System.out.printf("the number of data should be greater than or equal to two !\n");
					System.out.printf("Enter the number of arguments:\n");
					continue; // continue looping
				}
				// we got it correctly, so break out of the loop
				break; 
			}
			return ndata;
		}

		public void getDataSet(Scanner input) {
			int ndata = getNumOfData(input);
			// we create the array instance variable
			data = new double[ndata]; 

			// here you should write code that gets exactly ndata numbers
			for (int i = 0; i < ndata; i++) {
				System.out.printf("Please enter the "+(i+1)+"." +" number below:\n");
				data[i]= input.nextDouble();
			}
				System.out.printf("Numbers stored successfully!\n");
				System.out.printf("The data inputted is:\n");
				for (int z = 0; z < ndata; z++) {
				System.out.println(data[z]);
				}	
			}
			
			// from the standard input and initialises the array elements
			// you will need a while (true) loop as above
			// and you should use the S
		
		public static void main(String[] args) {
			// create first new Scanner object instance  that reads the standard input 
			Scanner input = new Scanner(System.in);
			//create new MeanAndVariance object instance 
			MeanAndVariance mv = new MeanAndVariance();
			mv.getDataSet(input); //get data
			System.out.println("The mean and variance of the following numbers are:\n");
			System.out.printf("Numbers: %s\n", mv.toString());
			System.out.printf("Mean: %f Variance: %f \n", mv.mean(), mv.variance());
			System.out.println("\n");
		}
}
