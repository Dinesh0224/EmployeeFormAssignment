<!DOCTYPE html>
<html lang="en">

<head>
  <title>Employee Form </title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="/css/employeeForm.css" />
  <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
  <script src="/js/validation.js"></script>

</head>

<body>
  <br>
   <div class="main">
    <div class="main_inside">
  <h1 class="custo-heading"><b>Employee Registration Form</b></h1><br>
  <form name="myform" method="post" action="../addEmployeeDetails" onsubmit="return validateform()">
    <b><label class="" for="Ename">Employee Name : &nbsp; </label></b> <b><input id="employeeName"
        type="text" class="" name="employeeName" /> <br><br></b>
    <b><label class="" for="EId"> Employee ID : &nbsp; </label></b> <b><input
        id="employeeID" type="text" class="" name="employeeID" /> <br><br></b>
    <b><label class="" for="age"> Age : &nbsp; </label></b> <b><input id="age"
        type="number" class="" name="age" /> <br><br></b>
    <b><label class="" for="Pname"> Place Name : &nbsp; </label></b> <b><input id="placeName"
        type="text" class="" name="placeName" /> <br><br></b>
        <div style="text-align:center"> 
      <input type="submit" value="Submit"> <br><br>
      </div>
  </form>
  </div>
  </div>
</body>

</html>