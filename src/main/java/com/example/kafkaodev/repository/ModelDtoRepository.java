package com.example.kafkaodev.repository;

import com.example.kafkaodev.model.ModelDto;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ModelDtoRepository extends CassandraRepository<ModelDto, Integer> {

}

