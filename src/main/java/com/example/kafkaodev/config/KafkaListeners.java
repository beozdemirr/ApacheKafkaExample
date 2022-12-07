package com.example.kafkaodev.config;

import com.example.kafkaodev.model.ModelDto;
import com.example.kafkaodev.model.ModelDtoRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @Autowired
    ModelDtoRepository modelDtoRepository;

    @KafkaListener(topics = "usermodel", groupId = "groupId")
    void listen(String modelDto) throws JsonProcessingException {
        System.out.println("Received Message in group foo: " + modelDto );

        ObjectMapper objectMapper = new ObjectMapper();
        ModelDto modelDto1 = objectMapper.readValue(modelDto, ModelDto.class);
        modelDtoRepository.save(modelDto1);

    }




}