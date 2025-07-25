# Behavior Driven Development (BDD) - Summary

## What is BDD?
- Behavior Driven Development (BDD) focuses on system behavior **as observed externally**, not its internal implementation.
- It encourages thinking **"from the outside in"**, focusing on behaviors tied directly to business outcomes.
- BDD uses a **test-first approach** like TDD, but at a **higher level of abstraction** (integration/system testing).

## BDD vs. TDD
| Feature       | TDD                              | BDD                                 |
|---------------|----------------------------------|--------------------------------------|
| Focus         | Internal code behavior           | External system behavior             |
| Testing Level | Unit tests                       | Integration, System, Acceptance      |
| Syntax        | Programming language assertions  | Natural language (Gherkin)           |

## Benefits of BDD
- Uses a **shared syntax** understandable by developers, testers, stakeholders, and domain experts.
- **Gherkin syntax** (Given-When-Then) lowers the learning curve.
- Enables **automatic documentation and test generation** from specifications.
- Keeps **specs, tests, and documentation synchronized**.
- - Promotes **outside-in development**.
- Uses **Gherkin syntax** for writing features in a business-readable format.
- Ensures **requirements, tests, and documentation** stay in sync.
- Reduces **rework and misunderstandings**.

## BDD Syntax and Structure
- **Feature**: High-level description of functionality (user story).
- **Scenario**: Concrete example describing a single behavior.
- **Steps**:
  - `Given` – Precondition or context
  - `When` – Action or event
  - `Then` – Expected outcome/assertion

## Example Feature

```gherkin
Feature: Returns go to stock

  As a store owner,
  I want to add items back to stock when they’re returned,
  So that I can keep track of the stock.

  Scenario: Refunded items should be returned to stock
    Given that a customer previously bought a black sweater from me
    And I have three black sweaters in stock
    When they return the black sweater for a refund
    Then I should have four black sweaters in stock
