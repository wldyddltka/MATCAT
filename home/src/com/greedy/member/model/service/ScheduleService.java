package com.greedy.member.model.service;

import static com.greedy.common.Template.getSqlSession;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.greedy.common.SearchCriteria;
import com.greedy.member.model.dao.SqlMapper;
import com.greedy.member.model.dto.ScheduleDTO;

public class ScheduleService {

	private SqlMapper mapper;
	
	public List<ScheduleDTO> selectAllMenu() {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(SqlMapper.class);
		
		List<ScheduleDTO> list = mapper.selectAllMenu();
		
		sqlSession.close();
		
		return list;
	}

	public int insertSchedule(ScheduleDTO DTO) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(SqlMapper.class);
		
		int result = mapper.insertSchedule(DTO);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result;
	}

	public List<ScheduleDTO> searchByThis(SearchCriteria parameter) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(SqlMapper.class);
		
		List<ScheduleDTO> scheduleList = mapper.searchByThis(parameter);
		
		
		return scheduleList;
		
	}

	public int modifySchedule(ScheduleDTO parameter) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(SqlMapper.class);
		
		int result = mapper.modifySchedule(parameter);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result;
	}

	public int deleteSchedule(Integer delete) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(SqlMapper.class);
		
		int result = mapper.deleteSchedule(delete);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result;
	}



}
