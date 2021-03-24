package fr.cesi.projetV2.service.impl;

import fr.cesi.projetV2.business.Statut;
import fr.cesi.projetV2.dao.StatutDao;
import fr.cesi.projetV2.dao.impl.StatutDaoImpl;
import fr.cesi.projetV2.service.StatutService;

import java.sql.SQLException;
import java.util.List;


public class StatutServiceImpl implements StatutService {
	
	private StatutDao statutDao;

	public StatutServiceImpl() {
		// TODO Auto-generated constructor stub
		statutDao = new StatutDaoImpl();
	}

	@Override
	public List<Statut> recupererStatuts() {
		// TODO Auto-generated method stub
		try {
			return statutDao.findAll();
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public Statut recupererStatutId(String idStatut) {
		Statut statut = null;
		try{
			statut = statutDao.findOne(idStatut);
			return statut;
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}

	}

}
