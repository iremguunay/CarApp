package com.finalproject.carapp.repository;

import com.finalproject.carapp.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "owner", path = "owner")
public interface OwnerRepository extends JpaRepository<Owner, Long> {

    List<Owner> findByFirstName(@Param("firstName") String firstName);
    List<Owner> findByLastName(@Param("lastName") String lastName);

}
