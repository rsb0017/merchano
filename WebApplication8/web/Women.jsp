<%-- 
    Document   : Women
    Created on : Jun 30, 2017, 11:30:30 PM
    Author     : Rohit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            #women{
                margin:5px;
                padding:10px; 
                }
                .img{
                    margin-right:10px;
                    margin-top: 5px
                }
                .txt1{
                  text-align:center;
                border:1px solid black;
                background-color:#cccccc;
                margin:0px;
                padding:0px;
            }
               #hv{
                opacity:0.9;
                border:1px solid black;
            }
            #hv:hover{
                opacity:1.0;
            }     
                  
            
        </style>
    </head>
    <body style="margin:0px;padding:0px;background-color:#ccccff;">
        
        <jsp:include page="index.jsp"></jsp:include>
        <img style="width:100%;" src="images/WomenHero.jpg">
         <div id="women">
          
            <div class="img" style="float:left;">
                <img id="hv" src="images/Front_Medium(8).jpg">
            <div class="txt1" style="width:100%">
                <p>
                     Nineteen Women white and black Sheath Dress
                </p> 
                <p><del>Rs2300</del>Rs1200<span style="color:red">50% OFF</span></p>
                <form action="crt1">
                    <button  name="mybutton" value="9" type="submit">ADD to cart</button>
                    
                </form>
            </div>
                </div>
    <div class="img"  style="float:left;">
                <img id="hv" src="images/Front_Medium(9).jpg">
            <div class="txt1" style="width:100%">
                <p>
                  Olive green fit shirt 
                </p> 
                <p><del>Rs2300</del>Rs900<span style="color:red">70% OFF</span></p>
                <form action="crt1">
                    <button  name="mybutton" value="10" type="submit">ADD to cart</button>
                    
                </form>
            </div>
                </div>
              <div class="img" style="float:left;">
                  <img id="hv" src="images/Front_Medium(10).jpg">
            <div class="txt1" style="width:100%">
                <p>
                  Women black lace fit  
                </p> 
                <p><del>Rs749</del>Rs449 <span style="color:red">40% OFF</span></p>
                <form action="crt1">
                    <button  name="mybutton" value="11" type="submit">ADD to cart</button>
                    
                </form>
            </div>
                </div>
             <div class="img" style="float:left;">
                  <img id="hv" src="images/Front_Medium(11).jpg">
            <div class="txt1" style="width:100%">
                <p>
                    Brown Regular Fit Dress
                </p> 
                <p><del>Rs3000 </del> Rs2111<span style="color:red">30% OFF</span></p>
                <form action="crt1">
                    <button  name="mybutton" value="12" type="submit">ADD to cart</button>
                    
                </form>
            </div>
             </div></div>
       
        <div id="women">
          
            <div class="img" style="float:left;">
                <img id="hv" src="images/Front_Medium_1038.jpg">
            <div class="txt1" style="width:100%">
                <p>
                     Nineteen Women white and black Sheath Dress
                </p> 
                <p><del>Rs2300</del>Rs1200<span style="color:red">50% OFF</span></p>
                <form action="crt1">
                    <button  name="mybutton" value="13" type="submit">ADD to cart</button>
                    
                </form>
            </div>
                </div>
    <div class="img" style="float:left;">
        <img id="hv" src="images/Front_Medium_142.jpg">
            <div class="txt1" style="width:100%">
                <p>
                  Olive green fit shirt 
                </p> 
                <p><del>Rs2300</del>Rs900<span style="color:red">70% OFF</span></p>
                <form action="crt1">
                    <button  name="mybutton" value="14" type="submit">ADD to cart</button>
                    
                </form>
            </div>
                </div>
              <div class="img" style="float:left;">
                  <img id="hv" src="images/Front_Medium_145.jpg">
            <div class="txt1" style="width:100%">
                <p>
                  Women black lace fit  
                </p> 
                <p><del>Rs749</del>Rs449 <span style="color:red">40% OFF</span></p>
                <form action="crt1">
                    <button  name="mybutton" value="15" type="submit">ADD to cart</button>
                    
                </form>
            </div>
                </div>
             <div class="img"  style="float:left;">
                 <img id="hv" src="images/Front_Medium_1541.jpg">
            <div class="txt1" style="width:100%">
                <p>
                    Brown Regular Fit Dress
                </p> 
                <p><del>Rs3000 </del> Rs2111<span style="color:red">30% OFF</span></p>
                <form action="crt1">
                    <button  name="mybutton" value="16" type="submit">ADD to cart</button>
                    
                </form>
            </div>
             </div></div>
        
        
    </body>
</html>
