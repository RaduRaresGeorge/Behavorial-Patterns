package src.main.java.TransaccionBancaria;

public class Demo {
    public static void main(String[] args) {
        Rule ruleChain = new ValidTypeRule(new SufficientBalanceRule(new DestinationAccountExistsRule(null)));
        TransactionProcessor processor = new TransactionProcessor(ruleChain);

        Transaction transaction1 = new Transaction("retiro", 100);
        System.out.println("Resultado de la transacción 1: " + processor.process(transaction1));

        Transaction transaction2 = new Transaction("transferencia", 200);
        System.out.println("Resultado de la transacción 2: " + processor.process(transaction2));

        Transaction transaction3 = new Transaction("depósito", 300);
        System.out.println("Resultado de la transacción 3: " + processor.process(transaction3));

        Transaction transaction4 = new Transaction("invalido", 400);
        System.out.println("Resultado de la transacción 4: " + processor.process(transaction4));
    }
}