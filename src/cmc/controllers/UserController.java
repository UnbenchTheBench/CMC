package cmc.controllers;

import java.util.List;

import cmc.CMCException;

public class UserController {
	
	// other classes should *not* instantiate this class.  It is "pure static".
	private UserController() throws CMCException {
		throw new CMCException("Attempt to instantiate a UserController");
	}

	// this ADMIN ONLY method returns the list of all the users (and their data)
	// TODO: shouldn't this return a List of User objects?
	public static List<String[]> getAllUsers() {
		List<String[]> usersList = DatabaseController.getAllUsers();
		return usersList;
	}
	
	// this ADMIN ONLY method attempts to add a user to the database with the
	// provided details
	public static boolean addUser(String username, String password,
			String firstName, String lastName, boolean isAdmin) {
		return DatabaseController.addUser(username, password, firstName, lastName, isAdmin);
	}

}
