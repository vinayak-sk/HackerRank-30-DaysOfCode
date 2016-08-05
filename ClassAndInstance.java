/*
 Task 
 Write a Person class with an instance variable, age, and a constructor that takes an integer, intialAge, as a parameter.
 The constructor must assign intialAge to  after confirming the argument passed as intialAge is not negative; 
 if a negative argument is passed as intialAge, the constructor should set  to  and print "Age is not valid, setting age to 0.". 
 In addition, you must write the following instance methods:
 1: yearPasses() should increase the age instance variable by 1.
 2: amIOld() should perform the following conditional actions:
	If age<13, print "You are young.".
	If age>=13 and age<18, print "You are a teenager.".
	Otherwise, print "You are old.".
 */


public class ClassAndInstance {
    private int age;	
  
	public ClassAndInstance(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if(initialAge<0){
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        else{
            this.age = initialAge;
        }
    }
	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        String displayOutput = "";
        if(this.age < 13){
            displayOutput = "You are young.";
        }
        else if(this.age>=13 && this.age<18){
            displayOutput = "You are a teenager.";
        }
        else{
            displayOutput = "You are old.";
        }
        System.out.println(displayOutput);
	}

	public void yearPasses() {
  		// Increment this person's age.
        this.age = this.age +1;
	}
}