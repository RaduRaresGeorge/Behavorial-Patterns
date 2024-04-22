package src.main.java.TransaccionBancaria;

public class TransactionProcessor {
    private Rule firstRule;

    public TransactionProcessor(Rule firstRule) {
        this.firstRule = firstRule;
    }

    public boolean process(Transaction transaction) {
        return firstRule.process(transaction);
    }
}
