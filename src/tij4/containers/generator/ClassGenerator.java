package tij4.containers.generator;

/**
 * 一种类的生成方案
 *
 * @author liuhongji
 */
public class ClassGenerator<T> implements Generator<T>{

    private Class<T> tClass;

    public ClassGenerator(Class<T> tClass){
        this.tClass = tClass;
    }

    @Override
    public T next() throws IllegalAccessException, InstantiationException {
        return tClass.newInstance();
    }

    public static <T> Generator<T> create(Class<T> tClass){
        return new ClassGenerator<>(tClass);
    }
}
