<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">
    <title>Bootstrap JSP Example</title>
    <style>
        body {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }
        .button-container {
            text-align: center;
        }
        .btn-cool {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            font-size: 18px;
            margin: 5px;
            border-radius: 5px;
            cursor: pointer;
        }
        .btn-cool:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

    <div class="button-container">
        <a class="btn btn-cool" href="enterusn.jsp">Check_Result</a>
        <a class="btn btn-cool" href="adminlogin.jsp">Admin</a>
        <a class="btn btn-cool" href="lecturelogin.jsp">Upload_Result</a>
        <!-- Add any extra cool features here -->
    </div>

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>