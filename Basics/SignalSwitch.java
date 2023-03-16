class SignalSwitch
{
	public static void main(String[] args)
	{
		char signal='G';
		switch(signal)
		{
			case 'R': System.out.println("Please Stop");
			break;
			case 'G': System.out.println("Please Go");
			break;
			case 'Y': System.out.println("Go slow");
			break;
		}
	}
}