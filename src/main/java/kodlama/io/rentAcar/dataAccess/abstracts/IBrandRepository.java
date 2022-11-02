package kodlama.io.rentAcar.dataAccess.abstracts;

import java.util.List;

import kodlama.io.rentAcar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBrandRepository extends JpaRepository<Brand,Integer> {


}

//BTK ileri Java kursu...