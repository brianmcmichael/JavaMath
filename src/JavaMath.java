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
	
}
