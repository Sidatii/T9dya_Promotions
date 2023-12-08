package com.marjane.marjanepromotion.ServiceSpecification;

import java.util.Optional;

public interface Auth<T> {

    Optional<T> login(String email, String password);
    Optional<T> register(T user);

}
