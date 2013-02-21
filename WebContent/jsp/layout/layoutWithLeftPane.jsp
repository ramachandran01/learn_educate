<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<jsp:include page="common.jsp" />
</head>
<body>

	<div id="container" style="width: 1400px">

		<div id="header" class="header">
			<tiles:insertAttribute name="header" />
		</div>

		<div id="navigation" class="navigation">
			<tiles:insertAttribute name="navigation" />
		</div>

		<div id="content" class="content">
			<tiles:insertAttribute name="body" />
		</div>

		<div id="footer" class="footer">
			<tiles:insertAttribute name="footer" />
		</div>

	</div>

</body>
</html>

