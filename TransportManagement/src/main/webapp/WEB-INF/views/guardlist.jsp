<%@ include file="startAdmin.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
	<a href="addDriver"
		class="btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light">Add
		more </a>
	
</div>

<div class="row">
	<div class="col-sm-12">
		<div class="white-box">

			<div class="table-responsive">
				<table class="table">
					<thead>
						<tr>
							<th>Driver Id</th>
							<th>Name</th>
							<th>License Number</th>
							<th>Phone Number</th>
							<th>AddressLine1</th>
							<th>AddressLine2</th>
							<th>AddressLine3</th>
							<th>City</th>
							<th>State</th>
							<th>PinCode</th>
							</tr>
					</thead>
					<tbody>
						<c:forEach var="guard" items="${guard}" varStatus="status">
							<tr>
								<td>${driver.driverId}</td>
								<td>${driver.name}</td>
								<td>${driver.driverLicenseNumber}</td>
								<td>${driver.phoneNumber}</td>
								<td>${driver.addressLine1}</td>
								<td>${driver.addressLine2}</td>
								<td>${driver.addressLine3}</td>
								<td>${driver.city}</td>
								<td>${driver.state}</td>
								<td>${driver.pinCode}</td>
							</tr>

						</c:forEach>


					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>
<!-- /.row -->
<!-- /.container-fluid -->
<!-- /#page-wrapper -->
<!-- /#wrapper -->
<!-- jQuery -->
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
<!-- Custom Theme JavaScript -->
<script src="js/custom.min.js"></script>
<script>
    function delre(id)
    {
     var info = 'id=' + id;
        if(confirm("Are you sure you want to delete this Record?"))
        {
            var html = $.ajax({
            type: "GET",
            url: "/deleteVendor?"+info,
              
            success: function(data)
            {
               alert("Record deleted")
            }
            
                               })

        }
        location.reload();
    }
    
    function editre(id)
    {
                console.log(id);
                 var info = 'id=' + id;
                $.ajax({
            type : "POST",
            url : "/vendor?"+info,

          //  success : function(data) {
            //       console.log(JSON.stringify(data));

              //     console.log(data.number);
                //   console.log(data.name);
                  // console.log(data.id);
                  // $("#employeeId").val(data.id);
                  // $("#employeeName").val(data.name);
                  // $("#employeeContact").val(data.number);

                //   $("#employeeId").prop("disabled", true);
                  // $("#employeeName").prop("disabled", true);
                   //$("#employeeContact").prop("disabled", true);
           // }
     });

    }
    </script>

</body>

</html>
