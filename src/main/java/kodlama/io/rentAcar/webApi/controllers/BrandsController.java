package kodlama.io.rentAcar.webApi.controllers;

import java.util.List;

import kodlama.io.rentAcar.business.Requests.CreateBrandRequest;
import kodlama.io.rentAcar.business.Responses.GetAllBrandsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentAcar.business.abstracts.IBrandService;
import kodlama.io.rentAcar.entities.concretes.Brand;

@RestController
@RequestMapping("api/brands")
public class BrandsController {
    private IBrandService brandService;

    @Autowired
    public BrandsController(IBrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }
    @PostMapping("/add")
    public void add(CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }

}