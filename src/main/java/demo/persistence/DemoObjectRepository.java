package demo.persistence;

import demo.domain.DemoObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.io.Serializable;

public interface DemoObjectRepository extends JpaRepository<DemoObject, Serializable> {
    DemoObject findDemoObjectById(int id);

    @Override
    void delete(DemoObject demoObject);
}
