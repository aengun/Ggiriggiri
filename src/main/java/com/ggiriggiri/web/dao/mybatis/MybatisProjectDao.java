package com.ggiriggiri.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ggiriggiri.web.dao.ProjectDao;
import com.ggiriggiri.web.entity.Project;
import com.ggiriggiri.web.entity.ProjectView;

@Repository
public class MybatisProjectDao implements ProjectDao {

	private ProjectDao mapper;

	/* 생성자 */
	@Autowired
	public MybatisProjectDao(SqlSession session) {
		mapper = session.getMapper(ProjectDao.class);
	}

	@Override
	public int insert(Project project) {
		return mapper.insert(project);
	}

	@Override
	public int update(Project project) {
		return mapper.update(project);
	}

	@Override
	public int delete(int id) {
		return mapper.delete(id);
	}

	@Override
	public Project get(int id) {
		return mapper.get(id);
	}

	@Override
	public List<Project> getList(int startIndex, int endIndex, String field, String query) {
		return mapper.getList(startIndex, endIndex, field, query);
	}

//	@Override
//	public List<ProjectView> getViewList(int startIndex, int endIndex, String field, String query) {
//		return null;
//	}

	@Override
	public int getCount(int[] ids, String title, String query) {
		return mapper.getCount(ids, title, query);
	}

	@Override
	public List<Project> getList() {
		return mapper.getList();
	}

	@Override
	public List<ProjectView> getViewList(int[] ids, int offset, int size, String title, String query) {

		return mapper.getViewList(ids, offset, size, title, query);
	}

	@Override
	public ProjectView getView(int id) {
		return mapper.getView(id);
	}

	@Override
	public ProjectView getPrev(int id) {
		return mapper.getPrev(id);
	}

	@Override
	public ProjectView getNext(int id) {
		return mapper.getNext(id);
	}

	@Override
	public Project getLast() {
		return mapper.getLast();
	}

	@Override
	public int[] getIdsByFieldNames(String[] field) {
		if (field.length == 0)
			field = null;

		return mapper.getIdsByFieldNames(field);
	}

	@Override
	public int[] getIdsByLeaderId(int leaderId, int statusId) {
		return mapper.getIdsByLeaderId(leaderId, statusId);
	}

	@Override
	public List<ProjectView> getViewListByStatusId(int[] ids, int leaderId, int statusId) {
		return mapper.getViewListByStatusId(ids, leaderId, statusId);
	}

	@Override
	public int updateStatusById(int id, int statusId) {
		// TODO Auto-generated method stub
		return mapper.updateStatusById(id, statusId);
	}

}
