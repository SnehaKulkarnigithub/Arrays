
public class PVRMovies {
	private static boolean setBookStatus=false;
	private static PVRMovies mTicket;
	private PVRMovies()
	{
		System.out.println("Welcome to PVRCinemas");
	}
	
	public static PVRMovies bookTicket()
	{
		if(setBookStatus == false)
		{
			mTicket=new PVRMovies();
			setBookStatus=true;
		}
		return mTicket;
	}

}
