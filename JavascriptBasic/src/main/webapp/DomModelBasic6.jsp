<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>new document</title>
<style type="text/css">
#theBox {
	background-color: #ddd;
}
</style>

</head>

<body>
	<div id="theBox">
		<h1>요소 생성 연습</h1>
	</div>
</body>

<script type="text/javascript">
	//<![CDATA[
	window.onload = function() {
		var theList = document.getElementById("theList");
		var listAll = theList.getElementsByTagName("li");
		//1. <li>리스트1</li> 복제를 합니다.
		//선택태그.clonwNode(true or false)
		//false 이면 자신만 복제
		var copyLi = listAll[3].cloneNode(true);
	
		//2.  기존 "list1" 삭제 합니다.
		theList.removeChild(listAll[3]);

		//3. "list2"이전에 복제 요소 추가
		//선택 태그.insertbefore(새태그, 선택태그2 == 새 태그가 오게될 위치)
		//
		
		theList.insertBefore(copyLi, listAll[0]);
	}
	</script>
</html>