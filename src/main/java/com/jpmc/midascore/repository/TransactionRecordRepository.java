package com.jpmc.midascore.repository;

import com.jpmc.midascore.foundation.TransactionRecord;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRecordRepository extends CrudRepository<TransactionRecord, Long> {
}
