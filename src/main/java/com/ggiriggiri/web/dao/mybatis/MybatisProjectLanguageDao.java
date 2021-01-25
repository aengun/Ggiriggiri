package com.ggiriggiri.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ggiriggiri.web.dao.ProjectLanguageDao;
import com.ggiriggiri.web.dao.StudyLanguageDao;
import com.ggiriggiri.web.entity.ProjectLanguageView;
import com.ggiriggiri.web.entity.StudyLanguageView;

@Repository
public class MybatisProjectLanguageDao implements ProjectLanguageDao{
	
	@Autowired
	private SqlSession session;
	
	private ProjectLanguageDao mapper;
	
	@Autowired
	public MybatisProjectLanguageDao(SqlSession session) {
		
		mapper = session.getMapper(ProjectLanguageDao.class);
	}

	
	@Override
	public List<ProjectLanguageView> getListByProjectId(int id) {
		
		return mapper.getListByProjectId(id);
	}


	@Override
	public int[] getByProjectIds(int[] skProjectIds, String[] language) {
		
		if(language.length==0)
			language = null;
		
		return mapper.getByProjectIds(skProjectIds, language);
	}

	
}