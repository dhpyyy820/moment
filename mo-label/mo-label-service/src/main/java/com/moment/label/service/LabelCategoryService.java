package com.moment.label.service;

import com.moment.label.mapper.LabelCategoryMapper;
import com.moment.label.pojo.LabelCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelCategoryService {

    @Autowired
    private LabelCategoryMapper labelCategoryMapper;

    public List<LabelCategory> queryByParent(Long pid) {
        LabelCategory model = new LabelCategory();
        model.setParent(pid);
        return labelCategoryMapper.select(model);
    }
}
