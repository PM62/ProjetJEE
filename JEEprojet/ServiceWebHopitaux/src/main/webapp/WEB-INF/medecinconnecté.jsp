
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MedecinConnect�</title>
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
 <FONT size="6pt" style="color:#FFFAFA"> Service web pour h�pitaux  </FONT>


<input type="button"  style="width:130px ;float: right;height:50px"  value="Deconnexion" onclick="window.location.href='http://localhost:8080/ServiceWebHopitaux/';" />
    
</header>
<body>

<form method="post" action="MedecinConnect�">
<Div Align=Center>
         <p>
            <c:out value="Que souhaitez-vous faire ? :" />
        </p>
        <input type="button" value="Ajouter un patient" onclick="window.location.href='http://localhost:8080/ServiceWebHopitaux/medecinconnect�/ajouterpatient';"/>
        <input type="button" value="Supprimer un patient" onclick="window.location.href='http://localhost:8080/ServiceWebHopitaux/medecinconnect�/supprimerpatient';"/>
        <input type="button" value="Modifier un patient" onclick="window.location.href='http://localhost:8080/ServiceWebHopitaux/medecinconnect�/modifierpatient';"/>
        </Div>
    </form>
</body>
</html>	