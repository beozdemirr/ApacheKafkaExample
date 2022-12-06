package com.example.kafkaodev.model;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ModelDtoRepository extends CassandraRepository<ModelDto, Integer> {

}

