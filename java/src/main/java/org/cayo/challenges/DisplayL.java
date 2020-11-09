package org.cayo.challenges;

public class DisplayL {

    public static final String L = "L";
    public static final String NEW_LINE = "\n";

    public static String solution(int N) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLine = new StringBuilder();
        for (int i = 0; i < N - 1; i++) {
            sb.append(L);
            sb.append(NEW_LINE);
            sbLine.append(L);
        }
        sb.append(L).append(sbLine);
        return sb.toString();
    }
}
