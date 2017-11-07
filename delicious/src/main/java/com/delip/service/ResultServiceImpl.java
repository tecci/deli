package com.delip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delip.domain.Result;
import com.delip.dto.Criteria;
import com.delip.mappers.ResultMapper;

@Service
public class ResultServiceImpl implements ResultService {

	@Autowired
	private ResultMapper mapper;
	
	@Override
	public List<Result> getList(Criteria cri) {
		return mapper.getList(cri);
	}
	 
	@Override
	public int getListCount(Criteria cri) {
		// TODO Auto-generated method stub
		return mapper.getTotal(cri);
	}

	@Override
	public Result get(Integer rno) {
		// TODO Auto-generated method stub
		return mapper.read(rno);
	}

}
