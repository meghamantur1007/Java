<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket Booking</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<form action="book" method="post">
		<pre>
<h1 style="color: green">Ticket Booked</h1>
<label for="stadiumName" class="form-label">Stadium Name</label><select
				name="stadiumName" class="form-control" id="stadiumName">
<option>Select Stadium Name</option>
<option value="Chinnaswamy Stadium" ${dto.stadiumName=='Chinnaswamy Stadium'? 'selected' : ''}>Chinnaswamy Stadium</option>
<option value="Rajiv Gandhi International Cricket Stadium" ${dto.stadiumName=='Rajiv Gandhi International Cricket Stadium' ? 'selected' : ''}>Rajiv Gandhi International Cricket Stadium</option>
<option value="Narendra Modi Stadium" ${dto.stadiumName=='Narendra Modi Stadium' ? 'selected' : ''}>Narendra Modi Stadium</option>
</select>
<label for="tickets" class="form-label">Tickets</label><input
				type="text" name="tickets" class="form-control" id="tickets"
				value=${dto.tickets}>
<label for="pContact" class="form-label">Primary Contact</label><input
				type="text" name="primaryContact" class="form-control" id="pContact"
				value=${dto.primaryContact}>
<label for="email" class="form-label">Email</label><input type="text"
				name="email" class="form-control" id="email" value=${dto.email}>
<button type="submit" class="btn btn-primary">Book</button>
</pre>
	</form>

	<span style="color: green">${success}</span>
	<span style="color: red">${failure}</span>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>