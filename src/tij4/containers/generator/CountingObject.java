package tij4.containers.generator;

/**
 * @author liuhongji
 */
public class CountingObject {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return "CountingObject{" +
                "id=" + id +
                '}';
    }
}
