package com.marjane.marjanepromotion.Admin;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/admin")
public class AdminController {
    private final AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }

    @GetMapping
    public Admin getAdmin(Admin admin) {
        return service.getAdmin(admin.getId());
    }


    @PostMapping
    public void addAdmin(@Valid @RequestBody Admin admin) {
        service.AddAdmin(admin);
    }

    @DeleteMapping(path = "{adminId}")
    public void deletAdmin(@PathVariable("adminId") Long adminId) {
        Admin admin = service.getAdmin(adminId);
        service.deletAdmin(admin);
    }
}