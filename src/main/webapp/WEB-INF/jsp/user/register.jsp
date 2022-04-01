<%--
  Created by IntelliJ IDEA.
  User: cpere
  Date: 4/1/2022
  Time: 1:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:include page="../include/header.jsp"/>

<h1>Sign Up</h1>

<form action="/user/registerSubmit" method="post">


    <div style="display: flex">
        <div style="display: flex; flex-direction: column; justify-content: space-between">
            <label for="emailID">Email</label>
            <label for="firstNameID">First Name</label>
            <label for="lastNameID">Last Name</label>
            <label for="passwordID">Password</label>
            <label for="confirmPasswordID">Confirm Password</label>
        </div>

        <div style="display: flex; flex-direction: column; justify-content: space-between">
            <input type="email" name="email" id="emailID">
            <input type="text" name="firstName" id="firstNameID">
            <input type="text" name="lastName" id="lastNameID">
            <input type="password" name="password" id="passwordID">
            <input type="password" name="confirmPassword" id="confirmPasswordID">
        </div>
    </div>


    <button class="btn btn-primary">Submit</button>
    </form>

    <jsp:include page="../include/header.jsp"/>

</body>
</html>
