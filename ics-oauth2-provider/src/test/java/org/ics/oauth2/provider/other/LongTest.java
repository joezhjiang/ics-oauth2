package org.ics.oauth2.provider.other;

public class LongTest {
	public static void main(String[] args) {
		Long i = 127L;
		Long j = 127L;
		System.out.println(i==j);
		
		i=128L;
		j=128L;
		System.out.println(i==j);
	}
}
