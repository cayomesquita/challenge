package org.cayo.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SubSequenceTags {

	public static List<Integer> subSequenceTags(List<String> targetList, List<String> availableTagList) {
		// WRITE YOUR CODE HERE
		int a = 0;
		int b = 0;
		HashMap<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		for (int index = 0; index < availableTagList.size(); index++) {
			String tag = availableTagList.get(index);
			for (String tagDesired : targetList) {
				if (tag.equals(tagDesired)) {
					List list = map.get(tagDesired);
					if (list == null) {
						list = new ArrayList<Integer>();
						map.put(tagDesired, list);
					}
					list.add(index);
					break;
				}
			}
		}
		// TODO continue
		return Arrays.asList(a, b);
	}
}
