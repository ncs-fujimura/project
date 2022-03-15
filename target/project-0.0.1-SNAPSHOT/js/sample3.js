function sampleFunction(id) {
	if (!window.confirm('削除しますか？')) {
		return false
	}
	document.getElementById("selectedId").value = id;
}