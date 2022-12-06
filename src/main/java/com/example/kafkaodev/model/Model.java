package com.example.kafkaodev.model;


import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;
import java.util.List;

@Data
@Table("olsunmu")
public class Model {

    @PrimaryKey
    private int id;
    private String name;
    private String surname;
    private List<Integer> followerList;
    private Date createdAt;



}
