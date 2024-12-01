package org.tnsif.capgemini.c2tc.wrapperclass;

public class AutoBoxing_UnBoxing {

	public static void main(String[] args) {
		
		// autoboxing: primitive datatype to wrapper class
		byte primitivebyte = 1;
		Byte wrapperbyte = primitivebyte;
		System.out.println("Auboxing "+wrapperbyte);
		
		// unboxing : wrapper class to primitve datatype
		byte unboxedbyte = wrapperbyte;
		System.out.println("Unboxed "+unboxedbyte);
		
		//autoboxing
		short primitiveshort = 2;
		Short wrappershort = primitiveshort;
		System.out.println("Autoboxing "+wrappershort);
		
		//unboxing
		short unboxedshort = wrappershort;
		System.out.println("Unboxed "+unboxedshort);
		
		int primitiveInt = 3;
		Integer wrapperInt = primitiveInt;
		System.out.println("Autoboxed Integer: "+wrapperInt);
		
		int unboxedInt = wrapperInt; //unboxing
		System.out.println("Unboxed int: "+unboxedInt);
		
		long primitiveLong = 4L;
		long wrapperLong = primitiveLong; //Autoboxing
		System.out.println("Autoboxed long: "+wrapperLong);
		
		long unboxedLong = wrapperLong; //Unboxing
		System.out.println("Unboxed long: "+unboxedLong);
		
		float primitiveFloat = 5.5f;
		Float wrapperFloat = primitiveFloat; //Autoboxing
		System.out.println("Autoboxed float: "+wrapperFloat);
		
		float unboxedFloat = wrapperFloat; //unboxing
		System.out.println("Unboxed float: "+unboxedFloat);
		
		double primitiveDouble = 6.6d;
		Double wrapperDouble = primitiveDouble; //Autoboxing
		System.out.println("Autoboxed double: "+wrapperDouble);
		
		double unboxedDouble = wrapperDouble; //Unboxing
		System.out.println("Unboxed double: "+unboxedDouble);
		
		char primitiveChar = 'a';
		Character wrapperChar = primitiveChar; //Autoboxing
		System.out.println("Autoboxed character: "+wrapperChar);
		
		char unboxedChar = wrapperChar;
		System.out.println("Unboxed char: "+unboxedChar);
		
		boolean primitiveBoolean = true;
		Boolean wrapperBoolean = primitiveBoolean; //AutBoxing
		System.out.println("Autoboxed boolean: "+wrapperBoolean);
		
		boolean unboxedBoolean = wrapperBoolean;
		System.out.println("Unboxed boolean: "+unboxedBoolean);

	}

}
