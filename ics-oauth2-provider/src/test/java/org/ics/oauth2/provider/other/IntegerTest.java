package org.ics.oauth2.provider.other;

public class IntegerTest {
	public static void main(String[] args) {
		
		Integer i=127;
		Integer j=127;
		System.out.println(i==j);
		
		i=128;
		j=128;
		System.out.println(i==j);
		
		i=-128;
		j=-128;
		System.out.println(i==j);
		
		i=-129;
		j=-129;
		System.out.println(i==j);
		
	}
}
