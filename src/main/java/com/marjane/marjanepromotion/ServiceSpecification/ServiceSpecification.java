package com.marjane.marjanepromotion.ServiceSpecification;

import java.util.List;

public interface ServiceSpecification<T, S> {
        T add(S object);

        T get(Long id);

        List<T> getAll();

        T update(Long id, S object);

        T delete(Long id);
}
