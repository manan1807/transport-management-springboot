<%@ include file="startAdmin.jsp"%>
<div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
	<a href="addvendor"
		class="btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light"
		style="    position: relative;
    left: 258px;
   
    top: -12px;
}"
		>Add
		more </a>
	
</div>

<div class="row">
	<div class="col-sm-12">
		<div class="white-box">

			<div class="table-responsive">
				<table class="table">
					<thead>
						<tr>
							<th>Vendor ID</th>
							<th>Vendor Name</th>
							<th>Contact Person</th>
							<th>Phone No.</th>
							<th>Total cabs</th>
							<th>Action</th>
							</tr>
					</thead>
					<tbody>
						<c:forEach var="vendor" items="${vendors}" varStatus="status">
							<tr>
								<td>${vendor.vendorId }</td>
								<td>${vendor.vendorName }</td>
								<td>${vendor.contactPerson }</td>
								<td>${vendor.phone}</td>

								<td><c:out value="${count[status.index]}" /></td>

								<td>
									<form action="deleteVendor" method="post">
										<input type="hidden" value="${vendor.vendorId}" name="id" />
										<input type="submit" value="delete"
											class=" like btn btn-danger" />
									</form>
								</td>
								<td>
									<form action="particularDetail" method="post">
										<input type="hidden" value="${vendor.vendorId}" name="id" />
										<input type="submit" value="edit"
											class=" like btn btn-warning" />
									</form>
								</td>


							</tr>

						</c:forEach>


					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>
<!-- /.row -->
</div>
<!-- /.container-fluid -->
</div>
<!-- /#page-wrapper -->
</div>
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
