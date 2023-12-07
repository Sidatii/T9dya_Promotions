package com.marjane.marjanepromotion.Admin;

//import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminRepository extends JpaRepository<Admin, Long> {
//    @Query("" +
//            "SELECT CASE WHEN COUNT(a) > 0 THEN " +
//            "TRUE ELSE FALSE END " +
//            "FROM admin a " +
//            "WHERE a.email = ?1"
//    )
//    Boolean selectExistsEmail(String email);
}
