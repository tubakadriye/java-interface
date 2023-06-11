package day28interfacescollections;

public interface Engine extends Details{ // both engine and details are interfaces, so we use extends
    void run();
    int volume = 6;
    int weight();

    default void eco() {
        hybridEco();
        System.out.println("Honda engines are economic");
    }

    private void hybridEco() {
        System.out.println("Honda uses hybrid eco engines");
    }
}
