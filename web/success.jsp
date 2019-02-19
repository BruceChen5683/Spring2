<%--
  Created by IntelliJ IDEA.
  User: battlecall
  Date: 19-2-18
  Time: 上午6:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<html>
<head>
    <title>Success</title>
</head>
<body>

    <table border="1" align="center" width="80%">

        <s:iterator value="#request.list" id="person">
            <tr>
                <td><s:property value="#person.name"></s:property></td>
                <td><s:property value="#person.age"></s:property></td>
            </tr>
        </s:iterator>

    </table>
</body>
</html>
