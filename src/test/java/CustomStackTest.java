import org.junit.jupiter.api.Test;

import smartappdev.module_2_tdd.CustomStack;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomStackTest{


    CustomStack<String> customStack = new CustomStack<>();

    @Test
    public void emptyStackTest() {
        boolean result = customStack.isEmpty();
        assertTrue(result, "Stack should be empty");
    }


}
