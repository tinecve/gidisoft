package co.edu.ufps.gidisoft.services;

import co.edu.ufps.gidisoft.entities.ClasificacionInvestigador;
import co.edu.ufps.gidisoft.repositories.ClasificacionInvestigadorRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public class ClasificacionInvestigadorService {

    private ClasificacionInvestigadorRepository repository;

    public ClasificacionInvestigadorService(ClasificacionInvestigadorRepository repository){
        this.repository = repository;
    }

    public ClasificacionInvestigador guardarClasificacionInvestigador(ClasificacionInvestigador clasificacionInvestigador){
        return this.repository.save(clasificacionInvestigador);
    }

    public ClasificacionInvestigador buscarClasificacionInvestigador(Long id){
        Optional<ClasificacionInvestigador> clasificacionInvestigador = this.repository.findById(id);
        return clasificacionInvestigador.orElse(null);
    }

    public List<ClasificacionInvestigador> listarClasificacionesInvestigador(){
        return this.repository.findAll();
    }

    public ClasificacionInvestigador actualizarClasificacionInvestigador(ClasificacionInvestigador clasificacionInvestigador, Long id){
        Optional<ClasificacionInvestigador> clasificacionInvestigador1 = this.repository.findById(id);
        if(clasificacionInvestigador1.isPresent()){
            return this.repository.save(clasificacionInvestigador);
        }else{
            return null;
        }
    }

    public void eliminarClasificacionInvestigador(Long id){
        Optional<ClasificacionInvestigador> clasificacionInvestigador = this.repository.findById(id);
        if (clasificacionInvestigador.isPresent()){
            this.repository.deleteById(id);
        }
    }

}
