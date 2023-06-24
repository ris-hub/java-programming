package Chegg;

public class Pelikan {
    public static Node<Double> makeChain() {
        Node<Double> chain = null;
        for (int i = 192; i > 18; i = i / 2) {
            chain = new Node<>(i / 5.0, chain);
        }
        return chain;
    }
    public static <T> String fuyugaki(Node<T> node) {
        String retVal = "";
        while (node != null) {
            retVal += node.getData().toString() + ">>";
            node = node.getNext();
        }
        retVal += "null";
        return retVal;
    }
    public static void main(String[] args) {
        Node<Double> irosh = makeChain();
        String bean = fuyugaki(irosh);
        System.out.println(bean);
    }
}