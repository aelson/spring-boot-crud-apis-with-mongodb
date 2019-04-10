package tech.aelson.crud.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.aelson.crud.gateways.HouseGateway;
import tech.aelson.crud.model.House;

@Service
public class SaveHouse {

    @Autowired
    private HouseGateway gateway;

    public House execute(final House house) {

        // some business logic
        if (house.hasPool && house.area > 300) {
            house.premium = true;
        }

        return gateway.save(house);
    }
}
