package ro.ase.cts.g1099.assignment2.classes;

public enum BankAccountType {
	STANDARD(0) , BUDGET(1), PREMIUM(2), SUPER_PREMIUM(3);
	
	int typeId;
	
	private BankAccountType(int typeId) {
		this.typeId = typeId;
	}

	public int getTypeId() {
		return typeId;
	}
	
}
