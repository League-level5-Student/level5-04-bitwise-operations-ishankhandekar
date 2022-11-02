package _03_Printing_Binary;

public class _01_BinaryPrinter {
    /*
     * Complete the methods below so they print the passed in parameter in binary.
     * Do not use the Integer.toBinaryString method!
     * Use the main method to test your methods.
     */


    public static void printByteBinary(byte b) {
        // We first want to print the bit in the one's place
    	for (int i = 7; i >= 0; i--) {
    	byte temp = b;
    		temp = (byte) (b >> i);
            // Use the & operator to "mask" the bit in the one's place
            // This can be done by "anding" (&) it with the value of 1
        	temp = (byte) (temp & 1);
        	System.out.print(temp);
        	
		}
        // Shift b seven bits to the right
    	
        // Print the result using System.out.print (NOT System.out.println)
    	
        //Use this method to print the remaining 7 bits of b
    }

    public static void printShortBinary(short s) {
        // Create 2 byte variables
    	byte b1;
    	byte b2;
        // Use bit shifting and masking (&) to save the first
        // 8 bits of s in one byte, and the second 8 bits of
        // s in the other byte
    	b2 = (byte)s;
    	b1 = (byte)(s >> 8);
        // Call printByteBinary twice using the two bytes
        // Make sure they are in the correct order
    	printByteBinary(b1);
    	printByteBinary(b2);
    }

    public static void printIntBinary(int i) {
        // Create 2 short variables
    	short s1;
    	short s2;
        // Use bit shifting and masking (&) to save the first
        // 16 bits of i in one short, and the second 16 bits of
        // i in the other short
    	s2 = (short)i;
    	s1 = (short)(i >> 16);
        // Call printShortBinary twice using the two short variables
        // Make sure they are in the correct order
    	printShortBinary(s1);
    	printShortBinary(s2);
    }

    public static void printLongBinary(long l) {
        // Use the same method as before to complete this method
    	int i1;
    	int i2;
    	
    	i2 = (int)l;
    	i1 = (int)(l >> 32);
    	
    	printIntBinary(i1);
    	printIntBinary(i2);
    }

    public static void main(String[] args) {
        // Test your methods here
    	System.out.println("byte");
    	printByteBinary((byte)17);
    	System.out.println("short");
    	printShortBinary((short)1567);
    	System.out.println("int");
    	printIntBinary((int)123434523);
    	System.out.println("long");
    	printLongBinary((long)234234253);
    }
}
