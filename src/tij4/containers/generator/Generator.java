package tij4.containers.generator;

/**
 * @author liuhongji
 */
public interface Generator<T> {

    T next() throws IllegalAccessException, InstantiationException;
}
