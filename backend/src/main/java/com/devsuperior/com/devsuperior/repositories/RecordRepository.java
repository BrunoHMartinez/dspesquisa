package com.devsuperior.com.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.com.devsuperior.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
