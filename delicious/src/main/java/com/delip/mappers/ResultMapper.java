package com.delip.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.delip.domain.Result;
import com.delip.dto.Criteria;

public interface ResultMapper extends CRUDMapper<Result, Integer>{


	public void create();
	
	@Select("select * from dtb_restaurant order by rno desc limit #{skip}, #{size}")
	public List<Result> getList(Criteria cri);
	
	@Select("select count(rno) from dtb_restaurant ")
	public int getTotal(Criteria cri);
	
}
