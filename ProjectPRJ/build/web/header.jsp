<%-- 
    Document   : header
    Created on : Nov 4, 2017, 12:02:01 PM
    Author     : Nuoi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Bootstrap E-commerce Templates</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <!--[if ie]><meta content='IE=8' http-equiv='X-UA-Compatible'/><![endif]-->
        <!-- bootstrap -->
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">      
        <link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">

        <link href="themes/css/bootstrappage.css" rel="stylesheet"/>

        <!-- global styles -->
        <link href="themes/css/flexslider.css" rel="stylesheet"/>
        <link href="themes/css/main.css" rel="stylesheet"/>

        <!-- scripts -->
        <script src="themes/js/jquery-1.7.2.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>				
        <script src="themes/js/superfish.js"></script>	
        <script src="themes/js/jquery.scrolltotop.js"></script>
        <!--[if lt IE 9]>			
                <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
                <script src="js/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <div id="top-bar" class="container">
            <div class="row">
                <div class="span4">
                    <form method="POST" class="search_form">
                        <input type="text" class="input-block-level search-query" Placeholder="eg. T-sirt">
                    </form>
                </div>
                <div class="span8">
                    <div class="account pull-right">
                        <nav id="menu" class="pull-right">
                            <ul class="user-menu">				

                                <li><a href="cart.jsp">Your Cart</a></li>
                                <li><a href="checkout.html">Checkout</a></li>					
                                <li>

                                    <a style="pointer-events: none; cursor: default;" href=""><img src="themes/images/user.png" width="20px" height="20px"> Account</a>
                                    <ul>
                                        <li><a href="Login.jsp">Login</a></li>
                                        <li><a href="SignUp.jsp">Sign Up New Account</a></li>
                                    </ul>
                                </li>		
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
        <div id="wrapper" class="container">
            <section class="navbar main-menu">
                <div class="navbar-inner main-menu">				
                    <a href="Index.jsp" class="logo pull-left"><img src="themes/images/logo.png" class="site_logo" alt=""></a>
                    <nav id="menu" class="pull-right">

                        <ul>
                            <li><a href="./product.jsp?id=1">Woman</a>					
                                <ul>
                                    <li><a href="./product.jsp?id=1&&subId=1">Shoes</a></li>									
                                    <li><a href="./product.jsp?id=1&&subId=2">Clothes</a></li>
                                    <li><a href="./product.jsp?id=1&&subId=3">Bags</a></li>									
                                </ul>
                            </li>															

                            <li><a href="./product.jsp?id=2">Men</a>
                                <ul>									
                                    <li><a href="./product.jsp?id=2&&subId=1">Shoes</a></li>
                                    <li><a href="./product.jsp?id=2&&subId=2">Clothes</a></li>
                                    <li><a href="./product.jsp?id=2&&subId=3">Bags</a></li>
                                </ul>
                            </li>							
                            <li><a href="./product.jsp??id=3">Kid</a>
                                <ul>									
                                    <li><a href="./product.jsp?id=3&&subId=1">Shoes</a></li>
                                    <li><a href="./product.jsp?id=3&&subId=2">Clothes</a></li>
                                    <li><a href="./product.jsp?id=3&&subId=3">Bags</a></li>
                                </ul>
                            </li>
                            <li><a href="./product.jsp?id=4">Best Seller</a></li>
                            <li><a href="./product.jsp?id=5">Top Seller</a></li>
                        </ul>
                    </nav>
                </div>
            </section>
        </div>
        <script src="themes/js/common.js"></script>
        <script src="themes/js/jquery.flexslider-min.js"></script>
        <script type="text/javascript">
            $(function () {
                $(document).ready(function () {
                    $('.flexslider').flexslider({
                        animation: "fade",
                        slideshowSpeed: 4000,
                        animationSpeed: 600,
                        controlNav: false,
                        directionNav: true,
                        controlsContainer: ".flex-container" // the container that holds the flexslider
                    });
                });
            });

        </script>
    </body>
</html>
