package com.xkjs.controller;

import com.xkjs.entity.Reference;
import com.xkjs.mapper.ReferenceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/reference")
@RestController
public class ReferenceController {
    @Autowired
    ReferenceMapper mapper;

    @GetMapping("/get")
    public List<Reference> getReference(){
        return mapper.selectList(null);
    }

    @PostMapping("/post")
    public Boolean saveReference(@RequestBody Reference reference){
        return mapper.insert(reference)==1;
    }

    @PutMapping("/put")
    public Boolean updateReference(@RequestBody Reference reference){
        return mapper.updateById(reference)==1;
    }

    @DeleteMapping("/delete")
    public Boolean deleteUser(Integer id){
        return mapper.deleteById(id)==1;
    }
}
