package tij4.polymorphism;

/**
 * 协变返回类型，在子类中被覆盖方法可以返回父类返回类型的某种子类类型
 */
public class CovariantReturn{
    public static void main(String[] args) {
        Mill mill = new Mill();
        Grain grain = mill.process();
        System.out.println(grain);
        mill = new WheatMill();
        grain = mill.process();
        System.out.println(grain);
    }
}

class Grain{
    @Override
    public String toString() {
        return "grain";
    }
}

class Wheat extends Grain{
    @Override
    public String toString() {
        return "wheat";
    }
}

class Mill{
    Grain process(){
        return new Grain();
    }
}

class WheatMill extends Mill{
    @Override
    Wheat process(){
        return new Wheat();
    }
}
