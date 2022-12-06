package com.example.kafkaodev.model;


import org.springframework.stereotype.Service;

@Service
public class ModelDtoService {
    private ModelDtoRepository modelDtoRepository;

    public ModelDtoService(ModelDtoRepository modelDtoRepository) {
        this.modelDtoRepository = modelDtoRepository;
    }

    /*public ModelDto saveUsersFollowers(ModelDto modelDto) {
        ModelDto modelDto1 = ModelDto.builder().userId(modelDto.getUserId())
                .followerList(modelDto.getFollowerList())
                .build();
        return modelDtoRepository.save(modelDto1);

    }*/
}


