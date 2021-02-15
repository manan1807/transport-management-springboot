<%@ include file="startAdmin.jsp"  %> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
				<!-- /row -->
				<div class="row">
					<div class="col-sm-12">
						<div class="white-box">

							<form action="/addDriverToDatabase" method="post"
								enctype="multipart/form-data">
								<fieldset>
									<legend>Add Vehicle Details</legend>
									<label for="file">Choose file to upload</label><br> <input
										type="file" id="file" name="uploadedFileName" accept=".csv"><br>
									<br> <label>Select Vendor</label> <select id="myList"
										name="vendor">
										<option value="none" selected disabled hidden>Please Select Vendor
							</option>
										<c:forEach var="vendor" items="${vendorObject}">
										<option value="${vendor.vendorName}">${vendor.vendorName}</option>
										</c:forEach>
									</select><br> <br> <input type="submit" class="like btn btn-success"
										value="Upload" id="Uploadbutton"> <input type="reset"
										id="ResetButton" class="like btn btn-danger" value="Reset">
								</fieldset>
							</form>


							<!-- /.row -->
						</div>

					</div>
					<!-- /.row -->
				</div>
				<!-- /.container-fluid -->
				<%@ include file="footer.jsp"  %> 