package pl.coderstrust.db.impl.memory.SQL.Company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderstrust.model.Company;

import javax.transaction.Transactional;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    @Transactional
    void deleteCompanyByVatIdentificationNumber(String vatIdentificationNumber);

    @Transactional
    Company getCompanyByVatIdentificationNumber(String vatIdentificationNumber);

    @Transactional
    Company getCompanyByName(String Name);

    @Transactional
    void deleteCompanyByName(String Name);

}
