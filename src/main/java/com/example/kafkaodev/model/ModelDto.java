package com.example.kafkaodev.model;


import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;


@Data
@Table("userfollowers")
public class ModelDto {
    @PrimaryKey
    private int userId;
    private List<Integer> followerList;


}
