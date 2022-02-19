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

    @PostMapping("/save")
    public Boolean saveReference(@RequestBody Reference reference){
        int save = mapper.insert(reference);
        return save==1;
    }

    @PutMapping ("/update")
    private Boolean updateReference(@RequestBody Reference reference){
        int update = mapper.updateById(reference);
        return update == 1;
    }

    @GetMapping("/get")
    private List<Reference> getReference() {
        return mapper.selectList(null);
    }




}
