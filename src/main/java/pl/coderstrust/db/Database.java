package pl.coderstrust.db;

import pl.coderstrust.model.Invoice;

import java.util.List;

public interface Database {

    void saveInvoice(Invoice invoice);

    void removeInvoice(int id);

    int getLastId();

    List<Invoice> getInvoices();

    List<Invoice> getInvoicesFromCurrentDay();

}
