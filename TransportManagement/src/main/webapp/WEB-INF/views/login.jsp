
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" type="image/png" sizes="16x16" href="../plugins/images/title_logo.png">
    <title>Guardian Life Transport System</title>
    <!-- Bootstrap Core CSS -->
    <link href="bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Menu CSS -->
    <link href="../plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css" rel="stylesheet">
    <!-- toast CSS -->
    <link href="../plugins/bower_components/toast-master/css/jquery.toast.css" rel="stylesheet">
    <!-- morris CSS -->
    <link href="../plugins/bower_components/morrisjs/morris.css" rel="stylesheet">
    <!-- chartist CSS -->
    <link href="../plugins/bower_components/chartist-js/dist/chartist.min.css" rel="stylesheet">
    <link href="../plugins/bower_components/chartist-plugin-tooltip-master/dist/chartist-plugin-tooltip.css" rel="stylesheet">
    <!-- animation CSS -->
    <link href="css/animate.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="css/style.css" rel="stylesheet">
    <!-- color CSS -->
    <link href="css/colors/default.css" id="theme" rel="stylesheet">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
</head>

<body class="fix-header">
    <!-- ============================================================== -->
    <!-- Preloader -->
    <!-- ============================================================== -->
    <div class="preloader">
        <svg class="circular" viewBox="25 25 50 50">
            <circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="2" stroke-miterlimit="10" />
        </svg>
    </div>
    <!-- ============================================================== -->
    <!-- Wrapper -->
    <!-- ============================================================== -->
    <div id="wrapper">
        <!-- ============================================================== -->
        <!-- Topbar header - style you can find in pages.scss -->
        <!-- ============================================================== -->
        <nav class="navbar navbar-default navbar-static-top m-b-0">
            <div class="navbar-header"   style="background-color: darkseagreen">
                <div class="top-left-part">
                    <!-- Logo -->
                    <a class="logo" href="dashboard.html">
                        <!-- Logo icon image, you can use font-icon also -->
                        <b>
                            <!--This is dark logo icon-->
                            <img src="../plugins/images/admin-logo.png" alt="home" class="dark-logo" />
                            <!--This is light logo icon-->
                            	
                        </b>
                        <!-- Logo text image you can use text also -->
                        <span class="hidden-xs">
                            <!--This is dark logo text-->
                            <img src="../plugins/images/admin-text.png" alt="home" class="dark-logo" />
                            <!--This is light logo text-->
                            <img src="../plugins/images/logo.jfif" lenght="50" width="150" alt="home" class="light-logo" />
                        </span> 
                    </a>
                </div>
                <!-- /Logo -->
                <ul class="nav navbar-top-links navbar-right pull-right">
                    <li>
                        <a class="nav-toggler open-close waves-effect waves-light hidden-md hidden-lg" href="javascript:void(0)"><i class="fa fa-bars"></i></a>
                    </li>
                    
                    
                </ul>
            </div>
            <!-- /.navbar-header -->
            <!-- /.navbar-top-links -->
            <!-- /.navbar-static-side -->
        </nav>
     
        <div id="page-wrapper">
            <div class="container-fluid">
              
                <!-- /.row -->
                <!-- ============================================================== -->
                <!-- Different data widgets -->
                <!-- ============================================================== -->
                <!-- .row -->
                
    <!-- All Jquery -->
    <!-- ============================================================== -->
    <script src="../plugins/bower_components/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- Menu Plugin JavaScript -->
    <script src="../plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js"></script>
    <!--slimscroll JavaScript -->
    <script src="js/jquery.slimscroll.js"></script>
    <!--Wave Effects -->
    <script src="js/waves.js"></script>
    <!--Counter js -->
    <script src="../plugins/bower_components/waypoints/lib/jquery.waypoints.js"></script>
    <script src="../plugins/bower_components/counterup/jquery.counterup.min.js"></script>
    <!-- chartist chart -->
    <script src="../plugins/bower_components/chartist-js/dist/chartist.min.js"></script>
    <script src="../plugins/bower_components/chartist-plugin-tooltip-master/dist/chartist-plugin-tooltip.min.js"></script>
    <!-- Sparkline chart JavaScript -->
    <script src="../plugins/bower_components/jquery-sparkline/jquery.sparkline.min.js"></script>
    <!-- Custom Theme JavaScript -->
    <script src="js/custom.min.js"></script>
    <script src="js/dashboard1.js"></script>
    <script src="../plugins/bower_components/toast-master/js/jquery.toast.js"></script>
    
<div class="container">
					<div class="row">
						<div class="col-md-4"></div>
						<div class="col-md-4 text-center bg-title">
							<form action="signIn" method="post">
								<div class="row">
									<div class="col-md-12">
										<h1>Sign In</h1>
										<span style="color:red">${checkPass} <br></span>
										<div class="input-group"
											style="margin-bottom: 20px; background: black;">
											<span class="input-group-addon"> <span
												class="glyphicon glyphicon-user"></span>
											</span> <input type="text" class="form-control"
												placeholder="Login Id" id="myLogin" name="login">

										</div>
										<!-- /input-group -->
										<span id="LoginMessage"></span>
									</div>
									<!-- /.col-md-12 -->

									<div class="col-md-12">
										<div class="input-group" style="margin-bottom: 28px;">
											<span class="input-group-addon"> <span
												class="glyphicon glyphicon-lock"></span>
											</span> <input type="password" class="form-control"
												placeholder="Password" id="myPassword" name="password">
										</div>
										<!-- /input-group -->
										

									</div>
									<!-- /.col-md-12 -->
									<div class="col-md-12">
										<div class="row">
											<div class="col-md-6">
												<a href="" class="btn btn-default">Cancel</a>
											</div>
											<div class="col-md-6">
												<input type="submit" class="btn btn-primary"
													onclick="return validateLogin()" value="Sign In">
											</div>
										</div>
									</div>
								</div>
								<!-- /.row -->
							</form>
						</div>
						<div class="col-md-4"></div>

					</div>
				</div>
				<script>
       
           
			
			function validateLogin()
			{
			
				var flagemployeeId = validLoginId()
				var flagemployeePassword = validatePassword()
				
				
				
			    if(flagemployeeId && flagemployeeId)
			    	{
			    	return true;
			    	}
				return false;
  
				
			}
			
			function validLoginId()
			{
			    console.log("Hi");
				var inputLogin   = document.getElementById("myLogin").value;
				console.log(inputLogin);
				
				
				if(inputLogin==null || inputLogin=="") 
				{
					//alert("Enter the must required fields")
					document.getElementById("LoginMessage").innerHTML= "This field is required";
					document.getElementById("LoginMessage").style.color= "red";
					document.getElementById("LoginMessage").style.display= "inline";
					document.getElementById("LoginMessage").style.position="absolute";
					document.getElementById("LoginMessage").style.top="126px";
					document.getElementById("LoginMessage").style.left="19px";  
					return false;
                }
				
				
				else
				{    console.log("Hiiiiii");
					var atposition  = inputLogin.indexOf("@");  
                	var dotposition = inputLogin.lastIndexOf(".");  
                	if (atposition<1 || dotposition<atposition+2 || dotposition >= inputLogin.length)
					{  
                //alert("Please enter a valid e-mail address" );
					    document.getElementById("LoginMessage").innerHTML= "Please enter a valid Login ID";
						document.getElementById("LoginMessage").style.color= "red";
						document.getElementById("LoginMessage").style.display= "inline";
						document.getElementById("LoginMessage").style.position="absolute";
						document.getElementById("LoginMessage").style.top="126px";
						document.getElementById("LoginMessage").style.left="19px";  
						return false;
				
					}  
				}
				return true;
    
			}
			
			
			function validatePassword()
			{
			    console.log("hiji");
			    var inputPassword = document.getElementById("myPassword").value;
				console.log(inputPassword);
				
				if(inputPassword == null || inputPassword == "" )
				{
					console.log("no password");
					document.getElementById("PasswordMessage").innerHTML= "Password is required";
					document.getElementById("PasswordMessage").style.color= "red";
					document.getElementById("PasswordMessage").style.display= "inline";
					document.getElementById("PasswordMessage").style.position="absolute";
					document.getElementById("PasswordMessage").style.top="40px";
					document.getElementById("PasswordMessage").style.left="18px";  
					return false;
                 }
				 
				 else if( inputPassword.length<8)
				 {
				 	document.getElementById("PasswordMessage").innerHTML= "Password must be at least 8 characters long";
					document.getElementById("PasswordMessage").style.color= "red";
					document.getElementById("PasswordMessage").style.display= "inline";
					document.getElementById("PasswordMessage").style.position="absolute";
					document.getElementById("PasswordMessage").style.top="40px";
					document.getElementById("PasswordMessage").style.left="18px";  
					console.log("short password");
					return false;
				 }
				 return true;		
				 
			}
    
    </script>

<%@ include file="footer.jsp"  %> 