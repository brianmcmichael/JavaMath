/**
 * @author Brian L. McMichael
 * 
 * JavaMath is a library of static mathematical methods.
 * 
 */
public class JavaMath {
	
	///////////////////////////////////////////////
	//            Absolute Values                //   
	///////////////////////////////////////////////
	
	/**
	 * @param numberToAbs Integer to convert to absolute value.
	 * @return Integer as absolute value.
	 */
	public static int absolute(final int numberToAbs)
	{
		int absoluteValue = (numberToAbs >= 0) ? numberToAbs : -numberToAbs;
		return absoluteValue;
	}
	
	/**
	 * @param numberToAbs Float to convert to absolute value.
	 * @return Float as absolute value.
	 */
	public static float absolute(final float numberToAbs)
	{
		float absoluteValue = (numberToAbs >= 0) ? numberToAbs : -numberToAbs;
		return absoluteValue;
	}
	
	/**
	 * @param numberToAbs Byte to convert to absolute value.
	 * @return Byte as absolute value.
	 */
	public static byte absolute(final byte numberToAbs)
	{
		byte convertedByte;
		int byteFlip = (int)numberToAbs;
		int absoluteValue = (byteFlip >= 0) ? numberToAbs : -numberToAbs;
		convertedByte = (byte)absoluteValue;
		return convertedByte;
	}
	
	/**
	 * @param numberToAbs Short to convert to absolute value.
	 * @return Short as absolute value.
	 */
	public static short absolute(final short numberToAbs)
	{
		short convertedShort;
		int byteFlip = (int)numberToAbs;
		int absoluteValue = (byteFlip >= 0) ? numberToAbs : -numberToAbs;
		convertedShort = (short)absoluteValue;
		return convertedShort;
	}
	
	/**
	 * @param numberToAbs Long to convert to absolute value.
	 * @return Long as absolute value.
	 */
	public static long absolute(final long numberToAbs)
	{
		long absoluteValue = (numberToAbs >= 0) ? numberToAbs : -numberToAbs;
		return absoluteValue;
	}
	
	/**
	 * @param numberToAbs Double to convert to absolute value.
	 * @return Double as absolute value.
	 */
	public static double absolute(final double numberToAbs)
	{
		double absoluteValue = (numberToAbs >= 0) ? numberToAbs : -numberToAbs;
		return absoluteValue;
	}
	
	///////////////////////////////////////////////
	//                Rounding                   //   
	///////////////////////////////////////////////
	
	/**
	 * @param numberToRound Float value of number to be rounded.
	 * @return Return a rounded float value. 
	 */
	public static float round(final float numberToRound)
	{
		float floorNumber = (float)Math.floor(numberToRound);
		float ceilingNumber = (float)Math.ceil(numberToRound);
		if ((numberToRound - floorNumber) > (ceilingNumber - numberToRound)) {return ceilingNumber;}
		else if ((ceilingNumber - numberToRound) > (numberToRound - floorNumber)) {return floorNumber;}
		else { return ceilingNumber; }			
	}
		
	/**
	 * @param numberToRound Double value of number to be rounded.
	 * @return Return a rounded double value.
	 */
	public static double round(final double numberToRound)
	{
		double floorNumber = Math.floor(numberToRound);
		double ceilingNumber = Math.ceil(numberToRound);
		if ((numberToRound - floorNumber) > (ceilingNumber - numberToRound)) {return ceilingNumber;}
		else if ((ceilingNumber - numberToRound) > (numberToRound - floorNumber)) {return floorNumber;}
		else { return ceilingNumber; }			
	}
	
	///////////////////////////////////////////////
	//             Adding Fractions              //   
	///////////////////////////////////////////////	
	
	/**
	 * @param fractionOne The first Fraction object to be added.
	 * @param fractionTwo The second Fraction object to be added.
	 * @return Returns the sum of two fractions.
	 */
	public static Fraction addFractions(final Fraction fractionOne, final Fraction fractionTwo)
	{
		double numeratorOne = fractionOne.getNumerator();
		double denominatorOne = fractionOne.getDenominator();
		double numeratorTwo = fractionTwo.getNumerator();
		double denominatorTwo = fractionTwo.getDenominator();
		if (denominatorOne == denominatorTwo)
		{
			Fraction addedFraction = new Fraction((numeratorOne + numeratorTwo), denominatorOne);
			return addedFraction;
		}
		else
		{
			double numberA = (numeratorOne * denominatorTwo);
			double numberB = (numeratorTwo * denominatorOne);
			double numberC = (numberA + numberB);
			double numberD = (denominatorOne * denominatorTwo);
			double GCD = greatestCommonDevisor(numberC, numberD);
			double newNumerator = numberC / GCD;
			double newDenominator = numberD / GCD;			
			return new Fraction(newNumerator, newDenominator);			
		}		
	}
	
	/**
	 * Method allows for addition of simple fractions by int value and returns an int array of the resulting fraction.
	 * 
	 * @param numeratorOne The integer numerator of the first fraction.
	 * @param denominatorOne The integer denominator of the first fraction.
	 * @param numeratorTwo The integer numerator of the second fraction.
	 * @param denominatorTwo The integer denominator of the second fraction.
	 * @return Returns a two item int array where position [0] is the numerator and [1] is the denominator. 
	 */
	public static int[] addFractions(final int numeratorOne, final int denominatorOne, final int numeratorTwo, final int denominatorTwo)
	{
		if (denominatorOne == denominatorTwo)
		{
			int[] addedFraction = new int[]{ (numeratorOne + numeratorTwo), denominatorOne };
			return addedFraction;
		}
		else
		{
			int numberA = (numeratorOne * denominatorTwo);
			int numberB = (numeratorTwo * denominatorOne);
			int numberC = (numberA + numberB);
			int numberD = (denominatorOne * denominatorTwo);
			int GCD = greatestCommonDevisor(numberC, numberD);
			int newNumerator = numberC / GCD;
			int newDenominator = numberD / GCD;	
			int[] newFraction = new int[]{ newNumerator, newDenominator };
			return newFraction;				
		}		
	}
	
	///////////////////////////////////////////////
	//         Greatest Common Divisor           //   
	///////////////////////////////////////////////
	
	/**
	 * Determines the highest common factor as int of two integers.
	 * 
	 * @param first The first number (int).
	 * @param second The second number (int).
	 * @return Returns an int of the highest common factor.
	 */
	public static int greatestCommonDevisor(final int first, final int second)
	{
		int remainder = first % second;
		if (remainder == 0) { return second; }
		else { return greatestCommonDevisor(second, remainder); }
	}
	
	/**
	 * Determines the highest common factor as a double of two double values.
	 * 
	 * @param first The first number (double).
	 * @param second The second number (double).
	 * @return Returns an double of the highest common factor.
	 */
	public static double greatestCommonDevisor(final double first, final double second)
	{
		double remainder = (first % second);
		if (remainder == 0) { return second; }
		else { return greatestCommonDevisor(second, remainder); }
	}
	
}
