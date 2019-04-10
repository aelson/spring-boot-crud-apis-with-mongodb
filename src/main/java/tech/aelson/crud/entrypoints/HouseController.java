package tech.aelson.crud.entrypoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.aelson.crud.model.House;
import tech.aelson.crud.usecases.SaveHouse;

@RestController
public class HouseController {

    @Autowired
    private SaveHouse saveHouse;

    @PostMapping
    public House create(@RequestBody final House house) {
        return saveHouse.execute(house);
    }
}
