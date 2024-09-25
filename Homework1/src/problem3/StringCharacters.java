package problem3;

public class StringCharacters {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + " Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";
        
        int spaces = 0, 
        vowels = 0, 
        letters = 0;

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters++; 
                ch = Character.toLowerCase(ch); 
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++; 
                }
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            }
        }

        System.out.println("The text contained vowels: " + vowels + "\n"
                + "Consonants: " + (letters - vowels) + "\n"
                + "Spaces: " + spaces);
    }
}

