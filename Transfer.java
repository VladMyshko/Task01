final class Transfer{
	
	private static final int GR_TO_KG_TRANSFER_KOEF = 1000;
	private static final int GR_TO_CENTNER_TRANSFER_KOEF = 100000;

	private Transfer(){}

	static double massTransferToKilograms(double gMass){

		 return gMass / GR_TO_KG_TRANSFER_KOEF;
		
	}

	static double massTransferToCentner(double gMass){

		return gMass / GR_TO_CENTNER_TRANSFER_KOEF;

	}

}
		