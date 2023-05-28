package ra.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ra.model.Customer;
import ra.model.Province;

public interface IProvinceRepository extends PagingAndSortingRepository<Province,Long>{
}
