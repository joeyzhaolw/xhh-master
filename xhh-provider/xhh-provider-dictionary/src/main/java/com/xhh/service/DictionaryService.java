package com.xhh.service;

import com.xhh.mapper.SysDataDictionaryMapper;
import com.xhh.pojo.SysDataDictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DictionaryService {
    @Autowired
    private SysDataDictionaryMapper sysDataDictionaryMapper;

    @PostMapping("/select")
    public List<SysDataDictionary> findAllDictionary(Map<String,Object> map){
        List<SysDataDictionary> list = sysDataDictionaryMapper.findAllDictionary(map);
        return list;
    }
}
