<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Test</title>
</head>
<body>
<c:forTokens var="morceau" items="je vous/demande/de partir/chez vous" delims="/"><p>${ morceau }</p></c:forTokens>

</body>
</html>