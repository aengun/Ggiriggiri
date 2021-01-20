package com.ggiriggiri.web.entity;

public class Language {
	private int id;
	private String name;
	private String image;

	public Language() {
		this(0, null, null);
	}

	public Language(int id, String name, String image) {
		this.id = id;
		this.name = name;
		this.image = image;
	}

	@Override
	public String toString() {
		return "Language [id=" + id + ", name=" + name + ", image=" + image + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}