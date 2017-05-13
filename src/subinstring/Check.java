package subinstring;

public class Check {

    public static void main(String[] args) {

	String name = "socrates";
	String value1 = "soc";
	String value2 = "rate";
	String value3 = "plato";

	// The name contains this value.
	if (name.contains(value1)) {
	    System.out.println(value1+" "+"is present in string");
	}

	// The name also contains this value.
	if (name.contains(value2)) {
	    System.out.println(value2+" "+" is present in string");
	}

	// The name does not contain this value.
	if (!name.contains(value3)) {
	    System.out.println(value3+" "+" is not present in string " );
	}
    }
}