package com.misiontic.account_ms.repositories;

import com.misiontic.account_ms.models.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public class TransactionRepository extends MongoRepository <Transaction, String>  {
    List<Transaction> findByUserIdOrigin (String userIdOrigin);
    List<Transaction> findByUserDestiny (String userIdDestiny);
}
