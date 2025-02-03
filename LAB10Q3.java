package lab10q3;

interface MessageEncoder {
    String encode(String plainText);
    String decode(String cipherText);
}

class ShuffleCipher implements MessageEncoder {
    private final int n;

    public ShuffleCipher(int n) {
        this.n = n;
    }

    @Override
    public String encode(String plainText) {
        String result = plainText;
        for (int i = 0; i < n; i++) {
            result = shuffle(result);
        }
        return result;
    }

    @Override
    public String decode(String cipherText) {
        String result = cipherText;
        for (int i = 0; i < n; i++) {
            result = unshuffle(result);
        }
        return result;
    }

    // Helper method to shuffle text
    private String shuffle(String text) {
        int mid = (text.length() + 1) / 2; // Adjust for odd-length strings
        StringBuilder result = new StringBuilder();
        int i = 0, j = mid;

        while (i < mid || j < text.length()) {
            if (i < mid) {
                result.append(text.charAt(i++));
            }
            if (j < text.length()) {
                result.append(text.charAt(j++));
            }
        }
        return result.toString();
    }

    // Helper method to reverse the shuffle
    private String unshuffle(String text) {
        char[] result = new char[text.length()];
        int mid = (text.length() + 1) / 2; // Adjust for odd-length strings
        int index = 0;

        for (int i = 0; i < mid; i++) {
            result[i] = text.charAt(index++);
            if (i + mid < text.length()) {
                result[i + mid] = text.charAt(index++);
            }
        }
        return new String(result);
    }
}

public class LAB10Q3 {
    public static void main(String[] args) {
        ShuffleCipher cipher = new ShuffleCipher(2);

        String plainText = "abcdef";
        System.out.println("Plain Text: " + plainText);

        String encoded = cipher.encode(plainText);
        System.out.println("Encoded: " + encoded);

        String decoded = cipher.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}
