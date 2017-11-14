package be.cegeka.selfeval5.domain;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class Service {
    @Inject
    private Repository repository;

    public List<Highway> getAllHighway(){
        return repository.getAllHighway();
    }
}
