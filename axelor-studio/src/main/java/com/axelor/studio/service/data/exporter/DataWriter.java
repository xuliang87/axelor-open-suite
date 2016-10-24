package com.axelor.studio.service.data.exporter;

import com.axelor.meta.db.MetaFile;

public interface DataWriter {
	
	void initialize();
	
	void write(String key, Integer index, String[] values);
	
	MetaFile export(MetaFile input);
	
}
