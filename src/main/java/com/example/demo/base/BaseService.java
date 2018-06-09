package com.example.demo.base;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public abstract class BaseService<T> {

	@Autowired
	private Mapper<T> mapper;

	public int insert(T entity) {
		return mapper.insert(entity);
	}
	
	public int insertSelective(T entity) {
		return mapper.insertSelective(entity);
	}

	public int deleteByPrimaryKey(T entity) {
		return mapper.deleteByPrimaryKey(entity);
	}
	
	public int deleteByExample(Example example) {
		return mapper.deleteByExample(example);
	}
	
	public List<T> selectAll() {
		return mapper.selectAll();
	}
	
	public List<T> selectByExample(Example example) {
		return mapper.selectByExample(example);
	}

	public List<T> selectByExampleAndRowBounds(Example example, RowBounds rowBounds) {
		return mapper.selectByExampleAndRowBounds(example,rowBounds);
	}
	
	public List<T> select(T entity) {
		return mapper.select(entity);
	}
	
	public int selectCount(T entity) {
		return mapper.selectCount(entity);
	}
	
	public int selectCountByExample(Example example) {
		return mapper.selectCountByExample(example);
	}
	
	public T selectOne(T entity) {
		return mapper.selectOne(entity);
	}
	
	public T selectByPrimaryKey(Object key) {
		return mapper.selectByPrimaryKey(key);
	}
	
	public int updateByPrimaryKey(T entity) {
		return mapper.updateByPrimaryKey(entity);
	}
	
	public int updateByExample(T entity,Example example) {
		return mapper.updateByExample(entity,example);
	}
	
	public int updateByPrimaryKeySelective(T entity){
		return mapper.updateByPrimaryKeySelective(entity);
	}

	public int updateByExampleSelective(T entity,Example example) {
		return mapper.updateByExampleSelective(entity,example);
	}

	/**
	 * 单表分页查询 
	 * 
	 * @param pageNum  0
	 * @param pageSize 10
	 * @return
	 */
	public List<T> selectPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return mapper.select(null);
	}

	/**
	 * 单表分页查询
	 * @param entityParam 查询参数实体
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public List<T> selectPage(T entityParam, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return mapper.select(entityParam);
	}

	/**
	 *
	 * @param entityParam 查询参数实体
	 * @param pageNum
	 * @param pageSize
	 * @param orderString 排序字符串，比如："username asc,email desc"
	 * @return
	 */
	public List<T> selectPage(T entityParam, int pageNum, int pageSize, String orderString) {
		PageHelper.startPage(pageNum, pageSize);

		//通用Example查询
		Example example = new Example(entityParam.getClass());
		example.createCriteria().andEqualTo(entityParam);
		example.setOrderByClause(orderString);

		return mapper.selectByExample(example);
	}

	public Mapper<T> getMapper() {
		return mapper;
	}

	public void setMapper(Mapper<T> mapper) {
		this.mapper = mapper;
	}
}
