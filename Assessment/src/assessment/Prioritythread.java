package assessment;

class Prioritythread extends Thread {
    public Prioritythread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " Priority: " + getPriority() + " Count: " + i);
        }
    }

    public static void main(String[] args) {
        Prioritythread max = new Prioritythread("MAX");
        Prioritythread min = new Prioritythread("MIN");
        Prioritythread norm = new Prioritythread("NORM");

        max.setPriority(Thread.MAX_PRIORITY);
        min.setPriority(Thread.MIN_PRIORITY);
        norm.setPriority(Thread.NORM_PRIORITY);

        max.start();
        min.start();
        norm.start();
    }
}
