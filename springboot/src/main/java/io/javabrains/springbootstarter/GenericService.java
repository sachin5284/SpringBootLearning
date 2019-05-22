package io.javabrains.springbootstarter;

import java.util.List;
public interface GenericService<T> {
    public List<T> getAll();

    public T get(String id);

    public void add(T item);

    public void update(T item, String id);

    void delete(String id);
}
