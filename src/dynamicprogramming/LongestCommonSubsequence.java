package dynamicprogramming;

public class LongestCommonSubsequence {


  public int getLCS(String s1, String s2) {
    return getLCS(s1, s2, s1.length(), s2.length());
  }

  private int getLCS(String s1, String s2, int p1, int p2) {
    if (p1 == 0 || p2 == 0) return 0;
    if (s1.charAt(p1-1) == s2.charAt(p2-1)) {
      return 1 + getLCS(s1, s2, p1 - 1, p2 - 1);
    } else {
      return Math.max(getLCS(s1, s2, p1 - 1, p2), getLCS(s1, s2, p1, p2 - 1));
    }
  }

  public static void main(String[] args) {
    LongestCommonSubsequence lCS = new LongestCommonSubsequence();
    System.out.println("Length: " + lCS.getLCS("ABCDGH", "AEDFHR"));
    System.out.println("Length: " + lCS.getLCS("AGGTAB", "GXTXAYB"));

  }

}
