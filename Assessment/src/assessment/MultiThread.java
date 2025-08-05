package assessment;

import java.util.Random;

public class MultiThread implements Runnable {
    String[] colours = {"white", "blue", "black", "green", "red", "yellow"};
    Random random = new Random();

    public void run() {
        while (true) {
            int index = random.nextInt(colours.length);
            String selected = colours[index];
            System.out.println("Selected Colour: " + selected);

            if (selected.equals("red")) {
                System.out.println("Red found! Stopping display.");
                break;
            }

            try {
                Thread.sleep(500); // To slow down output for visibility
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MultiThread());
        t.start();
    }
}
