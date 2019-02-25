package demo.persistence;

import demo.domain.DemoObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoObjectRepository extends JpaRepository<DemoObject, Long> {
}
