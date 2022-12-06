package com.example.kafkaodev.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
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
