package src.main.java.TransaccionBancaria;

public class ValidTypeRule implements Rule {
    private Rule next;

    public ValidTypeRule(Rule next) {
        this.next = next;
    }

    @Override
    public boolean process(Transaction transaction) {
        String type = transaction.getType();
        if (!type.equals("retiro") && !type.equals("depósito") && !type.equals("transferencia")) {
            System.out.println("Tipo de transacción inválido!");
            return false;
        }
        if (next != null) {
            return next.process(transaction);
        }
        return true;
    }
}
