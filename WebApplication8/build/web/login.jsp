<%-- 
    Document   : login
    Created on : Jun 23, 2017, 11:40:52 AM
    Author     : Rohit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
form {
    border: 3px solid #f1f1f1;
}

input[type=email], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
    background-position: 10px 10px;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

button:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}
</style>
<body>
    <%
    if(request.getCookies().length>1)
        response.sendRedirect("profile.jsp");
    %>
    <div><%@include file="index.jsp" %></div>
<h2>Login Form</h2>
<div style="width:70%;">
    <form action="validate1.jsp" method="post">
  <div class="imgcontainer">
      <img src="images/img_avatar2.png" alt="Avatar" class="avatar">
  </div>
        <div>
            <% 
            String b=(String)request.getAttribute("details");
            if(b!=null){
            %><font style="color:red"><% out.println(b);}%></font>
            
        </div>
  <div class="container">
    <label><b>Email</b></label>
    <input type="email" placeholder="Email" name="uname" required>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pssw" required>
        
    <button type="submit">Login</button>
    <input type="checkbox" checked="checked"> Remember me
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
    
</form>
</div>
</body>
</html>
