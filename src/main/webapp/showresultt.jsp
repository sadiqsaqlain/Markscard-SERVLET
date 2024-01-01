<%-- <%@page import="Dto.Students"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Students s=(Students) request.getAttribute("usn");%>
<table border="">
<tr>
<td>USN</td>
<td>Name</td>
<td>Maths</td>
<td>Science</td>
<td>Social</td>
<td>Hindi</td>
<td>Kannada</td>
<td>Physics</td>
<td>Total</td>
<td>Percentage</td>

</tr>
<tr>
<td><%=s.getUsn()%></td>
<td><%=s.getName() %> </td>
<td><%=s.getMaths() %> </td>
<td><%=s.getScience()%></td>
<td><%=s.getSocial() %></td>
<td><%=s.getHindi() %> </td>
<td><%=s.getKannada()%></td>
<td><%=s.getPhysics()%></td>
<td><%=s.getTotal() %> </td>
<td><%=s.getPercentage() %></td>
</tr>
</table>
</body>
</html>

 --%>

<%@page import="Dto.Students"%>
<%@page import="Dto.Lectures"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Table Display Page</title>
    <!-- Bootstrap CSS link -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Center the table on the page */
        body {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }
        /* Style adjustments for the table */
        table {
            width: 50%; /* Adjust the width as needed */
            margin-top: 20px;
        }
    </style>
</head>
<body>
<%Students ll=(Students) request.getAttribute("usn");%>

    <div>
        <h2 class="text-center">Result</h2>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>USN</th>
                    <th>Name</th>
                    <th>Maths</th>
                     <th>Science</th>
                                        <th>Social</th>
                                        <th>Hindi</th>
                                        <th>Kannada</th>
                                        <th>Physics</th>
                                        <th>Total</th>                                                                                
                                        <th>Percentage</th>    
                                                 
                                        
                    
                </tr>
            </thead>
            <tbody>
                <tr>
                  

<tr>
<td><%=ll.getUsn()%></td>
<td><%=ll.getName()%></td>
<td><%=ll.getMaths()%></td>
<td><%=ll.getScience()%></td>
<td><%=ll.getSocial()%></td>
<td><%=ll.getHindi()%></td>
<td><%=ll.getKannada()%></td>
<td><%=ll.getPhysics()%></td>
<td><%=ll.getTotal()%></td>
<td><%=ll.getPercentage()%></td>


</tr>


                </tr>
                
                <!-- Add more rows as needed -->
            </tbody>
        </table>
        <div class="text-center">
                
                
               <!--  <button class="btn btn-cool">print</button> -->
                
        </div>
    </div>

    <!-- Bootstrap JS and Popper.js scripts (required for Bootstrap) -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
