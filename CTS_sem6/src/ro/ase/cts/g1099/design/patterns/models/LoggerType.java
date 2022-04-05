package ro.ase.cts.g1099.design.patterns.models;

public enum LoggerType {
	ERROR("error.log", "*Error*"), INFO("info.log", "<Info>");
	
	String filename;
	String messagePatern;
	
	private LoggerType(String filename, String messagePatern) {
		this.filename = filename;
		this.messagePatern = messagePatern;
	}

	public String getFilename() {
		return filename;
	}

	public String getMessagePatern() {
		return messagePatern;
	}
	
}
