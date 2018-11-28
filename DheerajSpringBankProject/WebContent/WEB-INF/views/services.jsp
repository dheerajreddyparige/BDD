<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><font color="green">${message}</font></h1>
<h1 align="left"><font color="blue">Hi! <%=session.getAttribute("userid")%>, Welcome To The Services</font></h1>

		<div class="container">
			<!-- <a class="btn icon-btn btn-primary" href="http://localhost:8080/OrderProcessingSystemV5/cust/"><span class="glyphicon btn-glyphicon glyphicon-save img-circle text-muted"></span>Get Customer</a> -->
			<a class="btn icon-btn btn-success" href="http://localhost:8080/DheerajSpringBankProject/cust/showbalance"><span class="glyphicon btn-glyphicon glyphicon-remove-circle img-circle text-muted"></span>Showbalance</a>
			<!-- <a class="btn icon-btn btn-success" href="http://localhost:8080/OrderProcessingSystemV5/customerController?option=u"><span class="glyphicon btn-glyphicon glyphicon-remove-circle img-circle text-muted"></span>Update Customer</a><br> -->
			<!-- <a class="btn icon-btn btn-primary" href="http://localhost:8080/OrderProcessingSystemV5/customerController?option=d"><span class="glyphicon btn-glyphicon glyphicon-thumbs-up img-circle text-primary"></span>Delete Customer</a><br> -->
			<a class="btn icon-btn btn-success" href="/WEB-INF/views/withdraw.jsp"><span class="glyphicon btn-glyphicon glyphicon-plus img-circle text-success"></span>Withdraw</a><br>	
			<a class="btn icon-btn btn-success" href="/WEB-INF/views/deposit.jsp"><span class="glyphicon btn-glyphicon glyphicon-plus img-circle text-success"></span>Deposit</a><br>	
			<a class="btn icon-btn btn-success" href="/WEB-INF/views/fundtranfer.jsp"><span class="glyphicon btn-glyphicon glyphicon-plus img-circle text-success"></span>FundTransfer</a><br>	
		
		
		</div>		
</body>
</html>
