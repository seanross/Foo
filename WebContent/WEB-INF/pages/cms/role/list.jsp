 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <div class="row">
    <div class="col-lg-6">
        <h2>Bordered Table</h2>
        <div class="table-responsive">
            <table class="table table-bordered table-hover">
                <thead>
                    <tr>
                        <th>Description</th>
                    </tr>
                </thead>
                <tbody>
                    <c:if test="${not empty roles}">
                    	<c:forEach var="role" items="${roles}">
                    		<tr>
								<td>${role.description}</td>
							</tr>
						</c:forEach>	
                    </c:if>
                </tbody>
            </table>
        </div>
    </div>
 </div>
                    