package org.cayo.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubStringKDist {

	public static List<String> subStringsKDist(String inputStr, int num) {
		List<String> list = new ArrayList<String>();
		int max = inputStr.length() - num + 1;
		p: for (int i = 0; i < max; i++) {
			int maxPosition = i + num;
			for (int k = i; k < (maxPosition - 1); k++) {
				char c = inputStr.charAt(k);
//				System.out.println(
//						String.format("num=%s  max=%s  i=%s  k=%s  mp=%s  c=%s", num, max, i, k, maxPosition, c));
				int index = inputStr.indexOf(c, k + 1);
				if (index > 0 && index < maxPosition) {
//					System.out.println(inputStr.indexOf(c, k + 1));
					continue p;
				}
			}
			String subStr = inputStr.substring(i, maxPosition);
//			System.out.println(subStr);
//			System.out.println(Arrays.toString(list.toArray()));
			if (!list.contains(subStr)) {
				list.add(subStr);
			}
//			System.out.println(Arrays.toString(list.toArray()));
		}
		return list;
	}
}
