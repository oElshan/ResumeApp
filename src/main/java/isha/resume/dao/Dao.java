package isha.resume.dao;

import java.util.List;

public interface Dao<T,K> {
    T reade(K k);
    void create(T t);
    void update(T t);
    void delete(K k);
    List<T> readelist();
}
