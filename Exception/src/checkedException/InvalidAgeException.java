package checkedException;

public class InvalidAgeException extends RuntimeException 
{
 public String toString() {
	 return "Age Cannot be negative or must be between 18 to 40";
 }
}
