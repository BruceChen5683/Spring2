<%--
  Created by IntelliJ IDEA.
  User: battlecall
  Date: 19-2-18
  Time: 上午6:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>savePerson</title>
</head>
<body>

    <s:form action="savePerson">
        <s:textfield name="person.name" label="uername"></s:textfield>
        <s:textfield name="person.age" label="age"></s:textfield>

        <s:submit value="submiut"></s:submit>
    </s:form>
</body>
</html>
