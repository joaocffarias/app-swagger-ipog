package br.edu.ipog.backend3.app.generics;


import java.util.List;

/**
 *
 * create
 * create(1)
 * read() - list
 * read(1) - id
 * update(id, object)
 * delete(id)
 *
 * @param <T>
 * @param <N>
*/

public interface GenericOperationsService<T,N> {

    T create(T model);

    List<T> read();

    T readById(N id);

    T update(N id, T model);

    Void delete(N id);

}
