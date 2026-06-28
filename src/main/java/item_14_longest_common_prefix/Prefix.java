package prefix_length;

public class Prefix {
    public String longestCommonPrefix(String[] strs) {

        String prefix = "";
        String pivot = "";

        if (strs != null && strs.length == 1 && "".equals(strs[0])) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        for (int j = 0; j<strs[0].length(); j++) {

            prefix = pivot;

            pivot += String.valueOf(strs[0].charAt(j));
            for(int i = 0; i<strs.length; i++){

                if (strs[i].isEmpty()) {
                    return "";
                }

                if (!strs[i].startsWith(pivot)) {
                    return prefix;
                }
            }
        }
        return pivot;
    }
}
