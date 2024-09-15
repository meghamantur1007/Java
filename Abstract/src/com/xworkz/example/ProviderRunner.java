package com.xworkz.example;

public class ProviderRunner {

	public static void main(String[] args) {
		Provider provider1 = new BookingProvider("MovieMania", "Rajesh Malhotra");
		Provider provider2 = new BookingProvider("FlickFinders", "Neha Verma");
		boolean store1 = provider1.equals(provider2);
		System.out.println(store1);
		System.out.println(provider2.toString());
		provider1.service();

		System.out.println("=====================================");

		MovieBookingProvider movieBookingProvider = new MovieBookingProvider("CineHub", "Priya Nair");
		boolean store2 = movieBookingProvider.equals(movieBookingProvider);
		System.out.println(store2);
		movieBookingProvider.book();
		movieBookingProvider.cancel();
		System.out.println(movieBookingProvider.toString());
		movieBookingProvider.service();
		System.out.println("=====================================");

		BookMyshowMovieBookingProvider bookMyshowMovieBookingProvider = new BookMyshowMovieBookingProvider(
				"ReelReserve", "Ankit Chopra", 500);
		boolean store3 = bookMyshowMovieBookingProvider.equals(bookMyshowMovieBookingProvider);
		System.out.println(store3);
		System.out.println(bookMyshowMovieBookingProvider.toString());
		bookMyshowMovieBookingProvider.service();
		System.out.println("=====================================");

		DellProvider dellProvider1 = new DellProvider("Dell", "Michael Dell");
		DellProvider dellProvider2 = new DellProvider("Dell", "Dell Technologies");
		boolean store4 = dellProvider1.equals(dellProvider2);
		System.out.println(store4);
		System.out.println(dellProvider1);
		System.out.println(dellProvider2);
		dellProvider1.service();
		System.out.println("=====================================");

		LenovoProvider lenovoProvider1 = new LenovoProvider(3.5, "Yang", "lenovo");
		LenovoProvider lenovoProvider2 = new LenovoProvider(3, "abc", "pqr");
		boolean store5 = lenovoProvider1.equals(lenovoProvider2);
		System.out.println(store4);
		lenovoProvider1.service();
		System.out.println("=====================================");

		InternetProvider internetProvider1 = new InternetProvider("Jio", "Mukesh Ambani");
		InternetProvider internetProvider2 = new InternetProvider("Airtel", "Gopal Vittal");
		boolean store6 = internetProvider1.equals(internetProvider2);
		System.out.println(store6);
		internetProvider1.service();
		System.out.println("=====================================");

		AirtelInternetProvider airtelInternetProvider = new AirtelInternetProvider("Steven", "kiran");
		boolean store7 = airtelInternetProvider.equals(lenovoProvider1);
		System.out.println(store7);
		airtelInternetProvider.service();
		System.out.println("=====================================");

		ExtremeAirtelInternetProvider extremAirtelInternet = new ExtremeAirtelInternetProvider("Megha", "Deepthi");
		boolean store8 = extremAirtelInternet.equals(airtelInternetProvider);
		System.out.println(store8);
		extremAirtelInternet.service();
		System.out.println("=====================================");

		Fast5GExtreme fast5gExtreme = new Fast5GExtreme("Soumya", "Laxmi");
		boolean store9 = fast5gExtreme.equals(fast5gExtreme);
		System.out.println(store9);
		fast5gExtreme.service();
		System.out.println("=====================================");

		JioInternetProvider jioInternetProvider = new JioInternetProvider("Sakshi", "pooja");
		boolean store10 = jioInternetProvider.equals(airtelInternetProvider);
		System.out.println(store10);
		jioInternetProvider.service();
		System.out.println("=====================================");

		SatjioInternetProvider satJioInternetProvider = new SatjioInternetProvider(20000,1998,"JioSatellite", "Mukesh Ambani");
		boolean store11 = satJioInternetProvider.equals(satJioInternetProvider);
		System.out.println(store11);
		satJioInternetProvider.service();
	}

}
