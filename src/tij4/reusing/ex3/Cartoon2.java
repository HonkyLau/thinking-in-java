package tij4.reusing.ex3;

// 练习3：
// reusing/Cartoon2.java
// TIJ4 Chapter Reusing, Exercise 3, page 245
/* Prove the previous sentence. (Even if you don't create a constructor for
 * Cartoon(), the compiler will synthesize a default constructor for you that
 * calls the base-class constructor.
 */
class Art {
    Art() {
        System.out.println("Art constructor"); }
}

class Drawing extends Art {
    Drawing() { System.out.println("Drawing constructor"); }
}

public class Cartoon2 extends Drawing {

    Cartoon2(){

    }

    public static void main(String[] args) {
        //所有类都会有默认的无参构造器
        Cartoon2 x = new Cartoon2();
    }
}
