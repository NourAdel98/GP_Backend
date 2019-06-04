package app.app.controller;

import app.app.entities.Service;
import app.app.entities.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {

    @Autowired
    private ServiceRepository serviceRepo;

    @PostMapping("/get-all-services")
    ResponseEntity<List<Service>> getAllServices(){

        List<Service> services = (List<Service>) serviceRepo.findAll();
        ResponseEntity<List<Service>> response = new ResponseEntity<>(services, HttpStatus.OK);
        return response;
    }

}
