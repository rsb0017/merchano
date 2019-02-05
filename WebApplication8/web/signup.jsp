<html>
<style>
  <%
    if(request.getCookies().length>1)
        response.sendRedirect("profile.jsp");
    %>   
body { background-color: #fff; color: #000; padding: 0; margin: 0; }
/* Full-width input fields */
input[type=text], input[type=password],input[type=email],input[type=number] {
    width: 70%;
    padding: 12px 20px;
    /*margin: 8px 0;*/
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

/* Set a style for all buttons */
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

/* Extra styles for the cancel button */
.cancelbtn {
    padding: 14px 20px;
    background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn,.signupbtn {
    float: left;
    width: 50%;
}

/* Add padding to container elements */
.container {
    padding: 16px;
}

/* Clear floats */
.clearfix::after {
    content: "";
    clear: both;
    display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
    .cancelbtn, .signupbtn {
       width: 100%;
    }
}
</style>
<body>
    <jsp:include page="index.jsp"/>

<h2>Signup Form</h2>

<form action="validate.jsp" style="border:1px solid #ccc">
  <div class="container">
     
      <label><b>Name</b></label><br>
    <input type="text" placeholder="Enter name" name="user" required><br>

    <label><b>Password</b></label><br>
    <input type="password" placeholder="Enter Password" name="psw" required><br>
     
   
    <label><b>Email</b></label><br>
     <input type="email" placeholder="email" name="id" required> <% 
      String a=(String)request.getAttribute("err");
      if(a!=null)
      {
      %>
      <font style="color:red"><% out.println(a);}%></font><br>
     <label><b>Phn.no</b></label><br>
     <input type="number" placeholder="contact" name="phn" required><br>
    
   
    <label for="country">City</label>
    <select id="country" name="city">
       <option value="Chandigarh">Chandigarh</option>
      <option value ="Panchkula">Panchkula</option>
      <option value="Mohali">Mohali</option>
    </select>
  
     <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>

    <div class="clearfix">
      <button type="reset" class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn">Sign Up</button>
       <p>Already user <a href="login.jsp">login</a>.</p>
    </div>
  </div>
</form>

</body>
</html>
