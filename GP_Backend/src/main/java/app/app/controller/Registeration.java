package app.app.controller;

import app.app.entities.Account;
import app.app.entities.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Registeration {

    @Autowired
    private AccountRepository userRepository;

    @RequestMapping("/welcome")
    ResponseEntity<String> test(){
        return new ResponseEntity<>("welcome", HttpStatus.OK);
    }

    @PostMapping("/register")
    ResponseEntity<Boolean> register(Account account){

        ResponseEntity<Boolean> response;
        Account temp = userRepository.findUserByUsernameAndPassword(account.getUsername(), account.getPassword());
        if(temp == null){
            userRepository.save(account);
            response = new ResponseEntity<>(true, HttpStatus.OK);
        }
        else {
            response = new ResponseEntity<>(false, HttpStatus.OK);
        }

        return response;
    }

    @PostMapping("/login")
    ResponseEntity<Account> login(@RequestParam String username, @RequestParam String pass){

        Account account = userRepository.findUserByUsernameAndPassword(username,pass);
        System.out.println(account.getUsername() + "  " + account.getPassword());
        return new ResponseEntity<>(account,HttpStatus.OK);
    }
}
