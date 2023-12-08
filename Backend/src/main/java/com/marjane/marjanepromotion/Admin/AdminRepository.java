package com.marjane.marjanepromotion.Admin;

//import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@SuppressWarnings("unused")
public interface AdminRepository extends JpaRepository<Admin, Long> {
//    Admin findAdminByEmailAndPassword(String email, String password);
//    Boolean selectExistsEmail(String email);
}
