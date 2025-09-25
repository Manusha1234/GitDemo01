/**
 * 
 */
/**
 * 
 */
module Seleniumframework {
	requires org.seleniumhq.selenium.api;
	requires org.seleniumhq.selenium.chrome_driver;
	requires org.testng;
	requires extentreports;
	requires org.seleniumhq.selenium.support;
	requires org.seleniumhq.selenium.remote_driver;
	requires java.sql;
	exports main.java.base;
	exports test.java;
}