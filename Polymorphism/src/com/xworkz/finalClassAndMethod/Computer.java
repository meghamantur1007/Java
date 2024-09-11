//Final Method: A method declared as final cannot be overridden by subclasses, ensuring that the method's behavior remains consistent and unmodified.
package com.xworkz.finalClassAndMethod;

public class Computer {
	    // Final method
	    final void displayType() {
	        System.out.println("This is a computer.");
	    }

	    void showSpecs() {
	        System.out.println("Basic computer specs.");
	    }
	}

