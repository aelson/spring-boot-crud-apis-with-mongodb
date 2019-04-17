package tech.aelson.crud.entrypoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.aelson.crud.model.House;
import tech.aelson.crud.usecases.DeleteHouse;
import tech.aelson.crud.usecases.GetHouseById;
import tech.aelson.crud.usecases.SaveHouse;

@RestController
public class HouseController {

    @Autowired
    private SaveHouse saveHouse;

    @Autowired
    private GetHouseById getHouseById;

    @Autowired
    private DeleteHouse deleteHouse;

    @PostMapping(value = "/houses")
    public House create(@RequestBody final House house) {
        return saveHouse.execute(house);
    }

    @GetMapping(value = "/houses/{id}")
    public House find(@PathVariable final String id) throws Exception {
        return getHouseById.execute(id);
    }

    @PutMapping(value = "/houses")
    public House update(@RequestBody final House house) {
        return saveHouse.execute(house);
    }

    @DeleteMapping(value = "/houses/{id}")
    public void delete(@PathVariable final String id) {
        deleteHouse.execute(id);
    }
}
