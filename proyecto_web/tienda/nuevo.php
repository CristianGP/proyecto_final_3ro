<html lang="es">
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link href="css/bootstrap-theme.css" rel="stylesheet">
		<script src="js/jquery-3.1.1.min.js"></script>
		<script src="js/bootstrap.min.js"></script>	
	</head>
	
	<body>
		<div class="container">
			<div class="row">
				<h3 style="text-align:center">NUEVO REGISTRO</h3>
			</div>
			<form class="form-horizontal" method="POST" action="guardar.php" autocomplete="off">
				<div class="form-group">
					<label for="CLAVE" class="col-sm-2 control-label">CLAVE</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="CLAVE" name="CLAVE" placeholder="CLAVE"  required>
					</div>
				</div>

				
				
				<div class="form-group">
					<label for="NOMBREP" class="col-sm-2 control-label">NOMBREP</label>
					<div class="col-sm-10">
						<input type="NOMBREP" class="form-control" id="NOMBREP" name="NOMBREP" placeholder="NOMBREP"  required>
					</div>
				</div>
				
				<div class="form-group">
					<label for="CONTENIDO" class="col-sm-2 control-label">CONTENIDO</label>
					<div class="col-sm-10">
						<input type="CONTENIDO" class="form-control" id="CONTENIDO" name="CONTENIDO" placeholder="CONTENIDO"   required>
					</div>
				</div>

				<div class="form-group">
					<label for="UNIDADES" class="col-sm-2 control-label">UNIDADES</label>
					<div class="col-sm-10">
						<input type="UNIDADES" class="form-control" id="UNIDADES" name="UNIDADES" placeholder="UNIDADES"  required>
					</div>
				</div>


				<div class="form-group">
					<label for="PRECIOVENTA" class="col-sm-2 control-label">PRECIOVENTA</label>
					<div class="col-sm-10">
						<input type="PRECIOVENTA" class="form-control" id="PRECIOVENTA" name="PRECIOVENTA" placeholder="PRECIOVENTA"   required>
					</div>
				</div>

				<div class="form-group">
					<label for="STOKACTUAL" class="col-sm-2 control-label">STOKACTUAL</label>
					<div class="col-sm-10">
						<input type="STOKACTUAL" class="form-control" id="STOKACTUAL" name="STOKACTUAL" placeholder="STOKACTUAL"  required>
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<a href="index.php" class="btn btn-default">Regresar</a>
						<button type="submit" class="btn btn-primary">Guardar</button>
					</div>
				</div>
			</form>
		</div>
	</body>
</html>