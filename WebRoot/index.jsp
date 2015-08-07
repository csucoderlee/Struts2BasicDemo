<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>index page</title>
</head>

<body>
	Welcome to my homepage. ${user_session.username};
	<li><a
		href='${pageContext.request.contextPath}/booklistAction?c1=${c1.id }&c2=${c2.id }'>${c2.name}</a>
	</li>
</body>
</html>
