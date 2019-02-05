<%-- 
    Document   : Mens
    Created on : Jun 30, 2017, 11:29:18 AM
    Author     : Rohit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            
                      
            body {  padding: 0; margin: 0; }
            #men{
                width:100%;
            }
            #men1{
              
                margin:5px;
                padding:10px;
                margin-bottom:5px; 
                }
                 
                
           
            #hv{
                opacity:0.9;
                border:1px solid black;
            }
            #hv:hover{
                opacity:1.0;
            }
            .txt{
                text-align:center;
                border:1px solid black;
                background-color:#cccccc;
                margin:0px;
                padding:0px;
            }
            #cart{
                border:1px solid black;
                padding:2px 2px;
                color:white; 
                 background-color:#333;   
            }
            .img{
                    margin-right:10px;
                    margin-top: 5px
                }
           
            
        </style>
        
    </head>
    <body style="background-color:#ccccff;">
        <div>
           
          
      
        <jsp:include page="index.jsp"></jsp:include>
        <div id="men"><img id="men" src="images/MenHero.jpg"></div>
         
        <div id="men1">
          
            <div class="img" style="float:left;margin-right:15px;">
            <img id="hv" src="images/Front_Medium.jpg">
            <div class="txt" style="width:100%">
                <p>
                    Peter England Slim Fit
                </p> 
                <p><del>Rs500</del>Rs449</p>
                <form action="crt">
                    <button  name="mybutton" value="1" type="submit">ADD to cart</button>
                    
                </form>
            </div>
                </div>
          
            <div class="img" style="float:left;margin-right:15px;">
            <div>
            <img id="hv" src="images/Front_Medium(1).jpg">
            <div class="txt" style="width:100%">
                <p>
                    Skult
                </p> 
                <p>
                    <del>Rs749 </del> Rs649</p>
                <form action="crt">
                <button  name="mybutton" value="2" type="submit">ADD to cart</button>
                    
                </form>
            </div>
        </div>
        </div>
         <div class="img" style="float:left;margin-right:15px;">
            <div>
                <img id="hv" src="images/Front_Medium(2).jpg">
            <div class="txt" style="width:100%">
                <p>
                    Indigo regular Fit
                </p> 
                <p>
                    <del>Rs749 </del> Rs649</p>
                <form action="crt">
                     <button  name="mybutton" value="3" type="submit">ADD to cart</button>
                    
                </form>
            </div>
        </div>
        </div>
            <div  class="img"style="float:left;">
            <div>
                <img id="hv" src="images/Front_Medium(3).jpg">
            <div class="txt" style="width:100%">
                <p>
                  Roadster Pro  
                </p> 
                <p>
                    <del>Rs899 </del> Rs749</p>
                <form action="crt">
                 <button  name="mybutton" value="4" type="submit">ADD to cart</button>
                    
                </form>
            </div>
        </div>
        </div>
            
        </div>   
             <div id="men1">
          
            <div  class="img" style="float:left;margin-right:15px;">
                <img id="hv" src="images/Front_Medium(4).jpg">
            <div class="txt" style="width:100%">
                <p>
                    Peter England Slim Fit
                </p> 
                <p><del>Rs900</del>Rs746</p>
                <form action="crt">
                    <button  name="mybutton" value="5" type="submit">ADD to cart</button>
                    
                </form>
            </div>
                </div>
          
        <div class="img" style="float:left;margin-right:15px;">
            <div>
            <img id="hv" src="images/Front_Medium(5).jpg">
            <div class="txt" style="width:100%">
                <p>
                    Skult Green Check Shirt
                </p> 
                <p>
                    <del>Rs1300 </del> Rs900</p>
                <form action="crt">
                     <button  name="mybutton" value="6" type="submit">ADD to cart</button>
                    
                </form>
            </div>
        </div>
        </div>
         <div class="img" style="float:left;margin-right:15px;">
            <div>
                <img id="hv" src="images/Front_Medium(6).jpg">
            <div class="txt" style="width:100%">
                <p>
                    Indigo regular Fit
                </p> 
                <p>
                    <del>Rs2300</del> Rs1600</p>
                <form action="crt">
                     <button  name="mybutton" value="7" type="submit">ADD to cart</button>
                    
                </form>
            </div>
        </div>
        </div>
             <div class="img" style="float:left;">
            <div>
                <img id="hv" src="images/Front_Medium(7).jpg">
            <div class="txt" style="width:100%">
                <p>
                  Roadster Pro  
                </p> 
                <p>
                <del>Rs821</del> Rs550</p>
                <form action="crt">
                     <button  name="mybutton" value="8" type="submit">ADD to cart</button>
                    
                </form>
            </div>
        </div>
        </div>
            
        </div>    
            
            </body>
</html>
