package com.FindTheTime;

public abstract class UserProfile {
protected Calendar calendar;
protected String name;
protected GroupProfile member;

public UserProfile(Calendar calendar, String name, GroupProfile member) {
	super();
	this.calendar = calendar;
	this.name = name;
	this.member = member;
}
public UserProfile(){}
public GroupProfile createNewGroup(String teamName){
	return GroupProfile;
}

public void inputCalendar()
{
	return;
}
public void leaveGroup()
{
	
}
}

