package com.example.service;

import java.util.List;

import com.example.model.Demande;

public interface DemandeService {
	public List<Demande> getAllDemandes();
	public Demande findById(Integer id);
	public Demande update(Demande demande);
	public void add(Demande demande);
	public void delete(Integer id);
	public List<Demande> getDemandesSent(int id);
	

}
