$(document).ready(function () {

    $('#dataTable').dataTable();
    
    $('#btn_salvar').click(function () {
        salvar();    
    });
});

function mascara(t, mask) {
    var i = t.value.length;
    var saida = mask.substring(1, 0);
    var texto = mask.substring(i);
    if (texto.substring(0, 1) != saida)
    {
        t.value += texto.substring(0, 1);
    }

}
          

function salvar(){
	
     var codigo = $('#codigo').val();
     var salvar = true;
     
     

 	if (codigo == '' || codigo == undefined) {
 		
 		$('#codigo').css({"border-color" : "red"});
 		
 		 salvar = false;
 	}
if(salvar == true){
		
		$('#formCadastrar').submit();
		
	}else{
		
		$('#mensagemObrigatorio').show();
	}
}