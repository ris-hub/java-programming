package Generic;

public class Example {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<Integer>(124);
        System.out.println(b1.getValue());
        System.out.println(b1.container.getClass().getName());
        b1.container =456;
        System.out.println(b1.getValue());
        b1.performmsomeTask();
    }
}
