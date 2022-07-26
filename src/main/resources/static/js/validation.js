function validateform(){ 
 
 //Get All Inpu Values Here.
	var cardNumber=document.myform.cardNumber.value; 
	var accountNumber=document.myform.accountNumber.value; 
	var mobileNumber=document.myform.mobileNumber.value; 
	var merchantAtmName=document.myform.merchantAtmName.value; 
	var transactionAmount=document.myform.transactionAmount.value; 
	var disputeAmount=document.myform.disputeAmount.value; 
	var transactionIntimationDetails=document.myform.transactionIntimationDetails.value;
	var stoleOnDate=document.myform.stoleOnDate.value;
	var reportOnDate=document.myform.reportOnDate.value;
	var noOfTransaction=document.myform.noOfTransaction.value;
	var noOfTimesBilled=document.myform.noOfTimesBilled.value;
	var deliveredDate=document.myform.deliveredDate.value;
	var authorisedAmount=document.myform.authorisedAmount.value;
	var billedAmount=document.myform.billedAmount.value;
	var atmBilledAmount=document.myform.atmBilledAmount.value;
	var atmRecievedAmount=document.myform.atmRecievedAmount.value;
	var atmDisputeAmount=document.myform.atmDisputeAmount.value;
	var otherDetails=document.myform.otherDetails.value;
	var customerName=document.myform.customerName.value;
	var emailId=document.myform.emailId.value;
	var currentDate=document.myform.currentDate.value;
	var transactionDate=document.myform.transactionDate.value;
	var signName=document.myform.signName.value;
	
	
	 //Validation for Customer Name.
	if (customerName=='' || customerName==null){  
	    alert("Please Enter Customer Name");  
	  $("#customerName").css("border-color","hsl(351, 100%, 27%)");
	  return false; 
	  
	}else{
		$("#customerName").css("border-color","black");
	} 
	
	 
	
	//Validation for cardNumber.
	if (cardNumber.length!=16){  
	    alert("Card Number Length must Be 16 Digit.");  
	  $("#cardNumber").css("border-color","hsl(351, 100%, 27%)");
	  return false; 
	  
	}else{
		$("#cardNumber").css("border-color","black");
	} 
	
	//Validation for Account Number.
	if (accountNumber.length!=11){  
	  alert("Account Number must Be 11 Digit.");
	  $("#accountNumber").css("border-color","hsl(351, 100%, 27%)");
	  return false;  
	}else{
		$("#accountNumber").css("border-color","black");
	}

	
	
	//Validation for Merchant AtmName.
	if (transactionDate=="" || transactionDate==null){  
	  alert("Please Enter Transaction Date.");  
	  $("#transactionDate").css("border-color","hsl(351, 100%, 27%)");
	  return false;  
	} else {
		$("#transactionDate").css("border-color","black");
	}
	
	//Validation for Merchant AtmName.
	if (merchantAtmName=="" || merchantAtmName==null){  
	  alert("Please Enter murchant Name.");  
	  $("#merchantAtmName").css("border-color","hsl(351, 100%, 27%)");
	  return false;  
	} else {
		$("#merchantAtmName").css("border-color","black");
	} 
	
	//Validation for Transection Amount.
	if (transactionAmount=="" || transactionAmount==null){  
	  alert("Please Enter Transection Amount.");  
	  $("#transactionAmount").css("border-color","hsl(351, 100%, 27%)");
	  return false;  
	} else {
		$("#transactionAmount").css("border-color","black");
	} 
	
	//Validation for Dispute Amount.
	if (disputeAmount=="" || disputeAmount== null){  
	  alert("Please Enter Dispute Amount.");  
	  $("#disputeAmount").css("border-color","hsl(351, 100%, 27%)");
	  return false;  
	} else {
		$("#disputeAmount").css("border-color","black");
	} 
	
	//Validation for transaction Intimation Details.
	if (transactionIntimationDetails=="" || transactionIntimationDetails==null){  
	  alert("Please Enter Transaction Intemation Details.");  
	  $("#transactionIntimationDetails").css("border-color","hsl(351, 100%, 27%)");
	  return false;  
	} else {
		$("#transactionIntimationDetails").css("border-color","black");
	} 
	
	var flag1 = document.getElementById('flag1');
	var flag2 = document.getElementById('flag2');
	var flag3 = document.getElementById('flag3');
	var flag4 = document.getElementById('flag4');
	var flag5 = document.getElementById('flag5');
	var flag6 = document.getElementById('flag6');
	var flag7 = document.getElementById('flag7');
	var flag8 = document.getElementById('flag8');
	var flag9 = document.getElementById('flag9');
	var flag10 = document.getElementById('flag10');
	var flag11= document.getElementById('flag11');
	var flag12 = document.getElementById('flag12');
	var flag13 = document.getElementById('flag13');
	
	if(flag2.checked){
		if (stoleOnDate=="" || stoleOnDate==null){  
			  alert("Please Enter Stole onDate.");  
			  $("#stoleOnDate").css("border-color","hsl(351, 100%, 27%)");
		  return false;  
		} else {
			$("#stoleOnDate").css("border-color","black");
		}
		if (reportOnDate=="" || reportOnDate==null){  
			  alert("Please Enter Report onDate.");  
			  $("#reportOnDate").css("border-color","hsl(351, 100%, 27%)");
		  return false;  
		} else {
			$("#reportOnDate").css("border-color","black");
		}
	}
	
	if(flag3.checked){
		if (noOfTransaction=="" || noOfTransaction==null){  
			  alert("Please Enter Number Of Transaction.");  
			  $("#noOfTransaction").css("border-color","hsl(351, 100%, 27%)");
		  return false;  
		} else {
			$("#noOfTransaction").css("border-color","black");
		}
		if (noOfTimesBilled=="" || noOfTimesBilled==null){  
			  alert("Please Enter Number Of Times Billed.");  
			  $("#noOfTimesBilled").css("border-color","hsl(351, 100%, 27%)");
		  return false;  
		} else {
			$("#noOfTimesBilled").css("border-color","black");
		}
	}
	
	if(flag7.checked){
		if (deliveredDate=="" || deliveredDate==null){  
			  alert("Please Enter Delivered Date.");  
			  $("#deliveredDate").css("border-color","hsl(351, 100%, 27%)");
		  return false;  
		} else {
			$("#deliveredDate").css("border-color","black");
		}
		
	}
	
	if(flag10.checked){
		if (authorisedAmount=="" || authorisedAmount==null){  
			  alert("Please Enter Authorised Amount.");  
			  $("#authorisedAmount").css("border-color","hsl(351, 100%, 27%)");
		  return false;  
		} else {
			$("#authorisedAmount").css("border-color","black");
		}
		if (billedAmount=="" || billedAmount==null){  
			  alert("Please Enter Billed Amount.");  
			  $("#billedAmount").css("border-color","hsl(351, 100%, 27%)");
		  return false;  
		} else {
			$("#billedAmount").css("border-color","black");
		}
		
	}
	
	if(flag11.checked){
		if (atmBilledAmount=="" || atmBilledAmount==null){  
			  alert("Please Enter ATM Billed Amount.");  
			  $("#atmBilledAmount").css("border-color","hsl(351, 100%, 27%)");
		  return false;  
		} else {
			$("#atmBilledAmount").css("border-color","black");
		}	
	}
	
	if(flag12.checked){
		if (atmRecievedAmount=="" || atmRecievedAmount==null){  
			  alert("Please Enter ATM Recieved Amount.");  
			  $("#atmRecievedAmount").css("border-color","hsl(351, 100%, 27%)");
		  return false;  
		} else {
			$("#atmRecievedAmount").css("border-color","black");
		}	
		
		if (atmDisputeAmount=="" || atmDisputeAmount==null){  
			  alert("Please Enter ATM Dispute Amount.");  
			  $("#atmDisputeAmount").css("border-color","hsl(351, 100%, 27%)");
		  return false;  
		} else {
			$("#atmDisputeAmount").css("border-color","black");
		}	
	}
	
	if(flag13.checked){
		if (otherDetails=="" || otherDetails==null){  
			  alert("Please Enter Other Detail.");  
			  $("#otherDetails").css("border-color","hsl(351, 100%, 27%)");
		  return false;  
		} else {
			$("#otherDetails").css("border-color","black");
		}	
		
			
	}
                    
	//Validation for Email Id.
	if (emailId=='' || emailId==null){  
	    alert("Please Enter Email-ID");  
	  $("#emailId").css("border-color","hsl(351, 100%, 27%)");
	  return false; 
	  
	}else{
		var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			if(!emailId.match(mailformat))
			{
			alert("Please Enter Valid email address!");
			$("#emailId").css("border-color","hsl(351, 100%, 27%)");
			return false;
			} else {
					$("#emailId").css("border-color","black");
			}
		
	} 
	
	//Validation for Mobile Number.
	if (mobileNumber.length!=10){  
	  alert("Mobile Number Length must Be 10 Digit.");  
	  $("#mobileNumber").css("border-color","hsl(351, 100%, 27%)");
	  return false;  
	} else{
		$("#mobileNumber").css("border-color","black");
	} 
	
	//Validation for Sign Name.
	if (signName=='' || signName==null){  
	  alert("Plese Enter Your Signature as Name");  
	  $("#signName").css("border-color","hsl(351, 100%, 27%)");
	  return false;  
	} else{
		$("#signName").css("border-color","black");
	} 
	
	//Validation for Date.
	if (currentDate=='' || currentDate==null){  
	    alert("Please Enter Date");  
	  $("#currentDate").css("border-color","hsl(351, 100%, 27%)");
	  return false; 
	  
	}else{
		$("#currentDate").css("border-color","black");
	}
	
	if(!confirm("Do you really want to submit thisForm?")) {
    return false;
  }

}  