public class Money {
    private long dollars;
    private long cents;

    public Money(double amount) {
        dollars = (long) amount;
        double decimalPart = amount - dollars;
        cents = Math.round(decimalPart * 100);
    }

    public Money(Money other) {
        this.cents = other.cents;
        this.dollars = other.dollars;
    }

    public Money add(Money otherAmount) {
        long totalDollars = this.dollars + otherAmount.dollars;
        long totalCents = this.cents + otherAmount.cents;

        if (totalCents > 99) {
            totalDollars += totalCents / 100;
            totalCents = totalCents % 100;
        }

        double amount = totalDollars + (totalCents / 100.0);

        return new Money(amount);
    }

    public Money subtract(Money otherAmount) {
        long totalDollars = this.dollars - otherAmount.dollars;
        long totalCents = this.cents - otherAmount.cents;

        if (totalCents < 0) {
            totalDollars--;
            totalCents += 100;
        }

        double amount = totalDollars + (totalCents / 100.0);

        return new Money(amount);
    }

    public int compareTo(Money other) {
        if (this.dollars > other.dollars) {
            return 1;
        } else if (this.dollars == other.dollars && this.cents > other.cents) {
            return 1;
        } else if (this.dollars < other.dollars) {
            return -1;
        } else if (this.dollars == other.dollars && this.cents < other.cents) {
            return -1;
        }

        return 0;
    }

    public boolean equals(Money other) {

        if (this.dollars == other.dollars && this.cents == other.cents) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        if (cents < 10) {
            return (dollars + "." + "0" + cents);
        } else {
            return (dollars + "." + cents);
        }
    }

}
