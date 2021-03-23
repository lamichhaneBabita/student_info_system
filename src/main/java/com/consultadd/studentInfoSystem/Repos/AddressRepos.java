package com.consultadd.studentInfoSystem.Repos;

import com.consultadd.studentInfoSystem.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepos extends JpaRepository<Address, Long> {

}
