package com.lakshya.String;

public class GoalParserInterpretation {
	public static String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

    public static void main(String[] args) {
    	System.out.println(interpret("G()(al)"));
    }
}