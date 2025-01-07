package co.edu.ufps.gidisoft.controller;

import co.edu.ufps.gidisoft.entities.Investigador;
import co.edu.ufps.gidisoft.services.InvestigadorService;
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
        return ResponseEntity.ok(this.service.guardarInvestigador(investigador));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Investigador> buscarInvestigador(@RequestParam Long id){
        return ResponseEntity.ok(this.service.buscarInvestigador(id));
    }

    @GetMapping
    public ResponseEntity<List<Investigador>> listarInvestigadores(){
        return ResponseEntity.ok(this.service.listarInvestigadores());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Investigador> actualizarInvestigador(@RequestBody Investigador investigador,@RequestParam Long id){
        return ResponseEntity.ok(this.service.actualizarInvestigador(investigador, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> eliminarInvestigador(@RequestParam Long id){
        this.service.eliminarInvestigador(id);
        return ResponseEntity.ok().build();
    }

}
