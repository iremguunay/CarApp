package com.finalproject.carapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ownerId;
    private String firstName;
    private String lastName;

    // If I delete owner, I delete owner's data : CascadeType.ALL
    @OneToMany(cascade = CascadeType.ALL, mappedBy ="owner")
    @JsonIgnore
    private List<Car> cars;

    public Owner(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
