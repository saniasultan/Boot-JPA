package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepo;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

        UserRepo userRepo = context.getBean(UserRepo.class);
//      User user = new User();
//        user.setName("Sania");
//        user.setCity("Goa");
//        user.setStatus("Java Programmer");
//
//        User savedUser = userRepo.save(user);
//        System.out.println("Saved User: " + savedUser);
//        User user1 = new User();
//        user1.setName("Priti");
//    user1.setCity("city1");
//     user1.setStatus("teacher");
//     User user2 = new User();
//     user2.setName("Anuja");
// user2.setCity("city2");
//  user2.setStatus("Microbilogist");
//  List<User>users=List.of(user1,user2);
//Iterable<User>result= userRepo.saveAll(users);
//result.forEach(user->{
//	System.out.println(user);
//});
//update the user
//   Optional<User>optional = userRepo.findById(1);  
//  User user= optional.get();
//  user.setName("Sania Sultan");
// User result= userRepo.save(user);
//        System.out.println(result);
//        Iterable<User> itr= userRepo.findAll();
//        
//        Iterator<User> iterator = itr.iterator();        
//        
//        while(iterator.hasNext()) {
//        	User user =iterator.next();
//        	System.out.println(user);}
        
        
        //deleting the user
//        userRepo.deleteById(53);
//        System.out.println("deleted");
//        
//        List<User> users = userRepo.findByNameAndCity("priti","city1");
//        users.forEach(e->System.out.println(e));
//        System.out.println();
//        List<User> users = userRepo.getAllUser();
//        users.forEach(e->System.out.println(e));
//        System.out.println();
//        List<User> users = userRepo.getUserByName("Priti");
//        users.forEach(e->System.out.println(e));
//        System.out.println();
        List<User> users = userRepo.getUsers();
        users.forEach(e->System.out.println(e));
        System.out.println();
System.out.println("donnneee");
//System.out.println("donnneee");
  
    }
}
