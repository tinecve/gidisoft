package co.edu.ufps.gidisoft.controller;

import co.edu.ufps.gidisoft.entities.Investigador;
import co.edu.ufps.gidisoft.services.InvestigadorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/investigador")
public class InvestigadorController {

    private InvestigadorService service;

    public InvestigadorController(InvestigadorService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Investigador> guardarInvestigador(@RequestBody Investigador investigador){
        return new ResponseEntity<>(this.service.guardarInvestigador(investigador), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Investigador> buscarInvestigador(@PathVariable Long id){
        return new ResponseEntity<>(this.service.buscarInvestigador(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Investigador>> listarInvestigadores(){
        return new ResponseEntity<>(this.service.listarInvestigadores(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Investigador> actualizarInvestigador(@RequestBody Investigador investigador,@PathVariable Long id){
        return new ResponseEntity<>(this.service.actualizarInvestigador(investigador, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> eliminarInvestigador(@PathVariable Long id){
        this.service.eliminarInvestigador(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
