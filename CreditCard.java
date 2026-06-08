public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit) {
        owner = newCardHolder;
        creditLimit = new Money(limit);
        balance = new Money(0.00);
    }

    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        Money newBalance = balance.add(amount);

        if (newBalance.compareTo(creditLimit) > 0) {
            System.out.println("Credit limit exceeded.");
        } else {
            System.out.println("Charge: " + amount);
            balance = newBalance;
        }
    }

    public void payment(Money amount) {
        Money newBalance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
        balance = newBalance;
    }
}
