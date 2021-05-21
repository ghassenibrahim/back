package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Image {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Lob
	private byte[]image;
	@ManyToOne
	@JoinColumn(name = "type_id")
	@JsonIgnoreProperties("images")
	private Type type;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Image(Integer id, byte[] image) {
		super();
		this.id = id;
		this.image = image;
	}
	

}
