<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="left"><font color="blue">Hi! <%=session.getAttribute("userid")%>, Welcome To Customer Menu</font></h1>

		<div class="container">
			<!-- <a class="btn icon-btn btn-primary" href="http://localhost:8080/OrderProcessingSystemV5/cust/"><span class="glyphicon btn-glyphicon glyphicon-save img-circle text-muted"></span>Get Customer</a> -->
			<a class="btn icon-btn btn-success" href="http://localhost:8080/DheerajSpringBankProject/cust/eobj"><span class="glyphicon btn-glyphicon glyphicon-remove-circle img-circle text-muted"></span>Add Customer</a><br><br>
			<!-- <a class="btn icon-btn btn-success" href="http://localhost:8080/OrderProcessingSystemV5/customerController?option=u"><span class="glyphicon btn-glyphicon glyphicon-remove-circle img-circle text-muted"></span>Update Customer</a><br> -->
			<!-- <a class="btn icon-btn btn-primary" href="http://localhost:8080/OrderProcessingSystemV5/customerController?option=d"><span class="glyphicon btn-glyphicon glyphicon-thumbs-up img-circle text-primary"></span>Delete Customer</a><br> -->
			<a class="btn icon-btn btn-success" href="http://localhost:8080/DheerajSpringBankProject/cust/lobj"><span class="glyphicon btn-glyphicon glyphicon-plus img-circle text-success"></span>Login</a><br>	
		</div>		
</body>
</html>