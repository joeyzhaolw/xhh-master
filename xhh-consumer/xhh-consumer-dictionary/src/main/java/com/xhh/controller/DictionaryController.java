package com.xhh.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhh.pojo.SysDataDictionary;
import com.xhh.service.DictionaryService;
import com.xhh.util.LayuiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/xhh")
public class DictionaryController {
    @Autowired
    DictionaryService dictionaryService;

    /**
     * 访问首页
     * @return
     */
    @RequestMapping("/index")
    public String toIndex() {
        return "/destination/dictionary/dictionaryList";
    }

    @GetMapping("/dictionary")
    @ResponseBody
    public LayuiUtils doFindAll(String dictionaryCatalog, String dictionaryValue,
                                @RequestParam(defaultValue = "1") Integer pageNum,
                                @RequestParam(defaultValue = "10") Integer pageSize){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("dictionaryCatalog", dictionaryCatalog);
        map.put("dictionaryValue", dictionaryValue);
        LayuiUtils lay =null;
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<SysDataDictionary> list = dictionaryService.findAllDictionary(map);
            PageInfo<SysDataDictionary> pageInfo = new PageInfo<>(list);
            lay=new LayuiUtils();
            lay.setCode(0);
            lay.setCount((int) pageInfo.getTotal());
            lay.setData(list);
            return lay;
        } catch (Exception e) {
            e.printStackTrace();
            lay.setCount(1);
            lay.setMsg("请求出现异常.....");
            return lay;
        }
    }
}
