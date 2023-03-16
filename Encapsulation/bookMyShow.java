
class bookMyShow {

	public static void main(String[] args) {
		System.out.println("Welcome to Book My Show!.......Loading PVRCinema Movies ....... ");
		PVRMovies cust1Ticket=PVRMovies.bookTicket();
		System.out.println("Your Ticket is Confirmed and Ticket id is "+cust1Ticket);
		PVRMovies cust2Ticket=PVRMovies.bookTicket();
		System.out.println("Your Ticket is Confirmed and Ticket id is "+cust2Ticket);

	}

}
