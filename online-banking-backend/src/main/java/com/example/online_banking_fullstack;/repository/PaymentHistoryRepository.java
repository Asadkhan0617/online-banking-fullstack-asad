package com.example.online_banking_fullstack.repository;

import com.example.online_banking_fullstack.models.PaymentHistory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PaymentHistoryRepository extends CrudRepository<PaymentHistory,Integer> {

    @Query(value = "SELECT * FROM v_payments WHERE user_id = :user_id",nativeQuery = true)
    List<PaymentHistory> getPaymentsRecordsById(@Param("user_id")int user_id);
}
