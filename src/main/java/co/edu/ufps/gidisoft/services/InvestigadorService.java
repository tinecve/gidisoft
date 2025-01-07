package co.edu.ufps.gidisoft.services;

import co.edu.ufps.gidisoft.entities.Investigador;
import co.edu.ufps.gidisoft.repositories.InvestigadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvestigadorService {

    private InvestigadorRepository repository;

    public InvestigadorService(InvestigadorRepository repository){
        this.repository = repository;
    }

    public Investigador guardarInvestigador(Investigador investigador){
        return this.repository.save(investigador);
    }

    public Investigador buscarInvestigador(Long id){
        Optional<Investigador> investigador = this.repository.findById(id);
        return investigador.orElse(null);
    }

    public List<Investigador> listarInvestigadores(){
        return this.repository.findAll();
    }

    public Investigador actualizarInvestigador(Investigador investigador, Long id){
        Optional<Investigador> investigador1 = this.repository.findById(id);
        if(investigador1.isPresent()){
            return this.repository.save(investigador);
        }else{
            return null;
        }
    }

    public void eliminarInvestigador(Long id){
        this.repository.deleteById(id);
    }

}
