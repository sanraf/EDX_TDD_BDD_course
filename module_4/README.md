# Behavior-Driven Development (BDD)
> Enhancing Communication and Collaboration

---

## What is Behavior-Driven Development (BDD)?

- Focuses on system **behavior** from the **outside in**
- **Not concerned** with internal code structure
- Ideal for **Integration & Acceptance Testing**
- **Key Advantage**: Uses a **common language** understood by:
    - Business Analysts
    - Developers
    - Testers

---

## BDD vs. Test-Driven Development (TDD)

| TDD                               | BDD                                   |
|----------------------------------|----------------------------------------|
| Tests from the **inside out**    | Tests from the **outside in**         |
| Focuses on **implementation**    | Focuses on **behavior**               |
| Ideal for **unit testing**       | Ideal for **acceptance/integration**  |
| Example-based, method-driven     | Story-driven, scenario-based          |

---

## Three Amigos in BDD

- **Business Analyst (BA)**: defines business needs and goals
- **Developer**: implements system behavior
- **Tester**: ensures requirements are testable and verifiable

They collaborate to:
- Understand the business need
- Write user stories and examples
- Define "done" through behavior scenarios

---

## BDD Process Flow

1. **Discovery**: Collaborate to identify business needs
2. **Formulation**: Define examples using **Gherkin syntax**
3. **Automation**: Implement tests to validate behavior

---

## Example of Gherkin Scenario

```gherkin
Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters a valid username and password
    And clicks the login button
    Then the user should be redirected to the dashboard
