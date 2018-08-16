<?php
	require 'conexion.php';
	
	$PRODUCTOID = $_GET['PRODUCTOID'];

	$sql = "SELECT * FROM producto WHERE PRODUCTOID = '$PRODUCTOID'";
	$resultado = $mysqli->query($sql);
	$row = $resultado->fetch_array(MYSQLI_ASSOC);
	
?>
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
				<h3 style="text-align:center">MODIFICAR REGISTRO</h3>
			</div>

				<form class="form-horizontal" method="POST" action="update.php" autocomplete="off">
				<div class="form-group">
					<label for="CLAVE" class="col-sm-2 control-label">CLAVE</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="CLAVE" name="CLAVE" placeholder="CLAVE" value="<?php echo $row['CLAVE']; ?>" required>
					</div>
				</div>

				<input type="hidden" id="PRODUCTOID" name="PRODUCTOID" value="<?php echo $row['PRODUCTOID']; ?>" />
				
				<div class="form-group">
					<label for="NOMBREP" class="col-sm-2 control-label">NOMBREP</label>
					<div class="col-sm-10">
						<input type="NOMBREP" class="form-control" id="NOMBREP" name="NOMBREP" placeholder="NOMBREP" value="<?php echo $row['NOMBREP']; ?>"  required>
					</div>
				</div>
				
				<div class="form-group">
					<label for="CONTENIDO" class="col-sm-2 control-label">CONTENIDO</label>
					<div class="col-sm-10">
						<input type="CONTENIDO" class="form-control" id="CONTENIDO" name="CONTENIDO" placeholder="CONTENIDO" value="<?php echo $row['CONTENIDO']; ?>"  required>
					</div>
				</div>

				<div class="form-group">
					<label for="UNIDADES" class="col-sm-2 control-label">UNIDADES</label>
					<div class="col-sm-10">
						<input type="UNIDADES" class="form-control" id="UNIDADES" name="UNIDADES" placeholder="UNIDADES" value="<?php echo $row['UNIDADES']; ?>"  required>
					</div>
				</div>


				<div class="form-group">
					<label for="PRECIOVENTA" class="col-sm-2 control-label">PRECIOVENTA</label>
					<div class="col-sm-10">
						<input type="PRECIOVENTA" class="form-control" id="PRECIOVENTA" name="PRECIOVENTA" placeholder="PRECIOVENTA" value="<?php echo $row['PRECIOVENTA']; ?>"  required>
					</div>
				</div>

				<div class="form-group">
					<label for="STOKACTUAL" class="col-sm-2 control-label">STOKACTUAL</label>
					<div class="col-sm-10">
						<input type="STOKACTUAL" class="form-control" id="STOKACTUAL" name="STOKACTUAL" placeholder="STOKACTUAL" value="<?php echo $row['STOKACTUAL']; ?>"  required>
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