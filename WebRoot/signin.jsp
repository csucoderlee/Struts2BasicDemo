<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'signin.jsp' starting page</title>
  </head>
  
  <body>
    <s:form action="SignInAction" >
    	<s:textfield name="user.username" label="username"/>
    	<s:password name="user.password" label="password"/>
    	<s:submit value="submit" />
    	<s:reset  value="reset" />
    </s:form>
  </body>
</html>
