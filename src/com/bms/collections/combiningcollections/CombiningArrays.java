package com.bms.collections.combiningcollections;

import java.util.Arrays;

import java.util.stream.Stream;

/**
 * Created - 27/10/2017
 * 
 * @author BMS Team
 */
public class CombiningArrays {

	public static Object[] usingNativeJava(Object[] first, Object[] second) {
		Object[] combined = new Object[first.length + second.length];
		System.arraycopy(first, 0, combined, 0, first.length);
		System.arraycopy(second, 0, combined, first.length, second.length);
		return combined;
	}

	public static Object[] usingJava8ObjectStream(Object[] first, Object[] second) {
		Object[] combined = Stream.concat(Arrays.stream(first), Arrays.stream(second)).toArray();
		return combined;
	}

	public static Object[] usingJava8FlatMaps(Object[] first, Object[] second) {
		Object[] combined = Stream.of(first, second).flatMap(Stream::of).toArray(String[]::new);
		return combined;
	}

}
