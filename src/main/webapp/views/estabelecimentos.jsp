<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="ss" uri="/struts-bootstrap-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags"%>
<tag:template title="Sistema de cadastro">

	<jsp:attribute name="head">
	  <script type="text/javascript"  src="${pageContext.request.contextPath}/views/estabelecimento.js"></script>
	  <STYLE type="text/css">  
		.errorMessage{color:red;}  
		</STYLE>        
  </jsp:attribute>


	<jsp:attribute name="corpo_id">   
<div class="container-fluid">
 <div class="panel panel-default">
  <div class="panel-body">
  <s:form theme="bootstrap" cssClass="well form-search" action="save"
						method="post"  validate="true">
						    			
						
   <div class="row">
   <fieldset>
                                    <legend>Estabelecimento</legend>
   <div class="col-md-3">
    <div class="form-group">
     <s:textfield class="form-control"  label="Código" name="estabelecimento.codigo"></s:textfield>
    </div>
    </div>
   <div class="col-md-3">
     <div class="form-group">
     <s:textfield class="form-control" label="Descrição" name="estabelecimento.descricao" maxLength="10"></s:textfield>
   </div>
   </div>
     <div class="col-md-3">
     	<div class="form-group">
      <s:select class="form-control" name="estabelecimento.situacao" list="{'Selecione','Ativo','Inativo'}" headerKey="" label="Situação" />
		</div>
   	 </div>
   	 <div class="col-md-3">   	 
   	 </div> 
   	 </fieldset>
 	</div>
 	<br>
 	<br>
 	  <fieldset>
 	   <legend>Endereço</legend>
 	<div class="row"> 	 
 	    <div class="col-md-3">
     	<div class="form-group">
      <s:textfield class="form-control" name="estabelecimento.numero" maxLength="5" label="Número" />
		</div>
   	 </div>
   	  <div class="col-md-3">
     	<div class="form-group">
      <s:textfield class="form-control" name="estabelecimento.logradouro" maxLength="20" label="Logradouro" />
		</div>
   	 </div>
   	  <div class="col-md-3">
     	<div class="form-group">
      <s:textfield class="form-control" name="estabelecimento.bairro" maxLength="20" label="Bairro" />
		</div>
   	 </div>
   	  <div class="col-md-3">
     	<div class="form-group">
      <s:textfield class="form-control" name="estabelecimento.cep" onkeypress="mascara(this, '#####-####');"  label="CEP" maxLength="10"/>
		</div>
   	 </div>
 	</div>
 	
 	<div class="row">
 	<div class="col-md-3">
     	<div class="form-group">
      <s:select class="form-control" name="estabelecimento.estado" list="{'Selecione','Acre','Alagoa','Amapá','Amazonas',
      'Bahia','Ceará','Distrito Federal','Espírito Santo','Goiás','Maranhão','Mato Grosso','Mato Grosso do Sul','Minas Gerais',
      'Pará','Paraíba','Pernambuco','Piauí','Rio de Janeiro','Rio Grande do Norte','Rio Grande do Sul',
      'Rondônia','Roraima','Santa Catarina','São Paulo','Sergipe','Tocantins'}" headerKey=""  label="Estado" />
		</div>
		</div>
		  <div class="col-md-3">
     	<div class="form-group">
      <s:textfield class="form-control" name="estabelecimento.cidade"  label="Cidade" />
		</div>
   	 </div>
 	</div>
 	 	</fieldset>
 	
    <s:hidden name="editMode"></s:hidden>
    <div class="row">
    <div class="col-md-2 pull-left">
    <s:submit  class="btn btn-primary form-control" id="btn_salvar"  value="incluir"></s:submit>    
    </div>
     <div class="col-md-2 pull-left">
    <s:reset  class="btn btn-primary form-control" value="Limpar" />
    </div>
      <div class="col-md-2 pull-left">
      </div>
    
    </div>
  </s:form>
  </div>
  
   <div class="panel-body">
    <div class="row">
    <div class="col-md-12">
    <div  class="table-responsive">
    <table id="dataTable"  class="table table-striped"> 
    <thead>  
     <tr>  
	   <th>Descrição</th>
	   <th>Situação</th>
	   <th>Numero</th>
	   <th>logradouro</th>
	   <th>Bairro</th>
	   <th>CEP</th>
	   <th>Estado</th>
	   <th>Cidade</th>
	   <th>Ação</th>		   
     </tr>
     </thead>
     
     <tbody>          
     <s:iterator value="estabelecimentos">
        <tr>          
          <td><s:property value="descricao" /></td>
          <td><s:property value="situacao" /></td>
          <td><s:property value="numero" /></td>
          <td><s:property value="logradouro" /></td>
          <td><s:property value="bairro" /></td>
          <td><s:property value="cep" /></td>
          <td><s:property value="estado" /></td>
          <td><s:property value="cidade" /></td>          
          <s:url action="delete" var="url1">
            <s:param name="ref">
              <s:property value="codigo" />
            </s:param>
          </s:url>
          <s:url action="edit" var="url2">
            <s:param name="ref">
              <s:property value="codigo" />
            </s:param>
          </s:url>
          <td><s:a href="%{url1}"
				onclick="return confirm('Tem certeza que deseja exlcuir?')"> <img
				alt="Delete" style="width: 20px; height: 20px;"
				src="${pageContext.request.contextPath}/views/resources/image/Delete.png">
				</s:a>
           <s:a href="%{url2}">
				<img alt="Edit" style="width: 20px; height: 20px;"
				src="${pageContext.request.contextPath}/views/resources/image/Edit.png">
				</s:a></td>
        </tr>
     </s:iterator> 
          </tbody>  
     </table>
     </div>
     </div>       
  </div>
  </div>
  </div>
  </div>
	</jsp:attribute>
</tag:template>