package beharvioral.observer;


import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class EventSource extends Observable implements Runnable {
    @Override
    public void run() {
        while (true) {
            String response = new Scanner(System.in).next();
            setChanged();
            notifyObservers(response);
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter text");
        EventSource eventSource = new EventSource();
        eventSource.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("Receive reponse " + arg);
            }
        });

        new Thread(eventSource).start();
    }
}