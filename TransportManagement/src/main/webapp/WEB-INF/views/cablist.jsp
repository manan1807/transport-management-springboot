<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="startAdmin.jsp"%>

<!-- /row -->
<div class="row">
	<div class="col-sm-12">
		<div class="white-box">

			<h3 class="box-title">Cab List</h3>

			<div class="table-responsive">
				<table class="table">
					<thead>
						<tr>
							<th>Route No.</th>
							<th>Capacity</th>
							<th>Cab No.</th>
							<th>Employee boarded</th>
							<th>Driver Name</th>
							<th>Vendor Name</th>
							
							<th>Action</th>
						</tr>
					</thead>
					<tbody>
						<!--  	<c:forEach var="cablist" items="${cablist}"> -->
						<tr>
							<c:forEach var="temp" items="${cablist}" varStatus="status">
								<td>${temp}</td>
							</c:forEach>
							<td>
								<form action="/addstarttime" method="post">
									<input type="submit" value="Start" name="start" /> <input
										type="submit" value="End" name="end" />
								</form>

							</td>

							<td>
								<form action="/listOfRouteDetails" method="post">
									<input type="submit" value="View roster" name="view" />

								</form>
							</td>



							
						</tr>
						
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>
<!-- /.row -->
<!-- /.container-fluid -->

</body>

</html>