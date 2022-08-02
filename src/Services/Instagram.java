package Services;

import java.util.HashMap;
import java.util.HashSet;

import Models.User;

public class Instagram {

	public HashMap<String, User> allUsers = new HashMap<>();

	public void registerUser(String userId, String name, String description) {
		User newUser = null;

		if (allUsers.containsKey(userId)) {
			System.out.println("User already exists.");
		} else {
			newUser = new User(userId, name, description);
			allUsers.put(userId, newUser);
			System.out.println("New User created ");
		}

	}

	/*
	 * FOLLOW_USER | <FOLLOWER_USER_ID> | <FOLLOWING_USER_ID> FOLLOWER_USER_ID will
	 * start following FOLLOWING_USER_ID if not already following.
	 * 
	 * FOLLOW_USER | jon | ned jon is following ned
	 * 
	 */
	
	

	public void followUser(String followersId, String followingId) {
		if(followersId == followingId) {
			System.out.println("You can't follow yourself");
			return;
		}
		if (!allUsers.containsKey(followersId) || !allUsers.containsKey(followingId)) {
			System.out.println("No such user exists.");
		} else {
			User whoIsGoingToFollow = allUsers.get(followersId);
			whoIsGoingToFollow.getFollowing().add(followingId);
			allUsers.get(followingId).getFollowers().add(whoIsGoingToFollow.getUserId());
		}
		String followersName = allUsers.get(followersId).getName();
		String toBeFollowedName = allUsers.get(followingId).getName();
		System.out.println(followersName + " is following " + toBeFollowedName);
	}

	/*
	 * UNFOLLOW_USER | <FOLLOWER_USER_ID> | <FOLLOWING_USER_ID> FOLLOWER_USER_ID
	 * will stop following FOLLOWING_USER_ID if he/she was following earlier.
	 * UNFOLLOW_USER | ned | jon Error: ned was not following jon
	 * 
	 */

	public void unfollowUser(String followerId, String followingId) {
		User whoseFollowerToBeRemoved = allUsers.get(followingId);
		User whoIsUnfollowing = allUsers.get(followerId);
		if (!whoseFollowerToBeRemoved.getFollowers().contains(followerId)) {
			System.out.println(whoIsUnfollowing.getName() + "was not following " + whoseFollowerToBeRemoved.getName());
		} else {
			whoIsUnfollowing.getFollowing().remove(followingId);
			whoseFollowerToBeRemoved.getFollowers().remove(followerId);
			System.out.println(followerId +" unfollowed "+ followingId);
		}
	}
	/*
	 * GET_ALL_USER_INFO Displays all the users’ info with the number of posts
	 * created, number of followers, and number of following GET_ALL_USER_INFO id:
	 * ned, name: Ned Stark, description: Hand of the King, posts: 0, followers: 0,
	 * following: 0 id: jon, name: Jon Snow, description: Night's Watch, posts: 0,
	 * followers: 0, following: 0
	 * 
	 */

	public void getAllUsersInfo() {
		for (String usersDetailsToBePrinted : allUsers.keySet()) {
			User takingOurUsers = allUsers.get(usersDetailsToBePrinted);
			System.out.println("User id: " + takingOurUsers.getUserId() + " name: " + takingOurUsers.getName() + " "
					+ takingOurUsers.getDescription() + " Posts: " + takingOurUsers.getAllUserPosts().size()
					+ " followes: " + takingOurUsers.getFollowers().size() + " following: "
					+ takingOurUsers.getFollowing().size());

		}
	}

	/*
	 * CREATE_POST | <CREATOR_USER_ID> | <POST_ID> | <CONTENTS> This would create a
	 * new post for CREATOR_USER_ID with POST_ID and CONTENTS. For now, the contents
	 * will only be text (i.e String). CREATE_POST | ned | ned_post_1 (post_id) |
	 * Winter is coming!! Post created
	 * 
	 */

	public void createPost(String creatorsId, String postId, String content) {
		if (!allUsers.containsKey(creatorsId)) {
			System.out.println("User doesn't exist.");
		} else {
			User postCreator = allUsers.get(creatorsId);
			postCreator.getAllUserPosts().put(postId, content);
			System.out.println(content);
		}
	}

	/*
	 * GET_FEED | <USER_ID>
Get the post of all the users that he follows ranked using timestamp (latest first). Also, make sure the ranking module is pluggable. (i.e if I want to rank using the number of followers it should be a small change).
GET_FEED | jon
user_id: ned, post_id: ned_post_1, contents: Winter is coming!!

	 */
	
	public void getFeed(String userId) {
		/*
		 * 
		 */
		
	}
	
	

}
