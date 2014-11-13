package com.FindTheTime;

import java.util.ArrayList;

public class GroupProfile {
	String name;
	String meetingTime;
	UserProfile leader;
	ArrayList<UserProfile> members;
	
	public GroupProfile(String name, String meetingTime, UserProfile leader,
			ArrayList<UserProfile> members) {
		super();
		this.name = name;
		this.meetingTime = meetingTime;
		this.leader = leader;
		this.members = members;
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMeetingTime() {
		return meetingTime;
	}
	public void setMeetingTime(String meetingTime) {
		this.meetingTime = meetingTime;
	}
	public UserProfile getLeader() {
		return leader;
	}
	public void setLeader(UserProfile leader) {
		this.leader = leader;
	}
	public ArrayList<UserProfile> getMembers() {
		return members;
	}
	public void setMembers(ArrayList<UserProfile> members) {
		this.members = members;
	}
	
	

}
