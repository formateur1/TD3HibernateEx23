<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body>

<form method="post">
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Montant</label> 
			<input type="number" name="montant" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Date</label>
			<input type="text" name="date" class="form-control"id="exampleInputPassword1">
		</div>
		
		<input type="radio" class="btn-check" name="paiement" value="cb" id="option1" autocomplete="off" checked>
		<label class="btn btn-secondary" for="option1">CB</label>
		
		<input type="radio" class="btn-check" name="paiement" value="paypal" id="option2" autocomplete="off">
		<label class="btn btn-secondary" for="option2">Paypal</label>
		
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Numero CB</label> 
			<input type="number" name="num" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
		</div>
		
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Date expiration</label>
			<input type="text" name="dateE" class="form-control"id="exampleInputPassword1">
		</div>
		
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Numero Paypal</label> 
			<input type="number" name="numP" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
		</div>
		
		
		<button type="submit" class="btn btn-primary">Submit</button>
		<button type="reset" class="btn btn-danger">Annuler</button>
	</form>

</body>
</html>