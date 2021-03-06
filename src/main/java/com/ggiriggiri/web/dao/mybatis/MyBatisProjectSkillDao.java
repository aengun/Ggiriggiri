package com.ggiriggiri.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ggiriggiri.web.dao.ProjectSkillDao;
import com.ggiriggiri.web.entity.ProjectSkill;
import com.ggiriggiri.web.entity.ProjectSkillView;


@Repository 
public class MyBatisProjectSkillDao implements ProjectSkillDao{
	
	@Autowired
	private SqlSession session;
	
	private ProjectSkillDao mapper;
	
	@Autowired
	public MyBatisProjectSkillDao(SqlSession session) {
		
		this.session=session;
		mapper = session.getMapper(ProjectSkillDao.class);
	}

	
	@Override
	public List<ProjectSkillView> getListByProjectId(int id) {
		return mapper.getListByProjectId(id);
	}

	
	


	@Override
	public int insert(ProjectSkill projectSkill) {
		// TODO Auto-generated method stub
		return mapper.insert(projectSkill);
	}


	@Override
	public int[] getProjectIdsBySkillNames(int[] projectIds, String[] skill) {
		if(skill.length==0)
			skill = null;
		
		return mapper.getProjectIdsBySkillNames(projectIds, skill);
	}


	@Override
	public int update(ProjectSkill projectSkill) {
		return mapper.update(projectSkill);
	}


	@Override
	public int getId(int projectId, int skillId) {
		return mapper.getId(projectId, skillId);
	}


	

}
