<%@ page import="org.example.models.HtmlTable" %>
<%@ page import="java.util.Enumeration" %>
<%@ page import="org.example.utils.Rounder" %>
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
        HtmlTable point = (HtmlTable) session.getAttribute(name);
%>
<tr>
    <td><%=Rounder.round(point.getX())%>
    </td>
    <td><%=Rounder.round(point.getY())%>
    </td>
    <td><%=Rounder.round(point.getRadius())%>
    </td>
    <td><%=point.getInRange()%>
    </td>
    <td><%=point.getRequestTime()%>
    </td>
</tr>

<%
    }
%>