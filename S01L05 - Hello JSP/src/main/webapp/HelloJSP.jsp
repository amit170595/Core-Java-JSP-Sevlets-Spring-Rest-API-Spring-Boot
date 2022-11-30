<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<h2>JSP Expressions Elements (Tags)</h2>
	<%= "Hello" %>
	<br>
	<%! public int x=22; %>
	<%= x %>
	<br>
	<%= new Integer(23) %>
	<br>
	<%= new String("Amit Karmakar") %>
	<br>
	<%= new java.util.Date() %>
	<br>
	<%= 25*4 %>
	<br>
	<%= 25>4 %>
	<br><br>
	<h2>JSP Scriptlet Elements (Tags)</h2>
	<%
	int y=25;
	out.println(y);
	if(y>25){
		out.println("Y is greater then 25");
	}else{
		out.println("Y is smaller then 25");
	}
	%>
	<br>
	<%= y %>
	<br>
	<%
	for(int i=0;i<10;i++){
		out.print(i);
		out.print("<br>");
	}
	%>
	<h2>JSP Declaration Elements (Tags)</h2>
	<%!
	 String message(){
		return "I Love JSP";
	}
	%>
	<%= message() %>
	<h2>JSP Comment Elements (Tags)</h2>
	<%-- response.sendRedirect("https://www.google.com/"); --%>
</body>
</html>