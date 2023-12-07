package com.marjane.marjanepromotion;

import com.github.javafaker.Faker;
import com.marjane.marjanepromotion.Admin.Admin;
import com.marjane.marjanepromotion.Admin.AdminRepository;
import com.marjane.marjanepromotion.Category.Category;
import com.marjane.marjanepromotion.Category.CategoryRepository;
import com.marjane.marjanepromotion.Center.Center;
import com.marjane.marjanepromotion.Center.CenterRepository;
import com.marjane.marjanepromotion.Product.Product;
import com.marjane.marjanepromotion.Product.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class MarjanePromotionApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarjanePromotionApplication.class, args);
    }
//    @Bean
//    CommandLineRunner commandLineRunner(CategoryRepository categoryRepository, ProductRepository productRepository){
//        return args -> {
////            CategoryDataFaker(categoryRepository);
////            ProductDataFaker(productRepository, categoryRepository);
////            CenterDataFaker(centerRepository);
////            AdminDataFaker(adminRepository);
////            PageRequest pageRequest = PageRequest.of(0, 10);
////            Page<Admin> page = adminRepository.findAll(pageRequest);
////            System.out.println(page);
//        };
//    }

    public void AdminDataFaker(AdminRepository adminRepository){
        Faker faker = new Faker();
        for (int i = 0; i <= 20; i++) {
            String FirstName = faker.name().firstName();
            String LastName =  faker.name().lastName();
            String Email = String.format("%s.%s@marjane.ma", FirstName, LastName);
            String Password = faker.internet().password();
            Long CenterId = faker.number().randomNumber(1,true);
            Center center = new Center();
            center.setId(CenterId);
            Admin admin = new Admin(FirstName, LastName, Email, Password, center);
            adminRepository.save(admin);
        }
    }
    public void CenterDataFaker(CenterRepository centerRepository){
        Faker faker = new Faker();
        for (int i = 0; i < 20; i++) {
            String name = faker.name().name();
            Center center = new Center(name);
            centerRepository.save(center);
        }
    }

    public void CategoryDataFaker(CategoryRepository categoryRepository){
        Faker faker = new Faker();
        for (int i = 0; i < 20; i++) {
            String name = faker.name().name();
            Category category = new Category();
            category.setName(name);
            categoryRepository.save(category);
        }
    }

    public void ProductDataFaker(ProductRepository productRepository, CategoryRepository categoryRepository){
        Faker faker = new Faker();
        for (int i = 0; i < 20; i++) {
            String name = faker.name().name();
            Double price = faker.number().randomDouble(2, 100, 10000);
            int qty = faker.number().randomDigit();
            long categoryId = (long) faker.number().numberBetween(1, 20);
            Product product = new Product();
            product.setName(name);
            product.setPrice(price);
//            Optional<Category> category = categoryRepository.findById((Long) categoryId);
//            product.setCategory(category.get());
            product.setQuantity(qty);
            productRepository.save(product);
        }
    }

}

