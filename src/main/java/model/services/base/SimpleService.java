package model.services.base;

import java.util.List;



public interface SimpleService<T>{
    T create( String name );

    List<T> getAll();

    T getById( Long id );

    T getByName( String name );

    void refresh( List<T> entityList );

    void remove( T entity );

    boolean contains( T entity );
}

