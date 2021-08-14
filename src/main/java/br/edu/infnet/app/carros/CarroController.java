
package br.edu.infnet.app.carros;

import br.edu.infnet.domain.carros.Carro;
import br.edu.infnet.infra.carros.CarroRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/carros"})
public class CarroController {
    
    @Autowired
    private CarroRepository repository;
    
    @GetMapping
    public Collection<Carro> listarCarros(){
        return repository.listar();
    }
    
    @GetMapping(path = {"/{id}"})
    public Carro obterCarro(@PathVariable int id){
        return repository.obter(id);
    }
}

