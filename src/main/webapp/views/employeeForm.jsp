<!DOCTYPE html>
<html lang="en">

<head>
<title>Employee Form</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/employeeForm.css" />
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="/js/validation.js"></script>

<script>
	var csvFileData = [];

	function download_csv_file() {

		var e = document.getElementById("empName").value;
		var empID = document.getElementById("empID").value;
		var ag = document.getElementById("ageVal").value;
		var place = document.getElementById("pName").value;

		var csv = 'Name,EmpID,Age,PlaceName\n';
		csvFileData.push(e);
		csvFileData.push(empID);
		csvFileData.push(ag);
		csvFileData.push(place);

		csvFileData.forEach(function(row) {
			csv += row;
			csv += ",";
		});

		var hiddenElement = document.createElement('a');
		hiddenElement.href = 'data:text/csv;charset=utf-8,' + encodeURI(csv);
		hiddenElement.target = '_blank';
		hiddenElement.download = 'Employee Report.csv';
		hiddenElement.click();
	}
</script>

</head>

<body>
	<br>
	<div class="main">
		<div class="main_inside">
			<h1 class="custo-heading">
				<b>Employee Registration Form</b>
			</h1>
			<br>
			<form name="myform" method="post" action="../addEmployeeDetails"
				onsubmit="return validateform()">
				<b><label class="" for="Ename">Employee Name : &nbsp; </label></b> <b><input
					id="empName" type="text" class="" name="employeeName" /> <br>
				<br></b> <b><label class="" for="EId"> Employee ID :
						&nbsp; </label></b> <b><input id="empID" type="text" class=""
					name="employeeID" /> <br>
				<br></b> <b><label class="" for="age"> Age : &nbsp; </label></b> <b><input
					id="ageVal" type="number" class="" name="age" /> <br>
				<br></b> <b><label class="" for="Pname"> Place Name :
						&nbsp; </label></b> <b><input id="pName" type="text" class=""
					name="placeName" /> <br>
				<br></b>
				<div style="text-align: center">
					<input type="submit" value="Submit"> <input type="button"
						onclick="download_csv_file()" value="Download CSV">
				</div>
			</form>
		</div>
	</div>
</body>
</html>