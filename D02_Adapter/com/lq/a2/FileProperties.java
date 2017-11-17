package com.lq.a2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void readFromFile(String filename) throws IOException {
		InputStream i = new FileInputStream(filename);
		load(i);
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		OutputStream out = new FileOutputStream(filename);
		this.store(out, "written by FileProperties");
	}

	@Override
	public void setValue(String key, String value) {
		setProperty(key, value);

	}

	@Override
	public String getValue(String key) {
		return getProperty(key);

	}

}
