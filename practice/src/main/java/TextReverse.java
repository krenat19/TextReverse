public class TextReverse {

    public String[] ReverseStringArray(String input) {
        String[] lyrics = input.split(" ");
        String[] result = new String[lyrics.length];
        int j = 0;
        for (int i = lyrics.length -1; i >= 0; i--) {
            if (i % 2 == 1) {
                lyrics[i] = ReverseStringWord(lyrics[i]);
            }
            result[j] = lyrics[i];
            j++;
        }
        return result;
    }

    public String ReverseStringWord(String input) {
        char[] result = new char[input.length()];
        int j = 0;
        for (int i = input.length() -1; i >= 0; i--) {
            result[j] = input.charAt(i);
            j++;
        }
        String finalWord = String.valueOf(result);
        return finalWord;
    }


}
