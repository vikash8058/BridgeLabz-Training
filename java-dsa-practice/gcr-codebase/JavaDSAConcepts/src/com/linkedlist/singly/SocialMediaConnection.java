package com.linkedlist.singly;

public class SocialMediaConnection {

	// Friend Node
	static class FriendNode {
		int friendId;
		FriendNode next;

		FriendNode(int friendId) {
			this.friendId = friendId;
			this.next = null;
		}
	}

	// User Node
	static class UserNode {
		int userId;
		String name;
		int age;
		FriendNode friendHead;
		UserNode next;

		UserNode(int userId, String name, int age) {
			this.userId = userId;
			this.name = name;
			this.age = age;
			this.friendHead = null;
			this.next = null;
		}
	}

	// Head Pointer
	private UserNode head;

	// Add User
	public void addUser(int userId, String name, int age) {
		UserNode newUser = new UserNode(userId, name, age);

		if (head == null) {
			head = newUser;
		} else {
			UserNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newUser;
		}

		System.out.println("User added: " + name);
	}

	// Search User By ID
	private UserNode searchUserById(int userId) {
		UserNode temp = head;

		while (temp != null) {
			if (temp.userId == userId) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}

	// Search User By Name
	public void searchUserByName(String name) {
		UserNode temp = head;

		while (temp != null) {
			if (temp.name.equalsIgnoreCase(name)) {
				System.out.println("User Found → ID: " + temp.userId + ", Age: " + temp.age);
				return;
			}
			temp = temp.next;
		}
		System.out.println("User not found");
	}

	// Add Friend Connection
	public void addFriendConnection(int userId1, int userId2) {

		UserNode user1 = searchUserById(userId1);
		UserNode user2 = searchUserById(userId2);

		if (user1 == null || user2 == null) {
			System.out.println("One or both users not found");
			return;
		}

		addFriend(user1, userId2);
		addFriend(user2, userId1);

		System.out.println("Friend connection added between " + user1.name + " and " + user2.name);
	}

	private void addFriend(UserNode user, int friendId) {
		FriendNode newFriend = new FriendNode(friendId);

		if (user.friendHead == null) {
			user.friendHead = newFriend;
			return;
		}

		FriendNode temp = user.friendHead;
		while (temp.next != null) {
			if (temp.friendId == friendId) {
				return;
			}
			temp = temp.next;
		}
		temp.next = newFriend;
	}

	// Remove Friend Connection
	public void removeFriendConnection(int userId1, int userId2) {

		UserNode user1 = searchUserById(userId1);
		UserNode user2 = searchUserById(userId2);

		if (user1 == null || user2 == null) {
			System.out.println("User not found");
			return;
		}

		removeFriend(user1, userId2);
		removeFriend(user2, userId1);

		System.out.println("Friend connection removed");
	}

	private void removeFriend(UserNode user, int friendId) {

		FriendNode temp = user.friendHead;

		if (temp == null)
			return;

		if (temp.friendId == friendId) {
			user.friendHead = temp.next;
			return;
		}

		while (temp.next != null && temp.next.friendId != friendId) {
			temp = temp.next;
		}

		if (temp.next != null) {
			temp.next = temp.next.next;
		}
	}

	// Display Friends
	public void displayFriends(int userId) {

		UserNode user = searchUserById(userId);

		if (user == null) {
			System.out.println("User not found");
			return;
		}

		System.out.print("Friends of " + user.name + ": ");
		FriendNode temp = user.friendHead;

		if (temp == null) {
			System.out.println("No friends");
			return;
		}

		while (temp != null) {
			System.out.print(temp.friendId + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	// Mutual Friends
	public void findMutualFriends(int userId1, int userId2) {

		UserNode user1 = searchUserById(userId1);
		UserNode user2 = searchUserById(userId2);

		if (user1 == null || user2 == null) {
			System.out.println("User not found");
			return;
		}

		System.out.print("Mutual Friends: ");
		FriendNode f1 = user1.friendHead;

		boolean found = false;

		while (f1 != null) {
			FriendNode f2 = user2.friendHead;
			while (f2 != null) {
				if (f1.friendId == f2.friendId) {
					System.out.print(f1.friendId + " ");
					found = true;
				}
				f2 = f2.next;
			}
			f1 = f1.next;
		}

		if (!found) {
			System.out.print("None");
		}
		System.out.println();
	}

	// Count Friends
	public void countFriends() {

		UserNode temp = head;

		while (temp != null) {
			int count = 0;
			FriendNode f = temp.friendHead;

			while (f != null) {
				count++;
				f = f.next;
			}

			System.out.println(temp.name + " has " + count + " friends");
			temp = temp.next;
		}
	}

	// Main Method
	public static void main(String[] args) {

		SocialMediaConnection sm = new SocialMediaConnection();

		sm.addUser(1, "Rahul", 22);
		sm.addUser(2, "Amit", 21);
		sm.addUser(3, "Priya", 23);
		sm.addUser(4, "Neha", 20);

		sm.addFriendConnection(1, 2);
		sm.addFriendConnection(1, 3);
		sm.addFriendConnection(2, 3);
		sm.addFriendConnection(2, 4);

		sm.displayFriends(1);
		sm.findMutualFriends(1, 2);
		sm.searchUserByName("Priya");
		sm.countFriends();
		sm.removeFriendConnection(1, 2);
		sm.displayFriends(1);
	}
}
