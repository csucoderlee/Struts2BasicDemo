<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'signup.jsp' starting page</title>
  </head>
  
  <body>
    <s:form action="SignUpAction" >
    	<s:textfield name="user.username" />
    	<s:password name="user.password"  />
    	<s:submit value="submit" />
    	<s:reset  value="reset" />
    </s:form>
  </body>
</html>
