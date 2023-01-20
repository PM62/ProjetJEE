
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modifier un patient</title>
<style>
      body {
        background-color: #F0F8FF;
      }
       header {
        background-color: #008080;
      }
    </style>
</head>
<header style="height:50px">
 <FONT size="6pt" style="color:#FFFAFA"> Service web pour hôpitaux  </FONT>


<input type="button"  style="width:130px ;float: right;height:50px"  value="Deconnexion" onclick="window.location.href='http://localhost:8080/ServiceWebHopitaux/';" />
    
</header>
<body>
<form method="post" action="modifierpatient">
<Div Align=Center>
        <p>
			Entrez les informations du patient :
		</p>
        <p>
            <label for="idpatient">Numero patient : </label>
            <input type="text" name="idpatient" id="idpatient" />
        </p>
        
         <p>
            <label for="informations_médicales">Dossier medical : </label>
            <input type="text" name="informations_médicales" id="informations_médicales" />
        </p>
        
        <input type="submit" value="Enregister les modifications" />
        </Div>
    </form>
    <ul>
    <li><a href="/ServiceWebHopitaux/medecinconnecté">Accueil Medecin</a></li>  
	</ul>
    

    <table>
  
  <caption>Liste de tout les patients :</caption>


<tr> <td>N° Patient</td> <td>Nom</td> <td>Prénom</td> <td>Information medicales</td></tr>
 <c:forEach var="patient" items="${ patients }">
<tr> <td><c:out value="${ patient.idPatient }" /></td> <td><c:out value="${ patient.nom }" /></td> <td><c:out value="${ patient.prenom }" /></td> <td><c:out value="${ patient.medical }" /></td></tr>
 </c:forEach>


</table>
    
    
</html>