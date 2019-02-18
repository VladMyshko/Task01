final class Bytetransfer{
	
	private final static int FROM_BYTE_TO_KILOBYTE = 1024;
	private final static int FROM_BYTE_TO_MEGABYTE = 1048576;

	private Bytetransfer(){}

	static long transferToKilobyte(long b){

		return b / FROM_BYTE_TO_KILOBYTE;
		
	}

	static long transferToMegabyte(long b){

		return  b / FROM_BYTE_TO_MEGABYTE;
		

	}

}

		