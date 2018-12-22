package com.moment.label.controller;

import com.moment.label.pojo.LabelCategory;
import com.moment.label.service.LabelCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LabelCategoryController {

    @Autowired
    private LabelCategoryService labelCategoryService;

    @GetMapping("category")
    public ResponseEntity<List<LabelCategory>> queryByParent(@RequestParam(value = "parentid",defaultValue = "0") Long parentid) {
        List<LabelCategory> list = labelCategoryService.queryByParent(parentid);
        if(list == null || list.size() < 1) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return ResponseEntity.ok(list);
        }
    }

}
