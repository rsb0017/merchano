<%-- 
    Document   : Mobiles
    Created on : Jul 1, 2017, 11:00:08 PM
    Author     : Rohit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
             .img{
                    margin-right:10px;
                    margin-top: 5px
                }
        </style>
          <link rel="stylesheet" href="newcss.css"/>
    </head>
    <body style="margin:0px;padding:0px;background-color:  #9999ff">
        <jsp:include page="index.jsp"></jsp:include>
        <img style="width:100%;" src="mobile/k2-_6169eb14-2f4f-4d2f-a3d5-bf6349103642.v1.jpg" height="400">
          <div id="m1">
          
              <div class="img" style="float:left;margin-right:50px;">
                <img id="hv" src="mobile/s6.jpeg" >
            <div class="txt1" style="width:100%">
                <p>
                    Samsung galaxy S6
                </p> 
                <p><del>Rs49000</del>Rs30000<span style="color:red">50% OFF</span></p>
               <form action="crt4">
                    <button  name="mybutton" value="27" type="submit">ADD to cart</button>
                    
                </form>  
            </div>
                </div>
    <div class="img" style="float:left;margin-right:50px;" >
        <img id="hv" src="mobile/htc10.jpeg"  >
            <div class="txt1" style="width:100%">
                <p>
                  HTC 10
                </p> 
                <p><del>Rs51000</del>Rs40000<span style="color:red">70% OFF</span></p>
                 <form action="crt4">
                    <button  name="mybutton" value="28" type="submit">ADD to cart</button>
                    
                </form>
            </div>
                </div>
              <div class="img" style="float:left;margin-right:50px;">
                  <img id="hv" src="mobile/MP000000000925572_252Wx374H_20170107052940.jpeg">
            <div class="txt1" style="width:100%">
                <p>
                  HTC Desire 10pro
                </p> 
                <p><del>Rs26000</del>Rs20000 <span style="color:red">40% OFF</span></p>
                 <form action="crt4">
                    <button  name="mybutton" value="29" type="submit">ADD to cart</button>
                    
                </form>
            </div>
                </div>
             <div class="img" style="float:left; margin-right:50px">
                 <img id="hv" src="mobile/j7max.jpeg" >
            <div class="txt1" style="width:100%">
                <p>
                    J7MAX
                </p> 
                <p><del>Rs20000</del> Rs17499<span style="color:red">30% OFF</span></p>
                 <form action="crt4">
                    <button  name="mybutton" value="30" type="submit">ADD to cart</button>
                    
                </form>
            </div>
             </div></div>
        <div id="m1">
            <div class="img" style="float:left;margin-right:50px">
            <img id="hv" src="mobile/k3.jpeg"  >
            <div class="txt1" style="width:100%">
                <p>
                    LG k3
                </p> 
                <p><del>Rs13000</del> Rs10000<span style="color:red">30% OFF</span></p>
                 <form action="crt4">
                    <button  name="mybutton" value="31" type="submit">ADD to cart</button>
                    
                </form>
            </div></div>
            <div class="img"style="float:left;margin-right:50px">
                <img id="hv" src="mobile/v20.jpeg"  >
            <div class="txt1" style="width:100%">
                <p>
                    LG V20
                </p> 
                <p><del>Rs52000</del> Rs40000<span style="color:red">30% OFF</span></p>
                 <form action="crt4">
                    <button  name="mybutton" value="32" type="submit">ADD to cart</button>
                    
                </form>
            </div>
            
             </div>
            <div class="img" style="float:left;margin-right:50px">
            <img id="hv" src="mobile/lgx.jpeg"  >
            <div class="txt1" style="width:100%">
                <p>
                    LG X Power
                </p> 
                <p><del>Rs20000</del> Rs15000<span style="color:red">30% OFF</span></p>
                 <form action="crt4">
                    <button  name="mybutton" value="33" type="submit">ADD to cart</button>
                    
                </form>
            </div>
            
             </div>
             <div class="img" style="float:left;margin-right:50px">
                 <img id="hv" src="mobile/iphone.jpeg">
            <div class="txt1" style="width:100%">
                <p>
                   Iphone 7(32gb)
                </p>
                <p><del>Rs80000</del> Rs56000<span style="color:red">30% OFF</span></p>
                 <form action="crt4">
                    <button  name="mybutton" value="34" type="submit">ADD to cart</button>
                    
                </form>
            </div>
            
             </div>
        </div>
    </body>
</html>
