package src.main.java.TransaccionBancaria;

public class DestinationAccountExistsRule implements Rule {
    private Rule next;

    public DestinationAccountExistsRule(Rule next) {
        this.next = next;
    }

    @Override
    public boolean process(Transaction transaction) {
        if (transaction.getType().equals("transferencia")) {
            // Aquí deberías verificar si la cuenta de destino existe.
            // Para este ejemplo, vamos a asumir que siempre existe.
        }
        if (next != null) {
            return next.process(transaction);
        }
        return true;
    }
}
