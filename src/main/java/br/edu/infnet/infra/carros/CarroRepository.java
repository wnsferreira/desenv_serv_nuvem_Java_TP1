
package br.edu.infnet.infra.carros;

import br.edu.infnet.domain.carros.Carro;
import java.util.Collection;
import java.util.HashMap;
import org.springframework.stereotype.Repository;

@Repository
public class CarroRepository {
    
    private HashMap<Integer, Carro> carros;
    private static int ids = 4;
    
    public CarroRepository(){
        carros = new HashMap<>();
        carros.put(1, new Carro(1,"ford","Focus", "preto", 2015));
        carros.put(2, new Carro(2,"Honda", "Fit", "cinza", 2007));
        carros.put(3, new Carro(3,"Honda", "Civic", "prata", 2017));
        
    }
    
    public Collection<Carro> listar(){
        return this.carros.values();
    }
    
    public Carro obter(int id){
        return carros.get(id);
    }
}

