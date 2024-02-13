package JavaCollectionFramework2024.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main1 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		String[] arrayStrings = new String[] {"wer", "werrddfgsaf", "wersdf", "werds42323af", "wsder", "werddfgdfssaf", "wsdfer", "werd34saf", "wdfgber", "werdsxcdsaf" };
		System.out.println(arrayList);
		for (String string : arrayList) {
			System.out.println(string);
		}
		for (int i = 0; i < arrayStrings.length; i++) {
			System.out.println(arrayStrings[i]);

		}
	}
}
