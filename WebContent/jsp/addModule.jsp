<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form>
	<table>
		<tr>
			<td>Name</td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td>Description</td>
			<td><form:textarea path="description" /></td>
		</tr>
		<tr>
			<td>URL</td>
			<td><form:textarea path="url" rows="3" cols="20" /></td>
		</tr>
		<tr>
			<td>Search Training Content</td>
			<td><form:input path="searchBarInternalTrainingContent" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<button id="saveButton">Save</button>
				<button id="cancelButton">Cancel</button>
			</td>
		</tr>
	</table>
</form:form>
