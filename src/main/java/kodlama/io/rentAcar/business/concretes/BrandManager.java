package kodlama.io.rentAcar.business.concretes;

import java.util.List;

import kodlama.io.rentAcar.business.abstracts.IBrandService;
import kodlama.io.rentAcar.dataAccess.abstracts.IBrandRepository;
import kodlama.io.rentAcar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandManager implements IBrandService {
private IBrandRepository brandRepository;

    @Autowired
    public BrandManager(IBrandRepository brandRepository) {
        super();
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        // Business codes will be here
        return this.brandRepository.getAll();
    }

}



