# Strategy Pattern (Short Notes)

- **Purpose**: Encapsulate algorithms (strategies) and make them interchangeable at runtime.
- **Key Idea**: One operation, many strategies.
- **Components**:
    - **Context**: Uses the strategy (e.g., `PaymentApp`)
    - **Strategy Interface**: Common method (e.g., `pay()`)
    - **Concrete Strategies**: Implement the interface differently (e.g., `PayByCredit`, `CashPayment`, lambda)
- **Example**:

```java
app.pay(new PayByCredit());
app.pay(PaymentMode.cashPayment);
app.pay(() -> System.out.println("Paying by BankTransfer"));
