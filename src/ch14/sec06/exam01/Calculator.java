package ch14.sec06.exam01;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory1(int memory) throws Exception {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " : " + this.memory);
        }
    }

    public void setMemory2(int memory) throws Exception {
        synchronized (this) {
            this.memory = memory;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " : " + this.memory);
            }
        }
    }
}
