package item_20_valid_parenthesis;

public class Solution {

    public boolean isValid(String s) {

        if(s.length() == 1) {
            return false;
        }

        boolean lw = false;
        boolean rw = false;

        boolean res = true;

        for (int left = 0, right = s.length() -1; left <= right; left++, right--) {

            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (lw && !rw) {
                left+=1;
                right+=1;
            }
            if (rw && !lw) {
                right-=1;
                left-=1;
            }

            if(
                    (leftChar == '(' && s.charAt(left + 1) == ')') ||
                    (leftChar == '{' && s.charAt(left + 1) == '}') ||
                    (leftChar == '[' && s.charAt(left + 1) == ']')
            ) {
                lw = true;
            }

            if(
                    (rightChar == ')' && s.charAt(right - 1) == '(') ||
                    (rightChar == '}' && s.charAt(right - 1) == '{') ||
                    (rightChar == ']' && s.charAt(right - 1) == '[')
            ) {
                rw = true;
            }

            if (
                    (leftChar == '(' && rightChar == ')') ||
                    (leftChar == '{' && rightChar == '}') ||
                    (leftChar == '[' && rightChar == ']') ||

                    (leftChar == '(' && s.charAt(left + 1) == ')') ||
                    (leftChar == '{' && s.charAt(left + 1) == '}') ||
                    (leftChar == '[' && s.charAt(left + 1) == ']') ||

                    (rightChar == ')' && s.charAt(right - 1) == '(') ||
                    (rightChar == '}' && s.charAt(right - 1) == '{') ||
                    (rightChar == ']' && s.charAt(right - 1) == '[')
            ) {
                if (rw && lw) {
                    left+=1;
                    right-=1;
                }
                continue;
            }
            res = false;
        }
        return res;
    }
}
