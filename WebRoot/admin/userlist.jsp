<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'userlist.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>
<!--  
	struts��ǩ������ 
-->
<body>
	<s:set name="userlist" value="#request.userlist" />
	<table>
		<tr>�û��б�
		</tr>
		<tr>
			<td>
				<table border="0" width="100%" cellspacing="0" cellpadding="0">



					<tr align="center">
						<s:iterator value="userlist">
							<td><s:property value="#userlist.name" />
							</td>
							<td><s:property value="#userlist.password" />
							</td>
						</s:iterator>
					</tr>

				</table>
			</td>
		</tr>
	</table>
</body>
</html>
