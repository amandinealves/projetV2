package fr.cesi.projetV2.service;

import fr.cesi.projetV2.business.Statut;

import java.util.List;

public interface StatutService {
	
	public List<Statut> recupererStatuts();

    Statut recupererStatutId(String idStatut);
}
