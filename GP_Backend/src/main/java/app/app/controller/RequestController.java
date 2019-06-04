package app.app.controller;

import app.app.entities.Request;
import app.app.entities.repositories.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @Autowired
    private RequestRepository requestRepo;

    @PostMapping("/make-request")
    ResponseEntity<Boolean> makeRequest( Request request){

        requestRepo.save(request);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}
