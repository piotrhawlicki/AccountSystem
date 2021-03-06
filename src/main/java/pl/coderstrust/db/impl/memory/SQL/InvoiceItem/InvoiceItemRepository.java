package pl.coderstrust.db.impl.memory.SQL.InvoiceItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderstrust.model.InvoiceItem;

import javax.transaction.Transactional;

@Repository
public interface InvoiceItemRepository extends JpaRepository<InvoiceItem, Long> {

    @Transactional
    InvoiceItem getInvoiceItemByDescription(String description);

    @Transactional
    InvoiceItem getInvoiceItemById(long id);

    @Transactional
    void deleteInvoiceItemById(long id);

    @Transactional
    void deleteInvoiceItemByDescription(String description);
}
