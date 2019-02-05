<%-- 
    Document   : Laptops
    Created on : Jul 1, 2017, 12:30:57 PM
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
    <body style="margin:0px;padding:0px;background-color:#ccccff;">
        <jsp:include page="index.jsp"></jsp:include>
        <img  src="lap/GS32.jpg" width="1350" height="400" >
        <div id="m1">
          
            <div class="img" style="float:left;margin-right:30px;">
                <img id="hv" src="lap/s-l225 (1).jpg" height="225" width="225">
            <div class="txt1" style="width:100%">
                <p>
                    Dell ultra book 570
                </p> 
                <p><del>Rs230000</del>Rs120000<span style="color:red">50% OFF</span></p>
                 <form action="crt2">
                    <button  name="mybutton" value="17" type="submit">ADD to cart</button>
                    
                </form>
            </div>
                </div>
            <div class="img" style="float:left;margin-right:30px;">
        <img id="hv" src="lap/s-l225 (2).jpg">
            <div class="txt1" style="width:100%">
                <p>
                  Dell xps15
                </p> 
                <p><del>Rs230000</del>Rs90000<span style="color:red">70% OFF</span></p>
                <form action="crt2">
                    <button  name="mybutton" value="18" type="submit">ADD to cart</button>
                    
                </form> 
            </div>
                </div>
            <div class="img" style="float:left;margin-right:30px;">
                  <img id="hv" src="lap/s-l225 (3).jpg" height="225" width="225">
            <div class="txt1" style="width:100%">
                <p>
                  Dell Inspiron 31x
                </p> 
                <p><del>Rs74900</del>Rs44900 <span style="color:red">40% OFF</span></p>
                 <form action="crt2">
                    <button  name="mybutton" value="19" type="submit">ADD to cart</button>
                    
                </form>
            </div>
                </div>
            <div class="img" style="float:left; margin-right:30px">
                 <img id="hv" src="lap/s-l225 (4).jpg"  height="225" width="225">
            <div class="txt1" style="width:100%">
                <p>
                    Dell Vostro lite
                </p> 
                <p><del>Rs30000</del> Rs21110<span style="color:red">30% OFF</span></p>
                 <form action="crt2">
                    <button  name="mybutton" value="20" type="submit">ADD to cart</button>
                    
                </form>
            </div>
             </div>
           
        <div class="img" style="float:left;">
                 <img id="hv" src="lap/s-l225 (5).jpg"  height="225" width="225">
            <div class="txt1" style="width:100%">
                <p>
                    Asus ultra book
                </p> 
                <p><del>Rs80000</del> Rs56000<span style="color:red">30% OFF</span></p>
                 <form action="crt2">
                    <button  name="mybutton" value="21" type="submit">ADD to cart</button>
                    
                </form>
            </div>
             </div></div>
       
        <div id="m1">
          
            <div class="img" style="float:left;margin-right:30px;">
                <img id="hv" src="lap/s-l225 (6).jpg" height="225" width="225">
            <div class="txt1" style="width:100%">
                <p>
                    Dell ultra book 570
                </p> 
                <p><del>Rs230000</del>Rs120000<span style="color:red">50% OFF</span></p>
                 <form action="crt2">
                    <button  name="mybutton" value="22" type="submit">ADD to cart</button>
                    
                </form>
            </div>
                </div>
            
            
            <div class="img" style="float:left;margin-right:30px;" >
        <img id="hv" src="lap/s-l225 (7).jpg" height="225" width="225"></img>
            <div class="txt1" style="width:100%">
                <p>
                  Acer aspire E5-573
                </p> 
                <p><del>Rs40000</del>Rs32000<span style="color:red">70% OFF</span></p>
                 <form action="crt2">
                    <button  name="mybutton" value="23" type="submit">ADD to cart</button>
                    
                </form>
            </div>
                </div>
            
            
            <div class="img" style="float:left;margin-right:30px;">
                  <img id="hv" src="lap/s-l225 (8).jpg" height="225" width="225">
            <div class="txt1" style="width:100%">
                <p>
                 Acer aspire E5-573 
                </p> 
                <p><del>Rs74900</del>Rs44900 <span style="color:red">40% OFF</span></p>
                 <form action="crt2">
                    <button  name="mybutton" value="24" type="submit">ADD to cart</button>
                    
                </form>
            </div>
                </div>
            
            
            <div class="img" style="float:left; margin-right:30px">
                 <img id="hv" src="lap/s-l225 (9).jpg"  height="225" width="225">
            <div class="txt1" style="width:100%">
                <p>
                    Asus Rog
                </p> 
                <p><del>Rs30000</del> Rs21110<span style="color:red">30% OFF</span></p>
                 <form action="crt2">
                    <button  name="mybutton" value="25" type="submit">ADD to cart</button>
                    
                </form>
            </div>
             </div>
           
            <div class="img" style="float:left;">
                 <img id="hv" src="lap/s-l225.jpg"  height="225" width="225">
            <div class="txt1" style="width:100%">
                <p>
                    Acer Swift S
                </p> 
                <p><del>Rs80000</del> Rs56000<span style="color:red">30% OFF</span></p>
                 <form action="crt2">
                    <button  name="mybutton" value="26" type="submit">ADD to cart</button>
                    
                </form>
            </div>
             </div></div>
        
        
    </body>
</html>
