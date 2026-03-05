//longest prifix ---14
/*class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prifix = strs[0];
        System.out.println(prifix);
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prifix) != 0) {
                prifix = prifix.substring(0, prifix.length() - 1);
                System.out.println(prifix);
            }
        }
        return prifix;
    }
}*/

class SolutionDebug {
    public static void main(String[] args) {

    }
}
