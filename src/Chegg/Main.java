// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package Chegg;
interface SomeInterface{
    public int returnSomeInt();
    public void workWithInt(int someInt);
}
abstract class A implements SomeInterface{
    public void workWithInt(int x){
        System.out.print(x);
    }
}
class B extends A{
    public int returnSomeInt(){
        return 2;
    }
    public void workWithInt(int x){
        System.out.print(x+1);
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.workWithInt(a.returnSomeInt());
    }
}