<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.TestDAO" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="test" class="user.Test" scope="page" />


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<title>BBS</title>
</head>
<body>
    <%
        TestDAO testDAO = new TestDAO();
    
        int result = testDAO.select(test.getUserID());
        String result1 = testDAO.ID(test.getUserID());
        
        if(result == 1){
            System.out.println("userID = " + result1);
        }
    %>

</body>
</html>