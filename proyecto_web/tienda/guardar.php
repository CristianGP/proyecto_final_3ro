<?php
	
	require 'conexion.php';
	
	$CLAVE = $_POST['CLAVE'];
	$NOMBREP = $_POST['NOMBREP'];
	$CONTENIDO = $_POST['CONTENIDO'];
	$UNIDADES = $_POST['UNIDADES'];
	$PRECIOVENTA = $_POST['PRECIOVENTA'];
	$STOKACTUAL = $_POST['STOKACTUAL'];
	

	
	$sql = "INSERT INTO producto (CLAVE, NOMBREP, CONTENIDO, UNIDADES, PRECIOVENTA, STOKACTUAL) VALUES ('$CLAVE', '$NOMBREP', '$CONTENIDO', '$UNIDADES', '$PRECIOVENTA', '$STOKACTUAL')";
	$resultado = $mysqli->query($sql);
	
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
				<div class="row" style="text-align:center">
					<?php if($resultado) { ?>
						<h3>REGISTRO GUARDADO</h3>
						<?php } else { ?>
						<h3>ERROR AL GUARDAR</h3>
					<?php } ?>
					
					<a href="index.php" class="btn btn-primary">Regresar</a>
					
				</div>
			</div>
		</div>
	</body>
</html>
