package com.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Type {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String duree;
	
	private String dimension;
	private String version;
	private String couleurs;
	private String outils;
	@ManyToOne
	@JsonIgnoreProperties("demande")
	@JoinColumn(name="DEMANDE_ID")
	private Demande demande;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "type")
    private List<Image> images;
	

	public Type(Integer id, String duree, String dimension, String version, String couleurs, String outils,
			Demande demande, List<Image> images) {
		super();
		this.id = id;
		this.duree = duree;
		this.dimension = dimension;
		this.version = version;
		this.couleurs = couleurs;
		this.outils = outils;
		this.demande = demande;
		this.images = images;
	}
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getCouleurs() {
		return couleurs;
	}
	public void setCouleurs(String couleurs) {
		this.couleurs = couleurs;
	}
	public String getOutils() {
		return outils;
	}
	public void setOutils(String outils) {
		this.outils = outils;
	}
	public Demande getDemande() {
		return demande;
	}
	public void setDemande(Demande demande) {
		this.demande = demande;
	}
	public List<Image> getImages() {
		return images;
	}
	public void setImages(List<Image> images) {
		this.images = images;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	}	
	

