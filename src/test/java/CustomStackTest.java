import org.junit.jupiter.api.Test;

import smartappdev.module_2_tdd.CustomStack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomStackTest{


    CustomStack<String> customStack = new CustomStack<>();

    @Test
    public void emptyStackTest() {
        boolean result = customStack.isEmpty();
        assertTrue(result, "Stack should be empty");
    }

    @Test
    public void pushStackTest(){
        customStack.push("Apples and Oranges");
        boolean result = customStack.isEmpty();
         assertFalse(result, "Stack should not be empty");
    }

}
