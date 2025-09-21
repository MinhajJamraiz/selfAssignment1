public class Problem4 {
    public static void main(String[] args) throws Exception {
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        String[] words = text.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");  
        //1: Removed everything other than letters and spaces.
        //2: Split the string based on empty space ( "\\s+" checks for multiple spaces) 

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {  // If condition is satisfied , Switch both words
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        System.out.println("Words in alphabetical order:");
        for (String w : words) {  // Display the sorted words by loop because words is not a string but an array 
            System.out.println(w);
        }
    }
}