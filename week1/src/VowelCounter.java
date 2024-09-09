public class VowelCounter {

    public static String vowelCounter(String phrase){
        int vowelNum = 0;
        for (int i = 0; i < phrase.length(); i++) {

            char c = phrase.charAt(i);

            switch (c) {

                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':

                    vowelNum++;
                    break;
                default:
                    break;

            }

        }
        System.out.println("Number of vowels in your phrase is: " + vowelNum);
        return phrase;
    }
}
