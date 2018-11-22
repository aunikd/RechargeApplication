
<!DOCTYPE html>
<!-- saved from url=(0063)file:///C:/Users/vshadmin/Desktop/UI.html?Phone+Number=&AMOUNT= -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MOBILE RECHARGE APPLICATION</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="style1.css">
</head>
<body>
<center>
<div class="header">
  <h1>MOBILE RECHARGE APPLICATION</h1>
</div>

<form action="confrim">
<div class="wrapper">
  <div class="form-wrapper">
   <input type="tel" class="form-control" name="phoneNo" pattern="[789][0-9]{9}" minlength="10" maxlength="10" placeholder="Enter your mobile number"><br>
  </div>
  <div class="form-wrapper">
    <input type="number" class="form-control" name="amount" min="10" max="1000" placeholder="Enter your recharge amount">
  </div><br>
  <div class="form-wrapper">
  <select name="operator" class="form-control" placeholder="Choose your operator">
	  <option value="airtel">airtel</option>
	  <option value="vodafone">vodafone</option>
	  <option value="bsnl">bsnl</option>
	  <option value="idea">idea</option>
	  <option value="jio">jio</option>
  </select>
  </div>
  <br>
    <input type="submit" "class="btn btn-primary" value="Submit">
  </div>
</form>
</center>
<a href="find">Transaction List</a>
</body></html>