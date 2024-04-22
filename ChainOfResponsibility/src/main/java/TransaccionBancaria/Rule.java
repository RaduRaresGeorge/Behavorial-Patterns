package src.main.java.TransaccionBancaria;

public interface Rule {
    boolean process(Transaction transaction);
}
