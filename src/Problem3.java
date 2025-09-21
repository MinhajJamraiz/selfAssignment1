public class Problem3 {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
            +"Whether `tis nobler in the mind to suffer"
            +" the slings and arrows of outrageous fortune,"
            +" or to take arms against a sea of troubles,"
            +" and by opposing end them?";
        int spaces = 0, vowels = 0, letters = 0;

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);  // Getting charater at index I

            if (Character.isLetter(c)) {   // Checking for letters
                letters++;
                if ("aeiou".indexOf(c) != -1) {  // Checking for vowels
                    vowels++;
                }
            }
            if (Character.isWhitespace(c)) {    // Checking for empty spaces
                spaces++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + (letters - vowels));
        System.out.println("Spaces: " + spaces);
    }
}