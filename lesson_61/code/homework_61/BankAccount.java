package homework_61;

public class BankAccount {
    String IBAN;

    public BankAccount(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getIBAN() {
        return IBAN;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankAccount{");
        sb.append("IBAN='").append(IBAN).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
