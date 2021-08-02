package tij4.innerclasses;

/**
 * 静态内部类用法
 * 1. staic修饰类，取消了外部类的引用, 不能从嵌套类的对象中访问非静态的外围类对象
 * 2. 要创建嵌套类的对象，不需要其外围类的对象
 *
 * @author liuhongji
 */
public class Parcel11 {

    private static class ParcelContent implements Contents{
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected static class ParcelDestination implements Destination{

        private String label;

        private ParcelDestination(String whereTo){
            this.label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }

        public static void f(){}

        static int x = 10;

        // 静态内部类中嵌套类
        static class AnotherLevel{
            public static void f(){}

            static int x =10;
        }
    }

    public static Contents parcelContents(){
        return new ParcelContent();
    }

    public static Destination parcelDestination(String s){
        return new ParcelDestination(s);
    }


    public static void main(String[] args) {
        //ParcelContent对象的生成并不依赖外围类Parcel11
        Contents contents = parcelContents();
        Destination destination = parcelDestination("label1");
    }


}
