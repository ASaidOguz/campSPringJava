package kodlama.io.rentAcar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.rentAcar.business.Requests.CreateBrandRequest;
import kodlama.io.rentAcar.business.Responses.GetAllBrandsResponse;
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
    public List<GetAllBrandsResponse> getAll() {
        // Business codes will be here
        List<Brand> brands=brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponses=new ArrayList<GetAllBrandsResponse>();

        for(Brand brand:brands){
            GetAllBrandsResponse responseitem=new GetAllBrandsResponse();
            responseitem.setId(brand.getId());
            responseitem.setName(brand.getName());

            brandsResponses.add(responseitem);
        }

        return brandsResponses;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
//Enttity ler new edilebilir. Herhangi
        Brand brand=new Brand();
        brand.setName(createBrandRequest.getName());

        this.brandRepository.save(brand);
    }

}



