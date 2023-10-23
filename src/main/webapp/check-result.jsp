<%@ page import="org.example.models.HtmlTable" %>
<%@ page import="java.util.Enumeration" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<tr>
    <th>X</th>
    <th>Y</th>
    <th>R</th>
    <th>Успех?</th>
    <th>Время работы</th>
</tr>
<%
    Enumeration<String> names = session.getAttributeNames();
    while (names.hasMoreElements()) {
        String name = names.nextElement();
        HtmlTable htmlTable = (HtmlTable) session.getAttribute(name);
%>
<tr>
    <td><%=htmlTable.getParameters().getX()%>
    </td>
    <td><%=htmlTable.getParameters().getY()%>
    </td>
    <td><%=htmlTable.getParameters().getR()%>
    </td>
    <td><%=htmlTable.isInArea()%>
    </td>
    <td><%=htmlTable.getScriptRunningTime()%>
    </td>
</tr>

<%
    }
%>