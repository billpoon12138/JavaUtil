package com.billpoon.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularUtil {
	
	public boolean isNumeric(String str){ 
		   Pattern pattern = Pattern.compile("[0-9]*"); 
		   Matcher isNum = pattern.matcher(str);
		   if( !isNum.matches() ){
		       return false; 
		   } 
		   return true; 
		}
	
	public boolean isEmail(String str){
		Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
		Matcher isEmail = pattern.matcher(str);
		if( !isEmail.matches() ){
		       return false; 
		   } 
		   return true; 
	}
	
    public static boolean checkMobileNumber(String mobileNumber){
        Pattern pattern = Pattern.compile("^(((13[0-9])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8})|(0\\d{2}-\\d{8})|(0\\d{3}-\\d{7})$");
        Matcher matcher = pattern.matcher(mobileNumber);
        if( !matcher.matches()){
        	return false;
        }
        return true; 
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularUtil rg = new RegularUtil();
		System.out.println(rg.isEmail("111e@we.com"));
	}

}
