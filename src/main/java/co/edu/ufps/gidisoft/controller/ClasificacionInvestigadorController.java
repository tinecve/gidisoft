package co.edu.ufps.gidisoft.controller;

import co.edu.ufps.gidisoft.entities.ClasificacionInvestigador;
import co.edu.ufps.gidisoft.services.ClasificacionInvestigadorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clasificacion-investigador")
public class ClasificacionInvestigadorController {

    private ClasificacionInvestigadorService service;

    public ClasificacionInvestigadorController(ClasificacionInvestigadorService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ClasificacionInvestigador> guardarClasificacionInvestigador(@RequestBody ClasificacionInvestigador clasificacionInvestigador){
        return new ResponseEntity<>(this.service.guardarClasificacionInvestigador(clasificacionInvestigador), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClasificacionInvestigador> buscarClasificacionInvestigador(@RequestParam Long id){
        return new ResponseEntity<>(this.service.buscarClasificacionInvestigador(id), HttpStatus.FOUND);
    }

    @GetMapping
    public ResponseEntity<List<ClasificacionInvestigador>> listarClasificacionesInvestigador(){
        return new ResponseEntity<>(this.service.listarClasificacionesInvestigador(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClasificacionInvestigador> actualizarClasificacionInvestigador(@RequestBody ClasificacionInvestigador clasificacionInvestigador, @RequestParam Long id){
        return new ResponseEntity<>(this.service.actualizarClasificacionInvestigador(clasificacionInvestigador, id), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> eliminarClasificacionInvestigador(@RequestParam Long id){
        this.service.eliminarClasificacionInvestigador(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
