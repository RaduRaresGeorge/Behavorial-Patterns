package src.main.java.TransaccionBancaria;

public class SufficientBalanceRule implements Rule {
    private Rule next;

    public SufficientBalanceRule(Rule next) {
        this.next = next;
    }

    @Override
    public boolean process(Transaction transaction) {
        if (transaction.getType().equals("retiro")) {
            // Aquí deberías verificar si la cuenta tiene suficiente saldo.
            // Para este ejemplo, vamos a asumir que siempre hay suficiente saldo.
        }
        if (next != null) {
            return next.process(transaction);
        }
        return true;
    }
}
