package com.brightman.inventory.bbm;

import java.util.List;

public interface BBMDAO {
	List<BBMResult> getAllBBM();
	BBMResult getBBMById(int id);	
	void addBBM(BBM bbm);	
	void updateBBM(BBM bbm, int id);	
	void deleteBBM(int id);	
	int lastestInput();
}
