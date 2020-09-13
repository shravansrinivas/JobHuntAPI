package com.job.model;

public class Certification {
String title;
String Provider;
int completionYear;
int expiryYear;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getProvider() {
	return Provider;
}
public void setProvider(String provider) {
	Provider = provider;
}
public int getCompletionYear() {
	return completionYear;
}
public void setCompletionYear(int completionYear) {
	this.completionYear = completionYear;
}
public int getExpiryYear() {
	return expiryYear;
}
public void setExpiryYear(int expiryYear) {
	this.expiryYear = expiryYear;
}
}
