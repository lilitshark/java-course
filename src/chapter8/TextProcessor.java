package chapter8;

public class TextProcessor {

    public static void main(String[] args) {
        reverseString("Hello world!");

        countWords("The program will count the number of words in this sentence");

        addSpaces("HelloWorldBlaBla");

        String newText = removeStops("The dog is under the table");
        System.out.println(newText);

        String[] words = {"Hello", "World", "Lilit", "is", "rocking!"};
        makeASentence(words);
    }

    /**
     * Splits the sentence by spaces
     * @param sentence full string to be split
     * @return the number of words in the sentence
     */
    public static void countWords(String sentence){
        int count = 0;

        for (String words : sentence.split(" ")) {
            count++;
            System.out.println(words);
        }

        System.out.println("Word count in given string is: " + count);
    }

    /**
     * Prints a String into an array by tokenizing it
     * Counts and prints them
     * @param string Full string to be split
     */
    public static void reverseString(String string){
        String reversedString = "";

        for (int i = string.length()-1; i >= 0; i--) {
            //System.out.print(string.charAt(i));
            reversedString = reversedString.concat(String.valueOf(string.charAt(i)));
        }

        System.out.println("Reversed string is: " + reversedString);
    }

    /**
     * Add spaces before each uppercase letter
     * @param string jumbled text
     */
    public static void addSpaces(String string){
        StringBuilder modifiedText = new StringBuilder(string);

        for (int i = 0; i < modifiedText.length(); i++) {
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                    modifiedText = modifiedText.insert(i," ");
                    i++;
            }
        }
        System.out.println("New text is: " + "'" + modifiedText + "'");
    }

    /**
     * Checks ignoring case if the word in a sentence is not "the" adds the word to new String builder
     * @param text input text
     */

    public static String removeStops(String text){
        String[] words = text.split(" ");
        StringBuilder builder = new StringBuilder();

        for (String word : words) {
            if(!word.equalsIgnoreCase("the")){
                builder.append(word).append(" ");
            }
        }
        return builder.toString();
    }

    /**
     * Make a sentence with given words
     * @param words given words
     */
    public static void makeASentence(String[] words){
        StringBuilder sentence = new StringBuilder();

        for (String word : words) {
            sentence.append(word).append(" ");
        }
        System.out.println(sentence);
    }
}
