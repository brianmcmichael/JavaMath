package com.brianmcmichael.JavaMath;

/**
 * @author Brian L. McMichael
 * 
 * Creates a fraction object with get and set functions for numerators and denominators. 
 * All numerators and denominators are held as double values.
 *
 */
public class Fraction {

	private double numerator;
	private double denominator;
	
	/**
	 * Creates a fraction equal to 1. Modify with setters and getters.
	 */
	public Fraction()
	{			
		this.setNumerator(1);
		this.setDenominator(1);
	}
	
	/**
	 * @param numerator The numerator of the fraction.
	 * @param denominator The denominator of the fraction.
	 */
	public Fraction(final int numerator, final int denominator)
	{
		this.setNumerator(numerator);
		this.setDenominator(denominator);		
	}
	
	/**
	 * @param numerator The numerator of the fraction.
	 * @param denominator The denominator of the fraction.
	 */
	public Fraction(final float numerator, final float denominator)
	{
		this.setNumerator(numerator);
		this.setDenominator(denominator);		
	}
	
	/**
	 * @param numerator The numerator of the fraction.
	 * @param denominator The denominator of the fraction.
	 */
	public Fraction(final long numerator, final long denominator)
	{
		this.setNumerator(numerator);
		this.setDenominator(denominator);		
	}
	
	/**
	 * @param numerator The numerator of the fraction.
	 * @param denominator The denominator of the fraction.
	 */
	public Fraction(final double numerator, final double denominator)
	{
		this.setNumerator(numerator);
		this.setDenominator(denominator);	
	}

	/**
	 * @return The numerator.
	 */
	public double getNumerator() {
		return numerator;
	}

	/**
	 * @param numerator Set the numerator of the fraction.
	 */
	public void setNumerator(final double numerator) {
		this.numerator = numerator;
	}

	/**
	 * @return The denominator.
	 */
	public double getDenominator() {
		return denominator;
	}

	/**
	 * @param denominator Sets the denominator of the fraction.
	 */
	public void setDenominator(final double denominator) {
		this.denominator = denominator;
	}
	
	/**
	 * @return Returns a double value of numerator / denominator.
	 */
	public double getValue() {
		return (numerator/denominator);
	}
	
}
