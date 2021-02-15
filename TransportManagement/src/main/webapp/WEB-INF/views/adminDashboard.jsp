<%@ include file="startAdmin.jsp"%>



<div class="row">


	<div class="col-lg-4 col-sm-6 col-xs-12">

		<div class="white-box analytics-info">
			<h3 class="box-title"
				style="text-align: center; color: #072f56; font-weight: bold; font-size: 23px;">Not
				Started</h3>
			<ul class="list-inline two-part">

				<li class="text-left"><i class="ti-arrow-up text-success"></i>
					<span class="text"> <b
						style="color: green; font-size: 19px;">CAB</b></font>
				</span></li>

				<li class="text-right"><i class="ti-arrow-up text-success"></i>
					<span class="text"> <font size="3"> <b
							style="color: dodgerblue; font-size: 19px;">EMPLOYEE</b>
					</font>
				</span></li>

			</ul>


			<ul class="list-inline two-part">

				<li class="text-left"><i class="ti-arrow-up text-info"> </i> <span
					class="counter text-info" style="color: green">
						${cabNotStartedCount} </span></li>

				<li class="text-right"><i class="ti-arrow-up text-success">
				</i> <span class="counter text-success" style="color: dodgerblue">
						${employeeNotStarted} </span></li>

			</ul>
		</div>
	</div>


	<div class="col-lg-4 col-sm-6 col-xs-12">
		<div class="white-box analytics-info">
			<h3 class="box-title"
				style="text-align: center; color: #072f56; font-weight: bold; font-size: 23px;">On
				Route</h3>

			<ul class="list-inline two-part">

				<li class="text-left"><i class="ti-arrow-up text-success"></i>
					<span class="text"> <b
						style="color: green; font-size: 19px;">CAB</b></font>
				</span></li>

				<li class="text-right"><i class="ti-arrow-up text-success"></i>
					<span class="text"> <font size="3"> <b
							style="color: dodgerblue; font-size: 19px;">EMPLOYEE</b>
					</font>
				</span></li>

			</ul>

			<ul class="list-inline two-part">

				<li class="text-left"><i class="ti-arrow-up text-purple"></i> <span
					class="counter text-info" style="color: green">
						${cabOnRouteCount} </span></li>
				<li class="text-right"><i class="ti-arrow-up text-success"></i>
					<span class="counter text-success" style="color: dodgerblue">
						${employeeOnRoute} </span></li>
			</ul>
		</div>
	</div>


	<div class="col-lg-4 col-sm-6 col-xs-12">
		<div class="white-box analytics-info">
			<h3 class="box-title"
				style="text-align: center; color: #072f56; font-weight: bold; font-size: 23px;">Reached</h3>

			<ul class="list-inline two-part">

				<li class="text-left"><i class="ti-arrow-up text-success"></i>
					<span class="text"> <b
						style="color: green; font-size: 19px;">CAB</b></font>
				</span></li>

				<li class="text-right"><i class="ti-arrow-up text-success"></i>
					<span class="text"> <font size="3"> <b
							style="color: dodgerblue; font-size: 19px;">EMPLOYEE</b>
					</font>
				</span></li>
			</ul>
			<ul class="list-inline two-part">
				<li class="text-left"><i class="ti-arrow-up text-success"></i>
					<span class="counter text-info" style="color: green">
						${cabReachedCount} </span></li>
				<li class="text-right"><i class="ti-arrow-up text-info"></i> <span
					class="counter text-success" style="color: dodgerblue">
						${employeeReachedCount} </span></li>
			</ul>
		</div>
	</div>
</div>
<!--/.row -->
<!--row -->
<!-- /.row -->
<div class="row">
	<div class="col-md-12 col-lg-12 col-sm-12 col-xs-12">
		<div class="white-box">
			<h3 class="box-title"
				style="text-align: left; color: #072f56; font-weight: bold; font-size: 23px;">
				Cab Arrival Status</h3>
			<ul class="list-inline text-right">
				<li>
					<h5>
						<span style="color: green"><i class="fa fa-circle m-r-5"></i>
						</span>On Time
					</h5>
				</li>
				<li>
					<h5>
						<span style="color: orange"><i class="fa fa-circle m-r-5"></i></span>Upto
						30min Delay
					</h5>
				</li>
				<li>
					<h5>
						<span style="color: red"><i class="fa fa-circle m-r-5"></i></span>More
						Than 30min Delay
					</h5>
				</li>
			</ul>
			<ul>
				<div id="ct-visits" style="height: 405px;"></div>
			</ul>

		</div>
	</div>
</div>

<div class="row">
	<div class="col-md-12 col-lg-12 col-sm-12 col-xs-12">
		<div class="white-box">
			<h3 class="box-title"
				style="text-align: left; color: #072f56; font-weight: bold; font-size: 23px;">
				Employee Arrival Status</h3>
			<ul class="list-inline text-right">
				<li>
					<h5>
						<span style="color: green"><i class="fa fa-circle m-r-5"></i></span>On
						Time
					</h5>
				</li>
				<li>
					<h5>
						<span style="color: orange"><i class="fa fa-circle m-r-5"></i></span>Upto
						30min Delay
					</h5>
				</li>
				<li>
					<h5>
						<span style="color: red"><i class="fa fa-circle m-r-5"></i></span>More
						Than 30min Delay
					</h5>
				</li>
			</ul>
			<ul>
				<div id="ct-cabs" style="height: 405px;"></div>
		</div>
	</div>
</div>
</div>



<%@ include file="footer.jsp"%>
