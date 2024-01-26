class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
                boolean isNegative = (s1.charAt(0) == '-' && s2.charAt(0) != '-') || (s1.charAt(0) != '-' && s2.charAt(0) == '-');

        // Remove the negative sign if present
        s1 = s1.charAt(0) == '-' ? s1.substring(1) : s1;
        s2 = s2.charAt(0) == '-' ? s2.substring(1) : s2;

        // Handle edge-case where the product is 0
        if (s1.equals("0") || s2.equals("0")) {
            return "0";
        }

        int n1 = s1.length();
        int n2 = s2.length();
        int[] result = new int[n1 + n2];

        // Build the number by multiplying one digit at a time
        for (int i = n1 - 1; i >= 0; --i) {
            for (int j = n2 - 1; j >= 0; --j) {
                int mul = (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
                int sum = mul + result[i + j + 1];
                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        // Convert the result array to a string
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for (int digit : result) {
            if (leadingZero && digit == 0) {
                continue;  // Skip leading zeros
            }
            leadingZero = false;
            sb.append(digit);
        }

        // If the result is zero, return "0" without a negative sign
        return sb.length() == 0 ? "0" : (isNegative ? "-" + sb.toString() : sb.toString());

    }
}
