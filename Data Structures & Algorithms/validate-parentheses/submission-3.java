/*
Time Complexity:O(n)
Space Complexity:O(n)
*/
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stc = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stc.push(c);
            } else {
                if (stc.isEmpty()) return false;
                Character popUp = stc.pop();
                if (c == ')' && popUp != '(') return false;
                else if (c == '}' && popUp != '{') return false;
                else if (c == ']' && popUp != '[') return false;
            }
        }
        return stc.isEmpty();
    }
}