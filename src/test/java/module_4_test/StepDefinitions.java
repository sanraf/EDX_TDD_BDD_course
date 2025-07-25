package module_4_test;


import io.cucumber.java.en.*;
import smartappdev.module_4.StockManager;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    private StockManager stockManager;
    private String item;

    @Given("a customer previously bought a black sweater")
    public void customerPreviouslyBoughtItem() {
        stockManager = new StockManager();
        item = "black sweater";
    }

    @Given("there are {int} black sweaters in stock")
    public void setInitialStock(int quantity) {
        stockManager.setStock(item, quantity);
    }

    @When("the customer returns one black sweater")
    public void customerReturnsItem() {
        stockManager.returnItem(item);
    }

    @Then("the stock should have {int} black sweaters")
    public void verifyStockCount(int expected) {
        assertEquals(expected, stockManager.getStock(item));
    }
}

