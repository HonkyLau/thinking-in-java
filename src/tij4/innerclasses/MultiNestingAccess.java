package tij4.innerclasses;

/**
 * 多层嵌套类中访问外部类的成员
 *
 * @author liuhongji
 */
public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A a = mna.new A();
        MNA.A.B b = a.new B();
        b.h();
    }
}

class MNA{
    private void f(){}

    class A{
        private void g(){}

        class B{
            void h(){
                f();
                g();
            }
        }
    }

}


