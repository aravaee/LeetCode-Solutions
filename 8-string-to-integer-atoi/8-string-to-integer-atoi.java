class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty())
            return 0;
        int sign = 1, base = 0, i = 0;
        while (s.charAt(i) == ' ')
            i++;
        if (s.charAt(i) == '-' || s.charAt(i) == '+')
            sign = s.charAt(i++) == '-' ? -1 : 1;
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            if (base > Integer.MAX_VALUE / 10
                    || (base == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            base = 10 * base + (s.charAt(i++) - '0');
        }
        return base * sign;
    }
}