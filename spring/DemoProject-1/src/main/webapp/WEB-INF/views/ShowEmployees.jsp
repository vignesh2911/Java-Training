<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table border="1" >
<tr bgcolor="green">
<th>EMPLOYEE NO</th>
<th>EMPLOYEE NAME</th>
<th>SALARY</th>
<th>DEPARTMENT NO</th>
</tr>
<c:if test="${!empty employees}">
<c:forEach items="${employees}" var="e">
<tr bgcolor="yellow">
<td><c:out value="${e.empNo}"/></td>
<td><c:out value="${e.empName}"/></td>
<td><c:out value="${e.salary}"/></td>
<td><c:out value="${e.deptNo}"/></td>
</tr>
</c:forEach>
</c:if>
</table>
<c:if test="${back}">

<a href="emp?pageIndex=${currentPage-1}">BACK</a>
</c:if>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<c:if test="${next}">

<a href="emp?pageIndex=${currentPage+1}">NEXT</a>
</c:if>