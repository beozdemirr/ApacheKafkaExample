package com.example.kafkaodev.controller;


import com.example.kafkaodev.model.Model;
import com.example.kafkaodev.model.ModelDto;
import com.example.kafkaodev.service.ModelService;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ModelController {


    final KafkaTemplate<String, Object> kafkaTemplate;
    private final ModelService modelService;

    public ModelController(KafkaTemplate<String, Object> kafkaTemplate, ModelService modelService) {
        this.kafkaTemplate = kafkaTemplate;
        this.modelService = modelService;

    }

    @PostMapping("/save")
    public Object publish(@RequestBody Model model) {
       ModelDto modelDto = new ModelDto();
        modelDto.setUserId(model.getId());
        modelDto.setFollowerList(model.getFollowerList());
        kafkaTemplate.send("usermodel", modelDto);
        modelService.save(model);
        return modelDto;

    }


}
