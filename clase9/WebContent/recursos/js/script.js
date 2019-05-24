$(document).ready(function(){
	//alert("hola");
	listar();
});

$("#boton").click(function(){
	var nom= $("#nombre").val();
	var apel= $("#apellido").val();
	var dni= $("#dni").val();
	var id = $("#id").val();
	$.post( "hc", {nom:nom,id:id,apel:apel,dni:dni, opc:1}).done(function(data){
		        $("#id").val(0);
				bootbox.alert(data);
				limpiar();
				listar();
		} );
});

function listar(){
	var i, c =1;
	$.get("hc",{opc:"2"},function(data){
		var d = JSON.parse(data);
		$('#tablita tbody').empty();
		for(i=0;i<d.length;i++){
			$("#tablita tbody").append("<tr><td style='color:blue'>"+c+"</td><td>"+d[i].nombres+"</td><td>"+d[i].apellidos+"</td><td>"+d[i].dni+
			"</td><td><a href='#' style='color:green' onclick='modificar("+d[i].idalumno+")'><i class='far fa-edit'></i></a></td><td><a href='#' style='color:red' onclick='eliminar("+d[i].idalumno+")'><i class='far fa-trash-alt'></i></a></td></tr>")
			c++;
		}
	});
}
function eliminar(id){	
	bootbox.confirm("Desea Eliminar?", function(result) {
    if(result){
    	bootbox.alert("Registro Eliminado Correctamente...!", function() {
    		$.get("hc",{id:id,opc:3},function(data){
				listar();
		});
    	});
		 
    }else{
    	bootbox.alert("El registro no se Elimino...!")
    }}); 
}
function modificar(id){
	$.post("hc",{id:id,opc:4},function(data){
		var x = JSON.parse(data);
		var nom= $("#nombre").val(x.nombres);
		var apel= $("#apellido").val(x.apellidos);
		var dni= $("#dni").val(x.dni);
		var id = $("#id").val(x.idalumno);		
	});
}
function limpiar(){
	$("#nombre").val("");
	$("#apellido").val("");
	$("#dni").val("");
	$("#nombre").focus();
}