<%@ include file="startLineManager.jsp"%>
<div class="container">
	<div class="row">
		<div class="col-md-5" style="margin-left: 10px;">
			<div class="white-box">
				<form class="form-horizontal form-material" action="addARequest"
					method="post">
					<div class="form-group">
						<label class="col-sm-12">Request Type</label>
						<div class="col-sm-12">
							<select class="form-control form-control-line" name="requestType"
								id="requestType" onchange="requestType()">
								<option value="">--Please Select --</option>
								<option>Emergency</option>
								<option>Adhoc</option>
							</select>

						</div>
					</div>
					<span id="srequestType"
						style="color: red; position: relative; top: -19px;"></span>
					<div class="form-group">
						<div class="form-check">
							<input type="checkbox" class="form-check-input" id="selfRequest"
								style="margin-left: 16px;"> <label
								class="form-check-label" for="exampleCheck1" name="selfRequest">Self
								Request</label>
						</div>
					</div>


					<div class="form-group">

						<label for="employee-Id" class="col-md-12">Guardian
							Employee Id</label>
						<div class="col-md-12">
							<input type="text" placeholder="Guardian Employee Id"
								class="form-control form-control-line" name="employeeId"
								id="employeeId" onchange="changeEmployeeId()">
						</div>

					</div>
					<span id="semployeeId"
						style="color: red; position: relative; top: -21px;"></span>
					<div class="form-group">

						<label for="employee-Id" class="col-md-12">Traveler Name </label>
						<div class="col-md-12">
							<input type="text" placeholder="Traveler Name"
								class="form-control form-control-line" name="employeeName"
								id="employeeName">
						</div>

					</div>
					<span id="semployeeName"
						style="color: red; position: relative; top: -21px;"></span>


					<div class="form-group">

						<label for="employee-contact" class="col-md-12">Traveler
							Contact</label>
						<div class="col-md-12">
							<input type="number" placeholder="Traveler Contact"
								class="form-control form-control-line" name="employeeContact"
								id="employeeContact">
						</div>

					</div>

					<span id="semployeeContact"
						style="color: red; position: relative; top: -21px;"></span>

					<div class="form-group">

						<label for="employee-remarks" class="col-md-12">Remarks</label>
						<div class="col-md-12">
							<textarea class="form-control" rows="5" id="remarks"
								name="remarks" placeholder="Remarks"></textarea>
						</div>

					</div>
					<span id="sremarks"
						style="color: red; position: relative; top: -21px;"></span>
			</div>

		</div>
		<div class="col-md-0"></div>
		<div class="col-md-5" style="margin-left: 59px;">
			<div class="white-box">
				<div class="form-horizontal form-material">

					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<label class="col-sm-12">Pick Up/Drop</label>
								<div class="col-sm-12">
									<select class="form-control form-control-line"
										name="pickOrDrop" id="pickupDrop">
										<option value="">Please Select</option>
										<option>Drop</option>
										<option>Pick Up</option>
									</select>
								</div>
							</div>
							<span id="spickupDrop"
								style="color: red; position: relative; top: -21px;"></span>
						</div>
						<div class="col-md-4">
							<div class="form-group">

								<label for="employee-Id" class="col-md-12">Date</label>
								<div class="col-md-12">
									<input type="date" placeholder=""
										class="form-control form-control-line" name="requestDate"
										id="date">
								</div>

							</div>
							<span id="sdate"
								style="color: red; position: relative; top: -21px;"></span>
						</div>
						<div class="col-md-4">
							<div class="form-group">

								<label for="employee-Id" class="col-md-12">Time</label>
								<div class="col-md-12">
									<input type="time" placeholder=""
										class="form-control form-control-line" name="requestTime"
										id="time">
								</div>

							</div>
							<span id="stime"
								style="color: red; position: relative; top: -21px;"></span>
						</div>
					</div>


					<!-- PickUp Address-->

					<div class="form-group">
						<div class="row">
							<div class="col-md-4">
								<div class="form-check">
									<label class="form-check-label" for="exampleCheck1"
										style="margin-top: 2px; margin-left: 16px;">Pick Up
										Address </label>
								</div>
							</div>
							<div class="col-md-4">
								<div class="form-check">
									<input type="checkbox" class="form-check-input"
										id="homeAddress1" name="homeAddress1"> <label
										class="form-check-label" for="exampleChec">Home
										Address</label>
								</div>
							</div>
							<div class="col-md-4">
								<div class="form-check">
									<input type="checkbox" class="form-check-input"
										id="officeAddress1" name="officeAddress1"> <label
										class="form-check-label" for="exampleChec">Office
										Address</label>
								</div>
							</div>

						</div>
					</div>


					<div class="form-group">


						<div class="col-md-12">
							<input type="text" placeholder="Address Line 1"
								class="form-control form-control-line" name="paddressLine1"
								id="paddressLine1">
						</div>

					</div>
					<span id="spaddressLine1"
						style="color: red; position: relative; top: -21px;"></span>
					<div class="form-group">


						<div class="col-md-12">
							<input type="text" placeholder="Address Line 2"
								class="form-control form-control-line" name="paddressLine2"
								id="paddressLine2">
						</div>

					</div>
					<span id="spaddressLine2"
						style="color: red; position: relative; top: -21px;"></span>
					<div class="form-group">


						<div class="col-md-12">
							<input type="text" placeholder="Address Line 3"
								class="form-control form-control-line" name="paddressLine3"
								id="paddressLine3">
						</div>

					</div>
					<span id="spaddressLine3"
						style="color: red; position: relative; top: -21px;"></span>
					<div class="form-group">
						<div class="row">
							<div class="col-md-4">
								<div class="col-md-12">
									<input type="text" placeholder="State"
										class="form-control form-control-line" name="pstate"
										id="pstate">
								</div>
								<span id="spstate"
									style="color: red; position: relative; left: 14px; top: 6px;"></span>
							</div>
							<div class="col-md-4">

								<div class="col-md-12">
									<input type="text" placeholder="City"
										class="form-control form-control-line" name="pcity" id="pcity">

								</div>
								<span id="spcity"
									style="color: red; position: relative; left: 14px; top: 6px;"></span>
							</div>
							<div class="col-md-4">
								<div class="col-md-12">
									<input type="number" placeholder="Pincode"
										class="form-control form-control-line" name="ppincode"
										id="ppincode">
								</div>
								<span id="sppincode"
									style="color: red; position: relative; left: 14px; top: 6px;"></span>
							</div>
						</div>



					</div>


					<!-- Drop Address-->

					<div class="form-group">
						<div class="row">
							<div class="col-md-4">
								<div class="form-check">
									<label class="form-check-label" for="exampleCheck1"
										style="margin-top: 2px; margin-left: 16px;">Drop
										Address </label>
								</div>
							</div>
							<div class="col-md-4">
								<div class="form-check">
									<input type="checkbox" class="form-check-input"
										id="homeAddress2" name="homeAddress2"> <label
										class="form-check-label" for="exampleChec">Home
										Address</label>
								</div>
							</div>
							<div class="col-md-4">
								<div class="form-check">
									<input type="checkbox" class="form-check-input"
										id="officeAddress2" name="officeAddress2"> <label
										class="form-check-label" for="exampleChec">Office
										Address</label>
								</div>
							</div>

						</div>

					</div>


					<div class="form-group">


						<div class="col-md-12">
							<input type="text" placeholder="Address Line 1"
								class="form-control form-control-line" name="daddressLine1"
								id="daddressLine1">
						</div>
						<span id="sdaddressLine1"
							style="color: red; position: relative; left: 14px; top: 4px;"></span>
					</div>
					<div class="form-group">


						<div class="col-md-12">
							<input type="text" placeholder="Address Line 2"
								class="form-control form-control-line" name="daddressLine2"
								id="daddressLine2">
						</div>
						<span id="sdaddressLine2"
							style="color: red; position: relative; left: 14px; top: 6px;"></span>

					</div>
					<div class="form-group">


						<div class="col-md-12">
							<input type="text" placeholder="Address Line 3"
								class="form-control form-control-line" name="daddressLine3"
								id="daddressLine3">
						</div>
						<span id="sdaddressLine3"
							style="color: red; position: relative; left: 14px; top: 6px;"></span>

					</div>
					<div class="form-group">

						<div class="row">
							<div class="col-md-4">
								<div class="col-md-12">
									<input type="text" placeholder="State"
										class="form-control form-control-line" name="dstate"
										id="dstate">
								</div>
								<span id="sdstate"
									style="color: red; position: relative; left: 14px; top: 6px;"></span>
							</div>
							<div class="col-md-4">

								<div class="col-md-12">
									<input type="text" placeholder="City"
										class="form-control form-control-line" name="dcity" id="dcity">

								</div>
								<span id="sdcity"
									style="color: red; position: relative; left: 14px; top: 6px;"></span>
							</div>
							<div class="col-md-4">
								<div class="col-md-12">
									<input type="number" placeholder="Pincode"
										class="form-control form-control-line" name="dpincode"
										id="dpincode">
								</div>
								<span id="sdpincode"
									style="color: red; position: relative; left: 14px; top: 6px;"></span>
							</div>
						</div>

					</div>


					<div class="row" style="margin-top: 12px">
						<div class="col-md-6"></div>
						<div class="col-md-6 text-center">
							<button class="btn btn-primary" style="margin-left: 67px;"
								onclick="return checkRequest()">Submit</button>
						</div>
					</div>
				</div>
			</div>




			</form>

		</div>




	</div>


</div>

<script>
		$(document).ready(function() {

			//  Self Request  

			$('#selfRequest').click(function() {
				if ($(this).prop("checked") == true) {

					$.ajax({
						type : "GET",
						url : "/html/selfrequest",

						success : function(data) {
							console.log(JSON.stringify(data));

							console.log(data.number);
							console.log(data.name);
							console.log(data.id);
							$("#employeeId").val(data.employeeId);
							$("#employeeName").val(data.name);
							$("#employeeContact").val(data.contactNumber);

							//	$("#employeeId").prop("disabled", true);
							//$("#employeeName").prop("disabled", true);
							//	$("#employeeContact").prop("disabled", true);
						}
					});

				} else {

					$("#employeeId").val("");
					$("#employeeName").val("");
					$("#employeeContact").val("");

					$("#employeeId").prop("disabled", false);
					$("#employeeName").prop("disabled", false);
					$("#employeeContact").prop("disabled", false);
				}

			});

			// Pick up or Drop

			$("#pickupDrop").change(function() {

				var test = $("#pickupDrop").val();
				console.log(test);
			});

			$("#homeAddress1").click(function() {
				if ($(this).prop("checked") == true) {

					$("#officeAddress1").attr("disabled", true);

					$.ajax({
						type : "GET",
						url : "/html/homeAddress1",

						success : function(data) {
							console.log(JSON.stringify(data));


							$("#paddressLine1").val(data.addressLine1);
							$("#paddressLine2").val(data.addressLine2);
							$("#paddressLine3").val(data.addressLine3);
							$("#ppincode").val(data.pinCode);
							$("#pstate").val(data.state);
							$("#pcity").val(data.city);

							//	$("#paddressLine1").prop("disabled", true);
							//	$("#paddressLine2").prop("disabled", true);
							//	$("#paddressLine3").prop("disabled", true);
							//	$("#ppincode").prop("disabled", true);
							//	$("#pstate").prop("disabled", true);
							//	$("#pcity").prop("disabled", true);

						}
					});

				} else {

					$("#officeAddress1").attr("disabled", false);
					$("#paddressLine1").val("");
					$("#paddressLine2").val("");
					$("#paddressLine3").val("");
					$("#ppincode").val("");
					$("#pstate").val("");
					$("#pcity").val("");

					$("#paddressLine1").prop("disabled", false);
					$("#paddressLine2").prop("disabled", false);
					$("#paddressLine3").prop("disabled", false);
					$("#ppincode").prop("disabled", false);
					$("#pstate").prop("disabled", false);
					$("#pcity").prop("disabled", false);
				}

			});
			$("#officeAddress1").click(function() {
				if ($(this).prop("checked") == true) {

					$("#homeAddress1").attr("disabled", true);

					$.ajax({
						type : "GET",
						url : "/html/officeAddress1",

						success : function(data) {
							console.log(JSON.stringify(data));

							$("#paddressLine1").val(data.addressLine1);
							$("#paddressLine2").val(data.addressLine2);
							$("#paddressLine3").val(data.addressLine3);
							$("#ppincode").val(data.pinCode);
							$("#pstate").val(data.state);
							$("#pcity").val(data.city);

							//	$("#paddressLine1").prop("disabled", true);
							//	$("#paddressLine2").prop("disabled", true);
							//	$("#paddressLine3").prop("disabled", true);
							//	$("#ppincode").prop("disabled", true);
							//	$("#pstate").prop("disabled", true);
							//	$("#pcity").prop("disabled", true);

						}
					});

				}

				else {

					$("#homeAddress1").attr("disabled", false);
					$("#paddressLine1").val("");
					$("#paddressLine2").val("");
					$("#paddressLine3").val("");
					$("#ppincode").val("");
					$("#pstate").val("");
					$("#pcity").val("");

					$("#paddressLine1").prop("disabled", false);
					$("#paddressLine2").prop("disabled", false);
					$("#paddressLine3").prop("disabled", false);
					$("#ppincode").prop("disabled", false);
					$("#pstate").prop("disabled", false);
					$("#pcity").prop("disabled", false);
				}
			});

			$("#homeAddress2").click(function() {
				if ($(this).prop("checked") == true) {

					$("#officeAddress2").attr("disabled", true);

					$.ajax({
						type : "GET",
						url : "/html/homeAddress2",

						success : function(data) {
							console.log(JSON.stringify(data));

							$("#daddressLine1").val(data.addressLine1);
							$("#daddressLine2").val(data.addressLine2);
							$("#daddressLine3").val(data.addressLine3);
							$("#dpincode").val(data.pinCode);
							$("#dstate").val(data.state);
							$("#dcity").val(data.city);

							//		$("#daddressLine1").prop("disabled", true);
							//		$("#daddressLine2").prop("disabled", true);
							//		$("#daddressLine3").prop("disabled", true);
							//		$("#dpincode").prop("disabled", true);
							//		$("#dstate").prop("disabled", true);
							//		$("#dcity").prop("disabled", true);

						}
					});

				} else {
					$("#officeAddress2").attr("disabled", false);

					$("#daddressLine1").val("");
					$("#daddressLine2").val("");
					$("#daddressLine3").val("");
					$("#dpincode").val("");
					$("#dstate").val("");
					$("#dcity").val("");

					$("#daddressLine1").prop("disabled", false);
					$("#daddressLine2").prop("disabled", false);
					$("#daddressLine3").prop("disabled", false);
					$("#dpincode").prop("disabled", false);
					$("#dstate").prop("disabled", false);
					$("#dcity").prop("disabled", false);
				}

			});
			$("#officeAddress2").click(function() {
				if ($(this).prop("checked") == true) {

					$("#homeAddress2").attr("disabled", true);

					$.ajax({
						type : "GET",
						url : "/html/officeAddress2",

						success : function(data) {
							console.log(JSON.stringify(data));

							$("#daddressLine1").val(data.addressLine1);
							$("#daddressLine2").val(data.addressLine2);
							$("#daddressLine3").val(data.addressLine3);
							$("#dpincode").val(data.pinCode);
							$("#dstate").val(data.state);
							$("#dcity").val(data.city);

							//	$("#daddressLine1").prop("disabled", true);
							//	$("#daddressLine2").prop("disabled", true);
							//	$("#daddressLine3").prop("disabled", true);
							//	$("#dpincode").prop("disabled", true);
							//	$("#dstate").prop("disabled", true);
							//	$("#dcity").prop("disabled", true);

						}
					});

				}

				else {

					$("#homeAddress2").attr("disabled", false);

					$("#daddressLine1").val("");
					$("#daddressLine2").val("");
					$("#daddressLine3").val("");
					$("#dpincode").val("");
					$("#dstate").val("");
					$("#dcity").val("");

					$("#daddressLine1").prop("disabled", false);
					$("#daddressLine2").prop("disabled", false);
					$("#daddressLine3").prop("disabled", false);
					$("#dpincode").prop("disabled", false);
					$("#dstate").prop("disabled", false);
					$("#dcity").prop("disabled", false);
				}
			});

		});

		function checkRequest() {
			//	if (employeeDropAddress3() ) {
			///		return true;
			///	}
			//	return false;
			//1  var gg = employeeContact();
			//	console.log(gg);
			//		var ff = employeeRemarks();
			
			var flagemployeeContact = employeeContact()
			var flagemployeeRemarks = employeeRemarks() 
			var flagrequestType = requestType()
			var flagemployeeId = employeeId() 
			var flagemployeeName = employeeName()
			var flagemployeePickUpDrop = employeePickUpDrop() 
			var flagemployeeDate = employeeDate()
			var flagemployeeTime = employeeTime() 
			var flagemployeePickupAddress1 = employeePickupAddress1()
		//	var flagemployeePickupAddress2 = employeePickupAddress2() 
		//	var flagemployeePickupAddress3 = employeePickupAddress3()
			var flagemployeePickupState = employeePickupState() 
			var flagemployeePickupCity = employeePickupCity()
			var flagemployeePickupPincode = employeePickupPincode() 
			var flagemployeeDropAddress1 = employeeDropAddress1()
		//	var flagemployeeDropAddress2 = employeeDropAddress2() 
		//	var flagemployeeDropAddress3 = employeeDropAddress3()
			var flagemployeeDropState = employeeDropState() 
			var flagemployeeDropCity = employeeDropCity()
			var flagemployeeDropPincode = employeeDropPincode()

			if (flagemployeeContact && flagemployeeRemarks && flagrequestType
				 && flagemployeeName && flagemployeeId
					&& flagemployeePickUpDrop && flagemployeeDate
					&& flagemployeeTime && flagemployeePickupAddress1
					
					&& flagemployeePickupState && flagemployeePickupCity
					&& flagemployeePickupPincode && flagemployeeDropAddress1
					
					&& flagemployeeDropState && flagemployeeDropCity
					&& flagemployeeDropPincode){
				return true;
			}
			return false;

		}

		function requestType() {
			var requestType = $("#requestType").val();

			if (requestType == "") {
				//	console.log("request Type");
				document.getElementById("srequestType").innerHTML = "Request Type Required";
				return false;
			}

			return true;
		}

		function employeeId() {
			var employeeId = $("#employeeId").val();

			if (employeeId == "") {
				console.log("Employee ID")
				document.getElementById("semployeeId").innerHTML = "Employee Id Required";
				return false;
			}

			return true;

		}
		function employeeName() {
			var employeeId = $("#employeeName").val();

			if (employeeId == "") {
				console.log("Employee Name");
				document.getElementById("semployeeName").innerHTML = "Employee Name Is Required";
				return false;
			}

			return true;

		}

		function employeeContact() {
			var employeeId = $("#employeeContact").val();

			if (employeeId == "") {
				console.log("Employee Contact");
				document.getElementById("semployeeContact").innerHTML = "Employee Contact Is Required";
				return false;
			}

			return true;

		}
		function employeeRemarks() {
			var employeeId = $("#remarks").val();

			if (employeeId == "") {
				console.log("Employee Remarks");
				document.getElementById("sremarks").innerHTML = "Remarks Required";
				return false;
			}

			return true;

		}
		function employeePickUpDrop() {
			var employeeId = $("#pickupDrop").val();

			if (employeeId == "") {
				console.log("Employee Name");
				document.getElementById("spickupDrop").innerHTML = "Pick Up/Drop Required";
				return false;
			}

			return true;

		}
		function employeeDate() {
			var employeeId = $("#date").val();

			if (employeeId == "") {
				console.log("Employee Name");
				document.getElementById("sdate").innerHTML = "Date Required";
				return false;
			}

			return true;
		}
		function employeeTime() {
			var employeeId = $("#time").val();

			if (employeeId == "") {
				console.log("Employee Name");
				document.getElementById("stime").innerHTML = "Time Required";
				return false;
			}

			return true;
		}

		///   Employee Pick Address

		function employeePickupAddress1() {
			var employeeId = $("#paddressLine1").val();

			if (employeeId == "") {
				console.log("Employee Name");
				document.getElementById("spaddressLine1").innerHTML = "Address Line1 required";
				return false;
			}

			return true;
		}

		function employeePickupAddress2() {
			var employeeId = $("#paddressLine2").val();

			if (employeeId == "") {
				console.log("Employee Name");
				document.getElementById("spaddressLine2").innerHTML = "Address Line2 required";
				return false;
			}

			return true;
		}

		function employeePickupAddress3() {
			var employeeId = $("#paddressLine3").val();

			if (employeeId == "") {
				console.log("Employee Name");
				document.getElementById("spaddressLine3").innerHTML = "Address Line3 required";
				return false;
			}

			return true;
		}
		function employeePickupState() {
			var employeeId = $("#pstate").val();

			if (employeeId == "") {
				console.log("Employee Name");
				document.getElementById("spstate").innerHTML = "State Required";
				return false;
			}

			return true;
		}

		function employeePickupCity() {
			var employeeId = $("#pcity").val();

			if (employeeId == "") {
				console.log("Employee Name");
				document.getElementById("spcity").innerHTML = "City Required";
				return false;
			}

			return true;
		}

		function employeePickupPincode() {
			var employeeId = $("#ppincode").val();

			if (employeeId == "") {
				console.log("Employee Name");
				document.getElementById("sppincode").innerHTML = "Pincode Required";
				return false;
			}

			return true;
		}

		// Drop Address

		function employeeDropAddress1() {
			var employeeId = $("#daddressLine1").val();

			if (employeeId == "") {
				console.log("Employee Name");
				document.getElementById("sdaddressLine1").innerHTML = "Address Line1 required";
				return false;
			}
			else
				{
				return true;	
				}
		//	return true;

			
		}

		function employeeDropAddress2() {
			var employeeId = $("#daddressLine2").val();

			if (employeeId == "") {
				console.log("Employee Name");
				document.getElementById("sdaddressLine2").innerHTML = "Address Line2 required";
				return false;
			}

			return true;
		}

		function employeeDropAddress3() {
			var employeeId = $("#daddressLine3").val();

			if (employeeId == "") {
				console.log("Employee Name");
				document.getElementById("sdaddressLine3").innerHTML = "Address Line3 required";
				return false;
			}

			return true;
		}
		function employeeDropState() {
			var employeeId = $("#dstate").val();

			if (employeeId == "") {
				console.log("Employee Name");
				document.getElementById("sdstate").innerHTML = "State Required";
				return false;
			}

			return true;
		}

		function employeeDropCity() {
			var employeeId = $("#dcity").val();

			if (employeeId == "") {
				console.log("Employee Name");
				document.getElementById("sdcity").innerHTML = "City Required";
				return false;
			}

			return true;
		}

		function employeeDropPincode() {
			var employeeId = $("#dpincode").val();

			if (employeeId == "") {
				console.log("Employee Name");
				document.getElementById("sdpincode").innerHTML = "Pincode Required";
				return false;
			}

			return true;
		}
		function changeEmployeeId() {
			var employeeId = $("#employeeId").val();

			if (employeeId.length == 6) {

				$.ajax({
					type : "GET",
					url : "/html/getEmployeeById?id="+employeeId,

					success : function(data) {
						console.log(JSON.stringify(data));

						console.log(data.number);
						console.log(data.name);
					//	console.log(data.id);
						//$("#employeeId").val(data.id);
						$("#employeeName").val(data.name);
						$("#employeeContact").val(data.contactNumber);

						//	$("#employeeId").prop("disabled", true);
						//$("#employeeName").prop("disabled", true);
						//	$("#employeeContact").prop("disabled", true);
					}
				});
			}

		}
	</script>

<%@ include file="footer.jsp"%>
