package com.example.kafkaodev.model;


import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class ModelService {

    private final ModelRepository modelRepository;


    public ModelService(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }


    public Model save(Model model)
    {
        Model model1 = new Model();
        model1.setId(model.getId());
        model1.setName(model.getName());
        model1.setSurname(model.getSurname());
        model1.setFollowerList(model.getFollowerList());
        model1.setCreatedAt(new Date());
        System.out.println("buraya bak = " + model1);
        modelRepository.save(model1);
        return model1;
    }



}