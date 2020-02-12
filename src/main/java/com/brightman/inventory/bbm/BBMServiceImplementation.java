package com.brightman.inventory.bbm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BBMServiceImplementation implements BBMService {	
	@Autowired
	private BBMDAO bbmDAO;

	@Override
	public List<BBMResult> getAllBBM() {
		return bbmDAO.getAllBBM();
	}

	@Override
	public BBMResult getBBMById(int id) {
		return bbmDAO.getBBMById(id);
	}

	@Override
	public void addBBM(BBM bbm) {
		bbmDAO.addBBM(bbm);
	}

	@Override
	public void updateBBM(BBM bbm, int id) {
	    bbmDAO.updateBBM(bbm, id);
	}

	@Override
	public void deleteBBM(int id) {
	    bbmDAO.deleteBBM(id);		
	}

	@Override
	public int lastestInput() {
		return bbmDAO.lastestInput();
	}
}
