package com.tanjifeizhai.subject.infra.basic.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tanjifeizhai.subject.infra.basic.entity.SubjectCategory;
import com.tanjifeizhai.subject.infra.basic.mapper.SubjectCategoryDao;
import com.tanjifeizhai.subject.infra.basic.service.SubjectCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 题目分类(SubjectCategory)表服务实现类
 *
 * @author makejava
 * @since 2024-07-14 10:39:46
 */
@Service("subjectCategoryService")
public class SubjectCategoryServiceImpl implements SubjectCategoryService {
    @Resource
    private SubjectCategoryDao subjectCategoryDao;





    /**
     * 新增数据
     *
     * @param subjectCategory 实例对象
     * @return 实例对象
     */
    @Override
    public SubjectCategory insert(SubjectCategory subjectCategory) {
        this.subjectCategoryDao.insert(subjectCategory);
        return subjectCategory;
    }

    @Override
    public SubjectCategory queryById(Long id) {
        return this.subjectCategoryDao.queryById(id);
    }

    /**
     * 修改数据
     *
     * @param subjectCategory 实例对象
     * @return 实例对象
     */
    @Override
    public SubjectCategory update(SubjectCategory subjectCategory) {
        this.subjectCategoryDao.update(subjectCategory);
        return this.queryById(subjectCategory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.subjectCategoryDao.deleteById(id) > 0;
    }
}
