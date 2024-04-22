package src.main.java.CustomerService.handler;

public abstract class AbstractHandler implements Handler {
    protected Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }
}
