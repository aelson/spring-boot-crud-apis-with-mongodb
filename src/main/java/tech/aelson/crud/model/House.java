package tech.aelson.crud.model;

import org.springframework.data.annotation.Id;

public class House {
    @Id
    public String id;

    public String address;
    public Integer area;
    public Boolean hasPool;
    public Boolean premium;
}
