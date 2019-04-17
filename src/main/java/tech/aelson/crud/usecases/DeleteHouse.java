package tech.aelson.crud.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.aelson.crud.gateways.HouseGateway;
import tech.aelson.crud.model.House;

@Service
public class DeleteHouse {

    @Autowired
    private HouseGateway gateway;

    public void execute(final String id) {
        gateway.deleteById(id);
    }
}
