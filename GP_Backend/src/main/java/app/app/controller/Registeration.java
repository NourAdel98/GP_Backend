package app.app.controller;

import app.app.entities.Account;
import app.app.entities.Disabled;
import app.app.entities.Helper;
import app.app.entities.Supporter;
import app.app.entities.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Registeration {

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping("/registerDisabled")
    ResponseEntity<Boolean> registerDisabled(Disabled disabled){

        ResponseEntity<Boolean> response;
        Account temp = accountRepository.findAccountByEmailAndPassword(disabled.getEmail(), disabled.getPassword());
        if(temp == null){
            accountRepository.save(disabled);
            response = new ResponseEntity<>(true, HttpStatus.OK);
        }
        else {
            response = new ResponseEntity<>(false, HttpStatus.OK);
        }

        return response;
    }

    @PostMapping("/registerHelper")
    ResponseEntity<Boolean> registerHelper(Helper helper){

        ResponseEntity<Boolean> response;
        Account temp = accountRepository.findAccountByEmailAndPassword(helper.getEmail(), helper.getPassword());
        if(temp == null){
            accountRepository.save(helper);
            response = new ResponseEntity<>(true, HttpStatus.OK);
        }
        else {
            response = new ResponseEntity<>(false, HttpStatus.OK);
        }

        return response;
    }

    @PostMapping("/registerSupporter")
    ResponseEntity<Boolean> registerSupporter(Supporter supporter){

        ResponseEntity<Boolean> response;
        Account temp = accountRepository.findAccountByEmailAndPassword(supporter.getEmail(), supporter.getPassword());
        if(temp == null){
            accountRepository.save(supporter);
            response = new ResponseEntity<>(true, HttpStatus.OK);
        }
        else {
            response = new ResponseEntity<>(false, HttpStatus.OK);
        }

        return response;
    }

    @PostMapping("/login")
    ResponseEntity<Boolean> login(Account account){
        ResponseEntity<Boolean> response;
        Account temp = accountRepository.findAccountByEmailAndPassword(account.getEmail(),account.getPassword());
        if(temp !=null){
            response = new ResponseEntity<>(true, HttpStatus.OK);
        }
        else {
            response = new ResponseEntity<>(false, HttpStatus.OK);
        }
        return response;
    }

    @PostMapping("/sendPassword")
    ResponseEntity<String> sendPassword(Account account){
        Account temp=accountRepository.findAccountByEmail(account.getEmail());
        String pass=temp.getPassword();
        return ResponseEntity.status(HttpStatus.OK)
                .body(pass);
    }






}
