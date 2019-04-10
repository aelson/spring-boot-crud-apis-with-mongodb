package tech.aelson.crud.gateways;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.aelson.crud.model.House;

public interface HouseGateway extends MongoRepository<House, String> {
    // for simple crud, none declaration is required (already exists in MongoRepository)
}
