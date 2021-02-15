<%@ include file="start.jsp"  %> 
				<div class="container">
					<div class="row">
						<div class="col-sm-12">
							<div class="white-box">

								<div class="table-responsive">
									<table class="table">
										<thead>
											<tr>

												<th>Request ID</th>
												<th>Requester ID</th>
												<th>Traveler Name</th>
												


											</tr>
										</thead>
										<tbody>
                                                <c:forEach items="${pendingRequests}" var="req">
								
                                                     <tr>

                                                          <td>${req.requestId}</td>
                                                          <td>${req.requesterId}</td>
                                                          <td>${req.travelerName}</td>
                                                         
                                                     
                                                    
                                                       
                                                          <td>
                                                              <form action="particularRequest" method="post">
                                                                   <!-- <a href="#" onclick="editre(${vendor.vendorId})" class="btn btn-primary" >
                                                          <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
                                                     </a>
                                                     -->
                                                                   <input type="hidden" value="${req.requesterId}" name="id" />
                                                                   <input type="submit" class="btn btn-primary" value="View" />

                                                              </form>
                                                          </td>


                                                     </tr>
                                                
                                                </c:forEach>


                                           </tbody>
                                           </table>
                                           </div>
                                           </div>
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
							<script
								src="../plugins/bower_components/jquery/dist/jquery.min.js"></script>
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
<%@ include file="footer.jsp"  %> 

