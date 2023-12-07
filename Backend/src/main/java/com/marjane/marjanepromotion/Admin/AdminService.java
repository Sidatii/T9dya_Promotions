package com.marjane.marjanepromotion.Admin;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AdminService {
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
}
