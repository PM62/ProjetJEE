
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Supprimer un patient</title>
<style>
      body {
        background-color: #F0F8FF;
      }
       header {
        background-color: #008080;
      }
    </style>
</head>
<body>
<header style="height:50px">
 <FONT size="6pt" style="color:#FFFAFA"> Service web pour hôpitaux  </FONT>


<input type="button"  style="width:130px ;float: right;height:50px"  value="Deconnexion" onclick="window.location.href='http://localhost:8080/ServiceWebHopitaux/';" />
    
</header>
<form method="post" action="supprimerpatient">
<Div Align=Center>
	<p>
			Entrez les informations du patient :
		</p>
        <p>
            <label for="idpatient">Numero du patient : </label>
            <input type="text" name="idpatient" id="idpatient" />
        </p>       
        
        <input type="submit" value="Supprimer le patient" />
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
</body>
</html>