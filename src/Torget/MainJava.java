package Torget;

//public class MainJava {
//	  static void checkAge(int age)  {
//	    if (age < 18) {
//	      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
//	    }
//	    else {
//	      System.out.println("Access granted - You are old enough!");
//	    }
//	  }
//
//	  public static void main(String[] args) {
//	    checkAge(26); // Set age to 15 (which is below 18...)
//	  }
//	}

class MainJava {

	 public static void calculate()  throws ArithmeticException {
		        int num = 10 / 0;
		    }

		    public static void main(String[] args) {
		        try {
		            calculate();
		        } catch (ArithmeticException e) {
		        	
		            System.out.println("Arithmetic Exception thrown");
		            
		            System.out.println(e.getMessage());
		 
		        }
		  }
    }
