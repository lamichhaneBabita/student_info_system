package com.consultadd.studentInfoSystem.RestController;

import com.consultadd.studentInfoSystem.Repos.AddressRepos;
import com.consultadd.studentInfoSystem.ResourceNotFound;
import com.consultadd.studentInfoSystem.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressRepos addressRepos;

    @GetMapping("/get/{id}")
    public Address getAddressById(@PathVariable(value = "id")long id) throws ResourceNotFound {
        return  addressRepos.findById(id)
                .orElseThrow(()-> new ResourceNotFound("Not Found",id,"Not Found"));
    }
    @GetMapping("/get")
    public List<Address>getAddress(){
        return addressRepos.findAll();
    }

}
