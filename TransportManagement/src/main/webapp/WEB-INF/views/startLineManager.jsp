<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" type="image/png" sizes="16x16"
	href="../plugins/images/title_logo.png">
<title>Guardian Life Transport System</title>
<!-- Bootstrap Core CSS -->
<link href="bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Menu CSS -->
<link
	href="../plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css"
	rel="stylesheet">
<!-- toast CSS -->
<link
	href="../plugins/bower_components/toast-master/css/jquery.toast.css"
	rel="stylesheet">
<!-- morris CSS -->
<link href="../plugins/bower_components/morrisjs/morris.css"
	rel="stylesheet">
<!-- chartist CSS -->
<link
	href="../plugins/bower_components/chartist-js/dist/chartist.min.css"
	rel="stylesheet">
<link
	href="../plugins/bower_components/chartist-plugin-tooltip-master/dist/chartist-plugin-tooltip.css"
	rel="stylesheet">
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
            <circle class="path" cx="50" cy="50" r="20" fill="none"
				stroke-width="2" stroke-miterlimit="10" />
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
			<div class="navbar-header" style="background-color: darkseagreen">
				<div class="top-left-part">
					<!-- Logo -->
					<a class="logo" href="dashboard.html"> <!-- Logo icon image, you can use font-icon also -->
						<b> <!--This is dark logo icon--> <img
							src="../plugins/images/admin-logo.png" alt="home"
							class="dark-logo" /> <!--This is light logo icon-->

					</b> <!-- Logo text image you can use text also --> <span
						class="hidden-xs"> <!--This is dark logo text--> <img
							src="../plugins/images/admin-text.png" alt="home"
							class="dark-logo" /> <!--This is light logo text--> <img
							src="../plugins/images/logo.jfif" lenght="50" width="150"
							alt="home" class="light-logo" />
					</span>
					</a>
				</div>
				<!-- /Logo -->
				<ul class="nav navbar-top-links navbar-right pull-right">
					<li><a
						class="nav-toggler open-close waves-effect waves-light hidden-md hidden-lg"
						href="javascript:void(0)"><i class="fa fa-bars"></i></a></li>

					
                    <li>
                        <a href="/logout" >Logout</a>
                    </li>
				</ul>
			</div>
			<!-- /.navbar-header -->
			<!-- /.navbar-top-links -->
			<!-- /.navbar-static-side -->
		</nav>
		<!-- End Top Navigation -->
		<!-- ============================================================== -->
		<!-- Left Sidebar - style you can find in sidebar.scss  -->
		<!-- ============================================================== -->
		<div class="navbar-default sidebar" role="navigation">
			<div class="sidebar-nav slimscrollsidebar">
				<div class="sidebar-head">
					<h3>
						<span class="fa-fw open-close"><i class="ti-close ti-menu"></i></span>
						<span class="hide-menu">Navigation</span>
					</h3>
				</div>
				<ul class="nav" id="side-menu">



					<li style="padding: 120px 0 0;">
					<li><a href="profile.html" class="waves-effect"
						id="View Route Chart">View Route Chart</a>
					<li><a href="/addRequest" class="waves-effect">Request a
							cab</a></li>

					<li><a href="basic-table.html" class="waves-effect"
						id="View Line Manager">View Line Manager</a></li>
					<li><a href="#" class="notification"> <span>Pending
								Requests</span> <span class="badge" style="background-color: red;">3</span>
					</a></li>


				</ul>

			</div>

		</div>
		<!-- ============================================================== -->
		<!-- End Left Sidebar -->
		<!-- ============================================================== -->
		<!-- ============================================================== -->
		<!-- Page Content -->
		<!-- ============================================================== -->
		<div id="page-wrapper">
			<div class="container-fluid">
				<div class="row bg-title">
					<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
						<h4 class="page-title">Hello, Manager-Name</h4>
					</div>
					<div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
						<a href="https://wrappixel.com/templates/ampleadmin/"
							target="_blank"
							class="btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light">ALERT</a>

					</div>
					<!-- /.col-lg-12 -->
				</div>
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
				<script
					src="../plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js"></script>
				<!--slimscroll JavaScript -->
				<script src="js/jquery.slimscroll.js"></script>
				<!--Wave Effects -->
				<script src="js/waves.js"></script>
				<!--Counter js -->
				<script
					src="../plugins/bower_components/waypoints/lib/jquery.waypoints.js"></script>
				<script
					src="../plugins/bower_components/counterup/jquery.counterup.min.js"></script>
				<!-- chartist chart -->
				<script
					src="../plugins/bower_components/chartist-js/dist/chartist.min.js"></script>
				<script
					src="../plugins/bower_components/chartist-plugin-tooltip-master/dist/chartist-plugin-tooltip.min.js"></script>
				<!-- Sparkline chart JavaScript -->
				<script
					src="../plugins/bower_components/jquery-sparkline/jquery.sparkline.min.js"></script>
				<!-- Custom Theme JavaScript -->
				<script src="js/custom.min.js"></script>
				<script src="js/dashboard1.js"></script>
				<script
					src="../plugins/bower_components/toast-master/js/jquery.toast.js"></script>