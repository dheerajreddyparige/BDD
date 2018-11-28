
function chkEmpty(){
	var mob = /^[7-9]{1}[0-9]{9}$/;
	var email=/[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$/;

	if (document.frm1.companyName.value == "") {alert("Please fill the company Name");}
	else if (document.frm1.userName.value == "") {alert("Please fill the  correct user Name");}
	else if (document.frm1.city.value == "") {alert("Please fill the  correct city");}
	else if (document.frm1.password.value == "") {alert("Please fill the  correct password");}
	else if (document.frm1.mynumber.value == "") {alert("Please fill the  correct my number");}
	else if (document.frm1.email.value == "") {alert("Please fill the  correct email");}
	else if (document.frm1.mobile.value == "") {alert("Please fill the  correct mobilenumber");}
	
	//else if (document.frm1.password.value == "") {alert("Please fill the  correct user Name");}
	
	/*else if (document.frmReg.txtEmail.value == ""){alert("Please fill the Email");}
	else if (email.test(document.frmReg.txtEmail.value) == false) { alert("Please enter valid Email Id.");}
	else if (document.frmReg.txtPhone.value == "") {alert("Please fill the Mobile No.");}
	else if (mob.test(document.frmReg.txtPhone.value) == false) { alert("Please enter valid Contact no.");}
	else if (document.frmReg.persons.value == ""){alert("Please fill the Number of people attending");}
	else if (document.frmReg.city.value=="Select City"){alert("Please select city")}
	else if (document.frmReg.state.value=="Select State"){alert("Please select state")}
	else if (document.frmReg.txtCardholderName.value == "") {alert("Please fill the Card holder name");}
	else if (document.frmReg.txtDebit.value == ""){alert("Please fill the Debit card Number");}
	else if (document.frmReg.txtCvv.value == "") {alert("Please fill the CVV");}
	else if (document.frmReg.txtMonth.value == ""){alert("Please fill expiration month");}
	else if (document.frmReg.txtYear.value == ""){alert("Please fill the expiration year");}*/

		else {
	alert(" completed Successfully.");
//	window.location="success.html";
		}
	}
