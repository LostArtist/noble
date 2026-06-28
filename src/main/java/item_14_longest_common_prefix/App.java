package item_14_longest_common_prefix;

public class App {
    public static void main(String[] args) {
        Prefix prefix = new Prefix();

        String[] strs1 = {"a"};
        String[] strs2 = {"flower", "flow", "flake"};
        String[] strs3 = {"flower", "flower", "flower", "flower"};

        System.out.println(prefix.longestCommonPrefix(strs3));
    }
}
