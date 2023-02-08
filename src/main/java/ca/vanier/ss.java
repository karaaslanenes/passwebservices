package ca.vanier;

public class ss {
    public static void main(String[] args) {
        System.out.println(minWindow("qploresinazxrhqknhoilerthf","lion"));
    }
    public static String minWindow(String s, String t) {
        int N = s.length(), M = t.length(), count = 0;
        String res = "";
        if (N < M || M == 0)    return res;
        int[] lib = new int[256], cur = new int[256];  // ASCII has 256 characters
        for (int i = 0; i < M; lib[t.charAt(i++)]++);  // count each characters in t
        for (int l = 0, r = 0; r < N; r++) {
            char c = s.charAt(r);
            if (lib[c] != 0) {
                cur[c]++;
                if (cur[c] <= lib[c])   count++;
                if (count == M) {
                    char tmp = s.charAt(l);
                    while (lib[tmp] == 0 || cur[tmp] > lib[tmp]) {
                        cur[tmp]--;
                        tmp = s.charAt(++l);
                    }
                    if (res.length() == 0 || r - l + 1 < res.length())
                        res = s.substring(l, r + 1);
                    count--;  // should add these three lines for the case cur[c] c is char in s but not the one visited
                    cur[s.charAt(l)]--;
                    l++;
                }
            }
        }
        return res;
    }
}
