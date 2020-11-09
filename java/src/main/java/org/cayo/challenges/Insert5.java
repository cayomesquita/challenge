package org.cayo.challenges;

public class Insert5 {

    private static final String FIVE = "5";

    public static int solution(int N) {
        String strNum = String.valueOf(N);
        char[] charArray = strNum.toCharArray();
        char char5 = String.valueOf(5).charAt(0);
        int insertionPosition = strNum.length();
        if (N > -1) {
            for (int i = 0; i < charArray.length; i++) {
                if (char5 >= charArray[i]) {
                    insertionPosition = i;
                    break;
                }
            }
        } else {
            for (int i = 1; i < charArray.length; i++) {
                if (char5 <= charArray[i]) {
                    insertionPosition = i;
                    break;
                }
            }
        }
        String resulStr = strNum.substring(0, insertionPosition) + FIVE + strNum.substring(insertionPosition);
        return Integer.valueOf(resulStr);
    }

}
