package tij4.containers.generator;

/**
 * @author liuhongji
 */
public class ClassGeneratorMain {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Generator<CountingObject> countingObjectGenerator =
                ClassGenerator.create(CountingObject.class);
        for (int i=0;i<10;i++){
            System.out.println(countingObjectGenerator.next());
        }
    }
}
