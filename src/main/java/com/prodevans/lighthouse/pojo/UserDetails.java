package com.prodevans.lighthouse.pojo;

public class UserDetails {
	private int user_id;
	private String user_name;
	private String password;
	private String desc;
	/**
	 * 
	 */
	public UserDetails() {
		super();
	}
	/**
	 * @param user_id
	 * @param user_name
	 * @param password
	 * @param desc
	 */
	public UserDetails(int user_id, String user_name, String password, String desc) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.password = password;
		this.desc = desc;
	}
	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}
	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserDetails [user_id=" + user_id + ", user_name=" + user_name + ", password=" + password + ", desc="
				+ desc + "]";
	}
	
	
}
