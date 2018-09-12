<!DOCTYPE html>
<html>
    <head>
        <title>Insertar registros - PHP con MySQL</title>
    </head>
    <body>
        <?php 
        $bd_host="127.0.0.1";
        $bd_user="root";
        $bd_pass="";
        $bd_name="soporte";
        #variabes provenientes del formulario
        $codigo=htmlspecialchars($_POST["codigo"]);
        $tec=htmlspecialchars($_POST["tec"]);
        $fecha=htmlspecialchars($_POST["fecha"]);
        $trabajo=htmlspecialchars($_POST["trabajo"]);
        $costo=htmlspecialchars($_POST["costo"]);
        #mysqli_connect - Abre una nueva conexion al servidor de MySQL
        $conectar=mysqli_connect($bd_host, $bd_user, $bd_pass, $bd_name, 3307);
        #mysqli_connect_errno-Devuelve el codigo de error de la ultima llamada
        if(mysqli_connect_errno())
        {
            #mysqli_connect_error-Devuelve una cadena con la descripcion de la ultimo error de conexion
            printf("ERROR:%u - %s", mysqli_connect_errno(), mysqli_connect_error());
            exit(); 
        }
        #mysqli_set_charset-Establece el conjunto de caracteres predeterminado del cliente
        mysqli_set_charset($conectar, "utf8");
        $insertar="INSERT INTO productos (codigo,tec,fecha,trabajo,costo ) VALUES('$codigo', '$tec', '$fecha', '$trabajo','$costo')";
        #mysqli_query-Realiza una consulta a la base d datos 
        if($resultado=mysqli_query($conectar, $insertar))
        {
            printf("Registro almacenado en la BD");
        }
        else
        {
            printf("ERROR - Al almacenar en la BD");   
        }
        #mysqli-close-Cierra una conexion previamente abierta a una base de datos
        mysqli_close($conectar);
        ?>
    </body>
</html>