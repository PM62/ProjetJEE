<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Medecin</title>
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


<input type="button"  style="width:130px ;float: right;height:50px"  value="Accueil" onclick="window.location.href='http://localhost:8080/ServiceWebHopitaux/';" />
    
</header>

	<form method="post" action="medecin">
	<Div Align=Center>
        <p>
            Entrez vos identifiants :
        </p>
        <p>
            <label for="idmedecin">Numero de medecin : </label>
            <input type="text" name="idmedecin" id="idmedecin" />
        </p>
        <p>
            <label for="mdp">Mdp : </label>
            <input type="password" name="mdp" id="mdp" />
        </p>
        
        <input type="submit" />
         <c:if test="${ connect.resultatM == false }">
        Identifiants incorrects
            </c:if>
            </div>
    </form>
</body>
 </html>