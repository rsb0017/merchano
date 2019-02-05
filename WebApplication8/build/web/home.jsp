<html>
<head>
<title>home page</title>

<style>
body {  padding: 0; margin: 0; }
.container { }
.container .ism-slider {  }
#tb{
   background-color:white;} 
#gllry{
    background-color:#cccccc;
}
#elec{
  background-color:whitesmoke;
  display:inline;
}
#cam
{
 width:34%;   
}
#cam1{
    width:33%;
}
#cam2{
    width:33%;
}
    

</style>

<link rel="stylesheet" href="ism/css/my-slider.css"/>
<script src="ism/js/ism-2.2.min.js"></script>


</head>
<body>
    <jsp:include page="index.jsp"/>

    <div id="sale1">
        <img src="images/sale.jpg" width="1349">



</div>
        <div class='container'>
    <div class="ism-slider" data-play_type="once-rewind" id="my-slider">
  <ol>
    <li>
        <img src="ism/image/slides/_u/1498461466339_965570.jpg"></a>
      
    </li>
    <li>
      <img src="ism/image/slides/_u/1498461422488_930370.jpg">
     
    </li>
    <li>
        <img src="ism/image/slides/_u/v1_CEPC_B_to_C__youthy1500X300-4._CB507476264_.jpg"></a>
      
    </li>
  </ol>
</div>

 </div>
<div id="tb">
<table id="gllry" >
    <tr>
        <td>
            <a href="Appliances.jsp"><img src="images/111.jpg"></a>   <img src="images/s-l500 (1).webp" height="402" width="400"> <a href="Mobiles.jsp"> <img src="images/offer.gif" height="402" width="270"></a> 
        </td>
       </tr>    
    
</table>

<div id="elec">
    <a href="Women.jsp">   <img id="cam" src="images/Card_Desktop.gif"></a><a href="Mens.jsp"><img id="cam1" src="images/Card_Desktop1.jpg"></a><img id="cam2" src="images/cl.jpg">  
    
</div>
</body>
</html>

