package co.edu.ufps.gidisoft.controllers;

import co.edu.ufps.gidisoft.models.ProductoInvestigacion;
import co.edu.ufps.gidisoft.services.IProductoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/producto")
@AllArgsConstructor
public class ProductoController {

    private final IProductoService productoService;

    @PostMapping
    public ProductoInvestigacion guardar(@RequestBody ProductoInvestigacion productoInvestigacion){
        return this.productoService.guardarProducto(productoInvestigacion);
    }

}
