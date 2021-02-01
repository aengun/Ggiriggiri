package com.ggiriggiri.web.dao;

import java.util.List;

import com.ggiriggiri.web.entity.StudyLanguage;
import com.ggiriggiri.web.entity.StudyLanguageView;

public interface StudyLanguageDao {

	List<StudyLanguageView> getViewList(int id);


	int[] getStudyIdsByLanguageNames(int[] studyIds, String[] language);


	int insert(StudyLanguage sl);



	

	

}
