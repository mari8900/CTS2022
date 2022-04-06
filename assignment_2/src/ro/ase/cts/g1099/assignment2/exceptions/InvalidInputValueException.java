package ro.ase.cts.g1099.assignment2.exceptions;

public class InvalidInputValueException extends RuntimeException {
	String msg;
	
	public InvalidInputValueException(String msg) {
		this.msg = msg;
	}
}
