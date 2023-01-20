<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient</title>
<style>
      body {
        background-color: #F0F8FF;
      }
    
    </style>
</head>


<body>
 <header style="height:50px">
 <FONT size="6pt" style="color:#FFFAFA"> Service web pour hôpitaux  </FONT>


<input type="button"  style="width:130px ;float: right;height:50px"  value="Accueil" onclick="window.location.href='http://localhost:8080/ServiceWebHopitaux/';" />
    
</header>
        
<form method="post" action="patient">
<Div Align=Center>
        <p>
            Entrez vos identifiants :
        </p>
        <p>
            <label for="idpatient">Numero de patient : </label>
            <input type="text" name="idpatient" id="idpatient" />
        </p>
        <p>
            <label for="mdp">Mdp : </label>
            <input type="password" name="mdp" id="mdp" />
        </p>
        
        <input type="submit" />
        <c:if test="${ connect.resultatP == false }">     
        <c:out value="${ patient.idPatient }" /> 
        <c:out value="${ patient.nom }" />
        <c:out value="${ patient.prenom }" />
        <c:out value="${ patient.medical }" />
        </c:if>
        </Div>
    </form>
</body>
 <input type="button" value="Medecin" onclick="window.location.href='http://localhost:8080/ServiceWebHopitaux/';" />
</html>