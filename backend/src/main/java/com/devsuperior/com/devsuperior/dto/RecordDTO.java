package com.devsuperior.com.devsuperior.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.com.devsuperior.entities.Record;
import com.devsuperior.com.devsuperior.entities.enums.Platform;

public class RecordDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Integer age;
	private Instant moment;
	private String gameTitle;
	private Platform gameplatform;
	private String genreName;

	public RecordDTO() {

	}

	public RecordDTO(Record entity) {
		id = entity.getId();
		name = entity.getName();
		age = entity.getAge();
		moment = entity.getMoment();
		gameTitle = entity.getGame().getTitle();
		gameplatform = entity.getGame().getPlatform();
		genreName = entity.getGame().getGenre().getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public String getGameTitle() {
		return gameTitle;
	}

	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}

	public Platform getGameplatform() {
		return gameplatform;
	}

	public void setGameplatform(Platform gameplatform) {
		this.gameplatform = gameplatform;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
}
