package tech.aelson.crud.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.aelson.crud.gateways.HouseGateway;
import tech.aelson.crud.model.House;

import java.util.Optional;

@Service
public class GetHouseById {

    @Autowired
    private HouseGateway gateway;

    public House execute(final String id) throws Exception {

        Optional<House> house = gateway.findById(id);

        return house.orElseThrow(() -> new Exception("Entity Not Found"));
    }
}
