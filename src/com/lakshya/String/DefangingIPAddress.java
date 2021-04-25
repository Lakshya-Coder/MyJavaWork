package com.lakshya.String;

public class DefangingIPAddress {
	public static String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        
        for (char c : address.toCharArray()) {
            if (c == '.') {
                result.append("[.]");
            } else {
                result.append(c);
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
    	System.out.println(defangIPaddr("255.100.50.0"));
    }
}