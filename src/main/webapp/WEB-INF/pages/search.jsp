<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Transaction List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Phone number</th><th>Carrier</th></tr>  
   <c:forEach var="r" items="${list}">   
   <tr>  
   <td>${r.phoneNo}</td>    
   <td>${r.amount}</td>    
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   