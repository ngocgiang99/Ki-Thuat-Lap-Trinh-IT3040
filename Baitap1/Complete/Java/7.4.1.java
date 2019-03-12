public class Main {
    private static boolean isPalindrome(String s) {
        return _isPalin(_toChars(s));
    }

    private static String _toChars(String s) {
        s = s.toLowerCase();
        String ans = "";
        final String characters = "abcdefghijklmnopqrstuvwxyz";
        for (char c : s.toCharArray()) {
            if (_containsCharacter(characters, c))
                ans += c;
        }
        return ans;
    }

    private static boolean _isPalin(String s) {
        if (s.length() <= 1)
            return true;
        else
            return s.charAt(0) == s.charAt(s.length() - 1) && _isPalin(s.substring(1, s.length() - 1));
    }

    private static boolean _containsCharacter(String s, char c) {
        return s.indexOf(c) != -1;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("eve"));
        System.out.println(isPalindrome("Able was I, ere I saw Elba"));
        System.out.println(isPalindrome("Is this a palindrome"));
    }
}