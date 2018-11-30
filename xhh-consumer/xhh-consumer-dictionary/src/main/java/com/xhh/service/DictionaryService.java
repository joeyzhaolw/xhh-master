package com.xhh.service;

import com.xhh.pojo.SysDataDictionary;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@FeignClient(name = "xhh-provider-dictionary")
public interface DictionaryService {
    @PostMapping("/select")
    public List<SysDataDictionary> findAllDictionary(Map<String,Object> map);
}
