package Models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class User {
	
	class Pair{
		int postId;
		
		String data;
		
		Pair(int postId, String data){
			this.postId = postId;
			this.data = data;
		}
	}
	
	private String userId;
	
	private String name;
	
	private char gender;
	
	private String description;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String contact;
	
	private String email;
	
	private HashSet<String> followers;
	
	private HashSet<String> following;
	
	private HashMap<String,String> allUserPosts;
	
	//private PriorityQueue<Pair> allPosts;
	
	public User(){
		
	}
	
	public User(String userId,String name, String description){
		this.userId = userId;
		this.name = name;
		this.description = description;
		this.followers = new HashSet<>();
		this.following = new HashSet<>();
		this.allUserPosts = new HashMap<>();
		//this.allPosts = new PriorityQueue<>((a,b)->a.postId - b.postId);
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public HashSet<String> getFollowers() {
		return followers;
	}

	public void setFollowers(HashSet<String> followers) {
		this.followers = followers;
	}

	public HashSet<String> getFollowing() {
		return following;
	}

	public void setFollowing(HashSet<String> following) {
		this.following = following;
	}

	public char getGender() {
		return gender;
	}

	public HashMap<String, String> getAllUserPosts() {
		return allUserPosts;
	}

	public void setAllUserPosts(HashMap<String, String> allUserPosts) {
		this.allUserPosts = allUserPosts;
	}
	
	
	

}
