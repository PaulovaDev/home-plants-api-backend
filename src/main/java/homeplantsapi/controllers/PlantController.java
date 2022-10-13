package homeplantsapi.controllers;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import homeplantsapi.model.Plant;
import homeplantsapi.repositories.PlantRepository;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping(path="/home")
public class PlantController {
    
    private final PlantRepository plantRepository;

    public PlantController(PlantRepository plantRepository){
        this.plantRepository = plantRepository;
    }
        
    @CrossOrigin(origins = "http://localhost:3000/", 
        allowedHeaders = "Requestor-Type", 
        exposedHeaders = "X-Get-Header")
    @GetMapping(path="/plants")
    public @ResponseBody List<Plant> getAllPlants() {
        
        return plantRepository.findAll();
    }
}
