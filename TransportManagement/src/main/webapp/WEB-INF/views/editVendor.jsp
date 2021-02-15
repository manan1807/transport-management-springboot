<%@ include file="startAdmin.jsp"%>
				 
				<div class="col-md-2"></div>
                        
                <div class="col-md-8 col-xs-12">
                        <div class="white-box">
                           <form action = "addvendortodb" class="form-horizontal form-material">
                           
							<div class="form-group row">
                                  <label for="vendor Id" class="col-md-3 col-form-label">Vendor ID</label>
                                    <div class= "col-md-12">
									  <input type="text" placeholder="Vendor ID" name = "vendorId" 
									   class="form-control" id="vendorID" value="${vendor.vendorId}" >
                                    </div>
                                </div>
                                <span id="vvendorId"
                                	style=" color: red;
								    position: relative;
								    top: -20px;
								    left: 2px;"></span>
                                	
                                	
								  <div class="form-group row">
                                   <label for="vendor Name" class="col-md-3 col-form-label">Vendor Name</label>
                                    <div class="col-md-12">
                                        <input type="text" placeholder="Vendor Name" name = "vendorName"
										 class="form-control" id="vendorName" value="${vendor.vendorName}" >
                                    </div>
                                </div>
								<span id="vvendorName"
                                	style=" color: red;
								    position: relative;
								    top: -20px;
								    left: 2px;"></span>
								    
								    
								<div class="form-group row">
                                   <label for="vendor govt-id" class="col-md-3 col-form-label">Vendor Govt. ID</label>
                                    <div class="col-md-12">
                                        <input type="text" placeholder="Vendor Govt. ID" name = "govtid"
										 class="form-control" id="vendorGovtID" value="${vendor.govtId}">
                                    </div>
                                </div>
								<span id="vvendorGovtID"
                                	style=" color: red;
								    position: relative;
								    top: -20px;
								    left: 2px;"></span>
								    
								    
								<div class="form-group row">
                                   <label for="vendor gstin-no." class="col-md-3 col-form-label">Vendor GSTIN No.</label>
                                    <div class="col-md-12">
                                        <input type="text" placeholder="Vendor GSTIN No." name = "gstin"
										class="form-control" id="vendorGstinNo" value="${vendor.gstin}" >
                                    </div>
                                </div>
                               <span id="vvendorGstinNo"
                                	style=" color: red;
								    position: relative;
								    top: -20px;
								    left: 2px;"></span>
								    
								    
							      <div class="form-group row">
                                   <label for="Phone-no." class="col-md-3 col-form-label">Phone No.</label>
                                    <div class="col-md-12">
                                        <input type="text" placeholder="Phone No." name = "phone"
										class="form-control" id="phoneNo" value="${vendor.phone}">
                                    </div>
                                </div>
                                <span id="vphoneNo"
                                	style=" color: red;
								    position: relative;
								    top: -20px;
								    left: 2px;"></span>
								
								 <div class="form-group row">
                                   <label for="contactperson" class="col-md-3 col-form-label">Contact Person</label>
                                    <div class="col-md-12">
                                        <input type="text" placeholder="Contact Person" name = "contactPerson"
										class="form-control" id="contactPerson" value="${vendor.contactPerson}">
                                    </div>
                                </div>
							   <span id="vcontactPerson"
                                	style=" color: red;
								    position: relative;
								    top: -20px;
								    left: 2px;"></span>
								    
								    
							     <div class="form-group row">
                                   <label for="address" class="col-md-3 col-form-label">Address</span></label>
                                    <div class="col-md-12">
                                        <input type="text" placeholder="Address Line 1" name = "addressLine1"
										 class="form-control" id="addressLine1" value="${vendor.addressLine1}" >
                                    </div>
                                </div>
								<span id="vaddressLine1"
                                	style=" color: red;
								    position: relative;
								    top: -20px;
								    left: 2px;"></span>
								    
								    
								<div class="form-group row">
                                   <label class="col-md-3"></label>
                                    <div class="col-md-12">
                                        <input type="text"placeholder="Address Line 2" name = "addressLine2"
										 class="form-control" id="addressLine2" value = "${vendor.addressLine1}">
                                    </div>
                                </div>
								
								<div class="form-group row">
                                   <label class="col-md-3"></label>
                                    <div class="col-md-12">
                                        <input type="text"placeholder="Address Line 3" name = "addressLine3"
										 class="form-control" id="addressLine3" value="${vendor.addressLine1}">
                                    </div>
                                </div>
								
							     <div class="form-group row">
                                   <label for="city" class="col-md-3 col-form-label">City</label>
                                    <div class="col-md-12">
                                        <input type="text" placeholder="City" name = "city"
										 class="form-control" value="${vendor.city }" id="city">
                                    </div>
                                </div>
								<span id="vcity"
                                	style=" color: red;
								    position: relative;
								    top: -20px;
								    left: 2px;"></span>
								    
								    
								 <div class="form-group row">
                                   <label for="state" class="col-md-3 col-form-label">State</label>
                                    <div class="col-md-12">
                                        <input type="text" placeholder="State" name = "state"
										class="form-control" id="state" value="${vendor.state}" >                                    </div>
                                </div>
							   <span id="vstate"
                                	style=" color: red;
								    position: relative;
								    top: -20px;
								    left: 2px;"></span>
								    
								    
							     <div class="form-group row">
                                   <label for="pincode" class="col-md-3 col-form-label">Pincode</label>
                                    <div class="col-md-12">
                                        <input type="text" placeholder="Pincode" name = "pinCode"
										 class="form-control" id="pincode" value="${vendor.pinCode}">
                                    </div>
                                </div>
								<span id="vpincode"
                                	style=" color: red;
								    position: relative;
								    top: -20px;
								    left: 2px;"></span>
								    
								    
								 <div class="form-group row">
                                   <label for="Pan-no" class="col-md-3 col-form-label">PAN No.</label>
                                    <div class="col-md-12">
                                        <input type="text" placeholder="Pan No." name = "pan"
										 class="form-control" id="panNo" value="${vendor.pan}">
                                    </div>
                                </div>
								<span id="vpanNo"
                                	style=" color: red;
								    position: relative;
								    top: -20px;
								    left: 2px;"></span>
								    
								    
								 <div class="form-group row">
                                   <label for="bank-name" class="col-md-3 col-form-label">Bank Name</label>
                                    <div class="col-md-12">
                                        <input type="text" placeholder="Bank Name" name = "bankAccountName"
										class="form-control" id="bankName" value="${vendor.bankAccountName}">
                                    </div>
                                </div>
								<span id="vbankName"
                                	style=" color: red;
								    position: relative;
								    top: -20px;
								    left: 2px;"></span>
								    
								    
								 <div class="form-group row">
                                   <label for="bank-account-no." class="col-md-3 col-form-label">Bank Account No.</label>
                                    <div class="col-md-12">
                                        <input type="text" placeholder="Bank Account No." name = "bankAccountNumber"
										 class="form-control" id="bankAccountNo" value="${vendor.bankAccountNumber}" >
                                    </div>
                                </div>
									<span id="vbankAccountNo"
                                	style=" color: red;
								    position: relative;
								    top: -20px;
								    left: 2px;"></span>
								    
								    
								 <div class="form-group row">
                                   <label for="ifsc" class="col-md-3 col-form-label">IFSC No.</label>
                                    <div class="col-md-12" >
                                        <input type="text" placeholder="IFSC No." name = "ifsc"
										class="form-control" id="ifsc"  value="${vendor.ifsc}">
                                    </div>
                                </div>
								<span id="vifsc"
                                	style=" color: red;
								    position: relative;
								    top: -20px;
								    left: 2px;"></span>
								    
								    
								<div class="form-group row">
									 <div class="col-md-6"></div>
                                     <div class="col-md-6 text-right" style="margin-bottom: 10px;" >
									
                                     <input type="submit" class="like btn btn-success" value="update" onclick= "return addVendor()">
                                     </div>
                                   </div> 
                                </div>
                             
                              </div>
                            </form>
                        </div>
                    </div>
                </div>
                <!-- /.row -->
            </div>



                <!-- ============================================================== -->
                <!-- chat-listing & recent comments -->
                <!-- ============================================================== -->
            </div>
            <!-- /.container-fluid -->
            </div>
        <!-- ============================================================== -->
        <!-- End Page Content -->
        <!-- ============================================================== -->
    </div>
    <!-- ============================================================== -->
    <!-- End Wrapper -->
    <!-- ============================================================== -->
    <!-- ============================================================== -->
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
    <script>
    
       
  //validation
  
  function addVendor()
  {
	  
	  var flagvendorId = vendorId()
	  var flagvendorName = vendorName()
	  var flagvendorGovtID = vendorGovtID()
	  var flagvendorGstinNo = vendorGstinNo()
	  var flagvendorPhone = vendorPhone()
	  var flagcontactPerson = contactPerson()
	  var flagaddressLine1 = addressLine1()
	  var flagcity = city()
	  var flagstate = state()
	  var flagpincode = pincode()
	  var flagpanNo = panNo()
	  var flagbankName = bankName()
	  var flagbankAccountNo = bankAccountNo()
	  var flagifsc = ifsc()
	  
	  if(flagvendorId && flagvendorName && flagvendorGovtID && flagvendorGstinNo 
			  && flagvendorPhone && flagcontactPerson && flagaddressLine1 
			  && flagcity && flagstate && flagpincode && flagpanNo 
			  && flagbankName && flagbankAccountNo && flagifsc)
	  {
		  return true;
	  }
	  return false;
	  
  }
    
  function vendorId() {
      var vendorId= $("#vendorID").val();
	
      if (vendorId == "") {
          console.log("vendor ID")
          document.getElementById("vvendorId").innerHTML = "Vendor Id Required";
          return false;
      }

      return true;

  }
  function vendorName() {
      var vendorName= $("#vendorName").val();
	
      if (vendorName== "") {
          console.log("vendor Name")
          document.getElementById("vvendorName").innerHTML = "Vendor Name Required";
          return false;
      }

      return true;

  }
  
  function vendorGovtID() {
      var vendorGovtID= $("#vendorGovtID").val();
	
      if (vendorGovtID== "") {
          console.log("vendor Govt. ID")
          document.getElementById("vvendorGovtID").innerHTML = "Vendor Govt. ID Required";
          return false;
      }

      return true;

  }
  
  function vendorGstinNo() {
      var vendorGstinNo= $("#vendorGstinNo").val();
	
      if (vendorGstinNo== "") {
          console.log("vendor GSTIN No.")
          document.getElementById("vvendorGstinNo").innerHTML = "Vendor GSTIN No. Required";
          return false;
      }

      return true;

  }
  
  function vendorPhone() {
      var vendorPhone= $("#vendorPhone").val();
	
      if (vendorPhone== "") {
          console.log("Phone No.")
          document.getElementById("vvendorPhone").innerHTML = "Phone No. Required";
          return false;
      }

      return true;

  }
  function contactPerson() {
      var contactPerson= $("#contactPerson").val();
	
      if (contactPerson== "") {
          console.log("Contact Person")
          document.getElementById("vcontactPerson").innerHTML = "Contact Person Required";
          return false;
      }

      return true;

  }
  function addressLine1() {
      var addressLine1= $("#addressLine1").val();
	
      if (addressLine1== "") {
          console.log("Address")
          document.getElementById("vaddressLine1").innerHTML = "Address Required";
          return false;
      }

      return true;

  }
  function city() {
      var city= $("#city").val();
	
      if (city== "") {
          console.log("City")
          document.getElementById("vcity").innerHTML = "City Required";
          return false;
      }

      return true;

  }
  function state() {
      var state= $("#state").val();
	
      if (state== "") {
          console.log("State")
          document.getElementById("vstate").innerHTML = "State Required";
          return false;
      }

      return true;

  }
  function pincode() {
      var pincode= $("#pincode").val();
	
      if (pincode == "") {
          console.log("Pincode")
          document.getElementById("vpincode").innerHTML = "Pincode Required";
          return false;
      }

      return true;

  }
  function panNo() {
      var panNo= $("#panNo").val();
	
      if (panNo== "") {
          console.log("Pan No.")
          document.getElementById("vpanNo").innerHTML = "Pan No. Required";
          return false;
      }

      return true;

  }
  function bankName() {
      var bankName= $("#bankName").val();
	
      if (bankName== "") {
          console.log("Bank Name")
          document.getElementById("vbankName").innerHTML = "Bank Name Required";
          return false;
      }

      return true;

  }
  function bankAccountNo() {
      var bankAccountNo= $("#bankAccountNo").val();
	
      if (bankAccountNo== "") {
          console.log("Bank Account No.")
          document.getElementById("vbankAccountNo").innerHTML = "Bank Account No. Required";
          return false;
      }

      return true;

  }
  function ifsc() {
      var ifsc= $("#ifsc").val();
	
      if (ifsc== "") {
          console.log("IFSC No.")
          document.getElementById("vifsc").innerHTML = "IFSC No. Required";
          return false;
      }

      return true;

  }
  
    </script>
</body>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>