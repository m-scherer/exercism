using System;
using System.Text.RegularExpressions;


public static class Bob
{
    public static string Hey(string statement)
    {
		string trimStatement = statement.TrimEnd();

		if (trimStatement == "") {
			return "Fine. Be that way!";
		} else if (trimStatement.ToUpper() == trimStatement && Regex.Match(trimStatement,@"[A-Z]").Success) {
			return "Whoa, chill out!";
		} else if (trimStatement.Substring(trimStatement.Length - 1) == "?") {
			return "Sure.";
		} else if (trimStatement.ToUpper() == trimStatement && trimStatement.ToLower() == trimStatement){
			return "Whatever.";	
		} else {
			return "Whatever.";
		}

    }
}