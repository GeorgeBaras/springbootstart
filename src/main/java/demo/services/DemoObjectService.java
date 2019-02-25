package demo.services;

import demo.domain.DemoObject;
import demo.persistence.DemoObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoObjectService {

    @Autowired
    private DemoObjectRepository demoObjectRepository;

    public List<DemoObject> findAll(){
        return this.demoObjectRepository.findAll();
    }

    public DemoObject findDemoObjectById(int id){
        return this.demoObjectRepository.findDemoObjectById(id);
    }

    public void delete(DemoObject demoObject){
        this.demoObjectRepository.delete(demoObject);
    }

    public void save(DemoObject demoObject){
        this.demoObjectRepository.saveAndFlush(demoObject);
    }
}
