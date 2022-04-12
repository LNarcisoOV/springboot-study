package com.spgbt.feign;

import com.spgbt.model.ChuckNorris;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient
public interface ChuckNorrisFeign {

    @GetMapping("https://api.chucknorris.io/jokes/random")
    public ChuckNorris getRandom();
}
