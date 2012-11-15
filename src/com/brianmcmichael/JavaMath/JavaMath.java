package com.brianmcmichael.JavaMath;

import java.util.ArrayList;

/**
 * @author Brian L. McMichael <brian@brianmcmichael.com>
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
	 * Euclid's algorithm
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
	 * Euclid's algorithm
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
	
	///////////////////////////////////////////////
	//         Generate List of Primes           //   
	///////////////////////////////////////////////
	
	/**
	 * This method generates the list of prime numbers through the inputed number.
	 * @param highestNumber The highest number from which to return a list of primes. 
	 * @return An ArrayList object containing all Primes through the entered number.
	 */
	public static ArrayList<Integer> listAllPrimesThrough(final int highestNumber)
	{
		ArrayList<Integer> numList = new ArrayList<Integer>();		
		
		if(highestNumber>1)
		{
			numList.add(2);
			if (highestNumber > 2)
			{
				for(int i = 3; i <= highestNumber; i = i+2) 	
				{		
					numList.add(i);
				}	
			} else { return numList; }
					
		} else { return numList; }
		
		
		double upperThreshold = Math.floor(Math.sqrt(highestNumber));
		
		for(int j = 0; j <= upperThreshold; j++) 	{
			int prime = numList.get(j);
			for(int k = j+1; k < numList.size(); k++)			{
				if ((numList.get(k) % prime) == 0)				{
					numList.remove(k);
				}
			}			
		}
		return numList;
	}
	
	
	///////////////////////////////////////////////
	//      Generate List of Prime Factors       //   
	///////////////////////////////////////////////
	
	/**
	 * Method returns the prime factors of a given number.
	 * @param numberToFactor The number to check factors. 
	 * @return An ArrayList object containing prime factors.
	 */
	public static ArrayList<Integer> listAllPrimeFactorsOf(final int numberToFactor)
	{
		ArrayList<Integer> listA = listAllPrimesThrough(((int)Math.floor(numberToFactor/2)));
		ArrayList<Integer> listB = new ArrayList<Integer>();
		int thisFactor = numberToFactor;
		
		for (int i = 0; i < listA.size(); i++)
		{
			int prime = listA.get(i);
			if (thisFactor % prime == 0)
			{
				thisFactor = thisFactor/prime;
				listB.add(prime);
			}			
		}
		return listB;
	}
	
	///////////////////////////////////////////////
	//             Strict Modulo                 //   
	///////////////////////////////////////////////
	
	/**
	 * Congruence relation.
	 * numberOne (is congruent to) [return] (mod numberTwo)
	 * 
	 * @param numberOne 
	 * @param numberTwo 
	 * @return 
	 */
	public static int strictModulo(final int numberOne, final int numberTwo)
	{
		int newModulo = (numberOne % numberTwo);
		if (newModulo < 0)
		{
			return newModulo + numberTwo;
		}
		else
		{
			return newModulo;			
		}		
	}
	
	
	///////////////////////////////////////////////
	//             Add Clock Times               //   
	///////////////////////////////////////////////
	
	/**
	 * Allows for simple adding of clock times and returns the new time in integer hours and minutes.
	 * @param startHours The hours on the first clock.
	 * @param startMinutes The minutes on the first clock.
	 * @param addHours The number of hours to add.
	 * @param addMinutes The number of minutes to add to the clock.
	 * @return Returns a two item int[] array containing the new time in hours and minutes.
	 */
	public static int[] addClocksSimple(int startHours, int startMinutes, int addHours, int addMinutes)
	{
		int newMinutes = strictModulo((startMinutes + addMinutes), 60);
		int newAddHours = addHours + (((startMinutes + addMinutes) - newMinutes) / 60);
		int newHours = (1 + strictModulo((startHours + newAddHours - 1), 12));
		int[] clock  = { newHours, newMinutes };
		return clock;
	}
}

