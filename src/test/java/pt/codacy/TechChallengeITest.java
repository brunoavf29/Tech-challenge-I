package pt.codacy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tech challenge I Test
 *
 * @author Bruno Fernandes
 */
public class TechChallengeITest {

    private static final String FOO = "Foo";
    private static final String BAR = "Bar";
    private static final String FOO_BAR = "FooBar";

    private static final int MULTIPLE_OF_THREE = 3;
    private static final int MULTIPLE_OF_FIVE = 5;
    private static final int RESULT_MULTIPLICATION = 0;
    private static final int MAX_LIMIT = 10;

    @Test
    public void testConvertToFooBar(){
        String result;
        boolean isMultipleOfThree;
        boolean isMultipleOfFive;
        for(int i = 1; i <= MAX_LIMIT; i++){
            result = TechChallengeI.convertToFooBar(i);
            isMultipleOfThree = (i % MULTIPLE_OF_THREE) == RESULT_MULTIPLICATION;
            isMultipleOfFive = (i % MULTIPLE_OF_FIVE) == RESULT_MULTIPLICATION;
            if(isMultipleOfThree && isMultipleOfFive){
                Assert.assertEquals(FOO_BAR, result);
            } else if(isMultipleOfThree){
                Assert.assertEquals(FOO, result);
            } else if(isMultipleOfFive){
                Assert.assertEquals(BAR, result);
            } else {
                Assert.assertEquals(String.valueOf(i), result);
            }
        }
    }

}