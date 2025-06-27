package co.edu.ufps.gidisoft.services;

import co.edu.ufps.gidisoft.entities.ClasificacionInvestigador;
import co.edu.ufps.gidisoft.exception.BadRequestException;
import co.edu.ufps.gidisoft.exception.ResourceNotFoundException;
import co.edu.ufps.gidisoft.repositories.ClasificacionInvestigadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClasificacionInvestigadorService {

    private ClasificacionInvestigadorRepository repository;

    public ClasificacionInvestigadorService(ClasificacionInvestigadorRepository repository){
        this.repository = repository;
    }

    public ClasificacionInvestigador guardarClasificacionInvestigador(ClasificacionInvestigador clasificacionInvestigador){

        try {
            return this.repository.save(clasificacionInvestigador);
        }catch(Exception e){
            throw new BadRequestException("Error al guardar");
        }
    }

    public ClasificacionInvestigador buscarClasificacionInvestigador(Long id){
        try {
            Optional<ClasificacionInvestigador> clasificacionInvestigador = this.repository.findById(id);
            if (clasificacionInvestigador.isPresent()) {
                return clasificacionInvestigador.get();
            } else {
                throw new ResourceNotFoundException("Clasificación no encontrada");
            }
        }catch(Exception e){
            throw new BadRequestException("Error al buscar clasificación");
        }
    }

    public List<ClasificacionInvestigador> listarClasificacionesInvestigador(){
        return this.repository.findAll();
    }

    public ClasificacionInvestigador actualizarClasificacionInvestigador(ClasificacionInvestigador clasificacionInvestigador, Long id){
        try{
            Optional<ClasificacionInvestigador> clasificacionInvestigador1 = this.repository.findById(id);
            if(clasificacionInvestigador1.isPresent()){
                return this.repository.save(clasificacionInvestigador);
            }else{
                throw new ResourceNotFoundException("Clasificación no se puedo encontrar");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void eliminarClasificacionInvestigador(Long id){
        try {

            Optional<ClasificacionInvestigador> clasificacionInvestigador = this.repository.findById(id);
            if (clasificacionInvestigador.isPresent()) {
                this.repository.deleteById(id);
            } else {
                throw new ResourceNotFoundException("Clasificación no encontrada");
            }
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

}
