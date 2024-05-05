package controller;

import dao.MovementDAO;
import entities.Movement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.MovementService;

import java.util.List;

@RestController
@RequestMapping("/movement")
public class MovementController {

    @Autowired
    MovementService movementService;
    @Autowired
    private MovementDAO movementDAO;

    @GetMapping
    public List<Movement> listarMovement(){
        return movementService.findAll();
    }

    @GetMapping("/{id}")
    public Movement obtenermovement(@PathVariable Long id){
        return movementService.findById(id);
    }

    @PostMapping
    public void guardarMovement(@RequestBody Movement movement){
        movementService.createMovement(movement);
    }

    @PutMapping("/{id}")
    public void actualizarMovement(@PathVariable Long id, @RequestBody Movement movement){
        movementService.modifyMovement(id,movement);
    }

    @DeleteMapping("/{id}")
    public void eliminarUser(@PathVariable Long id){
        movementService.deleteMovement(id);
    }

}
