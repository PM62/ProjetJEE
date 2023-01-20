
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PatientConnecté</title>
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

 <p>Bienvenue</p>

<c:forEach var="patient" items="${ patients }">
<c:if test="${ sessionScope.idpatient == patients.getIdPatient() }">     
        
        </c:if>
</c:forEach>
</body>
</html>