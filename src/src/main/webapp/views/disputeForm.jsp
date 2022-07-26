<!DOCTYPE html>
<html lang="en">

<head>
  <title>Employee Form </title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="/css/disputeForm.css" />
  <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
  <script src="/js/validation.js"></script>

</head>

<body>
  <div class="backgroud">
    <img src="" class="background-img" />
  </div>
  <br>
  <h1><b>Employee Registration FORM</b></h1><br>
  <form name="myform" method="post" action="../addDisputeDetails" onsubmit="return validateform()">
    <b><label class="label-line1" for="fname">Employee Name : &nbsp;&nbsp; </label></b> <b><input id="customerName"
        type="text" class="text-line" name="customerName" /> <br><br></b>
    <b><label class="label-line1" for="Cname"> Employee ID : &nbsp;&nbsp; </label></b> <b><input
        id="cardNumber" type="number" class="text-line1" name="cardNumber" /> <br><br></b>
    <b><label class="label-line1" for="Acname"> Bank Name : &nbsp;&nbsp; </label></b> <b><input id="accountNumber"
        type="text" class="text-line2" name="accountNumber" /> <br><br></b>
        <div class="container">
      <input type="submit" value="Submit" class="submit-button" > <br><br>
  </div>
  </form>
</body>

</html>