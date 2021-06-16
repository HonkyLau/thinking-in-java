package tij4.polymorphism;

/**
 * 引用计数，模拟JDK销毁对象时判断该对象无被引用时才销毁
 *
 * @author liuhongji
 */
public class ReferenceCounting {

    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {new Composing(shared),new Composing(shared),
                new Composing(shared),new Composing(shared),new Composing(shared)};
        for (Composing c:
        composings) {
            c.dispose();
        }
    }

}

class Shared{

    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared(){
        System.out.println("Creating shread " + this);
    }

    public void addRef(){
        refcount++;
    }

    protected void dispose(){
        if(--refcount == 0){
            System.out.println("Dispose " + this);
        }
    }

    @Override
    public String toString(){
        return "Shared " + id;
    }
}

class Composing{
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    public void dispose(){
        System.out.println("Disposing " + this);
        this.shared.dispose();
    }

    @Override
    public String toString(){
        return "Composing " + id;
    }
}
