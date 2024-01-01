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
<% List<Students> s=(List<Students>) request.getAttribute("stud");%>

    <div>
        <h2 class="text-center">All_Result</h2>
        <table class="table table-striped">
            <thead>
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
<td>Updated_from</td>
<td>Update</td>
<td>Delete</td>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <%for(Students ll:s) {%>

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
<td><%=ll.getDept()%></td>
<td><a href="updatestud?usn=<%=ll.getUsn()%>">update</a></td>
<td><a href="deletestud?usn=<%=ll.getUsn()%>">delete</a></td>

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
