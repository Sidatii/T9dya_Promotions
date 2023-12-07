package com.marjane.marjanepromotion.ServiceSpecification;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceSpecification<T, S> {
        T add(S object);

        T get(Long id);

        Page<T> getAll(Pageable pageable);

        T update(Long id, S object);

        T delete(Long id);
}
