package com.example.exampleschedule.entity;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import io.lettuce.core.dynamic.annotation.CommandNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import java.io.Serializable;


@Data
@Container(containerName = "User")
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 4000114013664273357L;

    @Id
    @GeneratedValue
    private String id;
    @PartitionKey
    private String email;

    private String name;

}
