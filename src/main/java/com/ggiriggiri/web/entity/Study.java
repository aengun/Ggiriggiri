package com.ggiriggiri.web.entity;


import java.util.Date;
import java.util.List;

public class Study {
	private int id;
    private String title;
    private String content;
    private int limitNumber;
    private int leaderId;
    private Date startDate;
    private Date endDate;
    private String requirement;
    private int statusId;
    private Date regDate;
    private String image;
    private int filedId;
    
   
    private List<StudyLanguageView> language;
    private List<StudySkillView> skill;
    

    public Study() {
		// TODO Auto-generated constructor stub
	}

	public Study(int id, String title, String content, int limitNumber, int leaderId, Date startDate, Date endDate,
			String requirement, int statusId, Date regDate, String image, int filedId) {
		
		this.id = id;
		this.title = title;
		this.content = content;
		this.limitNumber = limitNumber;
		this.leaderId = leaderId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.requirement = requirement;
		this.statusId = statusId;
		this.regDate = regDate;
		this.image = image;
		this.filedId = filedId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLimitNumber() {
		return limitNumber;
	}

	public void setLimitNumber(int limitNumber) {
		this.limitNumber = limitNumber;
	}

	public int getLeaderId() {
		return leaderId;
	}

	public void setLeaderId(int leaderId) {
		this.leaderId = leaderId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getRequirement() {
		return requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getFiledId() {
		return filedId;
	}

	public void setFiledId(int filedId) {
		this.filedId = filedId;
	}
	
	

	public List<StudyLanguageView> getLanguage() {
		return language;
	}

	public void setLanguage(List<StudyLanguageView> language) {
		this.language = language;
	}
	
	



	public List<StudySkillView> getSkill() {
		return skill;
	}

	public void setSkill(List<StudySkillView> skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Study [id=" + id + ", title=" + title + ", content=" + content + ", limitNumber=" + limitNumber
				+ ", leaderId=" + leaderId + ", startDate=" + startDate + ", endDate=" + endDate + ", requirement="
				+ requirement + ", statusId=" + statusId + ", regDate=" + regDate + ", image=" + image + ", filedId="
				+ filedId + "]";
	}
	

}
