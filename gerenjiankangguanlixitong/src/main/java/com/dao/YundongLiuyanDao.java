package com.dao;

import com.entity.YundongLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YundongLiuyanView;

/**
 * 运动教程留言 Dao 接口
 *
 * @author 
 */
public interface YundongLiuyanDao extends BaseMapper<YundongLiuyanEntity> {

   List<YundongLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
