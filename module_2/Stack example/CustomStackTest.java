import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void popStackTest(){
        customStack.push("Pears and Apples");
        assertEquals("Pears and Apples",customStack.pop());
        assertTrue(customStack.isEmpty(), "Stack should be empty");
    }

    @Test
    public void popEmptyStackTest(){
        assertThrows(IllegalStateException.class, () -> {
            customStack.pop();
        });
    }

    @Test
    public void peekTest(){
        customStack.push("Apples and Oranges");
        assertEquals("Apples and Oranges",customStack.peek());
    }

    @Test
    public void stackSizeTest(){
        assertEquals(0,customStack.size());

        customStack.push("Apples");
        assertEquals(1,customStack.size());

        customStack.push("Bananas");
        assertEquals(2,customStack.size());
    }

}
