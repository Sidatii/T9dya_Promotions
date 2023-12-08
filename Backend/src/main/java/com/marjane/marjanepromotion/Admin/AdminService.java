package com.marjane.marjanepromotion.Admin;

import com.marjane.marjanepromotion.ServiceSpecification.Auth;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AdminService implements Auth<Admin> {
    private final AdminRepository adminRepository;
    public Admin getAdmin(Long adminId){
//        return adminRepository.findBy( admin.getId());
        return null;
    }

    public void AddAdmin(Admin admin){
//        Boolean existsEmail = adminRepository
//                .selectExistsEmail(admin.getEmail());
//        if (existsEmail) {
//            throw new BadRequestException(
//                    "Email " + student.getEmail() + " taken");
//        }

        adminRepository.save(admin);
    }
    public void deletAdmin(Admin admin){
        adminRepository.delete(admin);
    }

    @Override
    public Optional<Admin> login(String email, String password) {
//        Admin admin = adminRepository.findAdminByEmailAndPassword(email, password);
//        if (admin == null)
//            return Optional.empty();
//        return Optional.of(admin);
        return Optional.empty();
    }

    @Override
    public Optional<Admin> register(Admin user) {
        return Optional.empty();
    }
}
