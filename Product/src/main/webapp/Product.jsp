<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<form action="product" method="post">
		<pre>
<label for="companyName" class="form-label">CompanyName</label><input type="text" name="companyName" class="form-control" id="companyName" value=${dto.companyName}>
<label for="productName" class="form-label">ProductName</label><input type="text" name="productName"  class="form-control" id="productName"value=${dto.productName}>
<label for="productType" class="form-label">ProductType</label><select name="productType"  class="form-control" id="productType">
<option>Select ProductType </option>
<option>Electronics</option>
<option>Clothing</option>
<option>Grocery</option>
<option>Furniture</option>
<option>Beauty</option>
</select>
<label for="productQuantity" class="form-label">ProductQuantity</label><input type="text" name="productQuantity" class="form-control" id="ProductQuantity"
				value=${productQuantityConverted}>
<label for="productCost" class="form-label">ProductCost</label><input type="text" name="productCost" class="form-control" id="productCost"
				vlue=${productCostConverted}>

<input type="submit" value="Product">
		
		</pre>
	</form>

	<span style="color: green">${success} </span>
	<span style="color: red">${failure}</span>
			${dto1} <script
				src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
				integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
				crossorigin="anonymous"></script>
</body>
</html>