package pt.codacy;

/**
 * Tech challenge I for codacy
 *
 * @author Bruno Fernandes
 */
public class TechChallengeI {

    private static final String FOO = "Foo";
    private static final String BAR = "Bar";
    private static final String FOO_BAR = "FooBar";

    private static final int MULTIPLE_OF_THREE = 3;
    private static final int MULTIPLE_OF_FIVE = 5;
    private static final int RESULT_MULTIPLICATION = 0;
    private static final int MAX_LIMIT = 100;

    public static void main(String[] args) {
        for(int i = 1;i <= MAX_LIMIT;i++){
            System.out.print(convertToFooBar(i) + " ");
        }
    }

    /**
     * Get String
     * @param number
     * @return according the next rules
     * - return "Foo" if the given number is multiple of three
     * - return "Bar" if the given number is multiple of five
     * - return "FooBar" if the given number is multiple of three and five
     * - if not of above conditions return the given number
     */
    static String convertToFooBar(int number){
        boolean isMultipleOfThree = (number % MULTIPLE_OF_THREE) == RESULT_MULTIPLICATION;
        boolean isMultipleOfFive = (number % MULTIPLE_OF_FIVE) == RESULT_MULTIPLICATION;

        if(isMultipleOfThree && isMultipleOfFive){
            return FOO_BAR;
        } else if(isMultipleOfThree){
            return FOO;
        } else if(isMultipleOfFive){
            return BAR;
        } else {
            return String.valueOf(number);
        }
    }
}
