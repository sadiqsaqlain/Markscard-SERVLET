
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
<% List<Lectures> l=(List<Lectures>) request.getAttribute("lect");%>

    <div>
        <h2 class="text-center">Table Display</h2>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Loc/Dep</th>
                                        <th>Mobile</th>
                                        <th>Status</th>
                                        <th>Change_Status</th>
                                        <th>Delete</th>
                                        
                    
                </tr>
            </thead>
            <tbody>
                <tr>
                    <%for(Lectures ll:l) {%>

<tr>
<td><%=ll.getName()%></td>
<td><%=ll.getEmail()%></td>
<td><%=ll.getLoc()%></td>
<td><%=ll.getMob()%></td>
<td><%=ll.isStatus() %></td>
<td><a href="changestatus?email=<%=ll.getEmail()%>">change</a></td>
<td><a href="deletelecture?email=<%=ll.getEmail()%>">Delete</a></td>

</tr>

<%} %>
                </tr>
                
                <!-- Add more rows as needed -->
            </tbody>
        </table>
        <div class="text-center">
                
                <form action="adminopt.jsp">
                <button class="btn btn-cool">Back</button>
                </form>
        </div>
    </div>

    <!-- Bootstrap JS and Popper.js scripts (required for Bootstrap) -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
