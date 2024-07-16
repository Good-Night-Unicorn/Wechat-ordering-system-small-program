package com.dao;

import com.entity.CaipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaipinVO;
import com.entity.view.CaipinView;


/**
 * 菜品
 * 
 * @author 
 * @email 
 * @date 2021-04-21 14:16:56
 */
public interface CaipinDao extends BaseMapper<CaipinEntity> {
	
	List<CaipinVO> selectListVO(@Param("ew") Wrapper<CaipinEntity> wrapper);
	
	CaipinVO selectVO(@Param("ew") Wrapper<CaipinEntity> wrapper);
	
	List<CaipinView> selectListView(@Param("ew") Wrapper<CaipinEntity> wrapper);

	List<CaipinView> selectListView(Pagination page,@Param("ew") Wrapper<CaipinEntity> wrapper);
	
	CaipinView selectView(@Param("ew") Wrapper<CaipinEntity> wrapper);
	
}
