package mx.com.ovaldez.store.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.ovaldez.store.shopping.entity.InvoiceItem;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
}
