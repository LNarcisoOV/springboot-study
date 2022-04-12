package com.spgbt.service;

import com.spgbt.feign.ChuckNorrisFeign;
import com.spgbt.model.ChuckNorris;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisServiceImpl implements ChuckNorrisService{

    private ChuckNorrisFeign chuckNorrisFeign;

    public ChuckNorris getRandom(){
        return chuckNorrisFeign.getRandom();
    }
}
