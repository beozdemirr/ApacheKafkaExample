package com.example.kafkaodev.repository;


import com.example.kafkaodev.model.Model;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ModelRepository extends CassandraRepository<Model, Integer> {


}

